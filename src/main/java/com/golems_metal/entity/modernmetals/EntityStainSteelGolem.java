package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityStainSteelGolem extends MetalGolemColorized {
	
	public EntityStainSteelGolem(World world) {
		super(world, 0xD8D6D7);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.STAINLESS_STEEL_GOLEM);
	}
}