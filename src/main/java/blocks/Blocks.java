package biomemod.blocks;

import net.minecraft.block.Block;
import biomemod.lib.DataInfo;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	public static final Block fullGrassBlock = new FullGrassBlock(
			DataInfo.fullGrassBlockID);
	public static final Block redShroomBlock = new RedshroomBlock(
			DataInfo.redShroomBlockID);
	public static final Block redShroomStem = new RedshroomStem(
			DataInfo.redStemBlockID);
	public static final Block slimeBlock = new SlimeBlock(DataInfo.slimeBlockID);
	public static final Block magmaSlime = new MagmaSlimeBlock(
			DataInfo.magmaSlimeBlockID);
	public static final Block coldSandBlock = new ColdSand(
			DataInfo.coldSandBlockID);
	public static final Block coldSandSmoothBlock = new ColdSandstone(
			DataInfo.coldSandStoneBlockID);
	public static final Block redRock = new RedRock(DataInfo.redRockBlockID);
	public static final Block redCobble = new RedCobble(
			DataInfo.redCobbleBlockID);
	public static final Block redRockBrick = new RedRockBricks(
			DataInfo.redRockBrickBlockID);
	public static final Block mapleLeaf = new MapleLeaf(DataInfo.mapleLeafID);
	public static final Block furnaceIdle = new RedRockFurnace(
			DataInfo.redRockFurnaceIdleID, false);
	public static final Block furnaceBurning = new RedRockFurnace(
			DataInfo.redRockFurnaceActiveID, true).setLightValue(0.875F);
	public static final Block lilacBlock = new Lilac(DataInfo.lilacBlockID);
	public static final Block spiderRack = new SpiderRack(
			DataInfo.spiderRackBlockID);
	public static final Block spiderStone = new SpiderStone(
			DataInfo.spiderStoneBlockID);
	
	public static void init() {
		addName(fullGrassBlock, "Full Grass Block");
		addName(redShroomBlock, "Redshroom Block");
		addName(redShroomStem, "Redshroom Stem");
		addName(slimeBlock, "Slime Block");
		addName(magmaSlime, "Magma Slime Block");
		addName(coldSandBlock, "Cold Sand");
		addName(coldSandSmoothBlock, "Cold Smoothstone");
		addName(redRock, "Red Rock");
		addName(redCobble, "Red Cobblestone");
		addName(redRockBrick, "Red Rock Bricks");
		addName(mapleLeaf, "Maple Leaves");
		addName(furnaceIdle, "Redrock Furnace");
		addName(lilacBlock, "Lilac");
		addName(spiderRack, "Spider Rack");
		addName(spiderStone, "Spider Stone");
	}
	
	public static void addName(Block block, String name) {
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}
}