package ru.twlghtdrgn.odaddon.item;

import net.minecraft.item.Item;
import ru.twlghtdrgn.odaddon.ODAddon;

public class ItemScrewdriver extends Item {

    public ItemScrewdriver() {
        this.setUnlocalizedName("screwdriver");
        this.setRegistryName("screwdriver");
        this.setMaxStackSize(16);
        this.setCreativeTab(ODAddon.OD);
        this.setHasSubtypes(false);
    }
}
