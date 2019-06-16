package com.golems_metal.entity.baseminerals;

import com.golems_metal.entity.MetalGolemNames;
import com.golems_metal.entity.MineralGolemColorized;
import com.golems_metal.init.MetalGolems;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;

public class EntitySulfurGolem extends MineralGolemColorized {
	
	private static final int PARTICLE_DELAY = 18;

	public EntitySulfurGolem(World world) {
		super(world, 0xC4B143);
		this.setLootTableLoc(MetalGolems.MODID, MetalGolemNames.SULFUR_GOLEM);
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (world.isRemote && this.getRNG().nextInt(PARTICLE_DELAY) == 0) {
			final EnumParticleTypes particle = EnumParticleTypes.LAVA;
			final double x = this.rand.nextDouble() - 0.5D * (double) this.width * 0.6D;
			final double y = this.rand.nextDouble() * (this.height - 0.75D);
			final double z = this.rand.nextDouble() - 0.5D * (double) this.width * 0.6D;
			final double speedX = (this.rand.nextDouble() - 0.5D) * 0.4D;
			final double speedY = (this.rand.nextDouble() - 0.5D) * 0.4D;
			final double speedZ = (this.rand.nextDouble() - 0.5D) * 0.4D;
			this.world.spawnParticle(particle, this.posX + x, this.posY + y, this.posZ + z,
				speedX, speedY, speedZ);
		}
	}
}