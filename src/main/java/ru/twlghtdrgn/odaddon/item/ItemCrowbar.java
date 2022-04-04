package ru.twlghtdrgn.odaddon.item;

import net.minecraft.item.Item;
import ru.twlghtdrgn.odaddon.ODAddon;

public class ItemCrowbar extends Item {

    public ItemCrowbar() {
        this.setUnlocalizedName("crowbar");
        this.setRegistryName("crowbar");
        this.setMaxStackSize(1);
        this.setCreativeTab(ODAddon.OD);
        this.setHasSubtypes(false);
    }
}
