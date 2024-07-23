package org.allaymc.itemstateupdater;

import org.allaymc.itemstateupdater.updater.CompoundTagUpdaterContext;
import org.cloudburstmc.nbt.NbtMap;

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
                .match("name", name)
                .edit("meta", helper -> {
                    var meta = (int) helper.getTag();
                    var remap = Arrays.stream(remaps)
                            .filter(entry -> entry.meta() == meta)
                            .findFirst()
                            .orElseThrow(() -> new IllegalStateException("Unexpected remap meta '%d' for '%s'".formatted(meta, name)));

                    helper.replaceWith("name", remap.name());
                });
    }

    default void renameId(CompoundTagUpdaterContext context, int major, int minor, int patch, String oldName, String newName) {
        context.addUpdater(major, minor, patch)
                .match("name", oldName)
                .edit("name", helper -> helper.replaceWith("name", newName));
    }

    record RemapMetaEntry(int meta, String name) {}

    record Entry(String name, int meta) {
        public static Entry fromNbt(NbtMap nbt) {
            return new Entry(nbt.getString("name"), nbt.getInt("meta"));
        }

        public NbtMap toNbt() {
            return NbtMap.builder()
                    .putString("name", name)
                    .putInt("meta", meta)
                    .build();
        }
    }
}
