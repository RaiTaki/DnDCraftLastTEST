package xyz.raitaki.DnDCraftLastTest.Commands;

import com.dndcraft.AtlasPaper;
import com.dndcraft.util.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CreateItemCommand extends ComTemplate{

    public void invoke(Player p){
        var displayname = AtlasPaper.get().componentBuilder().append("TAGGED ITEM").build();
        ItemStack item    = ItemUtil.make(Material.IRON_SHOVEL, displayname);
        ItemMeta itemMeta = item.getItemMeta();
        ItemUtil.setTag(itemMeta, "TEST", "TEST");
        item.setItemMeta(itemMeta);
        p.getInventory().addItem(item);
    }
}
