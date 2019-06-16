package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityPlatinumGolem extends MetalGolemColorized {

	public EntityPlatinumGolem(World world) {
		super(world, 0xFFF2FFFF);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.PLATINUM_GOLEM);
	}
}