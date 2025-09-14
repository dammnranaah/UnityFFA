package dev.dammnranaah.ffa.utils;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Bat;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
public class SitUtil {
    private static final Map<UUID, LivingEntity> chair = new HashMap<>();
    public static boolean isSitting(Player player) {
        return chair.containsKey(player.getUniqueId());
    }
    public static LivingEntity getChair(Player player) {
        return chair.get(player.getUniqueId());
    }
    public static void sit(Player player, Location pos) {
        standup(player);
        World world = player.getWorld();
        Bat entity = (Bat) world.spawnEntity(pos, EntityType.BAT);
        entity.setAwake(true);
        entity.setAI(false);
        entity.setInvulnerable(true);
        entity.setCollidable(false);
        entity.setSilent(true);
        entity.setGravity(false);
        entity.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY,
                9999999, 1, false, false, false));
        entity.addPassenger(player);
        entity.setRotation(player.getLocation().getYaw(), player.getLocation().getPitch());
        chair.put(player.getUniqueId(), entity);
    }
    public static void standup(Player player) {
        if (!isSitting(player)) {
            return;
        }
        LivingEntity chairEntity = getChair(player);
        chair.remove(player.getUniqueId());
        chairEntity.setInvulnerable(false);
        chairEntity.setHealth(0);
    }
}


