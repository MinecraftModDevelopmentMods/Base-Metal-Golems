package com.golems_metal.entity;

import java.util.List;

import com.golems.entity.GolemBase;
import com.golems.entity.GolemColorized;
import com.golems.util.WeightedItem;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;

import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class MetalGolemBase extends GolemColorized
{
	public static final double METAL_GOLEM_SPEED = 0.20D;
	
	private static final ResourceLocation TEXTURE_BASE = GolemBase.makeGolemTexture(MetalGolems.MODID, "metal");
	private static final ResourceLocation TEXTURE_OVERLAY_LOW = GolemBase.makeGolemTexture(MetalGolems.MODID, "metal_grayscale_low");
	private static final ResourceLocation TEXTURE_OVERLAY_HIGH = GolemBase.makeGolemTexture(MetalGolems.MODID, "metal_grayscale_high");
		
	public MetalGolemBase(World world, float attack, Block pickBlock, long color, boolean isHighContrast) 
	{
		super(world, attack, new ItemStack(pickBlock), color, TEXTURE_BASE, isHighContrast ? TEXTURE_OVERLAY_HIGH : TEXTURE_OVERLAY_LOW);
		this.setCanSwim(false);
	}
	
	public MetalGolemBase(World world, float attack, Block pickBlock, long color) 
	{
		this(world, attack, pickBlock, color, false);
	}
	
	public static Block getBlockForMat(String material) {
		return Materials.getMaterialByName(material).getBlock(Names.BLOCK);
	}
	
	public static Item getIngotForMat(String material) {
		return Materials.getMaterialByName(material).getItem(Names.INGOT);
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
