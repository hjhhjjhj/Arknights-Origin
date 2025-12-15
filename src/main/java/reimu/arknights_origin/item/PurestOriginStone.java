package reimu.arknights_origin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.ArknightsItemGroups;

public class PurestOriginStone {
    // 创建物品
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    // 注册物品
    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "purest_origin_stone"),
                CUSTOM_ITEM);

        // 加入物品组
        //ArknightsItemGroups.initialize();
    }
}
