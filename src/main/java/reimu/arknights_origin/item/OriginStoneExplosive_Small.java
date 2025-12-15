package reimu.arknights_origin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.ArknightsItemGroups;
import reimu.arknights_origin.customized_Item_category.ExplodingItemLittle;

public class OriginStoneExplosive_Small extends ExplodingItemLittle {
    public OriginStoneExplosive_Small(Settings settings) {
        super(settings);
    }

    // 创建物品
    public static final ExplodingItemLittle CUSTOM_ITEM = new ExplodingItemLittle(new FabricItemSettings().maxCount(16));

    // 注册物品
    public static void register() {
        FuelRegistry.INSTANCE.add(CUSTOM_ITEM, 300);
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "origin_stone_explosive_small"),
                CUSTOM_ITEM);

    }

}
