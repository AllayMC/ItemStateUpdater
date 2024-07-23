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
public class ItemStateUpdater_1_16_100 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_16_100();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 16, 100, "minecraft:banner_pattern",
                new RemapMetaEntry(0, "minecraft:creeper_banner_pattern"),
                new RemapMetaEntry(1, "minecraft:skull_banner_pattern"),
                new RemapMetaEntry(2, "minecraft:flower_banner_pattern"),
                new RemapMetaEntry(3, "minecraft:mojang_banner_pattern"),
                new RemapMetaEntry(4, "minecraft:field_masoned_banner_pattern"),
                new RemapMetaEntry(5, "minecraft:bordure_indented_banner_pattern"),
                new RemapMetaEntry(6, "minecraft:piglin_banner_pattern")
        );
        remapMeta(
                context, 1, 16, 100, "minecraft:boat",
                new RemapMetaEntry(0, "minecraft:oak_boat"),
                new RemapMetaEntry(1, "minecraft:spruce_boat"),
                new RemapMetaEntry(2, "minecraft:birch_boat"),
                new RemapMetaEntry(3, "minecraft:jungle_boat"),
                new RemapMetaEntry(4, "minecraft:acacia_boat"),
                new RemapMetaEntry(5, "minecraft:dark_oak_boat")
        );
        remapMeta(
                context, 1, 16, 100, "minecraft:bucket",
                new RemapMetaEntry(1, "minecraft:milk_bucket"),
                new RemapMetaEntry(2, "minecraft:cod_bucket"),
                new RemapMetaEntry(3, "minecraft:salmon_bucket"),
                new RemapMetaEntry(4, "minecraft:tropical_fish_bucket"),
                new RemapMetaEntry(5, "minecraft:pufferfish_bucket"),
                new RemapMetaEntry(8, "minecraft:water_bucket"),
                new RemapMetaEntry(10, "minecraft:lava_bucket")
        );
        remapMeta(
                context, 1, 16, 100, "minecraft:coal",
                new RemapMetaEntry(1, "minecraft:charcoal")
        );
        remapMeta(
                context, 1, 16, 100, "minecraft:dye",
                new RemapMetaEntry(0, "minecraft:ink_sac"),
                new RemapMetaEntry(1, "minecraft:red_dye"),
                new RemapMetaEntry(2, "minecraft:green_dye"),
                new RemapMetaEntry(3, "minecraft:cocoa_beans"),
                new RemapMetaEntry(4, "minecraft:lapis_lazuli"),
                new RemapMetaEntry(5, "minecraft:purple_dye"),
                new RemapMetaEntry(6, "minecraft:cyan_dye"),
                new RemapMetaEntry(7, "minecraft:light_gray_dye"),
                new RemapMetaEntry(8, "minecraft:gray_dye"),
                new RemapMetaEntry(9, "minecraft:pink_dye"),
                new RemapMetaEntry(10, "minecraft:lime_dye"),
                new RemapMetaEntry(11, "minecraft:yellow_dye"),
                new RemapMetaEntry(12, "minecraft:light_blue_dye"),
                new RemapMetaEntry(13, "minecraft:magenta_dye"),
                new RemapMetaEntry(14, "minecraft:orange_dye"),
                new RemapMetaEntry(15, "minecraft:bone_meal"),
                new RemapMetaEntry(16, "minecraft:black_dye"),
                new RemapMetaEntry(17, "minecraft:brown_dye"),
                new RemapMetaEntry(18, "minecraft:blue_dye"),
                new RemapMetaEntry(19, "minecraft:white_dye")
        );
        remapMeta(
                context, 1, 16, 100, "minecraft:spawn_egg",
                new RemapMetaEntry(10, "minecraft:chicken_spawn_egg"),
                new RemapMetaEntry(11, "minecraft:cow_spawn_egg"),
                new RemapMetaEntry(12, "minecraft:pig_spawn_egg"),
                new RemapMetaEntry(13, "minecraft:sheep_spawn_egg"),
                new RemapMetaEntry(14, "minecraft:wolf_spawn_egg"),
                new RemapMetaEntry(15, "minecraft:villager_spawn_egg"),
                new RemapMetaEntry(16, "minecraft:mooshroom_spawn_egg"),
                new RemapMetaEntry(17, "minecraft:squid_spawn_egg"),
                new RemapMetaEntry(18, "minecraft:rabbit_spawn_egg"),
                new RemapMetaEntry(19, "minecraft:bat_spawn_egg"),
                new RemapMetaEntry(22, "minecraft:ocelot_spawn_egg"),
                new RemapMetaEntry(23, "minecraft:horse_spawn_egg"),
                new RemapMetaEntry(24, "minecraft:donkey_spawn_egg"),
                new RemapMetaEntry(25, "minecraft:mule_spawn_egg"),
                new RemapMetaEntry(26, "minecraft:skeleton_horse_spawn_egg"),
                new RemapMetaEntry(27, "minecraft:zombie_horse_spawn_egg"),
                new RemapMetaEntry(28, "minecraft:polar_bear_spawn_egg"),
                new RemapMetaEntry(29, "minecraft:llama_spawn_egg"),
                new RemapMetaEntry(30, "minecraft:parrot_spawn_egg"),
                new RemapMetaEntry(31, "minecraft:dolphin_spawn_egg"),
                new RemapMetaEntry(32, "minecraft:zombie_spawn_egg"),
                new RemapMetaEntry(33, "minecraft:creeper_spawn_egg"),
                new RemapMetaEntry(34, "minecraft:skeleton_spawn_egg"),
                new RemapMetaEntry(35, "minecraft:spider_spawn_egg"),
                new RemapMetaEntry(36, "minecraft:zombie_pigman_spawn_egg"),
                new RemapMetaEntry(37, "minecraft:slime_spawn_egg"),
                new RemapMetaEntry(38, "minecraft:enderman_spawn_egg"),
                new RemapMetaEntry(39, "minecraft:silverfish_spawn_egg"),
                new RemapMetaEntry(40, "minecraft:cave_spider_spawn_egg"),
                new RemapMetaEntry(41, "minecraft:ghast_spawn_egg"),
                new RemapMetaEntry(42, "minecraft:magma_cube_spawn_egg"),
                new RemapMetaEntry(43, "minecraft:blaze_spawn_egg"),
                new RemapMetaEntry(44, "minecraft:zombie_villager_spawn_egg"),
                new RemapMetaEntry(45, "minecraft:witch_spawn_egg"),
                new RemapMetaEntry(46, "minecraft:stray_spawn_egg"),
                new RemapMetaEntry(47, "minecraft:husk_spawn_egg"),
                new RemapMetaEntry(48, "minecraft:wither_skeleton_spawn_egg"),
                new RemapMetaEntry(49, "minecraft:guardian_spawn_egg"),
                new RemapMetaEntry(50, "minecraft:elder_guardian_spawn_egg"),
                new RemapMetaEntry(51, "minecraft:npc_spawn_egg"),
                new RemapMetaEntry(54, "minecraft:shulker_spawn_egg"),
                new RemapMetaEntry(55, "minecraft:endermite_spawn_egg"),
                new RemapMetaEntry(56, "minecraft:agent_spawn_egg"),
                new RemapMetaEntry(57, "minecraft:vindicator_spawn_egg"),
                new RemapMetaEntry(58, "minecraft:phantom_spawn_egg"),
                new RemapMetaEntry(59, "minecraft:ravager_spawn_egg"),
                new RemapMetaEntry(74, "minecraft:turtle_spawn_egg"),
                new RemapMetaEntry(75, "minecraft:cat_spawn_egg"),
                new RemapMetaEntry(104, "minecraft:evoker_spawn_egg"),
                new RemapMetaEntry(105, "minecraft:vex_spawn_egg"),
                new RemapMetaEntry(108, "minecraft:pufferfish_spawn_egg"),
                new RemapMetaEntry(109, "minecraft:salmon_spawn_egg"),
                new RemapMetaEntry(110, "minecraft:drowned_spawn_egg"),
                new RemapMetaEntry(111, "minecraft:tropical_fish_spawn_egg"),
                new RemapMetaEntry(112, "minecraft:cod_spawn_egg"),
                new RemapMetaEntry(113, "minecraft:panda_spawn_egg"),
                new RemapMetaEntry(114, "minecraft:pillager_spawn_egg"),
                new RemapMetaEntry(115, "minecraft:villager_spawn_egg"),
                new RemapMetaEntry(116, "minecraft:zombie_villager_spawn_egg"),
                new RemapMetaEntry(118, "minecraft:wandering_trader_spawn_egg"),
                new RemapMetaEntry(121, "minecraft:fox_spawn_egg"),
                new RemapMetaEntry(122, "minecraft:bee_spawn_egg"),
                new RemapMetaEntry(123, "minecraft:piglin_spawn_egg"),
                new RemapMetaEntry(124, "minecraft:hoglin_spawn_egg"),
                new RemapMetaEntry(125, "minecraft:strider_spawn_egg"),
                new RemapMetaEntry(126, "minecraft:zoglin_spawn_egg"),
                new RemapMetaEntry(127, "minecraft:piglin_brute_spawn_egg")
        );

        renameId(context, 1, 16, 100, "minecraft:appleenchanted", "minecraft:enchanted_golden_apple");
        renameId(context, 1, 16, 100, "minecraft:carrotonastick", "minecraft:carrot_on_a_stick");
        renameId(context, 1, 16, 100, "minecraft:chorus_fruit_popped", "minecraft:popped_chorus_fruit");
        renameId(context, 1, 16, 100, "minecraft:clownfish", "minecraft:tropical_fish");
        renameId(context, 1, 16, 100, "minecraft:cooked_fish", "minecraft:cooked_cod");
        renameId(context, 1, 16, 100, "minecraft:darkoak_sign", "minecraft:dark_oak_sign");
        renameId(context, 1, 16, 100, "minecraft:emptymap", "minecraft:empty_map");
        renameId(context, 1, 16, 100, "minecraft:fireball", "minecraft:fire_charge");
        renameId(context, 1, 16, 100, "minecraft:fireworks", "minecraft:firework_rocket");
        renameId(context, 1, 16, 100, "minecraft:fireworkscharge", "minecraft:firework_star");
        renameId(context, 1, 16, 100, "minecraft:fish", "minecraft:cod");
        renameId(context, 1, 16, 100, "minecraft:horsearmordiamond", "minecraft:diamond_horse_armor");
        renameId(context, 1, 16, 100, "minecraft:horsearmorgold", "minecraft:golden_horse_armor");
        renameId(context, 1, 16, 100, "minecraft:horsearmoriron", "minecraft:iron_horse_armor");
        renameId(context, 1, 16, 100, "minecraft:horsearmorleather", "minecraft:leather_horse_armor");
        renameId(context, 1, 16, 100, "minecraft:lodestonecompass", "minecraft:lodestone_compass");
        renameId(context, 1, 16, 100, "minecraft:map", "minecraft:filled_map");
        renameId(context, 1, 16, 100, "minecraft:melon", "minecraft:melon_slice");
        renameId(context, 1, 16, 100, "minecraft:muttoncooked", "minecraft:cooked_mutton");
        renameId(context, 1, 16, 100, "minecraft:muttonraw", "minecraft:mutton");
        renameId(context, 1, 16, 100, "minecraft:netherstar", "minecraft:nether_star");
        renameId(context, 1, 16, 100, "minecraft:record_11", "minecraft:music_disc_11");
        renameId(context, 1, 16, 100, "minecraft:record_13", "minecraft:music_disc_13");
        renameId(context, 1, 16, 100, "minecraft:record_blocks", "minecraft:music_disc_blocks");
        renameId(context, 1, 16, 100, "minecraft:record_cat", "minecraft:music_disc_cat");
        renameId(context, 1, 16, 100, "minecraft:record_chirp", "minecraft:music_disc_chirp");
        renameId(context, 1, 16, 100, "minecraft:record_far", "minecraft:music_disc_far");
        renameId(context, 1, 16, 100, "minecraft:record_mall", "minecraft:music_disc_mall");
        renameId(context, 1, 16, 100, "minecraft:record_mellohi", "minecraft:music_disc_mellohi");
        renameId(context, 1, 16, 100, "minecraft:record_pigstep", "minecraft:music_disc_pigstep");
        renameId(context, 1, 16, 100, "minecraft:record_stal", "minecraft:music_disc_stal");
        renameId(context, 1, 16, 100, "minecraft:record_strad", "minecraft:music_disc_strad");
        renameId(context, 1, 16, 100, "minecraft:record_wait", "minecraft:music_disc_wait");
        renameId(context, 1, 16, 100, "minecraft:record_ward", "minecraft:music_disc_ward");
        renameId(context, 1, 16, 100, "minecraft:reeds", "minecraft:sugar_cane");
        renameId(context, 1, 16, 100, "minecraft:sign", "minecraft:oak_sign");
        renameId(context, 1, 16, 100, "minecraft:speckled_melon", "minecraft:glistering_melon_slice");
        renameId(context, 1, 16, 100, "minecraft:totem", "minecraft:totem_of_undying");
        renameId(context, 1, 16, 100, "minecraft:turtle_shell_piece", "minecraft:scute");
    }
}
