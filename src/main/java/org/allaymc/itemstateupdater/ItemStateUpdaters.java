package org.allaymc.itemstateupdater;

import lombok.experimental.UtilityClass;
import org.allaymc.itemstateupdater.updater.CompoundTagUpdaterContext;
import org.cloudburstmc.nbt.NbtMap;

import java.util.ArrayList;
import java.util.List;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
@UtilityClass
public class ItemStateUpdaters {
    public static final int LATEST_VERSION;

    private static final CompoundTagUpdaterContext CONTEXT;

    static {
        List<ItemStateUpdater> updaters = new ArrayList<>();
        updaters.add(ItemStateUpdaterBase.INSTANCE);
        updaters.add(ItemStateUpdater_1_12_0.INSTANCE);
        updaters.add(ItemStateUpdater_1_16_100.INSTANCE);
        updaters.add(ItemStateUpdater_1_16_200.INSTANCE);
        updaters.add(ItemStateUpdater_1_17_30.INSTANCE);
        updaters.add(ItemStateUpdater_1_18_0.INSTANCE);
        updaters.add(ItemStateUpdater_1_18_10.INSTANCE);
        updaters.add(ItemStateUpdater_1_18_30.INSTANCE);
        updaters.add(ItemStateUpdater_1_19_30.INSTANCE);
        updaters.add(ItemStateUpdater_1_19_70.INSTANCE);
        updaters.add(ItemStateUpdater_1_19_80.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_0.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_10.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_20.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_30.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_50.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_60.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_70.INSTANCE);
        updaters.add(ItemStateUpdater_1_20_80.INSTANCE);
        updaters.add(ItemStateUpdater_1_21_0.INSTANCE);

        var context = new CompoundTagUpdaterContext();
        updaters.forEach(updater -> updater.registerUpdaters(context));
        CONTEXT = context;
        LATEST_VERSION = context.getLatestVersion();
    }

    public static NbtMap updateItemState(NbtMap tag, int updateToVersion) {
        return CONTEXT.updateStates(tag, updateToVersion);
    }
}
