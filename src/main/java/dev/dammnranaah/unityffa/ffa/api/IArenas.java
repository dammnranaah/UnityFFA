package dev.dammnranaah.ffa.api;
import dev.dammnranaah.ffa.arenas.ArenaManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.List;
public class IArenas {
    public static void sendInvalidCommandMessage(CommandSender sender) {
        ArenaManager.sendInvalidCommandMessage(sender);
    }
    public static void createArena(CommandSender sender, Player player, String arenaName) {
        ArenaManager.createArena(sender, player, arenaName);
    }
    public static void deleteArena(CommandSender sender, String arenaName) {
        ArenaManager.deleteArena(sender, arenaName);
    }
    public static List<String> listArenas() {
        return ArenaManager.listArenas();
    }
    public static void arenasList(CommandSender sender) {
        ArenaManager.arenasList(sender);
    }
    public static void warp(CommandSender sender, Player player, String arenaName) {
        ArenaManager.warp(sender, player, arenaName);
    }
}



