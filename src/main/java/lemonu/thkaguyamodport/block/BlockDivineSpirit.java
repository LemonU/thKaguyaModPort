package lemonu.thkaguyamodport.block;

import net.minecraft.block.material.Material;
// import net.minecraft.creativetab.CreativeTabs;

/**
 * BlockDivineSpirit
 */
public class BlockDivineSpirit extends BlockBase
{

    public BlockDivineSpirit()
    {
        super("divine_spirit", Material.SNOW);

        setHardness(0.1F);
        setResistance(2000.0F);
        setLightLevel(8F/15F);

        // setCreativeTab(CreativeTabs.DECORATIONS);
    }
    
}