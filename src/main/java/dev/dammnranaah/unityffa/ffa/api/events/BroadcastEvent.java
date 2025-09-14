package dev.dammnranaah.ffa.api.events;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
public class BroadcastEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private CommandSender sender;
    private String message;
    private boolean cancelled = false;
    public BroadcastEvent(CommandSender sender, String message) {
        this.sender = sender;
        this.message = message;
    }
    public CommandSender getSender() {
        return sender;
    }
    public String getMessage() {
        return message;
    }
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
    @Override
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



