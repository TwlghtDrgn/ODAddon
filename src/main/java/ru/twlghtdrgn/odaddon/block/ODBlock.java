package ru.twlghtdrgn.odaddon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ODBlock extends Block {
    public ODBlock() {
        super(Material.AIR);
        this.setRegistryName("odblock");
        this.setUnlocalizedName("odblock");
    }
}
