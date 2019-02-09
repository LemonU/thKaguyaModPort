package lemonu.thkaguyamodport;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
// import org.apache.logging.log4j.Logger;

import lemonu.thkaguyamodport.block.BlockDanmakuCraftingTable;
import lemonu.thkaguyamodport.init.ModBlocks;
import lemonu.thkaguyamodport.proxy.CommonProxy;

@Mod(modid = THKaguyaMod.MODID, name = THKaguyaMod.MODNAME, version = THKaguyaMod.MODVERSION)
public class THKaguyaMod
{
    public static final String MODID = "thkaguyamodport";
    public static final String MODNAME = "Itutu No Nandai MOD+ Port";
    public static final String MODVERSION = "0.1";

    // private static Logger logger;

    private static final CreativeTabs THKAGUYAMOD_TAB = (new CreativeTabs(MODID){
    
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.getItemBlocks()[0]);
        }
    });

    @Mod.Instance
    public static THKaguyaMod instance = new THKaguyaMod();

    @SidedProxy(clientSide = "lemonu.thkaguyamodport.proxy.ClientProxy", serverSide = "lemonu.thkaguyamodport.proxy.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    public static final CreativeTabs getModCreativeTab()
    {
        return THKAGUYAMOD_TAB;
    }
}
