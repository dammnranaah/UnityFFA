package dev.dammnranaah.ffa.api;
import dev.dammnranaah.ffa.kits.KitManager;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.List;
public class IKits {
    public static void sendInvalidCommandMessage(CommandSender sender) {
        KitManager.sendInvalidCommandMessage(sender);
    }
    public static void saveKit(CommandSender sender, String kitName) {
        KitManager.saveKit(sender, kitName);
    }
    public static void deleteKit(String kitName) {
        KitManager.deleteKit(kitName);
    }
    public static void listKits(CommandSender sender) {
        KitManager.listKits(sender);
    }
    public static void giveKit(Player player, String kitName) {
        KitManager.giveKit(player, kitName);
    }
    public static List<String> getKitNames() {
        return KitManager.getKitNames();
    }
    public static boolean isKitExists(String kitName) {
        return KitManager.isKitExisting(kitName);
    }
}



