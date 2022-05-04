package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import dev.phoenix.phoenix.PhoenixAPI;
import dev.phoenix.phoenix.profile.Profile;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Phoenix implements IRank {

    @Override
    public String getRankSystem() {
        return "Phoenix";
    }

    @Override
    public String getRankName(UUID uuid) {
        Profile profile = PhoenixAPI.INSTANCE.getProfile(uuid);
        return profile.getBestRank().getDisplayName(profile);
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        Profile profile = PhoenixAPI.INSTANCE.getProfile(uuid);
        return profile.getBestRank().getPrefix(profile);
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        Profile profile = PhoenixAPI.INSTANCE.getProfile(uuid);
        return profile.getBestRank().getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        Profile profile = PhoenixAPI.INSTANCE.getProfile(uuid);
        return profile.getBestRank().getColor();
    }

    @Override
    public int getRankWeight(UUID uuid) {
        Profile profile = PhoenixAPI.INSTANCE.getProfile(uuid);
        return profile.getPriority();
    }

    @Override
    public String getRealName(Player player) {
        return PhoenixAPI.INSTANCE.getProfile(player.getUniqueId()).getPlayerNameWithoutDisguise();
    }
}
