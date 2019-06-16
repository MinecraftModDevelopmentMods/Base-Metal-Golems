package com.golems_metal.proxy;

import com.golems.entity.GolemBase;
import com.golems.util.GolemLookup;
import com.golems_metal.entity.basemetals.*;
import com.golems_metal.entity.baseminerals.*;
import com.golems_metal.entity.modernmetals.*;
import com.golems_metal.init.InterModComm;
import com.golems_metal.init.MetalGolems;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod.EventBusSubscriber(modid = MetalGolems.MODID)
public class CommonProxy {

	protected static int entityCount = 0;

	public void preInitRenders() {
		//
	}
	
	public void registerBaseMetalEntities() {
		if(MetalGolems.hasBaseMetals()) {
			registerOptionally(EntityAdamantineGolem.class, InterModComm.ADAMANTINE);
			registerOptionally(EntityAntimonyGolem.class, InterModComm.ANTIMONY);
			registerOptionally(EntityAquariumGolem.class, InterModComm.AQUARIUM);
			registerOptionally(EntityBismuthGolem.class, InterModComm.BISMUTH);
			registerOptionally(EntityBrassGolem.class, InterModComm.BRASS);
			registerOptionally(EntityBronzeGolem.class, InterModComm.BRONZE);
			registerOptionally(EntityColdIronGolem.class, InterModComm.COLDIRON);
			registerOptionally(EntityCopperGolem.class, InterModComm.COPPER);
			registerOptionally(EntityCupronickelGolem.class, InterModComm.CUPRONICKEL);
			registerOptionally(EntityElectrumGolem.class, InterModComm.ELECTRUM);
			registerOptionally(EntityInvarGolem.class, InterModComm.INVAR);
			registerOptionally(EntityLeadGolem.class, InterModComm.LEAD);
			registerOptionally(EntityMithrilGolem.class, InterModComm.MITHRIL);
			registerOptionally(EntityNickelGolem.class, InterModComm.NICKEL);
			registerOptionally(EntityPewterGolem.class, InterModComm.PEWTER);
			registerOptionally(EntityPlatinumGolem.class, InterModComm.PLATINUM);
			registerOptionally(EntitySilverGolem.class, InterModComm.SILVER);
			registerOptionally(EntityStarSteelGolem.class, InterModComm.STARSTEEL);
			registerOptionally(EntitySteelGolem.class, InterModComm.STEEL);
			registerOptionally(EntityTinGolem.class, InterModComm.TIN);
			registerOptionally(EntityZincGolem.class, InterModComm.ZINC);
		}
	}

	public void registerModernMetalEntities() {
		if (MetalGolems.hasModernMetals()) {
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
	}
	
	public void registerBaseMineralEntities() {
		if(MetalGolems.hasBaseMinerals()) {
			registerOptionally(EntityLithiumGolem.class, InterModComm.LITHIUM);
			registerOptionally(EntityNiterGolem.class, InterModComm.NITER);
			registerOptionally(EntityPhosphorusGolem.class, InterModComm.PHOSPHORUS);
			registerOptionally(EntityPotashGolem.class, InterModComm.POTASH);
			registerOptionally(EntitySaltGolem.class, InterModComm.SALT);
			registerOptionally(EntitySaltpeterGolem.class, InterModComm.SALTPETER);
			registerOptionally(EntitySiliconGolem.class, InterModComm.SILICON);
			registerOptionally(EntitySulfurGolem.class, InterModComm.SULFUR);
		}
	}

	protected static void registerOptionally(final Class<? extends GolemBase> entityClass, final String material) {
		if (Materials.hasMaterial(material) && Materials.getMaterialByName(material).hasBlock(Names.BLOCK)) {
			register(entityClass, "golem_" + material, Materials.getMaterialByName(material), true);
		}
	}

	/** registers the entity with an optional loot table. **/
	protected static void register(final Class<? extends GolemBase> entityClass, final String name,
			final MMDMaterial material, final boolean registerLootTable) {
		// register the entity with Forge
		EntityRegistry.registerModEntity(new ResourceLocation(MetalGolems.MODID, name), entityClass,
				MetalGolems.MODID + "." + name, ++entityCount, MetalGolems.instance, 16 * 4, 3, true);
		// register building block
		GolemLookup.addGolem(entityClass, material.getBlock(Names.BLOCK));
		// register loot table
		if (registerLootTable) {
			registerLootTable(name);
		}
	}

	/** registers the entity with a loot table. **/
	protected static void register(final Class<? extends GolemBase> entityClass, final String name,
			final MMDMaterial material) {
		register(entityClass, name, material, true);
	}

	protected static void registerLootTable(final String name) {
		LootTableList.register(new ResourceLocation(MetalGolems.MODID, "entities/" + name));
	}
}
