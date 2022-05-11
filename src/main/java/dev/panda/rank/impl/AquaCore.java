package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import me.activated.core.api.player.GlobalPlayer;
import me.activated.core.api.player.PlayerData;
import me.activated.core.api.rank.grant.Grant;
import me.activated.core.plugin.AquaCoreAPI;
import org.bukkit.entity.Player;

import java.util.UUID;

public class AquaCore implements IRank {

    @Override
    public String getRankSystem() {
        return "AquaCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        PlayerData data = AquaCoreAPI.INSTANCE.getPlayerData(uuid);
        return data == null ? "No Data" : data.getHighestRank().getName();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        PlayerData data = AquaCoreAPI.INSTANCE.getPlayerData(uuid);
        return data == null ? "No Data" : data.getHighestRank().getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        PlayerData data = AquaCoreAPI.INSTANCE.getPlayerData(uuid);
        return data == null ? "No Data" : data.getHighestRank().getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        PlayerData data = AquaCoreAPI.INSTANCE.getPlayerData(uuid);
        return data == null ? "No Data" : data.getHighestRank().getColor() + "";
    }

    @Override
    public int getRankWeight(UUID uuid) {
        GlobalPlayer data = AquaCoreAPI.INSTANCE.getGlobalPlayer(uuid);
        return data == null ? 0 : data.getRankWeight();
    }

    @Override
    public boolean hasRankTemporary(UUID uuid) {
        PlayerData data = AquaCoreAPI.INSTANCE.getPlayerData(uuid);

        if (data == null) return false;

        for (Grant grant : data.getActiveGrants()) {
            if (data.getHighestRank().equals(grant.getRank())) {
                return !grant.isPermanent();
            }
        }

        return false;
    }

    @Override
    public String getRealName(Player player) {
        return AquaCoreAPI.INSTANCE.getRealName(player);
    }
}
