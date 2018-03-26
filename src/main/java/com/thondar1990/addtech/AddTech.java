package com.thondar1990.addtech;

import com.thondar1990.addtech.handler.ConfigurationHandler;
import com.thondar1990.addtech.proxy.IProxy;
import com.thondar1990.addtech.reference.Reference;
import com.thondar1990.addtech.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class AddTech
{

    @Mod.Instance(Reference.MOD_ID)
    public static AddTech instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Load items and blocks here aswell as configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register GUI, tile entities, crafting recipes etc.
        LogHelper.info("Initialization Complete!");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrap things up here.
        LogHelper.info("Post Initialization Complete!");

    }


}
