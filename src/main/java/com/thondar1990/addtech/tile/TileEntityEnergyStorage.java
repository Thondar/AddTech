package com.thondar1990.addtech.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityEnergyStorage extends TileEntity
{

    private int count;


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound)
    {
        compound.setInteger("count", count);
        return super.writeToNBT(compound);

    }

    @Override
    public void readFromNBT(NBTTagCompound compound)
    {
        count = compound.getInteger("count");
        super.readFromNBT(compound);
    }

    public int getCount()
    {
        return count;
    }

    public int incrementCount()
    {
        count++;
        markDirty();
        return count;
    }

    public int decrementCount()
    {
        count--;
        markDirty();
        return count;
    }

}
