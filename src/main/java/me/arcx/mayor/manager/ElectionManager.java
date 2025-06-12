
package me.arcx.mayor.manager;

import org.bukkit.Bukkit;
import me.arcx.mayor.data.ElectionData;
import me.arcx.mayor.MayorElection;
import java.util.*;

public class ElectionManager {
    private static List<String> candidates = new ArrayList<>();
    private static final Random random = new Random();

    public static void initialize() {
        candidates = Arrays.asList("Diana", "Marina", "Aatrox", "Scorpius", "Paul");
    }

    public static List<String> getCurrentCandidates() {
        return candidates;
    }

    public static void saveElectionData() {
        // File-based saving logic placeholder
        Bukkit.getLogger().info("Saving election data...");
    }
}
