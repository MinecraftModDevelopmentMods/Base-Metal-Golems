package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityAntimonyGolem extends MetalGolemColorized {
    public EntityAntimonyGolem(World world) {
        super(world, 0xFFD8E3DE);
        this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.ANTIMONY_GOLEM);
    }
}
