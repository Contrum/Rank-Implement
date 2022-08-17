package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import dev.phoenix.phoenix.PhoenixAPI;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Phoenix implements IRank {

    @Override
    public String getRankSystem() {
        return "Phoenix";
    }

    @Override
    public String getRankName(UUID uuid) {
        return PhoenixAPI.INSTANCE.getPlayerRank(uuid).getName();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return PhoenixAPI.INSTANCE.getPlayerRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return PhoenixAPI.INSTANCE.getPlayerRank(uuid).getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        return PhoenixAPI.INSTANCE.getPlayerRank(uuid).getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return PhoenixAPI.INSTANCE.getPlayerRank(uuid).getPriority();
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        return false;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public String getTag(Player player) {
        return PhoenixAPI.INSTANCE.getTag(player.getUniqueId()).getFormat();
    }
}
