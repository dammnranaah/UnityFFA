package dev.dammnranaah.ffa.api.events;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;
public class TeleportToSpawnEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Location tspawnLocation;
    public TeleportToSpawnEvent(Player player, Location tspawnLocation) {
        super(player);
        this.tspawnLocation = tspawnLocation;
    }
    public Player getTeleportedPlayer() {
        return getPlayer();
    }
    public Location getSpawnLocation() {
        return tspawnLocation;
    }
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}



