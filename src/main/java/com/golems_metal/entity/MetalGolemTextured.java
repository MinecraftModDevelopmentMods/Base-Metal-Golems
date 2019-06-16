package com.golems_metal.entity;

import com.golems.entity.GolemBase;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/** NON-COLORIZED METAL GOLEM **/
public abstract class MetalGolemTextured extends GolemBase {
			
	public MetalGolemTextured(World world) {
		super(world);
		this.setCanSwim(false);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemColorized.METAL_GOLEM_SPEED);
	}
	
	/**
	 * Makes a texture at {@code metal_golems:textures/entity/[modid]/golem_[name].png}
	 * Used for organizing textures in this mod, since we support multiple mods
	 **/
	protected static ResourceLocation makeModdedTexture(String modid, String name) {
		return new ResourceLocation(MetalGolems.MODID + ":textures/entity/" + modid + "/" + name + ".png");
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
}
