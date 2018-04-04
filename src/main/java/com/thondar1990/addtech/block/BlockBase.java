package com.thondar1990.addtech.block;

import com.thondar1990.addtech.AddTech;
import com.thondar1990.addtech.creativetab.CreativeTabAddtech;
import com.thondar1990.addtech.init.ModBlocks;
import com.thondar1990.addtech.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block
{

    protected String name;

    public BlockBase(String name, Material material)
    {
        super(material);

        this.name = name;

        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabAddtech.ADDTECH_TAB);
    }

    public void registerItemModel(Item itemBlock)
    {
        AddTech.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

}
