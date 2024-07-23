## Usage

```java
// Update legacy items to new latest items (example for update jungle planks)
NbtMap updatedNbt = ItemStateUpdaters.updateItemState(
        NbtMap.builder()
                .putString("Id", "5")
                .putInt("Damage", 3)
                .build(),
        ItemStateUpdaters.LATEST_VERSION
);
// or update new items to latest
NbtMap updatedNbt = ItemStateUpdaters.updateItemState(
        NbtMap.builder()
                .putString("Name", "minecraft:coal")
                .putInt("Damage", 1)
                .build(),
        ItemStateUpdaters.LATEST_VERSION
);
```

## Acknowledgements

* [BedrockItemUpgradeSchema](https://github.com/pmmp/BedrockItemUpgradeSchema)
* [BlockStateUpdater](https://github.com/CloudburstMC/BlockStateUpdater)