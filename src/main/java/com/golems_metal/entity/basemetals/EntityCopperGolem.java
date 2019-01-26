package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCopperGolem extends MetalGolemTextured {

	public EntityCopperGolem(World world) {
		super(world);
		this.setLootTableLoc(MaterialNames.COPPER);
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MaterialNames.COPPER);
	}
}