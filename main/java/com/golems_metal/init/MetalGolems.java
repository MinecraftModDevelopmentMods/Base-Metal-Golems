package com.golems_metal.init;

import com.golems.integration.ModIds;
import com.golems_metal.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MetalGolems.MODID, name = MetalGolems.NAME, version = MetalGolems.VERSION, dependencies = MetalGolems.DEPENDENCIES, acceptedMinecraftVersions = MetalGolems.MCVERSION)
public class MetalGolems 
{
	public static final String MODID = "golems_metal";
	public static final String DEPENDENCIES = "required-after:golems@[6.02,);required-after:basemetals@[2.4.0.11,)";
	public static final String NAME = "Base Metal Golems";
	public static final String VERSION = "6.02.1";
	public static final String MCVERSION = "1.10.2";
	
	@Mod.Instance(MetalGolems.MODID)
	public static MetalGolems instance;
	
	@SidedProxy(clientSide = "com." + MODID + ".proxy.ClientProxy", serverSide = "com." + MODID + ".proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{	
		MetalConfig.mainRegistry(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.registerEntities();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		proxy.registerEvents();
		
		if(Loader.isModLoaded(ModIds.WAILA))
		{
			FMLInterModComms.sendMessage(ModIds.WAILA, "register", "com.golems_metal.integration.waila.WailaMetalGolems.callbackRegister");
		}
		if(Loader.isModLoaded(ModIds.TOP))
		{
			FMLInterModComms.sendFunctionMessage("theoneprobe", "getTheOneProbe", "com.golems_metal.integration.theoneprobe.TOPMetalGolems$GetTheOneProbe");
		}
	}
}

