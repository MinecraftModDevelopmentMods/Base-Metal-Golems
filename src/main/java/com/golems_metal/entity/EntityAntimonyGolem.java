package com.golems_metal.entity;

import net.minecraft.world.World;

public class EntityAntimonyGolem extends MetalGolemBase {
    public EntityAntimonyGolem(World world) {
        super(world, 0xFFD8E3DE, false);
        this.setLootTableLoc("golem_antimony");
    }
}
