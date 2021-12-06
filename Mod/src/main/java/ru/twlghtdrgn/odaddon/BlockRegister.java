package ru.twlghtdrgn.odaddon;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.twlghtdrgn.odaddon.block.*;

public class BlockRegister {
    
    public static Block OD_Block = new ODBlock();
    public static Block Cooked_Pork_Block = new CookedPorkBlock();

    public static void registerBlocks() {
        setRegister(OD_Block);
        setRegister(Cooked_Pork_Block);
    }

    @SideOnly(Side.CLIENT)
    public static void registerBlocksRender() {
        setRender(OD_Block);
        setRender(Cooked_Pork_Block);
    }

    private static void setRegister(Block block) {
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    private static void setRender(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}