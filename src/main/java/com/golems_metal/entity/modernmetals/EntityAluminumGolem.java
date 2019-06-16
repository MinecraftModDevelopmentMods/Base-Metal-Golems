package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityAluminumGolem extends MetalGolemColorized {
	
	public EntityAluminumGolem(World world) {
		super(world, 0xD8D9D6);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ALUMINUM_GOLEM);
	}
}