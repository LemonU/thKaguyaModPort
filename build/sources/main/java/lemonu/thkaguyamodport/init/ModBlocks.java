package lemonu.thkaguyamodport.init;

import lemonu.thkaguyamodport.block.BlockDanmakuCraftingTable;
import lemonu.thkaguyamodport.block.BlockDivineSpirit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
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

    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BLOCKS);
    }

    public static void registerItemBlocks(RegistryEvent.Register<Item> event)
    {

	}
    
}