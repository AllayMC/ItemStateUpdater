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
public class ItemStateUpdater_1_18_30 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_18_30();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 18, 30, "minecraft:chest_boat",
                new RemapMetaEntry(0, "minecraft:oak_chest_boat"),
                new RemapMetaEntry(1, "minecraft:spruce_chest_boat"),
                new RemapMetaEntry(2, "minecraft:birch_chest_boat"),
                new RemapMetaEntry(3, "minecraft:jungle_chest_boat"),
                new RemapMetaEntry(4, "minecraft:acacia_chest_boat"),
                new RemapMetaEntry(5, "minecraft:dark_oak_chest_boat")
        );
        remapMeta(
                context, 1, 18, 30, "minecraft:spawn_egg",
                new RemapMetaEntry(131, "minecraft:warden_spawn_egg")
        );

        renameId(context, 1, 18, 30, "minecraft:concretepowder", "minecraft:concrete_powder");
        renameId(context, 1, 18, 30, "minecraft:invisiblebedrock", "minecraft:invisible_bedrock");
        renameId(context, 1, 18, 30, "minecraft:movingblock", "minecraft:moving_block");
        renameId(context, 1, 18, 30, "minecraft:pistonarmcollision", "minecraft:piston_arm_collision");
        renameId(context, 1, 18, 30, "minecraft:sealantern", "minecraft:sea_lantern");
        renameId(context, 1, 18, 30, "minecraft:stickypistonarmcollision", "minecraft:sticky_piston_arm_collision");
    }
}
