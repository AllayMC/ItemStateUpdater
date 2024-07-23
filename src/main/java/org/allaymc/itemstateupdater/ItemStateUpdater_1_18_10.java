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
public class ItemStateUpdater_1_18_10 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_18_10();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 18, 10, "minecraft:banner_pattern",
                new RemapMetaEntry(7, "minecraft:globe_banner_pattern")
        );
        remapMeta(
                context, 1, 18, 10, "minecraft:bucket",
                new RemapMetaEntry(13, "minecraft:tadpole_bucket")
        );
        remapMeta(
                context, 1, 18, 10, "minecraft:spawn_egg",
                new RemapMetaEntry(132, "minecraft:frog_spawn_egg"),
                new RemapMetaEntry(133, "minecraft:tadpole_spawn_egg"),
                new RemapMetaEntry(134, "minecraft:allay_spawn_egg"),
                new RemapMetaEntry(135, "minecraft:firefly_spawn_egg")
        );
    }
}
