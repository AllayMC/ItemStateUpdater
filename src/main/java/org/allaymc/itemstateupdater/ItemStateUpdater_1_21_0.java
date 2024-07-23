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
public class ItemStateUpdater_1_21_0 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_21_0();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 21, 0, "minecraft:coral_block",
                new RemapMetaEntry(0, "minecraft:tube_coral_block"),
                new RemapMetaEntry(1, "minecraft:brain_coral_block"),
                new RemapMetaEntry(2, "minecraft:bubble_coral_block"),
                new RemapMetaEntry(3, "minecraft:fire_coral_block"),
                new RemapMetaEntry(4, "minecraft:horn_coral_block"),
                new RemapMetaEntry(8, "minecraft:dead_tube_coral_block"),
                new RemapMetaEntry(9, "minecraft:dead_brain_coral_block"),
                new RemapMetaEntry(10, "minecraft:dead_bubble_coral_block"),
                new RemapMetaEntry(11, "minecraft:dead_fire_coral_block"),
                new RemapMetaEntry(12, "minecraft:dead_horn_coral_block")
        );
        remapMeta(
                context, 1, 21, 0, "minecraft:double_plant",
                new RemapMetaEntry(0, "minecraft:sunflower"),
                new RemapMetaEntry(1, "minecraft:lilac"),
                new RemapMetaEntry(2, "minecraft:tall_grass"),
                new RemapMetaEntry(3, "minecraft:large_fern"),
                new RemapMetaEntry(4, "minecraft:rose_bush"),
                new RemapMetaEntry(5, "minecraft:peony")
        );
        remapMeta(
                context, 1, 21, 0, "minecraft:stone_block_slab",
                new RemapMetaEntry(0, "minecraft:smooth_stone_slab"),
                new RemapMetaEntry(1, "minecraft:sandstone_slab"),
                new RemapMetaEntry(2, "minecraft:petrified_oak_slab"),
                new RemapMetaEntry(3, "minecraft:cobblestone_slab"),
                new RemapMetaEntry(4, "minecraft:brick_slab"),
                new RemapMetaEntry(5, "minecraft:stone_brick_slab"),
                new RemapMetaEntry(6, "minecraft:quartz_slab"),
                new RemapMetaEntry(7, "minecraft:nether_brick_slab")
        );
        remapMeta(
                context, 1, 21, 0, "minecraft:tallgrass",
                new RemapMetaEntry(0, "minecraft:short_grass"),
                new RemapMetaEntry(2, "minecraft:fern"),
                new RemapMetaEntry(3, "minecraft:fern")
        );

        renameId(
                context, 1, 21, 0,
                "minecraft:record_creator", "minecraft:music_disc_creator"
        );
        renameId(
                context, 1, 21, 0,
                "minecraft:record_creator_music_box", "minecraft:music_disc_creator_music_box"
        );
        renameId(
                context, 1, 21, 0,
                "minecraft:record_precipice", "minecraft:music_disc_precipice"
        );
    }
}
