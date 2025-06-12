
package me.arcx.mayor;

import org.bukkit.plugin.java.JavaPlugin;
import me.arcx.mayor.manager.ElectionManager;
import me.arcx.mayor.listener.GUIListener;

public class MayorElection extends JavaPlugin {
    private static MayorElection instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        ElectionManager.initialize();
        getServer().getPluginManager().registerEvents(new GUIListener(), this);
        getCommand("mayorelection").setExecutor(new me.arcx.mayor.command.MayorCommand());
        getLogger().info("MayorElection plugin enabled.");
    }

    @Override
    public void onDisable() {
        ElectionManager.saveElectionData();
    }

    public static MayorElection getInstance() {
        return instance;
    }
}
