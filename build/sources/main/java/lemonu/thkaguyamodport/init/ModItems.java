package lemonu.thkaguyamodport.init;

import lemonu.thkaguyamodport.item.ItemHouraiJeweledBranch;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * ModItems
 */
public class ModItems {

	private static final Item[] ITEMS = {
		new ItemHouraiJeweledBranch()
	};

	public static void registerItems(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS);
	}

	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		for (Item item : ITEMS)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

}