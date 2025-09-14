package dev.dammnranaah.ffa.api.events;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
public class QuickRespawnEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final ItemStack item;
    private String lastArena;
    private String lastKit;
    private boolean cancelled;
    public QuickRespawnEvent(@NotNull Player player, @NotNull ItemStack item, String lastArena, String lastKit) {
        this.player = player;
        this.item = item;
        this.lastArena = lastArena;
        this.lastKit = lastKit;
        this.cancelled = false;
    }
    public Player getPlayer() {
        return player;
    }
    public ItemStack getItem() {
        return item;
}
    public String getLastArena() {
        return lastArena;
    }
    public String getLastKit() {
        return lastKit;
    }
    public boolean isCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}



