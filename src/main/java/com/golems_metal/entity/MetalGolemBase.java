package com.golems_metal.entity;

import com.golems.entity.GolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/** COLORIZED METAL GOLEM **/
public abstract class MetalGolemBase extends GolemColorized {
	
	public static final double METAL_GOLEM_SPEED = 0.20D;
	
	private static final ResourceLocation TEXTURE_BASE = makeGolemTexture(MetalGolems.MODID, "metal");
	private static final ResourceLocation TEXTURE_OVERLAY_LOW = makeGolemTexture(MetalGolems.MODID, "metal_grayscale_low");
	private static final ResourceLocation TEXTURE_OVERLAY_HIGH = makeGolemTexture(MetalGolems.MODID, "metal_grayscale_high");

	public MetalGolemBase(World world, long color, boolean isHighContrast) {
		super(world, color, TEXTURE_BASE, (isHighContrast ? TEXTURE_OVERLAY_HIGH : TEXTURE_OVERLAY_LOW));
		this.setCanSwim(false);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED);
	}
	
	public MetalGolemBase(World world, long color) {
		this(world, color, false);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		final int LIGHT_ADDED = 16;
		return super.getBrightnessForRender() + LIGHT_ADDED;
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}

	@Override
	public void setLootTableLoc(final String name) {
		this.lootTableLoc = new ResourceLocation(MetalGolems.MODID, "entities/" + name);
	}
}
