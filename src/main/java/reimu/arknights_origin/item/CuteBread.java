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

public class CuteBread {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
            .hunger(6)
            .saturationModifier(3.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 7200, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 7200, 2), 1.0f)
            .alwaysEdible()
            .build()));

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "cute_bread"),
                CUSTOM_ITEM);
    }
}
