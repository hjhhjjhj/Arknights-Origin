package reimu.arknights_origin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.ArknightsItemGroups;
import reimu.arknights_origin.customized_Item_category.ExplodingItemLarge;

public class OriginStoneExplosive_Large extends ExplodingItemLarge {
    public OriginStoneExplosive_Large(Settings settings) {
        super(settings);
    }

    public static final OriginStoneExplosive_Large CUSTOM_ITEM = new OriginStoneExplosive_Large(new FabricItemSettings().maxCount(4));

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "origin_stone_explosive_large"),
                CUSTOM_ITEM);
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 900);

    }

}
