package xyz.raitaki.DnDCraftLastTest;

import com.dndcraft.command.Commands;
import com.dndcraft.command.exception.InvalidPluginCommandException;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.raitaki.DnDCraftLastTest.Commands.CheckTagCommand;
import xyz.raitaki.DnDCraftLastTest.Commands.CreateItemCommand;
import xyz.raitaki.DnDCraftLastTest.Commands.HelloCommand;
import xyz.raitaki.DnDCraftLastTest.Commands.MenuCommand;

public final class Main extends JavaPlugin {

    @Getter private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    public void registerCommands(){
        try {

            Commands.build(getCommand("checktestitemmeta"), () -> new CheckTagCommand());
            Commands.build(getCommand("createtestitem"), () -> new CreateItemCommand());
            Commands.build(getCommand("menutest"), () -> new MenuCommand());
            Commands.build(getCommand("hi"), () -> new HelloCommand());
        } catch (InvalidPluginCommandException invalidPluginCommand) {
            invalidPluginCommand.printStackTrace();
        }
    }
}
