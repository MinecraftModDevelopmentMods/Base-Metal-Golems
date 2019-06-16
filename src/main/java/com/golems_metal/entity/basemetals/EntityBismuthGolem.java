package com.golems_metal.entity.basemetals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.init.MetalGolems;

import net.minecraft.world.World;

public class EntityBismuthGolem extends MetalGolemColorized {

    public EntityBismuthGolem(World world) {
        super(world, 0xFFDDD7CB);
        this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.BISMUTH_GOLEM);
    }
}
