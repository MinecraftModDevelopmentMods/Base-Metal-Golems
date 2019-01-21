package com.golems_metal.init;

import com.golems_metal.proxy.CommonProxy;
import com.mcmoddev.lib.events.MMLibPreInitSync;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
@Mod(modid = MetalGolems.MODID, name = MetalGolems.NAME, version = MetalGolems.VERSION, dependencies = MetalGolems.DEPENDENCIES, acceptedMinecraftVersions = MetalGolems.MCVERSION)
public class MetalGolems {
	
	public static final String MODID = "golems_metal";
	public static final String DEPENDENCIES = "required-after:golems@[7.1.0,);required-after:basemetals@[2.5.0,);required-after:forge@[14.23.4.2705,";
	public static final String NAME = "Base Metal Golems";
	public static final String VERSION = "7.1.0-alpha1";
	public static final String MCVERSION = "1.12.2";
	
	@Mod.Instance(MetalGolems.MODID)
	public static MetalGolems instance;
	
	@SidedProxy(clientSide = "com." + MODID + ".proxy.ClientProxy", serverSide = "com." + MODID + ".proxy.CommonProxy")
	public static CommonProxy proxy;

	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		MetalConfig.mainRegistry(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.preInitRenders();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.registerEntities();
	}
}

