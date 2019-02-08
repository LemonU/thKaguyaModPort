package lemonu.thkaguyamodport.block;

import lemonu.thkaguyamodport.THKaguyaMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * ModBlockBase
 */
public abstract class BlockBase extends Block
{

    private final String NAME;

    public BlockBase(String name, Material material)
    {
        super(material);

        this.NAME = name;

        setRegistryName(THKaguyaMod.MODID, NAME);
        setUnlocalizedName(THKaguyaMod.MODID + ":" + NAME);
    }
    
    public final String getBlockName()
    {
        return NAME;
    }
}