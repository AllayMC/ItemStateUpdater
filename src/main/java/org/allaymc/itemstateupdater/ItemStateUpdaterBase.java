package org.allaymc.itemstateupdater;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.allaymc.itemstateupdater.updater.CompoundTagUpdaterContext;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
public class ItemStateUpdaterBase implements ItemStateUpdater {
    public static final ItemStateUpdater INSTANCE = new ItemStateUpdaterBase();

    private static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    private static final Map<Integer, String> LEGACY_ITEM_IDS = new HashMap<>();

    static {
        try (var stream = ItemStateUpdaterBase.class.getClassLoader().getResourceAsStream("legacy_item_ids_map.json")) {
            Map<String, Integer> map = JSON_MAPPER.readValue(stream, new TypeReference<>() {});
            map.forEach((key, value) -> LEGACY_ITEM_IDS.put(value, key));
        } catch (IOException e) {
            throw new AssertionError("Error loading legacy item ids map", e);
        }
    }

    @Override
    public void registerUpdaters(CompoundTagUpdaterContext context) {
        context.addUpdater(0, 0, 0)
                .match("Id", "\\d+", true)
                .edit("Id", helper -> {
                    var id = Integer.parseInt((String) helper.getTag());
                    helper.replaceWith("Name", LEGACY_ITEM_IDS.get(id));
                });
    }
}
