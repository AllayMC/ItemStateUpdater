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
public class ItemStateUpdater_1_20_10 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_20_10();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 20, 10, "minecraft:concrete",
                new RemapMetaEntry(0, "minecraft:white_concrete"),
                new RemapMetaEntry(1, "minecraft:orange_concrete"),
                new RemapMetaEntry(2, "minecraft:magenta_concrete"),
                new RemapMetaEntry(3, "minecraft:light_blue_concrete"),
                new RemapMetaEntry(4, "minecraft:yellow_concrete"),
                new RemapMetaEntry(5, "minecraft:lime_concrete"),
                new RemapMetaEntry(6, "minecraft:pink_concrete"),
                new RemapMetaEntry(7, "minecraft:gray_concrete"),
                new RemapMetaEntry(8, "minecraft:light_gray_concrete"),
                new RemapMetaEntry(9, "minecraft:cyan_concrete"),
                new RemapMetaEntry(10, "minecraft:purple_concrete"),
                new RemapMetaEntry(11, "minecraft:blue_concrete"),
                new RemapMetaEntry(12, "minecraft:brown_concrete"),
                new RemapMetaEntry(13, "minecraft:green_concrete"),
                new RemapMetaEntry(14, "minecraft:red_concrete"),
                new RemapMetaEntry(15, "minecraft:black_concrete")
        );
        remapMeta(
                context, 1, 20, 10, "minecraft:shulker_box",
                new RemapMetaEntry(0, "minecraft:white_shulker_box"),
                new RemapMetaEntry(1, "minecraft:orange_shulker_box"),
                new RemapMetaEntry(2, "minecraft:magenta_shulker_box"),
                new RemapMetaEntry(3, "minecraft:light_blue_shulker_box"),
                new RemapMetaEntry(4, "minecraft:yellow_shulker_box"),
                new RemapMetaEntry(5, "minecraft:lime_shulker_box"),
                new RemapMetaEntry(6, "minecraft:pink_shulker_box"),
                new RemapMetaEntry(7, "minecraft:gray_shulker_box"),
                new RemapMetaEntry(8, "minecraft:light_gray_shulker_box"),
                new RemapMetaEntry(9, "minecraft:cyan_shulker_box"),
                new RemapMetaEntry(10, "minecraft:purple_shulker_box"),
                new RemapMetaEntry(11, "minecraft:blue_shulker_box"),
                new RemapMetaEntry(12, "minecraft:brown_shulker_box"),
                new RemapMetaEntry(13, "minecraft:green_shulker_box"),
                new RemapMetaEntry(14, "minecraft:red_shulker_box"),
                new RemapMetaEntry(15, "minecraft:black_shulker_box")
        );
    }
}
