package com.golems_metal.entity.modernmetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.init.InterModComm;

import net.minecraft.world.World;

public class EntityManganeseGolem extends MetalGolemColorized {
	
	public EntityManganeseGolem(World world) {
		super(world, 0xEBDDE0);
		this.setLootTableLoc(InterModComm.MANGANESE);
	}
}