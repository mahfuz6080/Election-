
package me.arcx.mayor.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.arcx.mayor.gui.MayorVoteGUI;

public class MayorCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        player.openInventory(MayorVoteGUI.getGUI(player));
        return true;
    }
}
