package ru.twlghtdrgn.odaddon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.twlghtdrgn.odaddon.ODAddon;

public class CookedPorkBlock extends Block {
    public CookedPorkBlock() {
        super(Material.CAKE);
        this.setRegistryName("cooked_pork_block");
        this.setUnlocalizedName("cooked_pork_block");
        this.setCreativeTab(ODAddon.OD);
    }
}
