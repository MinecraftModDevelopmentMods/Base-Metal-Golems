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

/** COLORIZED MINERAL GOLEM **/
public abstract class MineralGolemColorized extends GolemColorized {
	
	public static final double MINERAL_GOLEM_SPEED = 0.24D;
	
	private static final ResourceLocation TEXTURE_BASE = makeTexture(MetalGolems.MODID, "golem_mineral");
	private static final ResourceLocation TEXTURE_OVERLAY = makeTexture(MetalGolems.MODID, "golem_mineral_grayscale");

	public MineralGolemColorized(World world, long color) {
		super(world, color, TEXTURE_BASE, TEXTURE_OVERLAY);
		this.setCanSwim(false);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MineralGolemColorized.MINERAL_GOLEM_SPEED);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender() {
		final int LIGHT_ADDED = 16;
		return super.getBrightnessForRender() + LIGHT_ADDED;
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_STONE_STEP;
	}
}
