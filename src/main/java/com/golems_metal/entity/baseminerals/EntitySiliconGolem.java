package com.golems_metal.entity.baseminerals;

import com.golems_metal.entity.MetalGolemColorized;
import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntitySiliconGolem extends MineralGolemColorized {

	public EntitySiliconGolem(World world) {
		super(world, 0x767A87);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.SILICON_GOLEM);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemColorized.METAL_GOLEM_SPEED + 0.02D);
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}
}