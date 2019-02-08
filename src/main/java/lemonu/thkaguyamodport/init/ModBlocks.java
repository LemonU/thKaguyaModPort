package lemonu.thkaguyamodport.init;

import java.util.stream.Stream;

import lemonu.thkaguyamodport.block.BlockDanmakuCraftingTable;
import lemonu.thkaguyamodport.block.BlockDivineSpirit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;

/**
 * ModBlocks
 */
public class ModBlocks {

    private static final Block[] BLOCKS = 
    {
        new BlockDanmakuCraftingTable(),
        new BlockDivineSpirit()
    };

    private static final Item[] ITEMBLOCKS = Stream.of(BLOCKS)
                                            .map(block -> 
                                                        new ItemBlock(block)
                                                        .setRegistryName(block.getRegistryName()))
                                            .toArray(Item[]::new);

    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BLOCKS);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ITEMBLOCKS);
	}
    
}