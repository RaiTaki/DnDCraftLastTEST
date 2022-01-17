package xyz.raitaki.DnDCraftLastTest.Commands;

import com.dndcraft.menu.MenuBuilder;
import com.dndcraft.menu.icon.Icon;
import com.dndcraft.util.AtlasColor;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.raitaki.DnDCraftLastTest.EasyMenuBuilder;

public class MenuCommand extends ComTemplate{

    public void invoke(Player p){
        EasyMenuBuilder menuBuilder = new EasyMenuBuilder();
        menuBuilder.setSize(54);
        menuBuilder.setMenuName(ChatColor.AQUA + "RaiTaki's menu builder!");
        menuBuilder.setIcon(Material.PUFFERFISH, 21, "This is a fish button", "Button lore", AtlasColor.AQUA, AtlasColor.BLUE);
        menuBuilder.setPad(Material.BOOK, 23, "This is a pad", "Pad lore", AtlasColor.BABY_BLUE, AtlasColor.CYAN);
        menuBuilder.openToPlayer(p);
    }
}
