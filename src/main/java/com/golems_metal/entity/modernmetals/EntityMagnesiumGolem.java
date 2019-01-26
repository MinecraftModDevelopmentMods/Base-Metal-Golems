package com.golems_metal.entity.modernmetals;

import com.golems.entity.ai.EntityAIPlaceRandomBlocksStrictly;
import com.golems_metal.entity.MetalGolemColorized;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class EntityMagnesiumGolem extends MetalGolemColorized
{
	public static final String ALLOW_PLACE_FIRE = "Allow Special: Place Fires";
	public static final String ALLOW_BURN_MOBS = "Allow Special: Ignite Creatures";
	public static final String FIRE_FREQ = "Fire Placement Interval";
	
	public EntityMagnesiumGolem(World world) 
	{
		super(world, 0xBEBEBB);
		int ticks = getConfig(this).getInt(FIRE_FREQ);
		boolean allow = getConfig(this).getBoolean(ALLOW_PLACE_FIRE);
		IBlockState[] fire = new IBlockState[] { Blocks.FIRE.getDefaultState() };
		EntityAIBase aiPlaceFire = new com.golems.entity.ai.EntityAIPlaceRandomBlocks(this, ticks, fire, 
				EntityAIPlaceRandomBlocksStrictly.getGriefingPredicate().and(EntityAIPlaceRandomBlocksStrictly.getPredicate(allow)));
		this.tasks.addTask(2, aiPlaceFire);
		if(allow) this.isImmuneToFire = true;
	}
	
	/** Attack by lighting on fire as well */
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		final int BURN_CHANCE = 20;
		if(super.attackEntityAsMob(entity)) {
			if(getConfig(this).getBoolean(ALLOW_BURN_MOBS) && this.rand.nextInt(100) < BURN_CHANCE) {
				entity.setFire(2 + rand.nextInt(5));
			}
			return true;
		}
		return false;
	}
}