package com.golems_metal.entity.baseminerals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityNiterGolem extends MineralGolemColorized {

	public EntityNiterGolem(World world) {
		super(world, 0xB5A59B);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.NITER_GOLEM);
	}
}