package org.allaymc.itemstateupdater.util;

import lombok.experimental.UtilityClass;
import org.cloudburstmc.nbt.NbtList;
import org.cloudburstmc.nbt.NbtMap;
import org.cloudburstmc.nbt.NbtType;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
@UtilityClass
public class TagUtils {
    public static Object toMutable(Object immutable) {
        if (immutable instanceof NbtMap map) {
            Map<String, Object> mutable = new LinkedHashMap<>();
            for (var entry : map.entrySet()) {
                mutable.put(entry.getKey(), toMutable(entry.getValue()));
            }

            return mutable;
        } else if (immutable instanceof NbtList) {
            List<Object> list = new ArrayList<>();
            for (var value : (List<?>) immutable) {
                list.add(toMutable(value));
            }

            return list;
        }

        return immutable;
    }

    public static Object toImmutable(Object mutable) {
        if (mutable instanceof Map<?, ?> map) {
            var immutable = NbtMap.builder();
            map.forEach((key, value) -> immutable.put((String) key, toImmutable(value)));
            return immutable.build();
        } else if (mutable instanceof List) {
            List<Object> list = new ArrayList<>();
            NbtType<?> type = NbtType.END;
            for (var value : (List<?>) mutable) {
                if (type == NbtType.END) type = NbtType.byClass(value.getClass());
                list.add(toImmutable(value));
            }

            return new NbtList(type, list);
        }

        return mutable;
    }
}
