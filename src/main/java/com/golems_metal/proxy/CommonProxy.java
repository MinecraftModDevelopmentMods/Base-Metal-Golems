package com.golems_metal.proxy;

import com.golems_metal.entity.EntityAdamantineGolem;
import com.golems_metal.entity.EntityAquariumGolem;
import com.golems_metal.entity.EntityBrassGolem;
import com.golems_metal.entity.EntityBronzeGolem;
import com.golems_metal.entity.EntityColdIronGolem;
import com.golems_metal.entity.EntityCopperGolem;
import com.golems_metal.entity.EntityCupronickelGolem;
import com.golems_metal.entity.EntityElectrumGolem;
import com.golems_metal.entity.EntityInvarGolem;
import com.golems_metal.entity.EntityLeadGolem;
import com.golems_metal.entity.EntityMithrilGolem;
import com.golems_metal.entity.EntityNickelGolem;
import com.golems_metal.entity.EntityPlatinumGolem;
import com.golems_metal.entity.EntitySilverGolem;
import com.golems_metal.entity.EntityStarSteelGolem;
import com.golems_metal.entity.EntitySteelGolem;
import com.golems_metal.entity.EntityTinGolem;
import com.golems_metal.entity.EntityZincGolem;
import com.golems_metal.events.BuildEventHandler;
import com.golems_metal.init.MetalGolems;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
	protected static int entityCount;
	
	public void registerEntities() 
	{
		entityCount = 0;
		register(EntityAdamantineGolem.class, "golem_adamantine");
		register(EntityAquariumGolem.class, "golem_aquarium");
		register(EntityBrassGolem.class, "golem_brass");
		register(EntityBronzeGolem.class, "golem_bronze");
		register(EntityColdIronGolem.class, "golem_coldiron");
		register(EntityCopperGolem.class, "golem_copper");
		register(EntityCupronickelGolem.class, "golem_cupronickel");
		register(EntityElectrumGolem.class, "golem_electrum");
		register(EntityInvarGolem.class, "golem_invar");
		register(EntityLeadGolem.class, "golem_lead");
		register(EntityMithrilGolem.class, "golem_mithril");
		register(EntityNickelGolem.class, "golem_nickel");
		register(EntityPlatinumGolem.class, "golem_platinum");
		register(EntitySilverGolem.class, "golem_silver");
		register(EntityStarSteelGolem.class, "golem_starsteel");
		register(EntitySteelGolem.class, "golem_steel");
		register(EntityTinGolem.class, "golem_tin");
		register(EntityZincGolem.class, "golem_zinc");
	}
	
	public void registerEvents()
	{
		MinecraftForge.EVENT_BUS.register(new BuildEventHandler());
	}
	
	/** registers the entity **/
	protected void register(Class<? extends Entity> entityClass, String name)
	{		
		EntityRegistry.registerModEntity(new ResourceLocation(name), entityClass, name, ++entityCount, MetalGolems.instance, 48, 3, true);
	}
}
