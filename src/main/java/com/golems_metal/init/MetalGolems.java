package com.golems_metal.init;

import com.golems_metal.proxy.CommonProxy;

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
	public static final String DEPENDENCIES = "required-after:golems@[7.1.1,);required-after:basemetals@[2.5.0,);after:modernmetals@[2.5.0,);required-after:forge@[14.23.4.2705,";
	public static final String NAME = "Base Metal Golems";
	public static final String VERSION = "7.1.1-1";
	public static final String MCVERSION = "1.12.2";
	
	@Mod.Instance(MetalGolems.MODID)
	public static MetalGolems instance;
	
	@SidedProxy(clientSide = "com." + MODID + ".proxy.ClientProxy", serverSide = "com." + MODID + ".proxy.CommonProxy")
	public static CommonProxy proxy;

	public static boolean modernMetalsLoaded;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		modernMetalsLoaded = Loader.isModLoaded(InterModComm.MODID_MODERN_METALS);
		if(modernMetalsLoaded) {
			System.out.println("Modern Metals detected. Loading golems for Modern Metals...");
		} else {
			System.out.println("Modern Metals not detected. Skipping golems for Modern Metals...");
		}
		MetalConfig.mainRegistry(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.preInitRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.registerEntities();
	}
}

