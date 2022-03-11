package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Default implements IRank {

    @Override
    public String getRankSystem() {
        return "Default";
    }

    @Override
    public String getRankName(UUID uuid) {
        return "";
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return "";
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return "";
    }

    @Override
    public String getRankColor(UUID uuid) {
        return "";
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return 0;
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }
}
