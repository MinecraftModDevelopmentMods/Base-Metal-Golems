package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.*;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = MetalGolems.MODID)
public class CommonProxy
{
	protected static int entityCount;
	
	public void registerEntities()
	{
		entityCount = 0;
		if(Materials.hasMaterial(MaterialNames.ADAMANTINE)) {
			register(EntityAdamantineGolem.class, "golem_adamantine", Materials.getMaterialByName(MaterialNames.ADAMANTINE));
		}
		if(Materials.hasMaterial(MaterialNames.ANTIMONY)) {
			register(EntityAntimonyGolem.class, "golem_antimony", Materials.getMaterialByName(MaterialNames.ANTIMONY));
		}
		if(Materials.hasMaterial(MaterialNames.AQUARIUM)) {
			register(EntityAquariumGolem.class, "golem_aquarium", Materials.getMaterialByName(MaterialNames.AQUARIUM));
		}
		if(Materials.hasMaterial(MaterialNames.BISMUTH)) {
			register(EntityBismuthGolem.class, "golem_bismuth", Materials.getMaterialByName(MaterialNames.BISMUTH));
		}
		if(Materials.hasMaterial(MaterialNames.BRASS)) {
			register(EntityBrassGolem.class, "golem_brass", Materials.getMaterialByName(MaterialNames.BRASS));
		}
		if(Materials.hasMaterial(MaterialNames.BRONZE)) {
			register(EntityBronzeGolem.class, "golem_bronze", Materials.getMaterialByName(MaterialNames.BRONZE));
		}
		if(Materials.hasMaterial(MaterialNames.COLDIRON)) {
			register(EntityColdIronGolem.class, "golem_coldiron", Materials.getMaterialByName(MaterialNames.COLDIRON));
		}
		if(Materials.hasMaterial(MaterialNames.COPPER)) {
			register(EntityCopperGolem.class, "golem_copper", Materials.getMaterialByName(MaterialNames.COPPER));
		}
		if(Materials.hasMaterial(MaterialNames.CUPRONICKEL)) {
			register(EntityCupronickelGolem.class, "golem_cupronickel", Materials.getMaterialByName(MaterialNames.CUPRONICKEL));
		}
		if(Materials.hasMaterial(MaterialNames.ELECTRUM)) {
			register(EntityElectrumGolem.class, "golem_electrum", Materials.getMaterialByName(MaterialNames.ELECTRUM));
		}
		if(Materials.hasMaterial(MaterialNames.INVAR)) {
			register(EntityInvarGolem.class, "golem_invar", Materials.getMaterialByName(MaterialNames.INVAR));
		}
		if(Materials.hasMaterial(MaterialNames.LEAD)) {
			register(EntityLeadGolem.class, "golem_lead", Materials.getMaterialByName(MaterialNames.LEAD));
		}
		if(Materials.hasMaterial(MaterialNames.MITHRIL)) {
			register(EntityMithrilGolem.class, "golem_mithril", Materials.getMaterialByName(MaterialNames.MITHRIL));
		}
		if(Materials.hasMaterial(MaterialNames.NICKEL)) {
			register(EntityNickelGolem.class, "golem_nickel", Materials.getMaterialByName(MaterialNames.NICKEL));
		}
		if(Materials.hasMaterial(MaterialNames.PEWTER)) {
			register(EntityPewterGolem.class, "golem_pewter", Materials.getMaterialByName(MaterialNames.PEWTER));
		}
		if(Materials.hasMaterial(MaterialNames.PLATINUM)) {
			register(EntityPlatinumGolem.class, "golem_platinum", Materials.getMaterialByName(MaterialNames.PLATINUM));
		}
		if(Materials.hasMaterial(MaterialNames.SILVER)) {
			register(EntitySilverGolem.class, "golem_silver", Materials.getMaterialByName(MaterialNames.SILVER));
		}
		if(Materials.hasMaterial(MaterialNames.STARSTEEL)) {
			register(EntityStarSteelGolem.class, "golem_starsteel", Materials.getMaterialByName(MaterialNames.STARSTEEL));
		}
		if(Materials.hasMaterial(MaterialNames.STEEL)) {
			register(EntitySteelGolem.class, "golem_steel", Materials.getMaterialByName(MaterialNames.STEEL));
		}
		if(Materials.hasMaterial(MaterialNames.TIN)) {
			register(EntityTinGolem.class, "golem_tin", Materials.getMaterialByName(MaterialNames.TIN));
		}
		if(Materials.hasMaterial(MaterialNames.ZINC)) {
			register(EntityZincGolem.class, "golem_zinc", Materials.getMaterialByName(MaterialNames.ZINC));
		}
	}
	
	/** registers the entity with an optional loot table. **/
	protected static void register(final Class<? extends GolemBase> entityClass, final String name, final MMDMaterial material, final boolean registerLootTable) {
		// register the entity with Forge
		EntityRegistry.registerModEntity(
				new ResourceLocation(MetalGolems.MODID, name), entityClass, 
				MetalGolems.MODID + "." + name, ++entityCount,
				MetalGolems.instance, 16 * 4, 3, true);
		// register building block
		GolemLookup.addGolem(entityClass, material.getBlock(Names.BLOCK));
		// register loot table
		if(registerLootTable) {
			// TODO
			//registerLootTable(name);
		}
	}
	
	/** registers the entity without a loot table. **/
	protected static void register(final Class<? extends GolemBase> entityClass, final String name, final MMDMaterial material) {
		register(entityClass, name, material, false);
	}
	
	protected static void registerLootTable(final String name) {
		LootTableList.register(new ResourceLocation(MetalGolems.MODID, "entities/" + name));
	}
	
	protected static void registerLootTables(final String MODID, final String prefix, final String[] names) {
		for(String s : names) {
			LootTableList.register(new ResourceLocation(MODID, "entities/golem_" + prefix + "/" + s));
		}
	}

	
	/** registers the entity **/
//	protected void register(Class entityClass, String name)
//	{		
//		EntityRegistry.registerModEntity(new ResourceLocation(MetalGolems.MODID + ":textures/entity" + name
//                + ".png"), entityClass, MetalGolems.MODID + "." + name, ++entityCount, MetalGolems.instance,
//                48, 3, true);
//	}
}
