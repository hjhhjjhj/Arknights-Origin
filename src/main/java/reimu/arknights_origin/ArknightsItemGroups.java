package reimu.arknights_origin;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.block.OriginMineralBlock;
import reimu.arknights_origin.item.OriginStoneExplosive_Large;
import reimu.arknights_origin.item.OriginStoneExplosive_Medium;
import reimu.arknights_origin.item.OriginStoneExplosive_Small;
import reimu.arknights_origin.item.PurestOriginStone;

public final class ArknightsItemGroups {

    public static final ItemGroup ARKNIGHTS_ORIGIN_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(PurestOriginStone.CUSTOM_ITEM))
            .displayName(Text.translatable("itemGroup.arknights_origin"))
            .entries((context, entries) -> {
                entries.add(PurestOriginStone.CUSTOM_ITEM);
                entries.add(OriginStoneExplosive_Small.CUSTOM_ITEM);
                entries.add(OriginStoneExplosive_Medium.CUSTOM_ITEM);
                entries.add(OriginStoneExplosive_Large.CUSTOM_ITEM);
                entries.add(OriginMineralBlock.CUSTOM_BLOCK);
            })
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP,
                Identifier.of("arknights_origin", "arknights_origin"),
                ARKNIGHTS_ORIGIN_GROUP);
    }


}
