package ru.twlghtdrgn.odaddon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.twlghtdrgn.odaddon.item.*;

public class ItemRegister {

    public static Item sandwich = new ItemSandwich("itemSandwich");

    public static void register() {
        setRegister(sandwich);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(sandwich);
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.registerAll(item);
    }
    
    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
