package ru.twlghtdrgn.odaddon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = odaddon.MODID, name = odaddon.NAME, version = odaddon.VERSION)
public class odaddon
{
    public static final String MODID = "odaddon";
    public static final String NAME = "Operation Destory III Add-On";
    public static final String VERSION = "0.0.1";

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Operation Destory III Add-On. Made by TwlghtDrgn for map w\\ same name");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("I'm loading, you know");
    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        logger.info("Loaded successfuly. Finishing soon");
    }
}
