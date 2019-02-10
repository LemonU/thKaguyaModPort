package lemonu.thkaguyamodport.block;

import lemonu.thkaguyamodport.bases.BlockBase;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

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

        setSoundType(SoundType.SNOW);
    }
    
}