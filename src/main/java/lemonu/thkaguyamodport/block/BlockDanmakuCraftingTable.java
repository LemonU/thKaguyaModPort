package lemonu.thkaguyamodport.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * BlockDanmakuCraftingTable
 */
public class BlockDanmakuCraftingTable extends BlockBase
{

    public BlockDanmakuCraftingTable()
    {
        super("danmaku_crafting_table", Material.WOOD);

        setHardness(1.5F);
        setResistance(1.0F);
        setLightLevel(1.0F);

        setCreativeTab(CreativeTabs.DECORATIONS);
    }

}