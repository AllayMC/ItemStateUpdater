package org.allaymc.itemstateupdater;

import org.cloudburstmc.nbt.NbtMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
class ItemStateUpdaterTest {
    @Test
    void update_planks_from_legacy() {
        var result = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Id", "5")
                        .putInt("Damage", 3)
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        System.out.println(result);

        assertEquals(result.getString("Name"), "minecraft:jungle_planks");
        assertEquals(result.getInt("Damage"), 0);
    }

    @Test
    void remap_meta_for_coal() {
        var result = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Name", "minecraft:coal")
                        .putInt("Damage", 1)
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.getString("Name"), "minecraft:charcoal");
        assertEquals(result.getInt("Damage"), 0);
    }

    @Test
    void unknown_remap_meta_for_coal() {
        Assertions.assertThrowsExactly(IllegalStateException.class, () -> {
            ItemStateUpdaters.updateItemState(
                    NbtMap.builder()
                            .putString("Name", "minecraft:coal")
                            .putInt("Damage", 2)
                            .build(),
                    ItemStateUpdaters.LATEST_VERSION
            );
        });
    }

    @Test
    void rename_id_for_record_creator() {
        var result = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Name", "minecraft:record_creator")
                        // Meta ignored because record_creator only renamed
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.getString("Name"), "minecraft:music_disc_creator");
    }
}