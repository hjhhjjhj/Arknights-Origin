package reimu.arknights_origin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.ArknightsItemGroups;
import reimu.arknights_origin.customized_Item_category.ExplodingItemMiddle;

public class OriginStoneExplosive_Medium extends ExplodingItemMiddle {
    public OriginStoneExplosive_Medium(Settings settings) {
        super(settings);
    }

    public static final OriginStoneExplosive_Medium CUSTOM_ITEM = new OriginStoneExplosive_Medium(new FabricItemSettings().maxCount(8));

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "origin_stone_explosive_medium"),
                CUSTOM_ITEM);
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 600);

    }

}
