package net.pixlies.enigma;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private @Getter UtilLists utilLists;

    private static @Getter Main instance;

    @Override
    public void onEnable() {
        instance = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
