package dev.dammnranaah.ffa.api.events;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
public class PlayerWarpEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Player targetPlayer;
    private final Location destination;
    private final CommandSender sender;
    public PlayerWarpEvent(CommandSender sender, Player targetPlayer, Location destination) {
        this.sender = sender;
        this.targetPlayer = targetPlayer;
        this.destination = destination;
    }
    public CommandSender getSender() {
        return sender;
    }
    public Player getTargetPlayer() {
        return targetPlayer;
    }
    public Location getDestination() {
        return destination;
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



