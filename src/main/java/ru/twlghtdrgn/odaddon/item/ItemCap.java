package ru.twlghtdrgn.odaddon.item;

import net.minecraft.item.Item;
import ru.twlghtdrgn.odaddon.ODAddon;

public class ItemCap extends Item {

    public ItemCap() {
        this.setUnlocalizedName("cap");
        this.setRegistryName("cap");
        this.setMaxStackSize(64);
        this.setCreativeTab(ODAddon.OD);
        this.setHasSubtypes(false);
    }
}
