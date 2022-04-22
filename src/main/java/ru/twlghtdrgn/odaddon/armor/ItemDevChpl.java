package ru.twlghtdrgn.odaddon.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import ru.twlghtdrgn.odaddon.ODAddon;

public class ItemDevChpl extends ItemArmor
{
    public static ItemArmor.ArmorMaterial DEVCHPL_MATERIAL = EnumHelper.addArmorMaterial("odaddon:devchpl", "odaddon:devchpl", 4, new int[]{1, 2, 3, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.5F);

    public ItemDevChpl(String name, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(DEVCHPL_MATERIAL, renderIndexIn, equipmentSlotIn);
        this.setMaxDamage(2432);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ODAddon.OD);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
      // If it works, then I'm not messing with it
    }
}