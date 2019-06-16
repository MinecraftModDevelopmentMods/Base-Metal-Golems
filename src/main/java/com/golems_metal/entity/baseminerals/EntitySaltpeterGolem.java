package com.golems_metal.entity.baseminerals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntitySaltpeterGolem extends MineralGolemColorized {

	public EntitySaltpeterGolem(World world) {
		super(world, 0xADA1A6);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.SALTPETER_GOLEM);
	}
}