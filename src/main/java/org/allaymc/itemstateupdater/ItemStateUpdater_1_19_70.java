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
public class ItemStateUpdater_1_19_70 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_19_70();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 19, 70, "minecraft:boat",
                new RemapMetaEntry(7, "minecraft:bamboo_raft")
        );
        remapMeta(
                context, 1, 19, 70, "minecraft:chest_boat",
                new RemapMetaEntry(7, "minecraft:bamboo_chest_raft")
        );
        remapMeta(
                context, 1, 19, 70, "minecraft:spawn_egg",
                new RemapMetaEntry(138, "minecraft:camel_spawn_egg"),
                new RemapMetaEntry(139, "minecraft:sniffer_spawn_egg"),
                new RemapMetaEntry(157, "minecraft:trader_llama_spawn_egg"),
                new RemapMetaEntry(20, "minecraft:iron_golem_spawn_egg"),
                new RemapMetaEntry(21, "minecraft:snow_golem_spawn_egg"),
                new RemapMetaEntry(52, "minecraft:wither_spawn_egg"),
                new RemapMetaEntry(53, "minecraft:ender_dragon_spawn_egg")
        );
        remapMeta(
                context, 1, 19, 70, "minecraft:wool",
                new RemapMetaEntry(0, "minecraft:white_wool"),
                new RemapMetaEntry(1, "minecraft:orange_wool"),
                new RemapMetaEntry(2, "minecraft:magenta_wool"),
                new RemapMetaEntry(3, "minecraft:light_blue_wool"),
                new RemapMetaEntry(4, "minecraft:yellow_wool"),
                new RemapMetaEntry(5, "minecraft:lime_wool"),
                new RemapMetaEntry(6, "minecraft:pink_wool"),
                new RemapMetaEntry(7, "minecraft:gray_wool"),
                new RemapMetaEntry(8, "minecraft:light_gray_wool"),
                new RemapMetaEntry(9, "minecraft:cyan_wool"),
                new RemapMetaEntry(10, "minecraft:purple_wool"),
                new RemapMetaEntry(11, "minecraft:blue_wool"),
                new RemapMetaEntry(12, "minecraft:brown_wool"),
                new RemapMetaEntry(13, "minecraft:green_wool"),
                new RemapMetaEntry(14, "minecraft:red_wool"),
                new RemapMetaEntry(15, "minecraft:black_wool")
        );
    }
}
