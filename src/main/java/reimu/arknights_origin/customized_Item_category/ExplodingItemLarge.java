package reimu.arknights_origin.customized_Item_category;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ExplodingItemLarge extends Item {
    public ExplodingItemLarge(Item.Settings settings) { super(settings); }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) world.createExplosion(
                user, user.getX(), user.getY(), user.getZ(), 3000.0F, World.ExplosionSourceType.MOB);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
