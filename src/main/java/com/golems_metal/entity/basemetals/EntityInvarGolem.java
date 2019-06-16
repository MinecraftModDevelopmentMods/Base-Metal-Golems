package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityInvarGolem extends MetalGolemColorized {

	public EntityInvarGolem(World world) {
		super(world, 0xC7C2AE);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.INVAR_GOLEM);
	}
}