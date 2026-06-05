package reimu.arknights_origin;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.block.OriginMineralBlock;
import reimu.arknights_origin.item.CuteBread;
import reimu.arknights_origin.item.OriginStoneExplosive_Large;
import reimu.arknights_origin.item.OriginStoneExplosive_Medium;
import reimu.arknights_origin.item.OriginStoneExplosive_Small;
import reimu.arknights_origin.item.PurestOriginStone;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArknightsOrigin implements ModInitializer {
	public static final String MOD_ID = "arknights-origin";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // 初始化自定义方块
    //public static final Block ORIGIN_MINERAL_BLOCK = new Block(FabricBlockSettings.create().strength(50.0f, 4.0f));// 源石矿方块

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

        // 模板生成
        //

        // 方块注册
        OriginMineralBlock.initialize();

        // 物品组注册
        ArknightsItemGroups.initialize();
        // 物品注册
        PurestOriginStone.register();
        OriginStoneExplosive_Small.register();
        OriginStoneExplosive_Medium.register();
        OriginStoneExplosive_Large.register();
        CuteBread.register();

        LOGGER.info("Hello Fabric world!");
	}
}