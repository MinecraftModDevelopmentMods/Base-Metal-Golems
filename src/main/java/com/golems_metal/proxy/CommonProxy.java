package com.golems_metal.proxy;

import com.golems_metal.entity.*;
import com.golems_metal.events.BuildEventHandler;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.init.Materials;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
	protected static int entityCount;
	
	public void registerEntities()
	{
		entityCount = 0;
		if(Materials.hasMaterial(MaterialNames.ADAMANTINE)) {
			register(EntityAdamantineGolem.class, "golem_adamantine");
		}
		if(Materials.hasMaterial(MaterialNames.ANTIMONY)) {
			register(EntityAntimonyGolem.class, "golem_antimony");
		}
		if(Materials.hasMaterial(MaterialNames.BISMUTH)) {
			register(EntityAquariumGolem.class, "golem_aquarium");
		}
		if(Materials.hasMaterial(MaterialNames.AQUARIUM)) {
			register(EntityBismuthGolem.class, "golem_bismuth");
		}
		if(Materials.hasMaterial(MaterialNames.BRASS)) {
			register(EntityBrassGolem.class, "golem_brass");
		}
		if(Materials.hasMaterial(MaterialNames.BRONZE)) {
			register(EntityBronzeGolem.class, "golem_bronze");
		}
		if(Materials.hasMaterial(MaterialNames.COLDIRON)) {
			register(EntityColdIronGolem.class, "golem_coldiron");
		}
		if(Materials.hasMaterial(MaterialNames.COPPER)) {
			register(EntityCopperGolem.class, "golem_copper");
		}
		if(Materials.hasMaterial(MaterialNames.CUPRONICKEL)) {
			register(EntityCupronickelGolem.class, "golem_cupronickel");
		}
		if(Materials.hasMaterial(MaterialNames.ELECTRUM)) {
			register(EntityElectrumGolem.class, "golem_electrum");
		}
		if(Materials.hasMaterial(MaterialNames.INVAR)) {
			register(EntityInvarGolem.class, "golem_invar");
		}
		if(Materials.hasMaterial(MaterialNames.LEAD)) {
			register(EntityLeadGolem.class, "golem_lead");
		}
		if(Materials.hasMaterial(MaterialNames.MITHRIL)) {
			register(EntityMithrilGolem.class, "golem_mithril");
		}
		if(Materials.hasMaterial(MaterialNames.NICKEL)) {
			register(EntityNickelGolem.class, "golem_nickel");
		}
		if(Materials.hasMaterial(MaterialNames.PEWTER)) {
			register(EntityPewterGolem.class, "golem_pewter");
		}
		if(Materials.hasMaterial(MaterialNames.PLATINUM)) {
			register(EntityPlatinumGolem.class, "golem_platinum");
		}
		if(Materials.hasMaterial(MaterialNames.SILVER)) {
			register(EntitySilverGolem.class, "golem_silver");
		}
		if(Materials.hasMaterial(MaterialNames.STARSTEEL)) {
			register(EntityStarSteelGolem.class, "golem_starsteel");
		}
		if(Materials.hasMaterial(MaterialNames.STEEL)) {
			register(EntitySteelGolem.class, "golem_steel");
		}
		if(Materials.hasMaterial(MaterialNames.TIN)) {
			register(EntityTinGolem.class, "golem_tin");
		}
		if(Materials.hasMaterial(MaterialNames.ZINC)) {
			register(EntityZincGolem.class, "golem_zinc");
		}
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
