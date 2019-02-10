package lemonu.thkaguyamodport.proxy;

import lemonu.thkaguyamodport.init.ModBlocks;
import lemonu.thkaguyamodport.init.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ClientProxy
 */
@EventBusSubscriber
public class ClientProxy extends CommonProxy
{
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModBlocks.registerModels(event);
        ModItems.registerModels(event);
    }
    
}