package lemonu.thkaguyamodport.init;

import java.util.HashMap;
import java.util.Map;

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

	private static final Map<String, Item> ITEMS_MAP = new HashMap<String, Item>();
	static {
		for(Item item : ITEMS) {
			ITEMS_MAP.put(item.getRegistryName().toString().substring(16), item);
		}
	}

	public static void registerItems(Register<Item> event) {
		event.getRegistry().registerAll(ITEMS);
	}

	public static final Item[] getItems() {
		return ITEMS;
	}

	public static final Item getItem(String itemName) {
		return ITEMS_MAP.get(itemName);
	}

	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		for (Item item : ITEMS)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

}