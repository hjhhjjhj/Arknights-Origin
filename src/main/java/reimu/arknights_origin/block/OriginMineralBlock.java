package reimu.arknights_origin.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class OriginMineralBlock {
    // 创建方块
    public static final Block CUSTOM_BLOCK = register("origin_mineral_block", new Block(Block.Settings.create()
            .strength(2.0f, 24.0f)
            .requiresTool()

            ));

    // 注册物品
    private static <T extends Block> T register(String path, T block) {
        Registry.register(Registries.BLOCK, Identifier.of("arknights_origin", path), block);
        Registry.register(Registries.ITEM, Identifier.of("arknights_origin", path), new BlockItem(block, new Item.Settings()));
        return block;
    }

    public static void initialize() {
    }
    //测试
}
