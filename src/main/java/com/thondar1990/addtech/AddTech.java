package com.thondar1990.addtech;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="addtech", name="Add Tech", version="1.12.2-1.0")
public class AddTech
{

    @Mod.Instance("addtech")
    public static AddTech instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Load items and blocks here

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register GUI, tile entities, crafting recipes etc.

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // Wrap things up here.

    }


}
