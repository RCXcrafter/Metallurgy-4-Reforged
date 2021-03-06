/*
 * -------------------------------------------------------------------------------------------------------
 * Class: ModArmors
 * This class is part of Metallurgy 4 Reforged
 * Complete source code is available at: https://github.com/Davoleo/Metallurgy-4-Reforged
 * This code is licensed under GNU GPLv3
 * Authors: ItHurtsLikeHell & Davoleo
 * Copyright (c) 2019.
 * --------------------------------------------------------------------------------------------------------
 */

package it.hurts.metallurgy_reforged.item.armor;

import it.hurts.metallurgy_reforged.config.ArmorConfig;
import it.hurts.metallurgy_reforged.config.ArmorEffectsConfig;
import it.hurts.metallurgy_reforged.config.GeneralConfig;
import it.hurts.metallurgy_reforged.material.ModMetals;
import it.hurts.metallurgy_reforged.util.Tooltips;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModArmors {

    public static final List<ItemArmorBase> armorList = new ArrayList<>();

    public static boolean isCreativeTabIconAvailable = false;

    public static ItemArmorBase adamantine_helmet = new ItemArmorBase(ModMetals.ADAMANTINE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "adamantine_helmet").setTooltip( Tooltips.ADAMANTINE_ARMOR_EFFECT);
    public static ItemArmorBase adamantine_chest = new ItemArmorBase(ModMetals.ADAMANTINE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "adamantine_chest").setTooltip( Tooltips.ADAMANTINE_ARMOR_EFFECT);
    public static ItemArmorBase adamantine_legs = new ItemArmorBase(ModMetals.ADAMANTINE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "adamantine_legs").setTooltip( Tooltips.ADAMANTINE_ARMOR_EFFECT);
    public static ItemArmorBase adamantine_boots = new ItemArmorBase(ModMetals.ADAMANTINE.getArmorMaterial(), EntityEquipmentSlot.FEET, "adamantine_boots").setTooltip( Tooltips.ADAMANTINE_ARMOR_EFFECT);

    public static ItemArmorBase amordrine_helmet = new ItemArmorBase(ModMetals.AMORDRINE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "amordrine_helmet").setTooltip(Tooltips.AMORDRINE_ARMOR_MATERIAL);
    public static ItemArmorBase amordrine_chest = new ItemArmorBase(ModMetals.AMORDRINE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "amordrine_chest").setTooltip(Tooltips.AMORDRINE_ARMOR_MATERIAL);
    public static ItemArmorBase amordrine_legs = new ItemArmorBase(ModMetals.AMORDRINE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "amordrine_legs").setTooltip(Tooltips.AMORDRINE_ARMOR_MATERIAL);
    public static ItemArmorBase amordrine_boots = new ItemArmorBase(ModMetals.AMORDRINE.getArmorMaterial(), EntityEquipmentSlot.FEET, "amordrine_boots").setTooltip(Tooltips.AMORDRINE_ARMOR_MATERIAL);

    public static ItemArmorBase angmallen_helmet = new ItemArmorBase(ModMetals.ANGMALLEN.getArmorMaterial(), EntityEquipmentSlot.HEAD, "angmallen_helmet").setTooltip( Tooltips.ANGMALLEN_ARMOR_EFFECT);
    public static ItemArmorBase angmallen_chest = new ItemArmorBase(ModMetals.ANGMALLEN.getArmorMaterial(), EntityEquipmentSlot.CHEST, "angmallen_chest").setTooltip( Tooltips.ANGMALLEN_ARMOR_EFFECT);
    public static ItemArmorBase angmallen_legs = new ItemArmorBase(ModMetals.ANGMALLEN.getArmorMaterial(), EntityEquipmentSlot.LEGS, "angmallen_legs").setTooltip( Tooltips.ANGMALLEN_ARMOR_EFFECT);
    public static ItemArmorBase angmallen_boots = new ItemArmorBase(ModMetals.ANGMALLEN.getArmorMaterial(), EntityEquipmentSlot.FEET, "angmallen_boots").setTooltip( Tooltips.ANGMALLEN_ARMOR_EFFECT);

    public static ItemArmorBase astral_silver_helmet = new ItemArmorBase(ModMetals.ASTRAL_SILVER.getArmorMaterial(), EntityEquipmentSlot.HEAD, "astral_silver_helmet").setTooltip(Tooltips.ASTRAL_SILVER_ARMOR_EFFECT);
    public static ItemArmorBase astral_silver_chest = new ItemArmorBase(ModMetals.ASTRAL_SILVER.getArmorMaterial(), EntityEquipmentSlot.CHEST, "astral_silver_chest").setTooltip(Tooltips.ASTRAL_SILVER_ARMOR_EFFECT);
    public static ItemArmorBase astral_silver_legs = new ItemArmorBase(ModMetals.ASTRAL_SILVER.getArmorMaterial(), EntityEquipmentSlot.LEGS, "astral_silver_legs").setTooltip(Tooltips.ASTRAL_SILVER_ARMOR_EFFECT);
    public static ItemArmorBase astral_silver_boots = new ItemArmorBase(ModMetals.ASTRAL_SILVER.getArmorMaterial(), EntityEquipmentSlot.FEET, "astral_silver_boots").setTooltip(Tooltips.ASTRAL_SILVER_ARMOR_EFFECT);

    public static ItemArmorBase atlarus_helmet = new ItemArmorBase(ModMetals.ATLARUS.getArmorMaterial(), EntityEquipmentSlot.HEAD, "atlarus_helmet");
    public static ItemArmorBase atlarus_chest = new ItemArmorBase(ModMetals.ATLARUS.getArmorMaterial(), EntityEquipmentSlot.CHEST, "atlarus_chest");
    public static ItemArmorBase atlarus_legs = new ItemArmorBase(ModMetals.ATLARUS.getArmorMaterial(), EntityEquipmentSlot.LEGS, "atlarus_legs");
    public static ItemArmorBase atlarus_boots = new ItemArmorBase(ModMetals.ATLARUS.getArmorMaterial(), EntityEquipmentSlot.FEET, "atlarus_boots");

    public static ItemArmorBase black_steel_helmet = new ItemArmorBase(ModMetals.BLACK_STEEL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "black_steel_helmet");
    public static ItemArmorBase black_steel_chest = new ItemArmorBase(ModMetals.BLACK_STEEL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "black_steel_chest");
    public static ItemArmorBase black_steel_legs = new ItemArmorBase(ModMetals.BLACK_STEEL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "black_steel_legs");
    public static ItemArmorBase black_steel_boots = new ItemArmorBase(ModMetals.BLACK_STEEL.getArmorMaterial(), EntityEquipmentSlot.FEET, "black_steel_boots");

    public static ItemArmorBase brass_helemt = new ItemArmorBase(ModMetals.BRASS.getArmorMaterial(), EntityEquipmentSlot.HEAD, "brass_helmet");
    public static ItemArmorBase brass_chest = new ItemArmorBase(ModMetals.BRASS.getArmorMaterial(), EntityEquipmentSlot.CHEST, "brass_chest");
    public static ItemArmorBase brass_legs = new ItemArmorBase(ModMetals.BRASS.getArmorMaterial(), EntityEquipmentSlot.LEGS, "brass_legs");
    public static ItemArmorBase brass_boots = new ItemArmorBase(ModMetals.BRASS.getArmorMaterial(), EntityEquipmentSlot.FEET, "brass_boots");

    public static ItemArmorBase bronze_helmet = new ItemArmorBase(ModMetals.BRONZE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "bronze_helmet");
    public static ItemArmorBase bronze_chest = new ItemArmorBase(ModMetals.BRONZE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "bronze_chest");
    public static ItemArmorBase bronze_legs = new ItemArmorBase(ModMetals.BRONZE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "bronze_legs");
    public static ItemArmorBase bronze_boots = new ItemArmorBase(ModMetals.BRONZE.getArmorMaterial(), EntityEquipmentSlot.FEET, "bronze_boots");

    public static ItemArmorBase carmot_helmet = new ItemArmorBase(ModMetals.CARMOT.getArmorMaterial(), EntityEquipmentSlot.HEAD, "carmot_helmet").setTooltip(Tooltips.CARMOT_ARMOR_EFFECT);
    public static ItemArmorBase carmot_chest = new ItemArmorBase(ModMetals.CARMOT.getArmorMaterial(), EntityEquipmentSlot.CHEST, "carmot_chest").setTooltip(Tooltips.CARMOT_ARMOR_EFFECT);
    public static ItemArmorBase carmot_legs = new ItemArmorBase(ModMetals.CARMOT.getArmorMaterial(), EntityEquipmentSlot.LEGS, "carmot_legs").setTooltip(Tooltips.CARMOT_ARMOR_EFFECT);
    public static ItemArmorBase carmot_boots = new ItemArmorBase(ModMetals.CARMOT.getArmorMaterial(), EntityEquipmentSlot.FEET, "carmot_boots").setTooltip(Tooltips.CARMOT_ARMOR_EFFECT);

    public static ItemArmorBase celenegil_helmet = new ItemArmorBase(ModMetals.CELENEGIL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "celenegil_helmet").setTooltip(Tooltips.CELENEGIL_ARMOR_EFFECT);
    public static ItemArmorBase celenegil_chest = new ItemArmorBase(ModMetals.CELENEGIL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "celenegil_chest").setTooltip(Tooltips.CELENEGIL_ARMOR_EFFECT);
    public static ItemArmorBase celenegil_legs = new ItemArmorBase(ModMetals.CELENEGIL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "celenegil_legs").setTooltip(Tooltips.CELENEGIL_ARMOR_EFFECT);
    public static ItemArmorBase celenegil_boots = new ItemArmorBase(ModMetals.CELENEGIL.getArmorMaterial(), EntityEquipmentSlot.FEET, "celenegil_boots").setTooltip(Tooltips.CELENEGIL_ARMOR_EFFECT);

    public static ItemArmorBase ceruclase_helmet = new ItemArmorBase(ModMetals.CERUCLASE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "ceruclase_helmet").setTooltip(Tooltips.CERUCLASE_ARMOR_EFFECT);
    public static ItemArmorBase ceruclase_chest = new ItemArmorBase(ModMetals.CERUCLASE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "ceruclase_chest").setTooltip(Tooltips.CERUCLASE_ARMOR_EFFECT);
    public static ItemArmorBase ceruclase_legs = new ItemArmorBase(ModMetals.CERUCLASE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "ceruclase_legs").setTooltip(Tooltips.CERUCLASE_ARMOR_EFFECT);
    public static ItemArmorBase ceruclase_boots = new ItemArmorBase(ModMetals.CERUCLASE.getArmorMaterial(), EntityEquipmentSlot.FEET, "ceruclase_boots").setTooltip(Tooltips.CERUCLASE_ARMOR_EFFECT);
    
    public static ItemArmorBase copper_helemt = new ItemArmorBase(ModMetals.COPPER.getArmorMaterial(), EntityEquipmentSlot.HEAD, "copper_helmet");
    public static ItemArmorBase copper_chest = new ItemArmorBase(ModMetals.COPPER.getArmorMaterial(), EntityEquipmentSlot.CHEST, "copper_chest");
    public static ItemArmorBase copper_legs = new ItemArmorBase(ModMetals.COPPER.getArmorMaterial(), EntityEquipmentSlot.LEGS, "copper_legs");
    public static ItemArmorBase copper_boots = new ItemArmorBase(ModMetals.COPPER.getArmorMaterial(), EntityEquipmentSlot.FEET, "copper_boots");
    
    public static ItemArmorBase damascus_steel_helemt = new ItemArmorBase(ModMetals.DAMASCUS_STEEL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "damascus_steel_helmet");
    public static ItemArmorBase damascus_steel_chest = new ItemArmorBase(ModMetals.DAMASCUS_STEEL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "damascus_steel_chest");
    public static ItemArmorBase damascus_steel_legs = new ItemArmorBase(ModMetals.DAMASCUS_STEEL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "damascus_steel_legs");
    public static ItemArmorBase damascus_steel_boots = new ItemArmorBase(ModMetals.DAMASCUS_STEEL.getArmorMaterial(), EntityEquipmentSlot.FEET, "damascus_steel_boots");

    public static ItemArmorBase deep_iron_helmet = new ItemArmorBase(ModMetals.DEEP_IRON.getArmorMaterial(), EntityEquipmentSlot.HEAD, "deep_iron_helmet").setTooltip(Tooltips.DEEP_IRON_ARMOR_EFFECT);
    public static ItemArmorBase deep_iron_chest = new ItemArmorBase(ModMetals.DEEP_IRON.getArmorMaterial(), EntityEquipmentSlot.CHEST, "deep_iron_chest").setTooltip(Tooltips.DEEP_IRON_ARMOR_EFFECT);
    public static ItemArmorBase deep_iron_legs = new ItemArmorBase(ModMetals.DEEP_IRON.getArmorMaterial(), EntityEquipmentSlot.LEGS, "deep_iron_legs").setTooltip(Tooltips.DEEP_IRON_ARMOR_EFFECT);
    public static ItemArmorBase deep_iron_boots = new ItemArmorBase(ModMetals.DEEP_IRON.getArmorMaterial(), EntityEquipmentSlot.FEET, "deep_iron_boots").setTooltip(Tooltips.DEEP_IRON_ARMOR_EFFECT);

    public static ItemArmorBase desichalkos_helmet = new ItemArmorBase(ModMetals.DESICHALKOS.getArmorMaterial(), EntityEquipmentSlot.HEAD, "desichalkos_helmet");
    public static ItemArmorBase desichalkos_chest = new ItemArmorBase(ModMetals.DESICHALKOS.getArmorMaterial(), EntityEquipmentSlot.CHEST, "desichalkos_chest");
    public static ItemArmorBase desichalkos_legs = new ItemArmorBase(ModMetals.DESICHALKOS.getArmorMaterial(), EntityEquipmentSlot.LEGS, "desichalkos_legs");
    public static ItemArmorBase desichalkos_boots = new ItemArmorBase(ModMetals.DESICHALKOS.getArmorMaterial(), EntityEquipmentSlot.FEET, "desichalkos_boots");

    public static ItemArmorBase electrum_helmet = new ItemArmorBase(ModMetals.ELECTRUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "electrum_helmet");
    public static ItemArmorBase electrum_chest = new ItemArmorBase(ModMetals.ELECTRUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "electrum_chest");
    public static ItemArmorBase electrum_legs = new ItemArmorBase(ModMetals.ELECTRUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "electrum_legs");
    public static ItemArmorBase electrum_boots = new ItemArmorBase(ModMetals.ELECTRUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "electrum_boots");

    public static ItemArmorBase eximite_helmet = new ItemArmorBase(ModMetals.EXIMITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "eximite_helmet").setTooltip(Tooltips.EXIMITE_HELMET_EFFECT);
    public static ItemArmorBase eximite_chest = new ItemArmorBase(ModMetals.EXIMITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "eximite_chest");
    public static ItemArmorBase eximite_legs = new ItemArmorBase(ModMetals.EXIMITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "eximite_legs");
    public static ItemArmorBase eximite_boots = new ItemArmorBase(ModMetals.EXIMITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "eximite_boots");

    public static ItemArmorBase haderoth_helmet = new ItemArmorBase(ModMetals.HADEROTH.getArmorMaterial(), EntityEquipmentSlot.HEAD, "haderoth_helmet");
    public static ItemArmorBase haderoth_chest = new ItemArmorBase(ModMetals.HADEROTH.getArmorMaterial(), EntityEquipmentSlot.CHEST, "haderoth_chest");
    public static ItemArmorBase haderoth_legs = new ItemArmorBase(ModMetals.HADEROTH.getArmorMaterial(), EntityEquipmentSlot.LEGS, "haderoth_legs");
    public static ItemArmorBase haderoth_boots = new ItemArmorBase(ModMetals.HADEROTH.getArmorMaterial(), EntityEquipmentSlot.FEET, "haderoth_boots");

    public static ItemArmorBase hepatizon_helmet = new ItemArmorBase(ModMetals.HEPATIZON.getArmorMaterial(), EntityEquipmentSlot.HEAD, "hepatizon_helmet");
    public static ItemArmorBase hepatizon_chest = new ItemArmorBase(ModMetals.HEPATIZON.getArmorMaterial(), EntityEquipmentSlot.CHEST, "hepatizon_chest");
    public static ItemArmorBase hepatizon_legs = new ItemArmorBase(ModMetals.HEPATIZON.getArmorMaterial(), EntityEquipmentSlot.LEGS, "hepatizon_legs");
    public static ItemArmorBase hepatizon_boots = new ItemArmorBase(ModMetals.HEPATIZON.getArmorMaterial(), EntityEquipmentSlot.FEET, "hepatizon_boots");

    public static ItemArmorBase inolashite_helmet = new ItemArmorBase(ModMetals.INOLASHITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "inolashite_helmet");
    public static ItemArmorBase inolashite_chest = new ItemArmorBase(ModMetals.INOLASHITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "inolashite_chest");
    public static ItemArmorBase inolashite_legs = new ItemArmorBase(ModMetals.INOLASHITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "inolashite_legs");
    public static ItemArmorBase inolashite_boots = new ItemArmorBase(ModMetals.INOLASHITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "inolashite_boots");

    public static ItemArmorBase ignatius_helmet = new ItemArmorBase(ModMetals.IGNATIUS.getArmorMaterial(), EntityEquipmentSlot.HEAD, "ignatius_helmet");
    public static ItemArmorBase ignatius_chest = new ItemArmorBase(ModMetals.IGNATIUS.getArmorMaterial(), EntityEquipmentSlot.CHEST, "ignatius_chest");
    public static ItemArmorBase ignatius_legs = new ItemArmorBase(ModMetals.IGNATIUS.getArmorMaterial(), EntityEquipmentSlot.LEGS, "ignatius_legs");
    public static ItemArmorBase ignatius_boots = new ItemArmorBase(ModMetals.IGNATIUS.getArmorMaterial(), EntityEquipmentSlot.FEET, "ignatius_boots");

    public static ItemArmorBase kalendrite_helmet = new ItemArmorBase(ModMetals.KALENDRITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "kalendrite_helmet").setTooltip(Tooltips.KALENDRITE_ARMOR_EFFECT);
    public static ItemArmorBase kalendrite_chest = new ItemArmorBase(ModMetals.KALENDRITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "kalendrite_chest").setTooltip(Tooltips.KALENDRITE_ARMOR_EFFECT);
    public static ItemArmorBase kalendrite_legs = new ItemArmorBase(ModMetals.KALENDRITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "kalendrite_legs").setTooltip(Tooltips.KALENDRITE_ARMOR_EFFECT);
    public static ItemArmorBase kalendrite_boots = new ItemArmorBase(ModMetals.KALENDRITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "kalendrite_boots").setTooltip(Tooltips.KALENDRITE_ARMOR_EFFECT);

    public static ItemArmorBase krik_helmet = new ItemArmorBase(ModMetals.KRIK.getArmorMaterial(), EntityEquipmentSlot.HEAD, "krik_helmet").setTooltip(Tooltips.KRIK_ARMOR_EFFECT);
    public static ItemArmorBase krik_chest = new ItemArmorBase(ModMetals.KRIK.getArmorMaterial(), EntityEquipmentSlot.CHEST, "krik_chest").setTooltip(Tooltips.KRIK_ARMOR_EFFECT);
    public static ItemArmorBase krik_legs = new ItemArmorBase(ModMetals.KRIK.getArmorMaterial(), EntityEquipmentSlot.LEGS, "krik_legs").setTooltip(Tooltips.KRIK_ARMOR_EFFECT);
    public static ItemArmorBase krik_boots = new ItemArmorBase(ModMetals.KRIK.getArmorMaterial(), EntityEquipmentSlot.FEET, "krik_boots").setTooltip(Tooltips.KRIK_ARMOR_EFFECT);
    
    public static ItemArmorBase lutetium_helmet = new ItemArmorBase(ModMetals.LUTETIUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "lutetium_helmet").setTooltip(Tooltips.LUTETIUM_ARMOR_EFFECT);
    public static ItemArmorBase lutetium_chest = new ItemArmorBase(ModMetals.LUTETIUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "lutetium_chest").setTooltip(Tooltips.LUTETIUM_ARMOR_EFFECT);
    public static ItemArmorBase lutetium_legs = new ItemArmorBase(ModMetals.LUTETIUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "lutetium_legs").setTooltip(Tooltips.LUTETIUM_ARMOR_EFFECT);
    public static ItemArmorBase lutetium_boots = new ItemArmorBase(ModMetals.LUTETIUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "lutetium_boots").setTooltip(Tooltips.LUTETIUM_ARMOR_EFFECT);
    
    public static ItemArmorBase midasium_helmet = new ItemArmorBase(ModMetals.MIDASIUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "midasium_helmet");
    public static ItemArmorBase midasium_chest = new ItemArmorBase(ModMetals.MIDASIUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "midasium_chest");
    public static ItemArmorBase midasium_legs = new ItemArmorBase(ModMetals.MIDASIUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "midasium_legs");
    public static ItemArmorBase midasium_boots = new ItemArmorBase(ModMetals.MIDASIUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "midasium_boots");

    public static ItemArmorBase mithril_helmet = new ItemArmorBase(ModMetals.MITHRIL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "mithril_helmet").setTooltip(Tooltips.MITHRIL_ARMOR_EFFECT);
    public static ItemArmorBase mithril_chest = new ItemArmorBase(ModMetals.MITHRIL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "mithril_chest").setTooltip(Tooltips.MITHRIL_ARMOR_EFFECT);
    public static ItemArmorBase mithril_legs = new ItemArmorBase(ModMetals.MITHRIL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "mithril_legs").setTooltip(Tooltips.MITHRIL_ARMOR_EFFECT);
    public static ItemArmorBase mithril_boots = new ItemArmorBase(ModMetals.MITHRIL.getArmorMaterial(), EntityEquipmentSlot.FEET, "mithril_boots").setTooltip(Tooltips.MITHRIL_ARMOR_EFFECT);

    public static ItemArmorBase orichalcum_helmet = new ItemArmorBase(ModMetals.ORICHALCUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "orichalcum_helmet");
    public static ItemArmorBase orichalcum_chest = new ItemArmorBase(ModMetals.ORICHALCUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "orichalcum_chest");
    public static ItemArmorBase orichalcum_legs = new ItemArmorBase(ModMetals.ORICHALCUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "orichalcum_legs");
    public static ItemArmorBase orichalcum_boots = new ItemArmorBase(ModMetals.ORICHALCUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "orichalcum_boots");

    public static ItemArmorBase osmium_helmet = new ItemArmorBase(ModMetals.OSMIUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "osmium_helmet").setTooltip(Tooltips.OSMIUM_ARMOR_EFFECT);
    public static ItemArmorBase osmium_chest = new ItemArmorBase(ModMetals.OSMIUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "osmium_chest").setTooltip(Tooltips.OSMIUM_ARMOR_EFFECT);
    public static ItemArmorBase osmium_legs = new ItemArmorBase(ModMetals.OSMIUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "osmium_legs").setTooltip(Tooltips.OSMIUM_ARMOR_EFFECT);
    public static ItemArmorBase osmium_boots = new ItemArmorBase(ModMetals.OSMIUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "osmium_boots").setTooltip(Tooltips.OSMIUM_ARMOR_EFFECT);
    
    public static ItemArmorBase oureclase_helmet = new ItemArmorBase(ModMetals.OURECLASE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "oureclase_helmet");
    public static ItemArmorBase oureclase_chest = new ItemArmorBase(ModMetals.OURECLASE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "oureclase_chest");
    public static ItemArmorBase oureclase_legs = new ItemArmorBase(ModMetals.OURECLASE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "oureclase_legs");
    public static ItemArmorBase oureclase_boots = new ItemArmorBase(ModMetals.OURECLASE.getArmorMaterial(), EntityEquipmentSlot.FEET, "oureclase_boots");

    public static ItemArmorBase platinum_helmet = new ItemArmorBase(ModMetals.PLATINUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "platinum_helmet").setTooltip(Tooltips.PLATINUM_HELMET_EFFECT);
    public static ItemArmorBase platinum_chest = new ItemArmorBase(ModMetals.PLATINUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "platinum_chest");
    public static ItemArmorBase platinum_legs = new ItemArmorBase(ModMetals.PLATINUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "platinum_legs");
    public static ItemArmorBase platinum_boots = new ItemArmorBase(ModMetals.PLATINUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "platinum_boots");

    public static ItemArmorBase prometheum_helmet = new ItemArmorBase(ModMetals.PROMETHEUM.getArmorMaterial(), EntityEquipmentSlot.HEAD, "prometheum_helmet").setTooltip(Tooltips.PROMETHEUM_ARMOR_EFFECT);
    public static ItemArmorBase prometheum_chest = new ItemArmorBase(ModMetals.PROMETHEUM.getArmorMaterial(), EntityEquipmentSlot.CHEST, "prometheum_chest").setTooltip(Tooltips.PROMETHEUM_ARMOR_EFFECT);
    public static ItemArmorBase prometheum_legs = new ItemArmorBase(ModMetals.PROMETHEUM.getArmorMaterial(), EntityEquipmentSlot.LEGS, "prometheum_legs").setTooltip(Tooltips.PROMETHEUM_ARMOR_EFFECT);
    public static ItemArmorBase prometheum_boots = new ItemArmorBase(ModMetals.PROMETHEUM.getArmorMaterial(), EntityEquipmentSlot.FEET, "prometheum_boots").setTooltip(Tooltips.PROMETHEUM_ARMOR_EFFECT);

    public static ItemArmorBase quicksilver_helmet=new ItemArmorBase(ModMetals.QUICKSILVER.getArmorMaterial(),EntityEquipmentSlot.HEAD, "quicksilver_helmet").setTooltip(Tooltips.QUICKSILVER_ARMOR_EFFECT);
    public static ItemArmorBase quicksilver_chest=new ItemArmorBase(ModMetals.QUICKSILVER.getArmorMaterial(),EntityEquipmentSlot.CHEST, "quicksilver_chest").setTooltip(Tooltips.QUICKSILVER_ARMOR_EFFECT);
    public static ItemArmorBase quicksilver_legs=new ItemArmorBase(ModMetals.QUICKSILVER.getArmorMaterial(),EntityEquipmentSlot.LEGS, "quicksilver_legs").setTooltip(Tooltips.QUICKSILVER_ARMOR_EFFECT);
    public static ItemArmorBase quicksilver_boots=new ItemArmorBase(ModMetals.QUICKSILVER.getArmorMaterial(),EntityEquipmentSlot.FEET, "quicksilver_boots").setTooltip(Tooltips.QUICKSILVER_ARMOR_EFFECT);
    
    public static ItemArmorBase sanguinite_helmet = new ItemArmorBase(ModMetals.SANGUINITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "sanguinite_helmet");
    public static ItemArmorBase sanguinite_chest = new ItemArmorBase(ModMetals.SANGUINITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "sanguinite_chest");
    public static ItemArmorBase sanguinite_legs = new ItemArmorBase(ModMetals.SANGUINITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "sanguinite_legs");
    public static ItemArmorBase sanguinite_boots = new ItemArmorBase(ModMetals.SANGUINITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "sanguinite_boots");

    public static ItemArmorBase shadow_iron_helmet = new ItemArmorBase(ModMetals.SHADOW_IRON.getArmorMaterial(), EntityEquipmentSlot.HEAD, "shadow_iron_helmet");
    public static ItemArmorBase shadow_iron_chest = new ItemArmorBase(ModMetals.SHADOW_IRON.getArmorMaterial(), EntityEquipmentSlot.CHEST, "shadow_iron_chest");
    public static ItemArmorBase shadow_iron_legs = new ItemArmorBase(ModMetals.SHADOW_IRON.getArmorMaterial(), EntityEquipmentSlot.LEGS, "shadow_iron_legs");
    public static ItemArmorBase shadow_iron_boots = new ItemArmorBase(ModMetals.SHADOW_IRON.getArmorMaterial(), EntityEquipmentSlot.FEET, "shadow_iron_boots");

    public static ItemArmorBase shadow_steel_helmet = new ItemArmorBase(ModMetals.SHADOW_STEEL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "shadow_steel_helmet").setTooltip(Tooltips.SHADOW_STEEL_ARMOR_EFFECT);
    public static ItemArmorBase shadow_steel_chest = new ItemArmorBase(ModMetals.SHADOW_STEEL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "shadow_steel_chest").setTooltip(Tooltips.SHADOW_STEEL_ARMOR_EFFECT);
    public static ItemArmorBase shadow_steel_legs = new ItemArmorBase(ModMetals.SHADOW_STEEL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "shadow_steel_legs").setTooltip(Tooltips.SHADOW_STEEL_ARMOR_EFFECT);
    public static ItemArmorBase shadow_steel_boots = new ItemArmorBase(ModMetals.SHADOW_STEEL.getArmorMaterial(), EntityEquipmentSlot.FEET, "shadow_steel_boots").setTooltip(Tooltips.SHADOW_STEEL_ARMOR_EFFECT);

    public static ItemArmorBase silver_helmet = new ItemArmorBase(ModMetals.SILVER.getArmorMaterial(), EntityEquipmentSlot.HEAD, "silver_helmet");
    public static ItemArmorBase silver_chest = new ItemArmorBase(ModMetals.SILVER.getArmorMaterial(), EntityEquipmentSlot.CHEST, "silver_chest");
    public static ItemArmorBase silver_legs = new ItemArmorBase(ModMetals.SILVER.getArmorMaterial(), EntityEquipmentSlot.LEGS, "silver_legs");
    public static ItemArmorBase silver_boots = new ItemArmorBase(ModMetals.SILVER.getArmorMaterial(), EntityEquipmentSlot.FEET, "silver_boots");

    public static ItemArmorBase steel_helmet = new ItemArmorBase(ModMetals.STEEL.getArmorMaterial(), EntityEquipmentSlot.HEAD, "steel_helmet");
    public static ItemArmorBase steel_chest = new ItemArmorBase(ModMetals.STEEL.getArmorMaterial(), EntityEquipmentSlot.CHEST, "steel_chest");
    public static ItemArmorBase steel_legs = new ItemArmorBase(ModMetals.STEEL.getArmorMaterial(), EntityEquipmentSlot.LEGS, "steel_legs");
    public static ItemArmorBase steel_boots = new ItemArmorBase(ModMetals.STEEL.getArmorMaterial(), EntityEquipmentSlot.FEET, "steel_boots");

    public static ItemArmorBase tartarite_helmet = new ItemArmorBase(ModMetals.TARTARITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "tartarite_helmet");
    public static ItemArmorBase tartarite_chest = new ItemArmorBase(ModMetals.TARTARITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "tartarite_chest");
    public static ItemArmorBase tartarite_legs = new ItemArmorBase(ModMetals.TARTARITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "tartarite_legs");
    public static ItemArmorBase tartarite_boots = new ItemArmorBase(ModMetals.TARTARITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "tartarite_boots");

    public static ItemArmorBase vulcanite_helmet = new ItemArmorBase(ModMetals.VULCANITE.getArmorMaterial(), EntityEquipmentSlot.HEAD, "vulcanite_helmet").setTooltip(Tooltips.VULCANITE_ARMOR_EFFECT);
    public static ItemArmorBase vulcanite_chest = new ItemArmorBase(ModMetals.VULCANITE.getArmorMaterial(), EntityEquipmentSlot.CHEST, "vulcanite_chest").setTooltip(Tooltips.VULCANITE_ARMOR_EFFECT);
    public static ItemArmorBase vulcanite_legs = new ItemArmorBase(ModMetals.VULCANITE.getArmorMaterial(), EntityEquipmentSlot.LEGS, "vulcanite_legs").setTooltip(Tooltips.VULCANITE_ARMOR_EFFECT);
    public static ItemArmorBase vulcanite_boots = new ItemArmorBase(ModMetals.VULCANITE.getArmorMaterial(), EntityEquipmentSlot.FEET, "vulcanite_boots").setTooltip(Tooltips.VULCANITE_ARMOR_EFFECT);

    public static ItemArmorBase vyroxeres_helmet = new ItemArmorBase(ModMetals.VYROXERES.getArmorMaterial(), EntityEquipmentSlot.HEAD, "vyroxeres_helmet");
    public static ItemArmorBase vyroxeres_chest = new ItemArmorBase(ModMetals.VYROXERES.getArmorMaterial(), EntityEquipmentSlot.CHEST, "vyroxeres_chest");
    public static ItemArmorBase vyroxeres_legs = new ItemArmorBase(ModMetals.VYROXERES.getArmorMaterial(), EntityEquipmentSlot.LEGS, "vyroxeres_legs");
    public static ItemArmorBase vyroxeres_boots = new ItemArmorBase(ModMetals.VYROXERES.getArmorMaterial(), EntityEquipmentSlot.FEET, "vyroxeres_boots");

    public static void register(IForgeRegistry<Item> registry) {
    	if(GeneralConfig.disableAllArmors) {
    		Object[] name;
        	for(Item armor : armorList)
        		for(Map<String, Boolean> m : ArmorConfig.mapList) {
        			name = m.keySet().toArray();
        			for(Object n : name)
        				if(armor instanceof ItemArmorBase && ((n.toString().equals(((ItemArmorBase) armor).getArmorMaterial().toString()) && m.get(n).booleanValue()))) {
                            registry.register(armor);
                            if (armor.equals(adamantine_chest))
                                isCreativeTabIconAvailable = true;
                        }
        		}
    	}
    }

    public static void registerModels() {
    	if(GeneralConfig.disableAllArmors) {
    		Object[] name;
        	for(Item armor : armorList) 
        		for(Map<String, Boolean> m : ArmorConfig.mapList) {
        			name = m.keySet().toArray();
        			for(Object n : name)
        				if(armor instanceof ItemArmorBase)
        					if((n.toString().equals(((ItemArmorBase) armor).getArmorMaterial().toString()) && m.get(n).booleanValue()))
        						((ItemArmorBase) armor).registerItemModel(armor, 0);
        		}
    	}
    }

    protected static boolean isEffectActive(ItemArmorBase armor)
    {
            String material = armor.getArmorMaterial().name().toLowerCase();

            switch (material)
            {
                case "adamantine":
                    if (ArmorEffectsConfig.adamantineArmorEffect)
                        return true;
                    break;
                case "amordrine":
                    if (ArmorEffectsConfig.amordrineArmorEffect)
                        return true;
                    break;
                case "angmallen":
                    if (ArmorEffectsConfig.angmallenArmorEffect)
                        return true;
                    break;
                case "astral_silver":
                    if (ArmorEffectsConfig.astralSilverArmorEffect)
                        return true;
                    break;
                case "carmot":
                    if (ArmorEffectsConfig.carmotArmorEffect)
                        return true;
                    break;
                case "celenegil":
                    if (ArmorEffectsConfig.celenegilArmorEffect)
                        return true;
                    break;
//                case "ceruclase":
//                    if (ArmorEffectsConfig.ceruclaseArmorEffect)
//                        return true;
//                    break;
                case "deep_iron":
                    if (ArmorEffectsConfig.deepIronArmorEffect)
                        return true;
                    break;
                case "eximite":
                    if (ArmorEffectsConfig.eximiteArmorEffect)
                        return true;
                    break;
                case "kalendrite":
                    if (ArmorEffectsConfig.kaledriteArmorEffect)
                        return true;
                    break;
                case "krik":
                    if (ArmorEffectsConfig.krikArmorEffect)
                        return true;
                    break;
                case "lutetium":
                    if (ArmorEffectsConfig.lutetiumArmorEffect)
                        return true;
                case "mithril":
                    if (ArmorEffectsConfig.mithrilArmorEffect)
                        return true;
                    break;
                case "osmium":
                    if (ArmorEffectsConfig.osmiumArmorEffect)
                        return true;
                case "platinum":
                    if (ArmorEffectsConfig.platinumArmorEffect)
                        return true;
                    break;
                case "prometheum":
                    if (ArmorEffectsConfig.prometheumArmorEffect)
                        return true;
                    break;
                case "quicksilver":
                    if (ArmorEffectsConfig.quicksilverArmorEffect)
                        return true;
                    break;
                case "shadow_steel":
                    if (ArmorEffectsConfig.shadowSteelArmorEffect)
                        return true;
                    break;
                case "vulcanite":
                    if (ArmorEffectsConfig.vulcaniteArmorEffect)
                        return true;
                    break;
                default:
                    return false;
            }
            return false;
    }

}
