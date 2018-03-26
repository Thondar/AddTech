package com.thondar1990.addtech.handler;

import com.thondar1990.addtech.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.image.ConvolveOp;
import java.io.File;

public class ConfigurationHandler
{

    public static Configuration configuration;

    public static boolean testValue = false;

    public static void init(File configFile)
    {
        // Create the config object from the given config file
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent()
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }


    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("TestValue", "TestCategory", false, "This is an example value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }

}




