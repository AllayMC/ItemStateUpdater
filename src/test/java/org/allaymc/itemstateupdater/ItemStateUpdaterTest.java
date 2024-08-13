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
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.getString("Name"), "minecraft:music_disc_creator");
    }

    @Test
    void rename_id_for_grass() {
        var result = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Name", "minecraft:grass")
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.getString("Name"), "minecraft:grass_block");
    }

    @Test
    void int_and_short_meta() {
        var resultInt = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Name", "minecraft:coal")
                        .putInt("Damage", 1)
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(resultInt.getString("Name"), "minecraft:charcoal");
        assertEquals(resultInt.getInt("Damage"), 0);

        var resultShort = ItemStateUpdaters.updateItemState(
                NbtMap.builder()
                        .putString("Name", "minecraft:coal")
                        .putShort("Damage", (short) 1)
                        .build(),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(resultShort.getString("Name"), "minecraft:charcoal");
        assertEquals(resultShort.getShort("Damage"), 0);
    }
}