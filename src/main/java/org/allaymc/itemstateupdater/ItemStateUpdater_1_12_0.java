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
public class ItemStateUpdater_1_12_0 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_12_0();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.black", "minecraft:black_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.blue", "minecraft:blue_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.brown", "minecraft:brown_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.cyan", "minecraft:cyan_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.gray", "minecraft:gray_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.green", "minecraft:green_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.light_blue", "minecraft:light_blue_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.lime", "minecraft:lime_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.magenta", "minecraft:magenta_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.orange", "minecraft:orange_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.pink", "minecraft:pink_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.purple", "minecraft:purple_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.red", "minecraft:red_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.silver", "minecraft:silver_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.white", "minecraft:white_glazed_terracotta");
        renameId(context, 1, 12, 0, "minecraft:glazedterracotta.yellow", "minecraft:yellow_glazed_terracotta");
    }
}
