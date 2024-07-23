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
public class ItemStateUpdater_1_17_30 implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdater_1_17_30();

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        remapMeta(
                context, 1, 17, 30, "minecraft:bucket",
                new RemapMetaEntry(11, "minecraft:powder_snow_bucket"),
                new RemapMetaEntry(12, "minecraft:axolotl_bucket")
        );
        remapMeta(
                context, 1, 17, 30, "minecraft:spawn_egg",
                new RemapMetaEntry(129, "minecraft:glow_squid_spawn_egg"),
                new RemapMetaEntry(130, "minecraft:axolotl_spawn_egg")
        );
    }
}
