package reimu.arknights_origin;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.item.OriginStoneExplosive_Small;
import reimu.arknights_origin.item.PurestOriginStone;

public final class ArknightsItemGroups {

    //public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings());

    public static final ItemGroup TEST_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(PurestOriginStone.CUSTOM_ITEM))
            .displayName(Text.translatable("itemGroup.arknights_origin.test_group"))
            .entries((context, entries) -> {
                entries.add(PurestOriginStone.CUSTOM_ITEM);
                entries.add(OriginStoneExplosive_Small.CUSTOM_ITEM);
            })
            .build();

    public static void initialize() {
        // 注册分页
        Registry.register(Registries.ITEM_GROUP,
                Identifier.of("arknights_origin", "test_group"),
                TEST_GROUP);
    }


}
