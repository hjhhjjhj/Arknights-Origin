package reimu.arknights_origin.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import reimu.arknights_origin.ArknightsItemGroups;

public class GrassFishHotPill {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 3000, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4800, 0), 1.0f)
            .alwaysEdible()
            .build()));

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "grass_fish_hot_pill"),
                CUSTOM_ITEM);
    }
}
