package com.golems_metal.entity.baseminerals;

import java.util.List;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntitySaltGolem extends MineralGolemColorized {

	public static final String ALLOW_DISSOLVE = "Dissolves in Water";
	private static final int DISSOLVE_CHANCE = 80;
	private boolean dissolves;
	
	public EntitySaltGolem(World world) {
		super(world, 0xB1B1B0);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.SALT_GOLEM);
		this.dissolves = getConfig(this).getBoolean(ALLOW_DISSOLVE);
	}
	

	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		// salt dissolves in water
		if(dissolves && this.isWet() && this.getRNG().nextInt(DISSOLVE_CHANCE) == 0) {
			this.damageEntity(DamageSource.WITHER, 0.5F);
		}
	}
	
	@Override
	public List<String> addSpecialDesc(final List<String> list) { 
		if(this.dissolves) {
			list.add(TextFormatting.AQUA + trans("entitytip.dissolves_in_water"));
		}
		return list;
	}
}