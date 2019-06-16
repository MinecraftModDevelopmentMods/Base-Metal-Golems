package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MetalGolemTextured;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityCopperGolem extends MetalGolemTextured {

	public EntityCopperGolem(World world) {
		super(world);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.COPPER_GOLEM);
	}
	
	@Override
	protected ResourceLocation applyTexture() {
		return makeModdedTexture(InterModComm.MODID_BASE_METALS, MetalGolemNames.COPPER_GOLEM);
	}
}