package xyz.raitaki.DnDCraftLastTest.Commands;

import com.dndcraft.AtlasPaper;
import com.dndcraft.util.AtlasColor;
import com.dndcraft.util.ItemUtil;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CheckTagCommand extends ComTemplate{

    public void invoke(Player p){
        if(p.getInventory().getItemInMainHand() != null){
            ItemStack item = p.getInventory().getItemInMainHand();
            if(ItemUtil.hasTag(item.getItemMeta(), "TEST")) p.sendMessage(AtlasPaper.get().componentBuilder()
                    .append("This item has CUSTOM META!",AtlasColor.BABY_BLUE).build());
            else p.sendMessage(AtlasPaper.get().componentBuilder()
                    .append("This item doesn't have custom meta :(",AtlasColor.DARK_GRAY).build());
            
        }
    }

}
