package com.thondar1990.addtech.block;

import com.thondar1990.addtech.tile.TileEntityEnergyStorage;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockEnergyStorage extends BlockTileEntity<TileEntityEnergyStorage>
{
    public BlockEnergyStorage(String name, Material material)
    {
        super(name, material);
        this.setHarvestLevel("pickaxe", 0);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if(!world.isRemote){
            TileEntityEnergyStorage tile = getTileEntity(world, pos);
            if(side == EnumFacing.DOWN){
                tile.decrementCount();
            }
            else if(side == EnumFacing.UP){
                tile.incrementCount();
            }
            player.sendMessage(new TextComponentString("Count: " + tile.getCount()));
        }
        return true;
    }

    @Override
    public Class<TileEntityEnergyStorage> getTileEntityClass(){
        return TileEntityEnergyStorage.class;
    }

    @Nullable
    @Override
    public TileEntityEnergyStorage createTileEntity(World world, IBlockState state){
        return new TileEntityEnergyStorage();
    }

}
