/*
 * -------------------------------------------------------------------------------------------------------
 * Class: MetallurgyTiCStats
 * This class is part of Metallurgy 4 Reforged
 * Complete source code is available at: https://github.com/Davoleo/Metallurgy-4-Reforged
 * This code is licensed under GNU GPLv3
 * Authors: ItHurtsLikeHell & Davoleo
 * Copyright (c) 2019.
 * --------------------------------------------------------------------------------------------------------
 */

package it.hurts.metallurgy_reforged.integration.mods.tic.material;

import it.hurts.metallurgy_reforged.material.Metal;
import slimeknights.tconstruct.library.materials.AbstractMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;

public class MetallurgyTiCStats {
	public final Metal metal;
	
	public final AbstractMaterialStats[] stats;
	
	public MetallurgyTiCStats(Metal metal, AbstractMaterialStats...abstractMaterialStats) {
		this.metal = metal;
		this.stats = abstractMaterialStats;
		TinkerMetals.metalStatsList.add(this);
	}
	
	
	public static HeadMaterialStats getHeadA(Metal metal){
		int durability = metal.getToolMaterial().getMaxUses();
		float speed = metal.getToolMaterial().getEfficiency();
		float attack = metal.getToolMaterial().getAttackDamage();
		int harvestL = metal.getToolMaterial().getHarvestLevel();
		
//		Dovremmo modificare lo speed ?
		return new HeadMaterialStats((int)(durability / 6.5), speed, attack, harvestL);
	}
	
	public static ExtraMaterialStats getExtraA(Metal metal){
		int durability = metal.getToolMaterial().getMaxUses();
		
		return new ExtraMaterialStats((int) (durability / 5.5));
	}
	
	public static HandleMaterialStats getHandleA(Metal metal){
		int durability = metal.getToolMaterial().getMaxUses();
		float multiplier = 0.07F;
		float modifier = (float) (Math.sqrt(durability) * multiplier);
		
		return new HandleMaterialStats(modifier > 2 ? modifier * 0.5F : modifier, (int)durability / 4);
	}
}
