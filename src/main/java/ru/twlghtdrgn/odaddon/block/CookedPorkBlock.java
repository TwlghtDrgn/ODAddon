package ru.twlghtdrgn.odaddon.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ru.twlghtdrgn.odaddon.ODAddon;

public class CookedPorkBlock extends Block {
    public CookedPorkBlock() {
        super(Material.CAKE);
        this.setRegistryName("cooked_pork_block");
        this.setUnlocalizedName("cooked_pork_block");
        this.setCreativeTab(ODAddon.OD);
    }

    private static final AxisAlignedBB CUSTOM_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return CUSTOM_AABB;        
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return CUSTOM_AABB;
    }
}
