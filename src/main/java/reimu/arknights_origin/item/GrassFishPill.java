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

public class GrassFishPill {
    public static final Item CUSTOM_ITEM = new Item(new FabricItemSettings().food(new FoodComponent.Builder()
            .hunger(4)
            .saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1200, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 600, 0), 1.0f)
            .build()));

    public static void register() {
        Registry.register(Registries.ITEM,
                new Identifier("arknights_origin", "grass_fish_pill"),
                CUSTOM_ITEM);
    }
}
