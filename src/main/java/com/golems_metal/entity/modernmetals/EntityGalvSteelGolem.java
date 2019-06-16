package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityGalvSteelGolem extends MetalGolemColorized {
	
	public EntityGalvSteelGolem(World world) {
		super(world, 0xC8CDCB);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.GALVANIZED_STEEL_GOLEM);
	}
}