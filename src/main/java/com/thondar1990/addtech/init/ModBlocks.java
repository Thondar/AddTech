package com.thondar1990.addtech.init;

import com.thondar1990.addtech.block.BlockEnergyStorage;
import com.thondar1990.addtech.block.BlockGeneratorCoal;
import com.thondar1990.addtech.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.energy.EnergyStorage;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;


public class ModBlocks
{

    public static  BlockGeneratorCoal GENERATOR_COAL = new BlockGeneratorCoal("generator_coal", Material.ROCK);
    public static  BlockEnergyStorage ENERGY_STORAGE = new BlockEnergyStorage("energy_storage", Material.ROCK);


    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                GENERATOR_COAL,
                ENERGY_STORAGE
        );

        GameRegistry.registerTileEntity(ENERGY_STORAGE.getTileEntityClass(), ENERGY_STORAGE.getRegistryName().toString());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                GENERATOR_COAL.createItemBlock(),
                ENERGY_STORAGE.createItemBlock()
        );
    }

    public static void registerModels()
    {
        GENERATOR_COAL.registerItemModel(Item.getItemFromBlock(GENERATOR_COAL));
        ENERGY_STORAGE.registerItemModel(Item.getItemFromBlock(ENERGY_STORAGE));
    }

}
