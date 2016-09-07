package com.golems_metal.entity;

import java.util.List;

import com.golems.entity.GolemLightProvider;
import com.golems.util.WeightedItem;
import com.golems_metal.init.MetalConfig;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityStarSteelGolem extends GolemLightProvider
{
	public static final String ALLOW_HEALING = "Allow Special: Random Healing";
	
	public EntityStarSteelGolem(World world) 
	{
		super(world, MetalConfig.STARSTEEL.getBaseAttack(), cyano.basemetals.init.Blocks.starsteel_block, EnumLightLevel.HALF);
		this.stepHeight = 1.0F;
	}

	@Override
	protected void applyAttributes() 
	{
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(MetalConfig.STARSTEEL.getMaxHealth());
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(MetalGolemBase.METAL_GOLEM_SPEED + 0.06D);
	}

	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	@Override
	public void onLivingUpdate()
	{
		super.onLivingUpdate();
		if(rand.nextInt(400) == 0 && MetalConfig.STARSTEEL.getBoolean(ALLOW_HEALING))
		{
			this.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 2));
		}

		// slow falling for this entity
		if(this.motionY < -0.1D)
		{
			this.motionY *= 4.0D / 5.0D;
		}
	}

	@Override
	protected float getJumpUpwardsMotion()
	{
		return 0.62F;
	}
	
	@Override
	public void addGolemDrops(List<WeightedItem> list, boolean recentlyHit, int lootingLevel) 
	{
		int size = 6 + rand.nextInt(6) + lootingLevel;
		this.addDrop(list, new ItemStack(cyano.basemetals.init.Items.starsteel_ingot, size > 36 ? 36 : size), 100);
	}

	@Override
	protected ResourceLocation applyTexture() 
	{
		return this.makeGolemTexture(MetalGolems.MODID, "starsteel");
	}

	@Override
	public SoundEvent getGolemSound() 
	{
		return SoundEvents.BLOCK_METAL_STEP;
	}
}