package dev.panda.rank.impl;

import dev.panda.rank.IRank;
import dev.panda.rank.RankObject;
import me.abhi.core.CorePlugin;
import me.abhi.core.profile.CoreProfile;
import me.abhi.core.rank.Rank;
import org.bukkit.entity.Player;

import java.util.UUID;

public class mCore implements IRank, RankObject<Rank> {

    @Override
    public String getRankSystem() {
        return "mCore";
    }

    @Override
    public String getRankName(UUID uuid) {
        return this.getRank(uuid) == null ? "None" : this.getRank(uuid).getName();
    }

    @Override
    public String getRankPrefix(UUID uuid) {
        return this.getRank(uuid) == null ? "None" : this.getRank(uuid).getPrefix();
    }

    @Override
    public String getRankSuffix(UUID uuid) {
        return this.getRank(uuid) == null ? "None" : this.getRank(uuid).getSuffix();
    }

    @Override
    public String getRankColor(UUID uuid) {
        return this.getRank(uuid) == null ? "None" : "";
    }

    @Override
    public int getRankWeight(UUID uuid) {
        return this.getRank(uuid) == null ? 0 : this.getRank(uuid).getWeight();
    }

    @Override
    public String getRealName(Player player) {
        return null;
    }

    @Override
    public Rank getRank(UUID uuid) {
        CoreProfile coreProfile = CorePlugin.getInstance().getProfileHandler().getCoreProfile(uuid);
        try {
            return coreProfile.getRank();
        }
        catch (Exception ex) {
            return null;
        }
    }
}
