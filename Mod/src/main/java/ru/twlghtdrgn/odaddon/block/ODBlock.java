package ru.twlghtdrgn.odaddon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ODBlock extends Block {
    public ODBlock(String name) {
        super(Material.GLASS);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}
