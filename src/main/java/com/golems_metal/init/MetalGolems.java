package com.golems_metal.init;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.golems.entity.EntityCoalGolem;
import com.golems.util.GolemLookup;
import com.golems_metal.proxy.CommonProxy;
import com.mcmoddev.lib.data.Names;
import com.mcmoddev.lib.init.Materials;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod.EventBusSubscriber
@Mod(modid = MetalGolems.MODID, name = MetalGolems.NAME, version = MetalGolems.VERSION, dependencies = MetalGolems.DEPENDENCIES, acceptedMinecraftVersions = MetalGolems.MCVERSION)
public class MetalGolems {
	
	public static final String MODID = "golems_metal";
	public static final String DEPENDENCIES = "required:forge@[14.23.4.2768,);required-after:golems@[7.1.5,);required-after:mmdlib@[1.0.0-rc2.36,)";
	public static final String NAME = "Base Metal Golems";
	public static final String VERSION = "7.1.5-1";
	public static final String MCVERSION = "1.12.2";
	
	@Mod.Instance(MetalGolems.MODID)
	public static MetalGolems instance;
	
	@SidedProxy(clientSide = "com." + MODID + ".proxy.ClientProxy", serverSide = "com." + MODID + ".proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static final Logger LOGGER = LogManager.getFormatterLogger(MODID);

	private static boolean baseMetalsLoaded;
	private static boolean modernMetalsLoaded;
	private static boolean baseMineralsLoaded;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		baseMetalsLoaded = Loader.isModLoaded(InterModComm.MODID_BASE_METALS);
		modernMetalsLoaded = Loader.isModLoaded(InterModComm.MODID_MODERN_METALS);
		baseMineralsLoaded = Loader.isModLoaded(InterModComm.MODID_BASE_MINERALS);
		
		MetalConfig.mainRegistry(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.preInitRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		// information about installed mods
		logModsLoaded("Base Metals", baseMetalsLoaded);
		proxy.registerBaseMetalEntities();
		logModsLoaded("Modern Metals", modernMetalsLoaded);
		proxy.registerModernMetalEntities();
		logModsLoaded("Base Minerals", baseMineralsLoaded);
		proxy.registerBaseMineralEntities();
		
		// add Charcoal as a material for Coal Block Golem
		if(Materials.hasMaterial(InterModComm.CHARCOAL) && Materials.getMaterialByName(InterModComm.CHARCOAL).hasBlock(Names.BLOCK)) {
			GolemLookup.addBlockAlias(Materials.getMaterialByName(InterModComm.CHARCOAL).getBlock(Names.BLOCK), EntityCoalGolem.class);
		}
	}
	
	public static boolean hasBaseMetals() {
		return baseMetalsLoaded;
	}
	
	public static boolean hasModernMetals() {
		return modernMetalsLoaded;
	}
	
	public static boolean hasBaseMinerals() {
		return baseMineralsLoaded;
	}
	
	private static void logModsLoaded(final String modName, final boolean isLoaded) {
		if(isLoaded) {
			LOGGER.info(modName + " detected. Loading golems for " + modName + "...");
		} else {
			LOGGER.info(modName + " not detected. Skipping golems for " + modName + "...");
		}
	}
}

