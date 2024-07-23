package org.allaymc.itemstateupdater;

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
    void remap_meta_for_coal() {
        var result = ItemStateUpdaters.updateItemState(
                new ItemStateUpdater.Entry("minecraft:coal", 1),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.name(), "minecraft:charcoal");
        assertEquals(result.meta(), 0);
    }

    @Test
    void unknown_remap_meta_for_coal() {
        Assertions.assertThrowsExactly(IllegalStateException.class, () -> {
            ItemStateUpdaters.updateItemState(
                    new ItemStateUpdater.Entry("minecraft:coal", 2),
                    ItemStateUpdaters.LATEST_VERSION
            );
        });
    }

    @Test
    void rename_id_for_record_creator() {
        var result = ItemStateUpdaters.updateItemState(
                new ItemStateUpdater.Entry("minecraft:record_creator", 0),
                ItemStateUpdaters.LATEST_VERSION
        );

        assertEquals(result.name(), "minecraft:music_disc_creator");
        // Meta ignored because record_creator only renamed
    }
}