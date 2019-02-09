package lemonu.thkaguyamodport.item;

import lemonu.thkaguyamodport.THKaguyaMod;
import net.minecraft.item.Item;

/**
 * ItemBase
 */
public class ItemBase extends Item
{

    public final String ITEMNAME;

    public ItemBase(String itemName)
    {
        this.ITEMNAME = itemName;

        setCreativeTab(THKaguyaMod.getModCreativeTab());
    }
    
}