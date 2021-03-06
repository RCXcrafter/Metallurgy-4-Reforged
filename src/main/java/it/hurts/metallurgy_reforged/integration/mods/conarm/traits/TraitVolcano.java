/*
 * -------------------------------------------------------------------------------------------------------
 * Class: TraitVolcano
 * This class is part of Metallurgy 4 Reforged
 * Complete source code is available at: https://github.com/Davoleo/Metallurgy-4-Reforged
 * This code is licensed under GNU GPLv3
 * Authors: ItHurtsLikeHell & Davoleo
 * Copyright (c) 2019.
 * --------------------------------------------------------------------------------------------------------
 */

package it.hurts.metallurgy_reforged.integration.mods.conarm.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import it.hurts.metallurgy_reforged.integration.mods.conarm.MetallurgyConArmorStats;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class TraitVolcano extends AbstractArmorTrait{

	public TraitVolcano() {
		super("volcano", TextFormatting.RED);
	}
	
	@SubscribeEvent
	public void onArmorTick(PlayerTickEvent event){	
		if(MetallurgyConArmorStats.isThatArmorTrait(event.player, "volcano"))
			event.player.extinguish();
	}

}
