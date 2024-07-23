## Usage

```java
ItemStateUpdater.Entry updatedEntry = ItemStateUpdaters.updateItemState(
        new ItemStateUpdater.Entry("minecraft:coal", 1),
        ItemStateUpdaters.LATEST_VERSION
);
// or
NbtMap updatedNbt = ItemStateUpdaters.updateItemState(
        NbtMap.builder()
                .putString("name", "minecraft:coal")
                .putInt("meta", 1)
                .build(),
        ItemStateUpdaters.LATEST_VERSION
);
```

## Acknowledgements

* [BedrockItemUpgradeSchema](https://github.com/pmmp/BedrockItemUpgradeSchema)
* [BlockStateUpdater](https://github.com/CloudburstMC/BlockStateUpdater)