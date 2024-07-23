package org.allaymc.itemstateupdater;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.allaymc.itemstateupdater.updater.CompoundTagUpdaterContext;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ItemStateUpdater_1_19_80 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_19_80();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 19, 80, "minecraft:boat",
                new RemapMetaEntry(8, "minecraft:cherry_boat")
        );
        remapMeta(
                context, 1, 19, 80, "minecraft:chest_boat",
                new RemapMetaEntry(8, "minecraft:cherry_chest_boat")
        );
        remapMeta(
                context, 1, 19, 80, "minecraft:fence",
                new RemapMetaEntry(0, "minecraft:oak_fence"),
                new RemapMetaEntry(1, "minecraft:spruce_fence"),
                new RemapMetaEntry(2, "minecraft:birch_fence"),
                new RemapMetaEntry(3, "minecraft:jungle_fence"),
                new RemapMetaEntry(4, "minecraft:acacia_fence"),
                new RemapMetaEntry(5, "minecraft:dark_oak_fence")
        );
        remapMeta(
                context, 1, 19, 80, "minecraft:log",
                new RemapMetaEntry(0, "minecraft:oak_log"),
                new RemapMetaEntry(1, "minecraft:spruce_log"),
                new RemapMetaEntry(2, "minecraft:birch_log"),
                new RemapMetaEntry(3, "minecraft:jungle_log"),
                new RemapMetaEntry(5, "minecraft:spruce_log"),
                new RemapMetaEntry(6, "minecraft:birch_log"),
                new RemapMetaEntry(7, "minecraft:jungle_log"),
                new RemapMetaEntry(9, "minecraft:spruce_log"),
                new RemapMetaEntry(10, "minecraft:birch_log"),
                new RemapMetaEntry(11, "minecraft:jungle_log")
        );
        remapMeta(
                context, 1, 19, 80, "minecraft:log2",
                new RemapMetaEntry(0, "minecraft:acacia_log"),
                new RemapMetaEntry(1, "minecraft:dark_oak_log"),
                new RemapMetaEntry(5, "minecraft:dark_oak_log"),
                new RemapMetaEntry(9, "minecraft:dark_oak_log")
        );
    }
}
