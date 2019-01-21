package com.golems_metal.entity;

import java.util.List;

import com.golems.blocks.BlockUtilityGlow;
import com.golems.entity.ai.EntityAIPlaceSingleBlock;
import com.golems.main.GolemItems;
import com.golems_metal.init.MetalGolems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class EntityStarSteelGolem extends MetalGolemBase2 {
	
	public static final String ALLOW_HEALING = "Allow Special: Random Healing";
	public static final String ALLOW_LIGHT = "Allow Glowing";
	public static final String LIGHT_FREQ = "Glowing Update Frequency";
	/** Float value between 0.0F and 1.0F that determines light level **/
	private static final float brightness = 0.5F;
	
	
	public EntityStarSteelGolem(World world) {
		super(world);
		this.stepHeight = 1.0F;
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED + 0.06D);
		// allow lighting
		final int lightInt = (int)(brightness * 15.0F);
		final int freq = getConfig(this).getInt(LIGHT_FREQ);
		final boolean allowed = getConfig(this).getBoolean(ALLOW_LIGHT);
		final IBlockState state = GolemItems.blockLightSource.getDefaultState().withProperty(BlockUtilityGlow.LIGHT_LEVEL, lightInt);
		this.tasks.addTask(9, new EntityAIPlaceSingleBlock(this, state, freq, allowed));
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if(rand.nextInt(400) == 0 && getConfig(this).getBoolean(ALLOW_HEALING)) {
			this.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2));
		}

		// slow falling for this entity
		if(this.motionY < -0.1D) {
			this.motionY *= 4.0D / 5.0D;
		}
	}

	@Override
	protected float getJumpUpwardsMotion() {
		return 0.62F;
	}
	
//	@Override
//	public void addGolemDrops(List<WeightedItem> list, boolean recentlyHit, int lootingLevel) 
//	{
//		int size = 6 + rand.nextInt(6) + lootingLevel;
//		this.addDrop(list, MATERIAL.getItemStack(Names.INGOT
//				, size > 36 ? 36 : size), 100);
//	}

	@Override
	protected ResourceLocation applyTexture() {
		return makeGolemTexture(MetalGolems.MODID, "starsteel");
	}

	@Override
	public SoundEvent getGolemSound() {
		return SoundEvents.BLOCK_METAL_STEP;
	}
	
	@Override
    public List<String> addSpecialDesc(final List<String> list) {
		if(getConfig(this).getBoolean(EntityStarSteelGolem.ALLOW_HEALING)) {
			String sHeals = TextFormatting.RED + trans("entitytip.heals");
			list.add(sHeals);
		}
		return list;
	}
}