package xyz.raitaki.DnDCraftLastTest;

import com.dndcraft.AtlasPaper;
import com.dndcraft.menu.MenuBuilder;
import com.dndcraft.menu.icon.Icon;
import com.dndcraft.menu.icon.Pad;
import com.dndcraft.menu.icon.SimpleButton;
import com.dndcraft.menu.icon.SimpleSlot;
import com.dndcraft.util.AtlasColor;
import com.dndcraft.util.ItemUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class EasyMenuBuilder {
    private String menuname = "";
    private Icon[] menuIcons;

    public void setSize(Integer size){
        this.menuIcons = new Icon[size];
    }

    public void setMenuName(String text){
        this.menuname = text;
    }

    public void setIcon(Material itemtype, Integer slot, String name, String loretext, AtlasColor namecolor, AtlasColor lorecolor){
        var displayName = AtlasPaper.get().componentBuilder().append(name, namecolor).build();
        var lore        = AtlasPaper.get().componentBuilder().append(loretext, lorecolor).build();
        menuIcons[slot] = new SimpleButton(
                ItemUtil.make(itemtype, displayName, lore),
                (menuAction -> menuAction.getMenuAgent().close()));
    }

    public void setPad(Material itemtype, Integer slot, String name, String loretext, AtlasColor namecolor, AtlasColor lorecolor){
        var displayName  = AtlasPaper.get().componentBuilder().append(name, namecolor).build();
        var lore         = AtlasPaper.get().componentBuilder().append(loretext, lorecolor).build();
        var item          = ItemUtil.make(itemtype, displayName, lore);
        Pad sageExamplePad = new Pad(item);
        menuIcons[slot] = sageExamplePad;
    }

    public void openToPlayer(Player p){
        MenuBuilder menuBuilder = new MenuBuilder(this.menuname, this.menuIcons.length/9);
        for(int i = 0; i < menuIcons.length; i++) {
            try {
                if(menuIcons[i] != null) menuBuilder.icon(i, menuIcons[i]);
            }catch(Exception e) {
                e.printStackTrace();
                continue;
            }
        }
        menuBuilder.build().openSession(p);
    }
}
