package com.thondar1990.addtech.item;

import com.thondar1990.addtech.AddTech;
import com.thondar1990.addtech.creativetab.CreativeTabAddtech;
import com.thondar1990.addtech.init.ModItems;
import com.thondar1990.addtech.proxy.ClientProxy;
import com.thondar1990.addtech.utility.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item
{

    public ItemBase(String name)
    {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        maxStackSize = 1;
        setCreativeTab(CreativeTabAddtech.ADDTECH_TAB);
    }

    public void registerItemModel()
    {
        AddTech.proxy.registerItemRenderer(this, 0, "inventory");
    }



}
