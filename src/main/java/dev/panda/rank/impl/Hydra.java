package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import org.bukkit.entity.Player;
import rip.veax.hydra.HydraAPI;
import rip.veax.hydra.rank.data.Rank;

import java.util.UUID;

public class Hydra implements IRank {

    @Override
    public String getRankSystem() {
        return "Hydra";
    }

    @Override
    public String getRankName(UUID uuid) {
        return this.getRank(uuid).getId();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return this.getRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return "";
    }

    @Override
    public String getRankColor(UUID uuid) {
        return this.getRank(uuid).getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return this.getRank(uuid).getPriority();
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    public Rank getRank(UUID uuid) {
        return HydraAPI.instance.getGrantHandler().findBestRank(uuid);
    }
}
