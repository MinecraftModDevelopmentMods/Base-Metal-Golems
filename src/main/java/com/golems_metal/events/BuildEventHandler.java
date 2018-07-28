package com.golems_metal.events;

import com.golems.events.GolemBuildEvent;
import com.golems_metal.entity.*;
import com.golems_metal.init.MetalConfig;
import com.mcmoddev.lib.data.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class BuildEventHandler 
{
	@SubscribeEvent
	public void onBuildGolem(GolemBuildEvent event)
	{
		if(event.isGolemNull())
		{
			if(event.blockBelow == EntityAdamantineGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockAdamantine"))
			{
				event.setGolem(new EntityAdamantineGolem(event.worldObj), MetalConfig.ADAMANTINE.canSpawn());
			}
			else if(event.blockBelow == EntityAntimonyGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockAntimony")) {
				event.setGolem(new EntityAntimonyGolem(event.worldObj), MetalConfig.ANTIMONY.canSpawn());
			}
			else if(event.blockBelow == EntityAquariumGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockAquarium"))
			{
				event.setGolem(new EntityAquariumGolem(event.worldObj), MetalConfig.AQUARIUM.canSpawn());
			}
			else if(event.blockBelow == EntityBismuthGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockBismuth"))
			{
				event.setGolem(new EntityBismuthGolem(event.worldObj), MetalConfig.BISMUTH.canSpawn());
			}
			else if(event.blockBelow == EntityBrassGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockBrass"))
			{
				event.setGolem(new EntityBrassGolem(event.worldObj), MetalConfig.BRASS.canSpawn());
			}
			else if(event.blockBelow == EntityBronzeGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockBronze"))
			{
				event.setGolem(new EntityBronzeGolem(event.worldObj), MetalConfig.BRONZE.canSpawn());
			}
			else if(event.blockBelow == EntityColdIronGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockColdiron"))
			{
				event.setGolem(new EntityColdIronGolem(event.worldObj), MetalConfig.COLDIRON.canSpawn());
			}
			else if(event.blockBelow == EntityCopperGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockCopper"))
			{
				event.setGolem(new EntityCopperGolem(event.worldObj), MetalConfig.COPPER.canSpawn());
			}
			else if(event.blockBelow == EntityCupronickelGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockCupronickel"))
			{
				event.setGolem(new EntityCupronickelGolem(event.worldObj), MetalConfig.CUPRONICKEL.canSpawn());
			}
			else if(event.blockBelow == EntityElectrumGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockElectrum"))
			{
				event.setGolem(new EntityElectrumGolem(event.worldObj), MetalConfig.ELECTRUM.canSpawn());
			}
			else if(event.blockBelow == EntityInvarGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockInvar"))
			{
				event.setGolem(new EntityInvarGolem(event.worldObj), MetalConfig.INVAR.canSpawn());
			}
			else if(event.blockBelow == EntityLeadGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockLead"))
			{
				event.setGolem(new EntityLeadGolem(event.worldObj), MetalConfig.LEAD.canSpawn());
			}
			else if(event.blockBelow == EntityMithrilGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockMithril"))
			{
				event.setGolem(new EntityMithrilGolem(event.worldObj), MetalConfig.MITHRIL.canSpawn());
			}
			else if(event.blockBelow == EntityNickelGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockNickel"))
			{
				event.setGolem(new EntityNickelGolem(event.worldObj), MetalConfig.NICKEL.canSpawn());
			}
			else if(event.blockBelow == EntityPewterGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockPewter")) {
				event.setGolem(new EntityPewterGolem(event.worldObj), MetalConfig.PEWTER.canSpawn());
			}
			else if(event.blockBelow == EntityPlatinumGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockPlatinum"))
			{
				event.setGolem(new EntityPlatinumGolem(event.worldObj), MetalConfig.PLATINUM.canSpawn());
			}
			else if(event.blockBelow == EntitySilverGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockSilver"))
			{
				event.setGolem(new EntitySilverGolem(event.worldObj), MetalConfig.SILVER.canSpawn());
			}
			else if(event.blockBelow == EntityStarSteelGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockStarsteel"))
			{
				event.setGolem(new EntityStarSteelGolem(event.worldObj), MetalConfig.STARSTEEL.canSpawn());
			}
			else if(event.blockBelow ==  EntitySteelGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockSteel"))
			{
				event.setGolem(new EntitySteelGolem(event.worldObj), MetalConfig.STEEL.canSpawn());
			}
			else if(event.blockBelow == EntityTinGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockTin"))
			{
				event.setGolem(new EntityTinGolem(event.worldObj), MetalConfig.TIN.canSpawn());
			}
			else if(event.blockBelow == EntityZincGolem.MATERIAL.getBlock(Names.BLOCK) || matchesOreDict(event.blockBelow, "blockZinc"))
			{
				event.setGolem(new EntityZincGolem(event.worldObj), MetalConfig.ZINC.canSpawn());
			}
		}
	}

	public static boolean matchesOreDict(Block b, String name)
	{
		if(OreDictionary.doesOreNameExist(name))
		{
			List<ItemStack> ores = OreDictionary.getOres(name);
			ItemStack blockStack = new ItemStack(b);
			for(ItemStack stack : ores)
			{
				if(OreDictionary.itemMatches(blockStack, stack, false))
				{
					//System.out.println("found ore dict match");
					return true;
				}
			}
		}
		return false;
	}
}
