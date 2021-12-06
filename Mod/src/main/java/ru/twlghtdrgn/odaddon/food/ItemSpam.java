package ru.twlghtdrgn.odaddon.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import ru.twlghtdrgn.odaddon.ODAddon;

public class ItemSpam extends ItemFood {
    public ItemSpam(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
        this.setRegistryName("spam");
        this.setUnlocalizedName("spam");
        this.setMaxStackSize(16);
        this.setCreativeTab(ODAddon.OD);
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        super.onFoodEaten(stack, worldIn, player);

        if (player.getFoodStats().getFoodLevel() > 2)
            player.addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 2400));
    }
}
