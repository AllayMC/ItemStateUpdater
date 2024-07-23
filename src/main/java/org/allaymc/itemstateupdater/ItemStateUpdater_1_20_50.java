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
public class ItemStateUpdater_1_20_50 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_20_50();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 20, 50, "minecraft:planks",
                new RemapMetaEntry(0, "minecraft:oak_planks"),
                new RemapMetaEntry(1, "minecraft:spruce_planks"),
                new RemapMetaEntry(2, "minecraft:birch_planks"),
                new RemapMetaEntry(3, "minecraft:jungle_planks"),
                new RemapMetaEntry(4, "minecraft:acacia_planks"),
                new RemapMetaEntry(5, "minecraft:dark_oak_planks")
        );
        remapMeta(
                context, 1, 20, 50, "minecraft:stone",
                new RemapMetaEntry(1, "minecraft:granite"),
                new RemapMetaEntry(2, "minecraft:polished_granite"),
                new RemapMetaEntry(3, "minecraft:diorite"),
                new RemapMetaEntry(4, "minecraft:polished_diorite"),
                new RemapMetaEntry(5, "minecraft:andesite"),
                new RemapMetaEntry(6, "minecraft:polished_andesite")
        );
    }
}
