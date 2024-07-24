package org.allaymc.itemstateupdater;

import org.allaymc.itemstateupdater.updater.CompoundTagUpdaterContext;

import java.util.Arrays;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
@FunctionalInterface
public interface ItemStateUpdater {
    void registerUpdaters(CompoundTagUpdaterContext context);

    default void remapMeta(CompoundTagUpdaterContext context, int major, int minor, int patch, String name, RemapMetaEntry... remaps) {
        context.addUpdater(major, minor, patch)
                .match("Name", name)
                .edit("Damage", helper -> {
                    var meta = (int) helper.getTag();
                    var remap = Arrays.stream(remaps)
                            .filter(entry -> entry.meta() == meta)
                            .findFirst()
                            .orElseThrow(() -> new IllegalStateException("Unexpected remap meta '%d' for '%s'".formatted(meta, name)));

                    helper.replaceWith("Name", remap.name());
                });
    }

    default void renameId(CompoundTagUpdaterContext context, int major, int minor, int patch, String oldName, String newName) {
        context.addUpdater(major, minor, patch)
                .match("Name", oldName)
                .edit("Name", helper -> helper.replaceWith("Name", newName));
    }

    record RemapMetaEntry(int meta, String name) {}
}
