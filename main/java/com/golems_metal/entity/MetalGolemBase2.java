package com.golems_metal.entity;

import java.util.List;

import com.golems.entity.GolemBase;
import com.golems.util.WeightedItem;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class MetalGolemBase2 extends GolemBase
{	
	public MetalGolemBase2(World world, float attack, Block pickBlock) 
	{
		super(world, attack, pickBlock);
		this.setCanSwim(false);
	}
	
	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float partialTicks)
	{
		final int LIGHT_ADDED = 16;
		return super.getBrightnessForRender(partialTicks) + LIGHT_ADDED;
	}
	
	@Override
	public void addGolemDrops(List<WeightedItem> list, boolean recentlyHit, int lootingLevel) 
	{
		int size = 6 + rand.nextInt(6) + lootingLevel;
		this.addDrop(list, new ItemStack(this.getIngot(), size > 36 ? 36 : size), 100);
	}
	
	@Override
	public SoundEvent getGolemSound() 
	{
		return SoundEvents.BLOCK_METAL_STEP;
	}
	
	public abstract Item getIngot();
}
