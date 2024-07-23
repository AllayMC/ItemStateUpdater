package org.allaymc.itemstateupdater.updater;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/**
 * ItemStateUpdater Project 23/07/2024
 *
 * @author IWareQ
 */
public class CompoundTagUpdater implements Comparable<CompoundTagUpdater> {
    private final List<Predicate<CompoundTagEditHelper>> filters = new ArrayList<>();
    private final List<Consumer<CompoundTagEditHelper>> updaters = new ArrayList<>();

    private final Builder builder = new Builder();

    @Getter
    private final int version;

    public CompoundTagUpdater(int version) {
        this.version = version;
    }

    private static String getTagValue(Object tag) {
        if (tag == null) {
            return "END";
        } else if (
                tag instanceof Byte || tag instanceof Short ||
                        tag instanceof Integer || tag instanceof Long ||
                        tag instanceof Float || tag instanceof Double
        ) {
            return String.valueOf(tag);
        } else if (tag instanceof String str) {
            return str;
        } else if (tag instanceof Boolean bool) {
            return bool ? "1" : "0";
        }

        throw new IllegalArgumentException("Invalid tag " + tag.getClass().getSimpleName());
    }

    public boolean update(Map<String, Object> tag) {
        var filterHelper = new CompoundTagEditHelper(tag);
        for (var filter : this.filters) {
            if (!filter.test(filterHelper)) {
                return false;
            }
        }

        var updaterHelper = new CompoundTagEditHelper(tag);
        this.updaters.forEach(updater -> updater.accept(updaterHelper));
        return true;
    }

    Builder builder() {
        return builder;
    }

    @Override
    public int compareTo(CompoundTagUpdater o) {
        return Integer.compare(this.version, o.version);
    }

    @SuppressWarnings("unchecked")
    private record TagNamePredicate(String name) implements Predicate<CompoundTagEditHelper> {
        @Override
        public boolean test(CompoundTagEditHelper helper) {
            var tag = helper.getTag();
            return tag instanceof Map && ((Map<String, Object>) tag).containsKey(name);
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    public class Builder {
        public Builder match(String name, String match) {
            return this.match(name, match, false);
        }

        public Builder match(String name, String match, boolean regex) {
            var pattern = regex ? Pattern.compile(match) : null;

            filters.add(helper -> {
                var tag = helper.getTag();
                if (!(tag instanceof Map)) return false;

                var compound = (Map<String, Object>) tag;
                if (!compound.containsKey(name)) return false;

                if (match.isEmpty()) return true;

                var matchTag = compound.get(name);
                return regex ?
                        pattern.matcher(getTagValue(matchTag)).matches() :
                        match.equals(getTagValue(matchTag));
            });
            return this;
        }

        public Builder edit(String name, Consumer<CompoundTagEditHelper> function) {
            filters.add(new TagNamePredicate(name));
            updaters.add(helper -> {
                helper.pushChild(name);
                function.accept(helper);
                helper.popChild();
            });
            return this;
        }
    }
}
