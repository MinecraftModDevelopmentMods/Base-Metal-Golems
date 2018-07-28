package com.golems_metal.proxy;

import com.golems_metal.entity.*;
import com.golems_metal.events.BuildEventHandler;
import com.golems_metal.init.MetalGolems;
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
		register(EntityAntimonyGolem.class, "golem_antimony");
		register(EntityAquariumGolem.class, "golem_aquarium");
		register(EntityBismuthGolem.class, "golem_bismuth");
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
		register(EntityPewterGolem.class, "golem_pewter");
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
	protected void register(Class entityClass, String name)
	{		
		EntityRegistry.registerModEntity(new ResourceLocation(MetalGolems.MODID + ":textures/entity" + name
                + ".png"), entityClass, MetalGolems.MODID + "." + name, ++entityCount, MetalGolems.instance,
                48, 3, true);
	}
}
