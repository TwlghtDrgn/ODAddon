package ru.twlghtdrgn.odaddon;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.twlghtdrgn.odaddon.item.*;
import ru.twlghtdrgn.odaddon.food.*;
import ru.twlghtdrgn.odaddon.armor.*;

public class ItemRegister {

    // Items
    public static Item screwdriver = new ItemScrewdriver();
    public static Item crowbar = new ItemCrowbar();
    public static Item cap = new ItemCap();

    // Food
    public static Item spam = new ItemSpam(20, 40.0F, true);

    // Armor
    public static Item devchpl = new ItemDevChpl("devchpl", 1, EntityEquipmentSlot.CHEST);

    public static void register() {
        setRegister(screwdriver);
        setRegister(crowbar);
        setRegister(spam);
        setRegister(cap);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(screwdriver);
        setRender(crowbar);
        setRender(spam);
        setRender(cap);
    }

    private static void setRegister(Item item) {
        ForgeRegistries.ITEMS.registerAll(item);
    }
    
    @SideOnly(Side.CLIENT)
    private static void setRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
