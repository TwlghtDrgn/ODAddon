package ru.twlghtdrgn.odaddon.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSandwich extends Item {
    public static final String NAME = "susFood";

    public ItemSandwich() {
        setUnlocalizedName(NAME);
        setMaxStackSize(16);
        setCreativeTab(CreativeTabs.FOOD);
    }
}
