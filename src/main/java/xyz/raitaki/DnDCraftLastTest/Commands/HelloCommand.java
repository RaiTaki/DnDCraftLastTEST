package xyz.raitaki.DnDCraftLastTest.Commands;

import com.dndcraft.AtlasPaper;
import com.dndcraft.command.annotations.Cmd;
import com.dndcraft.util.AtlasColor;


public class HelloCommand extends ComTemplate {

    @Cmd(value = "hello")
    public void hello(){
        getSender().sendMessage(AtlasPaper.get().componentBuilder().append("Hello!").color(AtlasColor.AQUA).build());
    }

    @Cmd(value = "world")
    public void world(){
        getSender().sendMessage(AtlasPaper.get().componentBuilder().append("World!").color(AtlasColor.AQUA).build());
    }

    public void invoke(){
        getSender().sendMessage(AtlasPaper.get().componentBuilder().append("Hello world!").color(AtlasColor.AQUA).build());
    }

}
