package dev.dammnranaah.ffa.utils;
import com.sk89q.worldedit.bukkit.BukkitAdapter;
import com.sk89q.worldguard.WorldGuard;
import com.sk89q.worldguard.protection.regions.ProtectedRegion;
import com.sk89q.worldguard.protection.regions.RegionContainer;
import com.sk89q.worldguard.protection.regions.RegionQuery;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
public class WorldGuardUtils {
    public static int getPlayerCountInRegion(String regionName) {
        RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
        RegionQuery query = regionContainer.createQuery();
        int playerCount = 0;
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (isInRegion(player, regionName, query)) {
                playerCount++;
            }
        }
        return playerCount;
    }
    private static boolean isInRegion(Player player, String regionName, RegionQuery query) {
        com.sk89q.worldedit.util.Location playerLocation = BukkitAdapter.adapt(player.getLocation());
        for (ProtectedRegion region : query.getApplicableRegions(playerLocation).getRegions()) {
            if (region.getId().equalsIgnoreCase(regionName)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isinRegion(Player player, String regionName) {
        RegionContainer regionContainer = WorldGuard.getInstance().getPlatform().getRegionContainer();
        RegionQuery query = regionContainer.createQuery();
        com.sk89q.worldedit.util.Location playerLocation = BukkitAdapter.adapt(player.getLocation());
        for (ProtectedRegion region : query.getApplicableRegions(playerLocation).getRegions()) {
            if (region.getId().equalsIgnoreCase(regionName)) {
                return true;
            }
        }
        return false;
    }
    public static String checkArenaStatus(String regionName) {
        int playerCount = getPlayerCountInRegion(regionName);
        if (playerCount >= 8) {
            return " &7(Busy)";
        } else {
            return "";
        }
    }
}



