package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityZincGolem extends MetalGolemColorized {
	
	public EntityZincGolem(World world) {
		super(world, 0xB1B1B1);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ZINC_GOLEM);
	}
}