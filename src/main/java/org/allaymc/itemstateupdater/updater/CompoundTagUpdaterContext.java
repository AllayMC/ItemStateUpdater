package org.allaymc.itemstateupdater.updater;

import org.allaymc.itemstateupdater.util.TagUtils;
import org.cloudburstmc.nbt.NbtMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
public class CompoundTagUpdaterContext {
    private final List<CompoundTagUpdater> updaters = new ArrayList<>();

    private static int mergeVersions(int baseVersion, int updaterVersion) {
        return updaterVersion | baseVersion;
    }

    private static int baseVersion(int version) {
        return version & 0xFFFFFF00;
    }

    public static int updaterVersion(int version) {
        return version & 0x000000FF;
    }

    public static int makeVersion(int major, int minor, int patch) {
        return (patch << 8) | (minor << 16) | (major << 24);
    }

    public CompoundTagUpdater.Builder addUpdater(int major, int minor, int patch) {
        return this.addUpdater(major, minor, patch, false);
    }

    public CompoundTagUpdater.Builder addUpdater(int major, int minor, int patch, boolean resetVersion) {
        return this.addUpdater(major, minor, patch, resetVersion, true);
    }

    public CompoundTagUpdater.Builder addUpdater(int major, int minor, int patch, boolean resetVersion, boolean bumpVersion) {
        var version = makeVersion(major, minor, patch);
        var prevUpdater = this.getLatestUpdater();

        var updaterVersion = 0;
        if (!resetVersion && prevUpdater != null && baseVersion(prevUpdater.getVersion()) == version) {
            updaterVersion = updaterVersion(prevUpdater.getVersion());
            if (bumpVersion) {
                updaterVersion++;
            }
        }

        version = mergeVersions(version, updaterVersion);

        var updater = new CompoundTagUpdater(version);
        this.updaters.add(updater);
        this.updaters.sort(null);
        return updater.builder();
    }

    public NbtMap updateStates(NbtMap tag, int updateToVersion) {
        var updated = this.updateStates0(tag, updateToVersion);
        return updated == null ? tag : (NbtMap) TagUtils.toImmutable(updated);
    }

    private Map<String, Object> updateStates0(NbtMap tag, int updateToVersion) {
        Map<String, Object> mutableTag = null;
        boolean updated = false;
        for (var updater : this.updaters) {
            if (updater.getVersion() > updateToVersion) continue;

            if (mutableTag == null) {
                mutableTag = (Map<String, Object>) TagUtils.toMutable(tag);
            }

            updated |= updater.update(mutableTag);
        }

        return mutableTag == null || !updated ? null : mutableTag;
    }

    private CompoundTagUpdater getLatestUpdater() {
        return this.updaters.isEmpty() ? null : this.updaters.getLast();
    }

    public int getLatestVersion() {
        var updater = this.getLatestUpdater();
        return updater == null ? 0 : updater.getVersion();
    }
}
