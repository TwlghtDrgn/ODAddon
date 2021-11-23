package ru.twlghtdrgn.odaddon;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

import org.apache.logging.log4j.Logger;

@Mod(modid = ODAddon.MODID, name = ODAddon.NAME, version = ODAddon.VERSION)
public class ODAddon
{
    public static final String MODID = "odaddon";
    public static final String NAME = "Operation Destory III Add-On";
    public static final String VERSION = "0.0.1";

    @Instance(value=ODAddon.MODID)
    public static ODAddon instance;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Operation Destory III Add-On. Made by TwlghtDrgn for map w\\ same name");

        ItemRegister.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("I'm loading, you know");

        ItemRegister.registerRender();
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        logger.info("Loaded successfuly. Finishing soon");
    }
}
