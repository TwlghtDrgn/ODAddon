package ru.twlghtdrgn.odaddon;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import org.apache.logging.log4j.Logger;

@Mod(modid = ODAddon.MODID, name = ODAddon.NAME, version = ODAddon.VERSION)
public class ODAddon
{
    public static final String MODID = "odaddon";
    public static final String NAME = "Operation Destory III Add-On";
    public static final String VERSION = "DEV BUILD";

    @Instance(value=ODAddon.MODID)
    public static ODAddon instance;

    public static final CreativeTabs OD = new CreativeTabs("ODAddon") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(BlockRegister.odblock);
        }
    };

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Operation Destory III Add-On. Made by TwlghtDrgn for map w\\ same name");
        logger.info("Loading blocks and items NOW!");


        ItemRegister.register();
        BlockRegister.registerBlocks();

        logger.info("Seems blocks and items loaded. Great!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("Loading textures...");

        ItemRegister.registerRender();
        BlockRegister.registerBlocksRender();

        logger.info("Textures loaded.");
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        logger.info("Loaded successfuly. That means Minecraft starts soon!");
    }
}
