package lemonu.thkaguyamodport.bases;

import lemonu.thkaguyamodport.THKaguyaMod;
import net.minecraft.item.ItemBow;

/**
 * ItemBase
 */
public class ItemFirearmBase extends ItemBow
{

    public final String ITEMNAME;

    public ItemFirearmBase(String itemName)
    {
        this.ITEMNAME = itemName;

        setUnlocalizedName(THKaguyaMod.MODID + ":" + this.ITEMNAME);
        setRegistryName(THKaguyaMod.MODID, this.ITEMNAME);

        setCreativeTab(THKaguyaMod.getModCreativeTab());
    }
    
}