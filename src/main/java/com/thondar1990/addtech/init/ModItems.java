package com.thondar1990.addtech.init;
import com.thondar1990.addtech.item.ItemBattery;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

public class ModItems
{
    public static final ItemBattery BATTERY = new ItemBattery("battery");


    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                BATTERY
        );
    }

    public static void registerModels()
    {
        BATTERY.registerItemModel();
    }


}
