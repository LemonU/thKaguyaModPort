package lemonu.thkaguyamodport.init;

import java.util.stream.Stream;

import lemonu.thkaguyamodport.block.BlockDanmakuCraftingTable;
import lemonu.thkaguyamodport.block.BlockDivineSpirit;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event)
    {
        for (Item item : ITEMBLOCKS)
        {
            ModelLoader.setCustomModelResourceLocation(item,
                                                        0,
                                                        new ModelResourceLocation(item.getRegistryName(), 
                                                                                    "inventory")
                                                    );   
        }
	}
    
}