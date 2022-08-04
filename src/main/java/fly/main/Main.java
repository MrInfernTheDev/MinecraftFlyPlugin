package fly.main;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new fly(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
