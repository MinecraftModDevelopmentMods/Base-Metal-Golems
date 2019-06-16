package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityTitaniumGolem extends MetalGolemColorized {
	
	public EntityTitaniumGolem(World world) {
		super(world, 0xB9BABC);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.TITANIUM_GOLEM);
	}
}