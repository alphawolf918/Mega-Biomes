package biomemod.lib;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import biomemod.blocks.Blocks;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	public static void init() {
		
		// Slime Block
		GameRegistry.addRecipe(new ItemStack(Blocks.slimeBlock, 1),
				new Object[] { "SSS", "SSS", "SSS", 'S', Item.slimeBall });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.slimeBall, 9),
				new Object[] { Blocks.slimeBlock });
		
		// Magma Slime Block
		GameRegistry.addRecipe(new ItemStack(Blocks.magmaSlime, 1),
				new Object[] { "SSS", "SSS", "SSS", 'S', Item.magmaCream });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.magmaCream, 9),
				new Object[] { Blocks.magmaSlime });
		
		// Red Rock
		ItemStack rrb = new ItemStack(Blocks.redRockBrick, 4);
		GameRegistry.addRecipe(rrb, new Object[] { "SS ", "SS ", "   ", 'S',
				Blocks.redRock });
		
		// Cold Smoothstone
		ItemStack css = new ItemStack(Blocks.coldSandSmoothBlock, 4);
		GameRegistry.addRecipe(css, new Object[] { "CC ", "CC ", "   ", 'C',
				Blocks.coldSandBlock });
		
		int input = Blocks.redCobble.blockID;
		ItemStack output = new ItemStack(Blocks.redRock, 1);
		float xp = 4F;
		GameRegistry.addSmelting(input, output, xp);
	}
}
