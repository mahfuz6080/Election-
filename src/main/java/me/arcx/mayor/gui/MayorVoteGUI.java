
package me.arcx.mayor.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Arrays;

public class MayorVoteGUI {
    public static Inventory getGUI(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "§6§lMayor Election");
        List<String> candidates = Arrays.asList("Diana", "Marina", "Aatrox", "Scorpius", "Paul");

        int slot = 11;
        for (String candidate : candidates) {
            ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
            ItemMeta meta = skull.getItemMeta();
            meta.setDisplayName("§b" + candidate);
            meta.setLore(Arrays.asList("§7Unique perks", "§7Vote for " + candidate));
            skull.setItemMeta(meta);
            inv.setItem(slot, skull);
            slot += 2;
        }
        return inv;
    }
}
