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
public class ItemStateUpdater_1_20_60 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_20_60();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 20, 60, "minecraft:hard_stained_glass",
                new RemapMetaEntry(0, "minecraft:hard_white_stained_glass"),
                new RemapMetaEntry(1, "minecraft:hard_orange_stained_glass"),
                new RemapMetaEntry(2, "minecraft:hard_magenta_stained_glass"),
                new RemapMetaEntry(3, "minecraft:hard_light_blue_stained_glass"),
                new RemapMetaEntry(4, "minecraft:hard_yellow_stained_glass"),
                new RemapMetaEntry(5, "minecraft:hard_lime_stained_glass"),
                new RemapMetaEntry(6, "minecraft:hard_pink_stained_glass"),
                new RemapMetaEntry(7, "minecraft:hard_gray_stained_glass"),
                new RemapMetaEntry(8, "minecraft:hard_light_gray_stained_glass"),
                new RemapMetaEntry(9, "minecraft:hard_cyan_stained_glass"),
                new RemapMetaEntry(10, "minecraft:hard_purple_stained_glass"),
                new RemapMetaEntry(11, "minecraft:hard_blue_stained_glass"),
                new RemapMetaEntry(12, "minecraft:hard_brown_stained_glass"),
                new RemapMetaEntry(13, "minecraft:hard_green_stained_glass"),
                new RemapMetaEntry(14, "minecraft:hard_red_stained_glass"),
                new RemapMetaEntry(15, "minecraft:hard_black_stained_glass")
        );
        remapMeta(
                context, 1, 20, 60, "minecraft:hard_stained_glass_pane",
                new RemapMetaEntry(0, "minecraft:hard_white_stained_glass_pane"),
                new RemapMetaEntry(1, "minecraft:hard_orange_stained_glass_pane"),
                new RemapMetaEntry(2, "minecraft:hard_magenta_stained_glass_pane"),
                new RemapMetaEntry(3, "minecraft:hard_light_blue_stained_glass_pane"),
                new RemapMetaEntry(4, "minecraft:hard_yellow_stained_glass_pane"),
                new RemapMetaEntry(5, "minecraft:hard_lime_stained_glass_pane"),
                new RemapMetaEntry(6, "minecraft:hard_pink_stained_glass_pane"),
                new RemapMetaEntry(7, "minecraft:hard_gray_stained_glass_pane"),
                new RemapMetaEntry(8, "minecraft:hard_light_gray_stained_glass_pane"),
                new RemapMetaEntry(9, "minecraft:hard_cyan_stained_glass_pane"),
                new RemapMetaEntry(10, "minecraft:hard_purple_stained_glass_pane"),
                new RemapMetaEntry(11, "minecraft:hard_blue_stained_glass_pane"),
                new RemapMetaEntry(12, "minecraft:hard_brown_stained_glass_pane"),
                new RemapMetaEntry(13, "minecraft:hard_green_stained_glass_pane"),
                new RemapMetaEntry(14, "minecraft:hard_red_stained_glass_pane"),
                new RemapMetaEntry(15, "minecraft:hard_black_stained_glass_pane")
        );
        remapMeta(
                context, 1, 20, 60, "minecraft:spawn_egg",
                new RemapMetaEntry(140, "minecraft:breeze_spawn_egg"),
                new RemapMetaEntry(142, "minecraft:armadillo_spawn_egg")
        );

        renameId(context, 1, 20, 60, "minecraft:scute", "minecraft:turtle_scute");
    }
}
