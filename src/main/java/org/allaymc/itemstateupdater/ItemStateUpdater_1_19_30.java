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
public class ItemStateUpdater_1_19_30 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_19_30();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 19, 30, "minecraft:boat",
                new RemapMetaEntry(6, "minecraft:mangrove_boat")
        );
        remapMeta(
                context, 1, 19, 30, "minecraft:chest_boat",
                new RemapMetaEntry(6, "minecraft:mangrove_chest_boat")
        );

        renameId(context, 1, 19, 30, "minecraft:double_stone_slab", "minecraft:stone_block_slab");
        renameId(context, 1, 19, 30, "minecraft:double_stone_slab2", "minecraft:stone_block_slab2");
        renameId(context, 1, 19, 30, "minecraft:double_stone_slab3", "minecraft:stone_block_slab3");
        renameId(context, 1, 19, 30, "minecraft:double_stone_slab4", "minecraft:stone_block_slab4");
        renameId(context, 1, 19, 30, "minecraft:real_double_stone_slab", "minecraft:double_stone_block_slab");
        renameId(context, 1, 19, 30, "minecraft:real_double_stone_slab2", "minecraft:double_stone_block_slab2");
        renameId(context, 1, 19, 30, "minecraft:real_double_stone_slab3", "minecraft:double_stone_block_slab3");
        renameId(context, 1, 19, 30, "minecraft:real_double_stone_slab4", "minecraft:double_stone_block_slab4");
        renameId(context, 1, 19, 30, "minecraft:record_5", "minecraft:music_disc_5");
        renameId(context, 1, 19, 30, "minecraft:stone_slab", "minecraft:stone_block_slab");
        renameId(context, 1, 19, 30, "minecraft:stone_slab2", "minecraft:stone_block_slab2");
        renameId(context, 1, 19, 30, "minecraft:stone_slab3", "minecraft:stone_block_slab3");
        renameId(context, 1, 19, 30, "minecraft:stone_slab4", "minecraft:stone_block_slab4");
    }
}
