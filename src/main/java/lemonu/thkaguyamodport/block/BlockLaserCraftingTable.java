package lemonu.thkaguyamodport.block;

import net.minecraft.block.material.Material;
// import net.minecraft.creativetab.CreativeTabs;

/**
 * BlockLaserCraftingTable
 */
public class BlockLaserCraftingTable extends BlockBase
{

    public BlockLaserCraftingTable()
    {
        super("laser_crafting_table", Material.WOOD);

        setHardness(1.5F);
        setResistance(1.0F);
        setLightLevel(1.0F);

        // setCreativeTab(CreativeTabs.DECORATIONS);
    }
    
}