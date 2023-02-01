package dev.panda.rank;

import org.bukkit.entity.Player;

import java.util.UUID;

public interface IRank {

    String getRankSystem();
    String getRankName(UUID uuid);
    String getRankPrefix(UUID uuid);
    String getRankSuffix(UUID uuid);
    String getRankColor(UUID uuid);
    int getRankWeight(UUID uuid);
    boolean hasRankTemporary(UUID uuid);
    String getRealName(Player player);

    String getTag(Player player);
}
