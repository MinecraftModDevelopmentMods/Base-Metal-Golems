package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityZirconiumGolem extends MetalGolemColorized {
	
	public EntityZirconiumGolem(World world) {
		super(world, 0xC5C7C5);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ZIRCONIUM_GOLEM);
	}
}