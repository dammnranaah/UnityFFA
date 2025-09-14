package dev.dammnranaah.ffa.utils;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import static dev.dammnranaah.ffa.Main.formatColors;
public class ActionBarUtil {
    public static void sendActionBar(Player player, String message) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(formatColors(message)));
    }
}



