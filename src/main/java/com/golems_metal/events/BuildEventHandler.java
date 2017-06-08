package com.golems_metal.events;

import java.util.List;

import com.golems.events.GolemBuildEvent;
import com.golems_metal.entity.EntityAdamantineGolem;
import com.golems_metal.entity.EntityAquariumGolem;
import com.golems_metal.entity.EntityBrassGolem;
import com.golems_metal.entity.EntityBronzeGolem;
import com.golems_metal.entity.EntityColdIronGolem;
import com.golems_metal.entity.EntityCopperGolem;
import com.golems_metal.entity.EntityCupronickelGolem;
import com.golems_metal.entity.EntityElectrumGolem;
import com.golems_metal.entity.EntityInvarGolem;
import com.golems_metal.entity.EntityLeadGolem;
import com.golems_metal.entity.EntityMithrilGolem;
import com.golems_metal.entity.EntityNickelGolem;
import com.golems_metal.entity.EntityPlatinumGolem;
import com.golems_metal.entity.EntitySilverGolem;
import com.golems_metal.entity.EntityStarSteelGolem;
import com.golems_metal.entity.EntitySteelGolem;
import com.golems_metal.entity.EntityTinGolem;
import com.golems_metal.entity.EntityZincGolem;
import com.golems_metal.init.MetalConfig;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

public class BuildEventHandler 
{
	@SubscribeEvent
	public void onBuildGolem(GolemBuildEvent event)
	{
		if(event.isGolemNull())
		{
			if(event.blockBelow == cyano.basemetals.init.Blocks.adamantine_block || matchesOreDict(event.blockBelow, "blockAdamantine"))
			{
				event.setGolem(new EntityAdamantineGolem(event.worldObj), MetalConfig.ADAMANTINE.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.aquarium_block || matchesOreDict(event.blockBelow, "blockAquarium"))
			{
				event.setGolem(new EntityAquariumGolem(event.worldObj), MetalConfig.AQUARIUM.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.brass_block || matchesOreDict(event.blockBelow, "blockBrass"))
			{
				event.setGolem(new EntityBrassGolem(event.worldObj), MetalConfig.BRASS.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.bronze_block || matchesOreDict(event.blockBelow, "blockBronze"))
			{
				event.setGolem(new EntityBronzeGolem(event.worldObj), MetalConfig.BRONZE.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.coldiron_block || matchesOreDict(event.blockBelow, "blockColdiron"))
			{
				event.setGolem(new EntityColdIronGolem(event.worldObj), MetalConfig.COLDIRON.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.copper_block || matchesOreDict(event.blockBelow, "blockCopper"))
			{
				event.setGolem(new EntityCopperGolem(event.worldObj), MetalConfig.COPPER.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.cupronickel_block || matchesOreDict(event.blockBelow, "blockCupronickel"))
			{
				event.setGolem(new EntityCupronickelGolem(event.worldObj), MetalConfig.CUPRONICKEL.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.electrum_block || matchesOreDict(event.blockBelow, "blockElectrum"))
			{
				event.setGolem(new EntityElectrumGolem(event.worldObj), MetalConfig.ELECTRUM.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.invar_block || matchesOreDict(event.blockBelow, "blockInvar"))
			{
				event.setGolem(new EntityInvarGolem(event.worldObj), MetalConfig.INVAR.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.lead_block || matchesOreDict(event.blockBelow, "blockLead"))
			{
				event.setGolem(new EntityLeadGolem(event.worldObj), MetalConfig.LEAD.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.mithril_block || matchesOreDict(event.blockBelow, "blockMithril"))
			{
				event.setGolem(new EntityMithrilGolem(event.worldObj), MetalConfig.MITHRIL.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.nickel_block || matchesOreDict(event.blockBelow, "blockNickel"))
			{
				event.setGolem(new EntityNickelGolem(event.worldObj), MetalConfig.NICKEL.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.platinum_block || matchesOreDict(event.blockBelow, "blockPlatinum"))
			{
				event.setGolem(new EntityPlatinumGolem(event.worldObj), MetalConfig.PLATINUM.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.silver_block || matchesOreDict(event.blockBelow, "blockSilver"))
			{
				event.setGolem(new EntitySilverGolem(event.worldObj), MetalConfig.SILVER.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.starsteel_block || matchesOreDict(event.blockBelow, "blockStarsteel"))
			{
				event.setGolem(new EntityStarSteelGolem(event.worldObj), MetalConfig.STARSTEEL.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.steel_block || matchesOreDict(event.blockBelow, "blockSteel"))
			{
				event.setGolem(new EntitySteelGolem(event.worldObj), MetalConfig.STEEL.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.tin_block || matchesOreDict(event.blockBelow, "blockTin"))
			{
				event.setGolem(new EntityTinGolem(event.worldObj), MetalConfig.TIN.canSpawn());
			}
			else if(event.blockBelow == cyano.basemetals.init.Blocks.zinc_block || matchesOreDict(event.blockBelow, "blockZinc"))
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
