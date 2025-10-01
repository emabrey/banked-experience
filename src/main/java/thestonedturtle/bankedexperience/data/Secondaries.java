/*
 * Copyright (c) 2019, TheStonedTurtle <https://github.com/TheStonedTurtle>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package thestonedturtle.bankedexperience.data;

import java.util.Locale;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.runelite.api.gameval.ItemID;

@Getter
public enum Secondaries
{
	/**
	 * Herblore
	 */
	UNFINISHED_POTION(new ItemStack(ItemID.VIAL_WATER, 1)),
	COCONUT_MILK(new ItemStack(ItemID.VIAL_COCONUT_MILK, 1)),
	SWAMP_TAR(new ItemStack(ItemID.SWAMP_TAR, 15)),
	VIAL_OF_BLOOD(new ItemStack(ItemID.VIAL_BLOOD, 1)),
	WEAPON_POISON_PLUS(new ItemStack(ItemID.RED_SPIDERS_EGGS, 1)),
	WEAPON_POISON_PLUS_PLUS(new ItemStack(ItemID.POISONIVY_BERRIES, 1)),
	// Guam
	ATTACK_POTION(new ItemStack(ItemID.EYE_OF_NEWT, 1)),
	// Marrentil
	ANTIPOISON(new Crushable(ItemID.UNICORN_HORN, ItemID.UNICORN_HORN_DUST)),
	// Tarromin
	STRENGTH_POTION(new ItemStack(ItemID.LIMPWURT_ROOT, 1)),
	SERUM_207(new ItemStack(ItemID.ASHES, 1)),
	// Harralander
	COMPOST_POTION(new ItemStack(ItemID.FOSSIL_VOLCANIC_ASH, 1)),
	RESTORE_POTION(new ItemStack(ItemID.RED_SPIDERS_EGGS, 1)),
	ENERGY_POTION(new Crushable(ItemID.CHOCOLATE_BAR, ItemID.CHOCOLATE_DUST)),
	COMBAT_POTION(new Crushable(ItemID.DESERT_GOAT_HORN, ItemID.GROUND_DESERT_GOAT_HORN)),
	GOADING_POTION(new ItemStack(ItemID.ALDARIUM, 1)),
	// Ranarr Weed
	DEFENCE_POTION(new ItemStack(ItemID.WHITE_BERRIES, 1)),
	PRAYER_POTION(new ItemStack(ItemID.SNAPE_GRASS, 1)),
	// Toadflax
	AGILITY_POTION(new ItemStack(ItemID.TOADS_LEGS, 1)),
	SARADOMIN_BREW(new Crushable(ItemID.BIRD_NEST_EMPTY, ItemID.CRUSHED_BIRD_NEST)),
	ANTIDOTE_PLUS(new ItemStack(ItemID.YEW_ROOTS, 1)),
	// Irit
	SUPER_ATTACK(new ItemStack(ItemID.EYE_OF_NEWT, 1)),
	SUPERANTIPOISON(new Crushable(ItemID.UNICORN_HORN, ItemID.UNICORN_HORN_DUST)),
	ANTIDOTE_PLUS_PLUS(new ItemStack(ItemID.MAGIC_ROOTS, 1)),
	// Avantoe
	FISHING_POTION(new ItemStack(ItemID.SNAPE_GRASS, 1)),
	SUPER_ENERGY_POTION(new ItemStack(ItemID.MORTMYREMUSHROOM, 1)),
	HUNTER_POTION(new Crushable(ItemID.HUNTINGBEAST_SABRETEETH, ItemID.HUNTINGBEAST_SABRETEETH_DUST)),
	// Kwuarm
	SUPER_STRENGTH(new ItemStack(ItemID.LIMPWURT_ROOT, 1)),
	WEAPON_POISON(new ItemStack(ItemID.DRAGON_SCALE_DUST, 1)),
	// Snapdragon
	SUPER_RESTORE(new ItemStack(ItemID.RED_SPIDERS_EGGS, 1)),
	SANFEW_SERUM(new ItemStack(ItemID.SNAKE_WEED, 1), new ItemStack(ItemID.UNICORN_HORN_DUST, 1), new ItemStack(ItemID._4DOSE2RESTORE, 1), new ItemStack(ItemID.NAIL_BEAST_NAIL, 1)),
	// Cadantine
	SUPER_DEFENCE_POTION(new ItemStack(ItemID.WHITE_BERRIES, 1)),
	// Lantadyme
	ANTIFIRE_POTION(new Crushable(ItemID.BLUE_DRAGON_SCALE, ItemID.DRAGON_SCALE_DUST)),
	MAGIC_POTION(new ItemStack(ItemID.CACTUS_POTATO, 1)),
	// Dwarf Weed
	RANGING_POTION(new ItemStack(ItemID.WINE_OF_ZAMORAK, 1)),
	ANCIENT_BREW(new Crushable(ItemID.NIHIL_SHARD, ItemID.NIHIL_DUST)),
	MENAPHITE_REMEDY(new ItemStack(ItemID.LILY_OF_THE_SANDS, 1)),
	// Torstol
	ZAMORAK_BREW(new ItemStack(ItemID.JANGERBERRIES, 1)),
	SUPER_COMBAT_POTION(new ItemStack(ItemID._4DOSE2ATTACK, 1), new ItemStack(ItemID._4DOSE2STRENGTH, 1), new ItemStack(ItemID._4DOSE2DEFENSE, 1)),
	ANTIVENOM_PLUS(new ItemStack(ItemID.ANTIVENOM4, 1)),
	// Huasca
	PRAYER_REGENERATION_POTION(new ItemStack(ItemID.ALDARIUM, 1)),
	// Other
	STAMINA_POTION(new ByDose(ItemID._1DOSE2ENERGY, ItemID._2DOSE2ENERGY, ItemID._3DOSE2ENERGY, ItemID._4DOSE2ENERGY)),
	FORGOTTEN_BREW(new ItemStack(ItemID.ANCIENT_ESSENCE, 20)),
	EXTENDED_ANTIFIRE(new ByDose(ItemID._1DOSE1ANTIDRAGON, ItemID._2DOSE1ANTIDRAGON, ItemID._3DOSE1ANTIDRAGON, ItemID._4DOSE1ANTIDRAGON)),
	EXTENDED_SUPER_ANTIFIRE(new ByDose(ItemID._1DOSE3ANTIDRAGON, ItemID._2DOSE3ANTIDRAGON, ItemID._3DOSE3ANTIDRAGON, ItemID._4DOSE3ANTIDRAGON)),
	CRUSHED_SUPERIOR_DRAGON_BONES(new Crushable(ItemID.DRAGON_BONES_SUPERIOR, ItemID.CRUSHED_DRAGON_BONES)),
	EXTENDED_ANTIVENOM_PLUS(new ByDose(ItemID.ANTIVENOM_1, ItemID.ANTIVENOM_2, ItemID.ANTIVENOM_3, ItemID.ANTIVENOM_4)),
	ANTIVENOM(new ItemStack(ItemID.SNAKEBOSS_SCALE, 5)),
	// Degrime
	DEGRIME(new Degrime()),
	/**
	 * Smithing
	 */
	COAL_ORE(new ItemStack(ItemID.COAL, 1)),
	COAL_ORE_2(new ItemStack(ItemID.COAL, 2)),
	COAL_ORE_3(new ItemStack(ItemID.COAL, 3)),
	COAL_ORE_4(new ItemStack(ItemID.COAL, 4)),
	COAL_ORE_6(new ItemStack(ItemID.COAL, 6)),
	COAL_ORE_8(new ItemStack(ItemID.COAL, 8)),
	/**
	 * Crafting
	 */
	GOLD_BAR(new ItemStack(ItemID.GOLD_BAR, 1)),
	SILVER_BAR(new ItemStack(ItemID.SILVER_BAR, 1)),
	WATER_ORB(new ItemStack(ItemID.WATER_ORB, 1)),
	EARTH_ORB(new ItemStack(ItemID.EARTH_ORB, 1)),
	FIRE_ORB(new ItemStack(ItemID.FIRE_ORB, 1)),
	AIR_ORB(new ItemStack(ItemID.AIR_ORB, 1)),
	BUCKET_OF_SAND(new ItemStack(ItemID.BUCKET_SAND, 1)),
	BUCKET_OF_SAND_6(new ItemStack(ItemID.BUCKET_SAND, 6)),
	HARD_LEATHER_SHIELD(new ItemStack(ItemID.OAK_SHIELD, 1), new ItemStack(ItemID.NAILS_BRONZE, 15)),
	COIN(new ItemStack(ItemID.COINS, 1)),
	COIN_3(new ItemStack(ItemID.COINS, 3)),
	LEATHER_BODY(new ItemStack(ItemID.LEATHER_ARMOUR, 1)),
	LEATHER_CHAPS(new ItemStack(ItemID.LEATHER_CHAPS, 1)),
	BALL_OF_WOOL(new ItemStack(ItemID.BALL_OF_WOOL, 1)),
	/**
	 * Construction
	 */
	COINS_100(new ItemStack(ItemID.COINS, 100)),
	COINS_250(new ItemStack(ItemID.COINS, 250)),
	COINS_500(new ItemStack(ItemID.COINS, 500)),
	COINS_1500(new ItemStack(ItemID.COINS, 1500)),
	// Plank make spell assumes earth staff is used because why wouldn't you
	PLANK_MAKE_REGULAR(new ItemStack(ItemID.ASTRALRUNE, 2), new ItemStack(ItemID.NATURERUNE, 1), new ItemStack(ItemID.COINS, 70)),
	PLANK_MAKE_OAK(new ItemStack(ItemID.ASTRALRUNE, 2), new ItemStack(ItemID.NATURERUNE, 1), new ItemStack(ItemID.COINS, 175)),
	PLANK_MAKE_TEAK(new ItemStack(ItemID.ASTRALRUNE, 2), new ItemStack(ItemID.NATURERUNE, 1), new ItemStack(ItemID.COINS, 350)),
	PLANK_MAKE_MAHOGANY(new ItemStack(ItemID.ASTRALRUNE, 2), new ItemStack(ItemID.NATURERUNE, 1), new ItemStack(ItemID.COINS, 1050)),
	// Mahogany Homes secondary rates are calculated utilizing the averages as generated by the wiki
	// https://oldschool.runescape.wiki/w/Mahogany_Homes
	STEEL_BAR_PLANK(new ItemStack(ItemID.STEEL_BAR, 0.040)),
	STEEL_BAR_OAK(new ItemStack(ItemID.STEEL_BAR, 0.040)),
	STEEL_BAR_TEAK(new ItemStack(ItemID.STEEL_BAR, 0.042)),
	STEEL_BAR_MAHOGANY(new ItemStack(ItemID.STEEL_BAR, 0.040)),
	/**
	 * Prayer
	 */
	BLESSED_BONE_SHARDS_JUG_OF_BLESSED_WINE(new ItemStack(ItemID.JUG_WINE_BLESSED, 0.0025)),
	BLESSED_BONE_SHARDS_JUG_OF_BLESSED_SUNFIRE_WINE(new ItemStack(ItemID.JUG_SUNFIRE_WINE_BLESSED, 0.0025)),
	/**
	 * Cooking
	 */
	JUG_OF_WATER(new ItemStack(ItemID.JUG_WATER, 1)),
	/**
	 * Fletching
	 */
	BOW_STRING(new ItemStack(ItemID.BOW_STRING, 1)),
	FEATHER(new ItemStack(ItemID.FEATHER, 1)),
	HEADLESS_ARROW(new ItemStack(ItemID.HEADLESS_ARROW, 1)),
	CROSSBOW_STRING(new ItemStack(ItemID.XBOWS_CROSSBOW_STRING, 1)),
	BRONZE_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_BRONZE, 1)),
	BLURITE_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_BLURITE, 1)),
	IRON_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_IRON, 1)),
	STEEL_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_STEEL, 1)),
	MITHRIL_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_MITHRIL, 1)),
	ADAMANTITE_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_ADAMANTITE, 1)),
	RUNITE_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_RUNITE, 1)),
	DRAGON_LIMBS(new ItemStack(ItemID.XBOWS_CROSSBOW_LIMBS_DRAGON, 1)),
	JAVELIN_SHAFT(new ItemStack(ItemID.JAVELIN_SHAFT, 1)),

	// Vale Totem Offerings
	OAK_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.OAK)),
	WILLOW_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.WILLOW)),
	MAPLE_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.MAPLE)),
	YEW_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.YEW)),
	MAGIC_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.MAGIC)),
	REDWOOD_VALE_TOTEM_OFFERING( new ValeTotemOfferable(ValeTotemOfferable.WOOD_TYPE.REDWOOD)),

	/**
	 * Prayer
	 */
	BUCKET_OF_SLIME(new ItemStack(ItemID.BUCKET_ECTOPLASM, 1)),
	BASIC_REANIMATION(new ItemStack(ItemID.NATURERUNE, 2), new ItemStack(ItemID.BODYRUNE, 4)),
	ADEPT_REANIMATION(new ItemStack(ItemID.NATURERUNE, 3), new ItemStack(ItemID.BODYRUNE, 4), new ItemStack(ItemID.SOULRUNE, 1)),
	EXPERT_REANIMATION(new ItemStack(ItemID.NATURERUNE, 3), new ItemStack(ItemID.BLOODRUNE, 1), new ItemStack(ItemID.SOULRUNE, 2)),
	MASTER_REANIMATION(new ItemStack(ItemID.NATURERUNE, 4), new ItemStack(ItemID.BLOODRUNE, 2), new ItemStack(ItemID.SOULRUNE, 4)),
	/**
	 * Thieving
	 */
	BEER_GLASS_5TH(new ItemStack(ItemID.BEER_GLASS, 0.2)),
	BEER_GLASS_4TH(new ItemStack(ItemID.BEER_GLASS, 0.25)),
	BEER_GLASS_3RD(new ItemStack(ItemID.BEER_GLASS, 1.0 / 3)),
	BEER_GLASS_HALF(new ItemStack(ItemID.BEER_GLASS, 0.5)),
	;
	private final ItemStack[] items;
	private final SecondaryHandler customHandler;

	public interface SecondaryHandler
	{
		ItemStack[] getInfoItems();
	}

	public static class ByDose implements SecondaryHandler
	{
		@Getter
		// index + 1 = amount of doses the item id is worth
		private final int[] items;
		@Getter
		private final ItemStack[] infoItems;

		public ByDose(final int... items)
		{
			this.items = items;
			this.infoItems = new ItemStack[]{new ItemStack(items[0], 0)};
		}
	}

	@NoArgsConstructor
	public static class Degrime implements SecondaryHandler
	{
		@Getter
		private final ItemStack[] infoItems = new ItemStack[]{new ItemStack(ItemID.NATURERUNE, 0)};

		public int getTotalNaturesRequired(int itemCount)
		{
			// Assume each spell cast is being maximally efficient by using a earth staff, 1 slot of natures, and 27 for herbs
			final int requiredCasts = (int) Math.ceil(itemCount / 27.0d);

			// 1 spell cast requires at least 2 nature runes.
			return requiredCasts * 2;
		}
	}

	public static class Crushable implements SecondaryHandler
	{
		@Getter
		private final int[] items;
		@Getter
		private final ItemStack[] infoItems;

		// Final ID should be the crushed variant, assume that only 1 of the resource is needed per activity
		private Crushable(final int... items)
		{
			this.items = items;
			this.infoItems = new ItemStack[]{new ItemStack(items[items.length - 1], 0)};
		}
	}

	@AllArgsConstructor
	public static class ValeTotemOfferable implements SecondaryHandler 
	{
		public static enum WOOD_TYPE 
		{
			OAK(ItemID.UNSTRUNG_OAK_SHORTBOW, ItemID.OAK_SHORTBOW, ItemID.UNSTRUNG_OAK_LONGBOW,
					ItemID.OAK_LONGBOW, ItemID.OAK_SHIELD, ItemID.XBOWS_CROSSBOW_STOCK_OAK),
							
			WILLOW(ItemID.UNSTRUNG_WILLOW_SHORTBOW, ItemID.WILLOW_SHORTBOW, ItemID.UNSTRUNG_WILLOW_LONGBOW,
					ItemID.WILLOW_LONGBOW, ItemID.WILLOW_SHIELD, ItemID.XBOWS_CROSSBOW_STOCK_WILLOW),
							
			MAPLE(ItemID.UNSTRUNG_MAPLE_SHORTBOW, ItemID.MAPLE_SHORTBOW, ItemID.UNSTRUNG_MAPLE_LONGBOW,
					ItemID.MAPLE_LONGBOW, ItemID.MAPLE_SHIELD, ItemID.XBOWS_CROSSBOW_STOCK_MAPLE),
							
			YEW(ItemID.UNSTRUNG_YEW_SHORTBOW, ItemID.YEW_SHORTBOW, ItemID.UNSTRUNG_YEW_LONGBOW,
					ItemID.YEW_LONGBOW, ItemID.YEW_SHIELD, ItemID.XBOWS_CROSSBOW_STOCK_YEW),
							
			MAGIC(ItemID.UNSTRUNG_MAGIC_SHORTBOW, ItemID.MAGIC_SHORTBOW, ItemID.UNSTRUNG_MAGIC_LONGBOW,
					ItemID.MAGIC_LONGBOW, ItemID.MAGIC_SHIELD, ItemID.XBOWS_CROSSBOW_STOCK_MAGIC),
							
			REDWOOD(ItemID.REDWOOD_HIKING_STAFF, ItemID.REDWOOD_SHIELD);

			@Getter
			private final String displayName;

			@Getter
			private final int[] items;

			@SafeVarargs
			private WOOD_TYPE(int... itemArgs) 
			{
				items = itemArgs.clone();
				assert items.length >= 2
						: "The info item is the 2nd position in the item array, so arrays must have minimum size";

				assert name().length() > 0;
				char[] titleCase = name().toLowerCase(Locale.US).toCharArray();
				titleCase[0] = name().toUpperCase(Locale.US).charAt(0);
				displayName = String.copyValueOf(titleCase);
			}
		}
		
		@Getter
		final WOOD_TYPE woodType;

		@Override
		public ItemStack[] getInfoItems() 
		{
			return new ItemStack[] { new ItemStack(woodType.items[1], 4) };
		}

		public int[] getItems() 
		{
			return woodType.getItems().clone();
		}

	}

	Secondaries(ItemStack... items)
	{
		this.items = items;
		this.customHandler = null;
	}

	Secondaries(SecondaryHandler customHandler)
	{
		this.items = new ItemStack[0];
		this.customHandler = customHandler;
	}
}
