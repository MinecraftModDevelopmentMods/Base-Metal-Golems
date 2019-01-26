package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.world.World;

public class EntityBismuthGolem extends MetalGolemColorized {

    public EntityBismuthGolem(World world) {
        super(world, 0xFFDDD7CB);
        this.setLootTableLoc("golem_bismuth");
    }
}
