package tech.thatgravyboat.playdate.common.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import tech.thatgravyboat.playdate.Playdate;
import tech.thatgravyboat.playdate.common.blocks.ModBlocks;
import tech.thatgravyboat.playdate.common.constants.BalloonType;
import tech.thatgravyboat.playdate.common.constants.PlushieItem;

public class ModItems {

    private static final FabricItemSettings GROUP_SETTINGS = new FabricItemSettings().group(Playdate.ITEM_GROUP);

    public static final Item STUFFING = new Item(GROUP_SETTINGS);
    public static final Item SOFTWOOD = new BlockItem(ModBlocks.SOFTWOOD, GROUP_SETTINGS);
    public static final Item BOTTLED_SOUL = new Item(new FabricItemSettings().maxCount(1).group(Playdate.ITEM_GROUP));
    public static final Item BALLOON = new BalloonItem(BalloonType.COLORED, GROUP_SETTINGS);
    public static final Item SUN_BALLOON = new BalloonItem(BalloonType.SUN, GROUP_SETTINGS);
    public static final Item ROPE = new RopeItem(GROUP_SETTINGS);

    public static final PlushItem PETUNIA_PIG_TOY = new PlushItem(ModBlocks.PETUNIA_PIG_TOY, PlushieItem.PETUNIA_PIG_TOY, GROUP_SETTINGS);
    public static final PlushItem HAPPY_SUN_TOY = new PlushItem(ModBlocks.HAPPY_SUN_TOY, PlushieItem.HAPPY_SUN_TOY, GROUP_SETTINGS);
    public static final PlushItem LOLLIPOP_CLOWN_TOY = new PlushItem(ModBlocks.LOLLIPOP_CLOWN_TOY, PlushieItem.LOLLIPOP_CLOWN_TOY, GROUP_SETTINGS);
    public static final PlushItem CREEPER_PLUSHIE = new PlushItem(ModBlocks.CREEPER_PLUSHIE, PlushieItem.CREEPER, GROUP_SETTINGS);
    public static final PlushItem DINO_PLUSHIE = new PlushItem(ModBlocks.DINO_PLUSHIE, PlushieItem.DINO, GROUP_SETTINGS);
    public static final PlushItem ENDERMAN_PLUSHIE = new PlushItem(ModBlocks.ENDERMAN_PLUSHIE, PlushieItem.ENDERMAN, GROUP_SETTINGS);
    public static final PlushItem HAPPY_SUN_PLUSHIE = new PlushItem(ModBlocks.HAPPY_SUN_PLUSHIE, PlushieItem.HAPPY_SUN, GROUP_SETTINGS);
    public static final PlushItem LOLLIPOP_CLOWN_PLUSHIE = new PlushItem(ModBlocks.LOLLIPOP_CLOWN_PLUSHIE, PlushieItem.LOLLIPOP_CLOWN, GROUP_SETTINGS);
    public static final PlushItem PETUNIA_PIG_PLUSHIE = new PlushItem(ModBlocks.PETUNIA_PIG_PLUSHIE, PlushieItem.PETUNIA_PIG, GROUP_SETTINGS);
    public static final PlushItem RUBBER_DUCKY_PLUSHIE = new PlushItem(ModBlocks.RUBBER_DUCKY_PLUSHIE, PlushieItem.RUBBER_DUCKY, GROUP_SETTINGS);
    public static final PlushItem TOADSTOOL_PLUSHIE = new PlushItem(ModBlocks.TOADSTOOL_PLUSHIE, PlushieItem.TOADSTOOL, GROUP_SETTINGS);
    public static final PlushItem WHEELIE_PUP_PLUSHIE = new PlushItem(ModBlocks.WHEELIE_PUP_PLUSHIE, PlushieItem.WHEELIE_PUP, GROUP_SETTINGS);
    public static final PlushItem ZOMBIE_PLUSHIE = new PlushItem(ModBlocks.ZOMBIE_PLUSHIE, PlushieItem.ZOMBIE, GROUP_SETTINGS);

    public static final PlushItem CYMBAL_MONKEY = new PlushItem(ModBlocks.CYMBAL_MONKEY, PlushieItem.CYMBAL_MONKEY, GROUP_SETTINGS);
    public static final PlushItem FOX_PLUSHIE = new PlushItem(ModBlocks.FOX_PLUSHIE, PlushieItem.FOX, GROUP_SETTINGS);
    public static final PlushItem SNOWY_FOX_PLUSHIE = new PlushItem(ModBlocks.SNOWY_FOX_PLUSHIE, PlushieItem.SNOWY_FOX, GROUP_SETTINGS);
    public static final PlushItem PIGGY_BANK = new PlushItem(ModBlocks.PIGGY_BANK, PlushieItem.PIGGY_BANK, GROUP_SETTINGS);
    public static final PlushItem RABBIT_PLUSHIE = new PlushItem(ModBlocks.RABBIT_PLUSHIE, PlushieItem.RABBIT, GROUP_SETTINGS);
    public static final PlushItem SOCK_MONKEY = new PlushItem(ModBlocks.SOCK_MONKEY, PlushieItem.SOCK_MONKEY, GROUP_SETTINGS);
    public static final PlushItem ROBOT = new PlushItem(ModBlocks.ROBOT, PlushieItem.ROBOT, GROUP_SETTINGS);

    public static void register() {
        Registry.register(Registry.ITEM, Playdate.modId("softwood"), SOFTWOOD);
        Registry.register(Registry.ITEM, Playdate.modId("stuffing"), STUFFING);
        Registry.register(Registry.ITEM, Playdate.modId("bottled_soul"), BOTTLED_SOUL);
        Registry.register(Registry.ITEM, Playdate.modId("balloon"), BALLOON);
        Registry.register(Registry.ITEM, Playdate.modId("happy_sun_balloon"), SUN_BALLOON);
        Registry.register(Registry.ITEM, Playdate.modId("rope"), ROPE);

        Registry.register(Registry.ITEM, Playdate.modId("creeper_plush"), CREEPER_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("dino_plush"), DINO_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("enderman_plush"), ENDERMAN_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("happy_sun_plush"), HAPPY_SUN_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("lollipop_clown_plush"), LOLLIPOP_CLOWN_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("petunia_pig_plush"), PETUNIA_PIG_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("rubber_ducky"), RUBBER_DUCKY_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("toadstool_studios_plush"), TOADSTOOL_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("wheelie_pup"), WHEELIE_PUP_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("zombie_plush"), ZOMBIE_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("petunia_pig_toy"), PETUNIA_PIG_TOY);
        Registry.register(Registry.ITEM, Playdate.modId("happy_sun_toy"), HAPPY_SUN_TOY);
        Registry.register(Registry.ITEM, Playdate.modId("lollipop_clown_toy"), LOLLIPOP_CLOWN_TOY);

        Registry.register(Registry.ITEM, Playdate.modId("cymbal_monkey"), CYMBAL_MONKEY);
        Registry.register(Registry.ITEM, Playdate.modId("fox_plush"), FOX_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("snowy_fox_plush"), SNOWY_FOX_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("piggy_bank"), PIGGY_BANK);
        Registry.register(Registry.ITEM, Playdate.modId("rabbit_plush"), RABBIT_PLUSHIE);
        Registry.register(Registry.ITEM, Playdate.modId("sock_monkey"), SOCK_MONKEY);
        Registry.register(Registry.ITEM, Playdate.modId("robot"), ROBOT);
    }


}
