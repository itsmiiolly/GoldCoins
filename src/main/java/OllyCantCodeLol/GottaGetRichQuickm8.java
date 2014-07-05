package OllyCantCodeLol;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class GottaGetRichQuickm8 {
	public static ArrayList<Block> blocks = new ArrayList<Block>();

	public static void placeCoins() {
		for (int i = 0; i < blocks.size(); i++) {
			Bukkit.broadcastMessage("Removed a gold block at " + blocks.get(i).getLocation().toString());
			blocks.get(i).setType(Material.AIR);
			blocks.get(i).getWorld().dropItem(blocks.get(i).getLocation(), new ItemStack(Material.GOLD_NUGGET));
		}
		blocks.clear();
	}
}
