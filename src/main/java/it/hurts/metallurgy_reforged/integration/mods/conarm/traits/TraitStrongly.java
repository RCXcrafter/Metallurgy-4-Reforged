package it.hurts.metallurgy_reforged.integration.mods.conarm.traits;

import c4.conarm.lib.traits.AbstractArmorTrait;
import it.hurts.metallurgy_reforged.integration.mods.conarm.MetallurgyConArmorStats;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class TraitStrongly extends AbstractArmorTrait{
	
	private int levels;

	public TraitStrongly(int levels) {
		super("strongly" + "_" + levels, TextFormatting.LIGHT_PURPLE);
		
		this.levels = levels;
	}
	
	@SubscribeEvent
	public void onArmorTick(PlayerTickEvent event){	
		if(MetallurgyConArmorStats.isThatArmorTrait(event.player, "strongly"))
			event.player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 60, levels, false, false));
	}

}