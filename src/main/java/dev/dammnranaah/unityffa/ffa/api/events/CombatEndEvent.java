package dev.dammnranaah.ffa.api.events;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
public class CombatEndEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Set<Player> players;
    private boolean cancelled;
    public CombatEndEvent(Set<Player> players) {
        this.players = players;
    }
    public Set<Player> getPlayers() {
        return players;
    }
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}



