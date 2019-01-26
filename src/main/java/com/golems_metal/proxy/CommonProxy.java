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
import com.golems_metal.entity.modernmetals.EntityBerylliumGolem;
import com.golems_metal.entity.modernmetals.EntityBoronGolem;
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
import com.golems_metal.entity.modernmetals.EntityThoriumGolem;
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
		registerOptionally(EntityAdamantineGolem.class, MaterialNames.ADAMANTINE);
		registerOptionally(EntityAntimonyGolem.class, MaterialNames.ANTIMONY);
		registerOptionally(EntityAquariumGolem.class, MaterialNames.AQUARIUM);
		registerOptionally(EntityBismuthGolem.class, MaterialNames.BISMUTH);
		registerOptionally(EntityBrassGolem.class, MaterialNames.BRASS);
		registerOptionally(EntityBronzeGolem.class, MaterialNames.BRONZE);
		registerOptionally(EntityColdIronGolem.class, MaterialNames.COLDIRON);
		registerOptionally(EntityCopperGolem.class, MaterialNames.COPPER);
		registerOptionally(EntityCupronickelGolem.class, MaterialNames.CUPRONICKEL);
		registerOptionally(EntityElectrumGolem.class, MaterialNames.ELECTRUM);
		registerOptionally(EntityInvarGolem.class, MaterialNames.INVAR);
		registerOptionally(EntityLeadGolem.class, MaterialNames.LEAD);
		registerOptionally(EntityMithrilGolem.class, MaterialNames.MITHRIL);
		registerOptionally(EntityNickelGolem.class, MaterialNames.NICKEL);
		registerOptionally(EntityPewterGolem.class, MaterialNames.PEWTER);
		registerOptionally(EntityPlatinumGolem.class, MaterialNames.PLATINUM);
		registerOptionally(EntitySilverGolem.class, MaterialNames.SILVER);
		registerOptionally(EntityStarSteelGolem.class, MaterialNames.STARSTEEL);
		registerOptionally(EntitySteelGolem.class, MaterialNames.STEEL);
		registerOptionally(EntityTinGolem.class, MaterialNames.TIN);
		registerOptionally(EntityZincGolem.class, MaterialNames.ZINC);
		
		// MODERN METAL GOLEMS
		if(MetalGolems.modernMetalsLoaded) {
			registerOptionally(EntityAluminumGolem.class, InterModComm.ALUMINUM);
			registerOptionally(EntityAluminumBrassGolem.class, InterModComm.ALUMINUM_BRASS);
			registerOptionally(EntityBerylliumGolem.class, InterModComm.BERYLLIUM);
			registerOptionally(EntityBoronGolem.class, InterModComm.BORON);
			registerOptionally(EntityCadmiumGolem.class, InterModComm.CADMIUM);
			registerOptionally(EntityChromiumGolem.class, InterModComm.CHROMIUM);
			registerOptionally(EntityGalvSteelGolem.class, InterModComm.GALVANIZED_STEEL);
			registerOptionally(EntityIridiumGolem.class, InterModComm.IRIDIUM);
			registerOptionally(EntityMagnesiumGolem.class, InterModComm.MAGNESIUM);
			registerOptionally(EntityManganeseGolem.class, InterModComm.MANGANESE);
			registerOptionally(EntityNichromeGolem.class, InterModComm.NICHROME);
			registerOptionally(EntityOsmiumGolem.class, InterModComm.OSMIUM);
			registerOptionally(EntityPlutoniumGolem.class, InterModComm.PLUTONIUM);
			registerOptionally(EntityRutileGolem.class, InterModComm.RUTILE);
			registerOptionally(EntityStainSteelGolem.class, InterModComm.STAINLESS_STEEL);
			registerOptionally(EntityTantalumGolem.class, InterModComm.TANTALUM);
			registerOptionally(EntityThoriumGolem.class, InterModComm.THORIUM);
			registerOptionally(EntityTitaniumGolem.class, InterModComm.TITANIUM);
			registerOptionally(EntityTungstenGolem.class, InterModComm.TUNGSTEN);
			registerOptionally(EntityUraniumGolem.class, InterModComm.URANIUM);
			registerOptionally(EntityZirconiumGolem.class, InterModComm.ZIRCONIUM);
		}
		
		// add Charcoal as a material for Coal Block Golem
		if(Materials.hasMaterial(MaterialNames.CHARCOAL) && Materials.getMaterialByName(MaterialNames.CHARCOAL).hasBlock(Names.BLOCK)) {
			GolemLookup.addBlockAlias(Materials.getMaterialByName(MaterialNames.CHARCOAL).getBlock(Names.BLOCK), EntityCoalGolem.class);
		}
	}
	
	protected static void registerOptionally(final Class<? extends GolemBase> entityClass, final String material) {
		if(Materials.hasMaterial(material) && Materials.getMaterialByName(material).hasBlock(Names.BLOCK)) {
			register(entityClass, "golem_" + material, Materials.getMaterialByName(material), true);
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
