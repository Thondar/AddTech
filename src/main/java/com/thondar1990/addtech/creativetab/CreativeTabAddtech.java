package com.thondar1990.addtech.creativetab;

import com.thondar1990.addtech.init.ModItems;
import com.thondar1990.addtech.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabAddtech
{

    public static final CreativeTabs ADDTECH_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return ModItems.BATTERY.getDefaultInstance();
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return  "AddTech";
        }

    };

}
