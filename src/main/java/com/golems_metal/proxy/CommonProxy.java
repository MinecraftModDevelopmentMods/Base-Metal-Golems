package com.golems_metal.proxy;

import com.golems.entity.EntityCoalGolem;
import com.golems.entity.GolemBase;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.basemetals.EntityAdamantineGolem;
import com.golems_metal.entity.basemetals.EntityAntimonyGolem;
import com.golems_metal.entity.basemetals.EntityAquariumGolem;
import com.golems_metal.entity.basemetals.EntityBismuthGolem;
import com.golems_metal.entity.basemetals.EntityBrassGolem;
import com.golems_metal.entity.basemetals.EntityBronzeGolem;
import com.golems_metal.entity.basemetals.EntityColdIronGolem;
import com.golems_metal.entity.basemetals.EntityCopperGolem;
import com.golems_metal.entity.basemetals.EntityCupronickelGolem;
import com.golems_metal.entity.basemetals.EntityElectrumGolem;
import com.golems_metal.entity.basemetals.EntityInvarGolem;
import com.golems_metal.entity.basemetals.EntityLeadGolem;
import com.golems_metal.entity.basemetals.EntityMithrilGolem;
import com.golems_metal.entity.basemetals.EntityNickelGolem;
import com.golems_metal.entity.basemetals.EntityPewterGolem;
import com.golems_metal.entity.basemetals.EntityPlatinumGolem;
import com.golems_metal.entity.basemetals.EntitySilverGolem;
import com.golems_metal.entity.basemetals.EntityStarSteelGolem;
import com.golems_metal.entity.basemetals.EntitySteelGolem;
import com.golems_metal.entity.basemetals.EntityTinGolem;
import com.golems_metal.entity.basemetals.EntityZincGolem;
import com.golems_metal.entity.modernmetals.EntityAluminumBrassGolem;
import com.golems_metal.entity.modernmetals.EntityAluminumGolem;
import com.golems_metal.entity.modernmetals.EntityCadmiumGolem;
import com.golems_metal.entity.modernmetals.EntityChromiumGolem;
import com.golems_metal.entity.modernmetals.EntityGalvSteelGolem;
import com.golems_metal.entity.modernmetals.EntityIridiumGolem;
import com.golems_metal.entity.modernmetals.EntityMagnesiumGolem;
import com.golems_metal.entity.modernmetals.EntityManganeseGolem;
import com.golems_metal.entity.modernmetals.EntityNichromeGolem;
import com.golems_metal.entity.modernmetals.EntityOsmiumGolem;
import com.golems_metal.entity.modernmetals.EntityPlutoniumGolem;
import com.golems_metal.entity.modernmetals.EntityRutileGolem;
import com.golems_metal.entity.modernmetals.EntityStainSteelGolem;
import com.golems_metal.entity.modernmetals.EntityTantalumGolem;
import com.golems_metal.entity.modernmetals.EntityTitaniumGolem;
import com.golems_metal.entity.modernmetals.EntityTungstenGolem;
import com.golems_metal.entity.modernmetals.EntityUraniumGolem;
import com.golems_metal.entity.modernmetals.EntityZirconiumGolem;
import com.golems_metal.init.InterModComm;
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
public class CommonProxy {
	
	protected static int entityCount;

	public void preInitRenders() {
		//
	}
	
	public void registerEntities() {
		entityCount = 0;
		// BASE METAL GOLEMS
		registerOptionally(EntityAdamantineGolem.class, "golem_adamantine", MaterialNames.ADAMANTINE);
		registerOptionally(EntityAntimonyGolem.class, "golem_antimony", MaterialNames.ANTIMONY);
		registerOptionally(EntityAquariumGolem.class, "golem_aquarium", MaterialNames.AQUARIUM);
		registerOptionally(EntityBismuthGolem.class, "golem_bismuth", MaterialNames.BISMUTH);
		registerOptionally(EntityBrassGolem.class, "golem_brass", MaterialNames.BRASS);
		registerOptionally(EntityBronzeGolem.class, "golem_bronze", MaterialNames.BRONZE);
		registerOptionally(EntityColdIronGolem.class, "golem_coldiron", MaterialNames.COLDIRON);
		registerOptionally(EntityCopperGolem.class, "golem_copper", MaterialNames.COPPER);
		registerOptionally(EntityCupronickelGolem.class, "golem_cupronickel", MaterialNames.CUPRONICKEL);
		registerOptionally(EntityElectrumGolem.class, "golem_electrum", MaterialNames.ELECTRUM);
		registerOptionally(EntityInvarGolem.class, "golem_invar", MaterialNames.INVAR);
		registerOptionally(EntityLeadGolem.class, "golem_lead", MaterialNames.LEAD);
		registerOptionally(EntityMithrilGolem.class, "golem_mithril", MaterialNames.MITHRIL);
		registerOptionally(EntityNickelGolem.class, "golem_nickel", MaterialNames.NICKEL);
		registerOptionally(EntityPewterGolem.class, "golem_pewter", MaterialNames.PEWTER);
		registerOptionally(EntityPlatinumGolem.class, "golem_platinum", MaterialNames.PLATINUM);
		registerOptionally(EntitySilverGolem.class, "golem_silver", MaterialNames.SILVER);
		registerOptionally(EntityStarSteelGolem.class, "golem_starsteel", MaterialNames.STARSTEEL);
		registerOptionally(EntitySteelGolem.class, "golem_steel", MaterialNames.STEEL);
		registerOptionally(EntityTinGolem.class, "golem_tin", MaterialNames.TIN);
		registerOptionally(EntityZincGolem.class, "golem_zinc", MaterialNames.ZINC);
		
		// MODERN METAL GOLEMS
		registerOptionally(EntityAluminumGolem.class, "golem_aluminum", InterModComm.ALUMINUM);
		registerOptionally(EntityAluminumBrassGolem.class, "golem_aluminumbrass", InterModComm.ALUMINUM_BRASS);
		registerOptionally(EntityCadmiumGolem.class, "golem_cadmium", InterModComm.CADMIUM);
		registerOptionally(EntityChromiumGolem.class, "golem_chromium", InterModComm.CHROMIUM);
		registerOptionally(EntityGalvSteelGolem.class, "golem_galvsteel", InterModComm.GALVANIZED_STEEL);
		registerOptionally(EntityIridiumGolem.class, "golem_iridium", InterModComm.IRIDIUM);
		registerOptionally(EntityMagnesiumGolem.class, "golem_magnesium", InterModComm.MAGNESIUM);
		registerOptionally(EntityManganeseGolem.class, "golem_manganese", InterModComm.MANGANESE);
		registerOptionally(EntityNichromeGolem.class, "golem_nichrome", InterModComm.NICHROME);
		registerOptionally(EntityOsmiumGolem.class, "golem_osmium", InterModComm.OSMIUM);
		registerOptionally(EntityPlutoniumGolem.class, "golem_plutonium", InterModComm.PLUTONIUM);
		registerOptionally(EntityRutileGolem.class, "golem_rutile", InterModComm.RUTILE);
		registerOptionally(EntityStainSteelGolem.class, "golem_stainsteel", InterModComm.STAINLESS_STEEL);
		registerOptionally(EntityTantalumGolem.class, "golem_tantalum", InterModComm.TANTALUM);
		registerOptionally(EntityTitaniumGolem.class, "golem_titanium", InterModComm.TITANIUM);
		registerOptionally(EntityTungstenGolem.class, "golem_tungsten", InterModComm.TUNGSTEN);
		registerOptionally(EntityUraniumGolem.class, "golem_uranium", InterModComm.URANIUM);
		registerOptionally(EntityZirconiumGolem.class, "golem_zirconium", InterModComm.ZIRCONIUM);
		
		// add Charcoal as a material for Coal Block Golem
		if(Materials.hasMaterial(MaterialNames.CHARCOAL) && Materials.getMaterialByName(MaterialNames.CHARCOAL).hasBlock(Names.BLOCK)) {
			GolemLookup.addBlockAlias(Materials.getMaterialByName(MaterialNames.CHARCOAL).getBlock(Names.BLOCK), EntityCoalGolem.class);
		}
	}
	
	protected static void registerOptionally(final Class<? extends GolemBase> entityClass, final String name, final String material) {
		if(Materials.hasMaterial(material) && Materials.getMaterialByName(material).hasBlock(Names.BLOCK)) {
			register(entityClass, name, Materials.getMaterialByName(material), false); // TODO change to true
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
			registerLootTable(name);
		}
	}
	
	/** registers the entity with a loot table. **/
	protected static void register(final Class<? extends GolemBase> entityClass, final String name, final MMDMaterial material) {
		register(entityClass, name, material, true);
	}
	
	protected static void registerLootTable(final String name) {
		LootTableList.register(new ResourceLocation(MetalGolems.MODID, "entities/" + name));
	}
}
