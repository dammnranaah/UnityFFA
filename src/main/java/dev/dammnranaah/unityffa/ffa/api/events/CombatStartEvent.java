package dev.dammnranaah.ffa.api.events;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
public class CombatStartEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Player attacker;
    private final Player victim;
    private boolean cancelled;
    public CombatStartEvent(Player attacker, Player victim) {
        this.attacker = attacker;
        this.victim = victim;
    }
    public Player getAttacker() {
        return attacker;
    }
    public Player getVictim() {
        return victim;
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



