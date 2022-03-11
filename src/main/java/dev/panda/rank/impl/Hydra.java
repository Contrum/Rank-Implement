package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import dev.panda.rank.RankObject;
import org.bukkit.entity.Player;
import rip.veax.hydra.HydraAPI;
import rip.veax.hydra.rank.data.Rank;

import java.util.UUID;

/**
 * Created by Risas
 * Project: PandaHub
 * Date: 10-03-2022
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public class Hydra implements IRank, RankObject<Rank> {

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

    @Override
    public Rank getRank(UUID uuid) {
        return HydraAPI.instance.getGrantHandler().findBestRank(uuid);
    }
}
