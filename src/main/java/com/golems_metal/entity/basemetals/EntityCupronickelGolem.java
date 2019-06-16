package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityCupronickelGolem extends MetalGolemColorized {
	
	public EntityCupronickelGolem(World world) {
		super(world, 0x98896C);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.CUPRONICKEL_GOLEM);
	}
}