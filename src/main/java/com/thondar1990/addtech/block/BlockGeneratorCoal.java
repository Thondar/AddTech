package com.thondar1990.addtech.block;

import net.minecraft.block.material.Material;

public class BlockGeneratorCoal extends BlockBase
{
    public BlockGeneratorCoal(String name, Material material)
    {
        super(name, material);
        this.setHarvestLevel("pickaxe", 0);
    }


}
