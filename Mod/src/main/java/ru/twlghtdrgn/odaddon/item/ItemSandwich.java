package ru.twlghtdrgn.odaddon.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSandwich extends Item {

    public ItemSandwich(String string) {
        this.setUnlocalizedName(string);
        this.setRegistryName(string);
        this.setMaxStackSize(16);
        this.setCreativeTab(CreativeTabs.FOOD);
        this.setHasSubtypes(false);
    }
}
