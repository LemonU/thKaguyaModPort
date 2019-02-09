package lemonu.thkaguyamodport.proxy;

import lemonu.thkaguyamodport.init.ModBlocks;
import lemonu.thkaguyamodport.init.ModItems;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * ClientProxy
 */
@EventBusSubscriber
public class ClientProxy extends CommonProxy
{
    
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModBlocks.registerModels(event);
        ModItems.registerModels(event);
    }
    
}