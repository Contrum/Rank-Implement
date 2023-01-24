package dev.panda.rank.impl;

import cc.invictusgames.invictus.profile.Profile;
import dev.panda.rank.IRank;
import org.bukkit.entity.Player;

import java.util.UUID;
 
public class Invictus implements IRank {
 
    @Override
    public String getRankSystem() {
        return "Invictus";
    }
 
    @Override
    public String getRankName(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile == null ? "No Data" : profile.getCurrentGrant().getRank().getName();
    }
 
    @Override
    public String getRankPrefix(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile == null ? "No Data" : profile.getCurrentGrant().getRank().getPrefix();
    }
 
    @Override
    public String getRankSuffix(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile == null ? "No Data" : profile.getCurrentGrant().getRank().getSuffix();
    }
 
    @Override
    public String getRankColor(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile == null ? "No Data" : profile.getCurrentGrant().getRank().getColor() + "";
    }
 
    @Override
    public int getRankWeight(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile == null ? 0 : profile.getCurrentGrant().getRank().getWeight();
    }
 
    @Override
    public boolean hasRankTemporary(UUID uuid) {
        Profile profile = cc.invictusgames.invictus.Invictus.getInstance().getProfileService().getProfile(uuid);
        return profile != null && profile.getCurrentGrant().getEnd() != -1L;
    }
 
    @Override
    public String getRealName(Player player) {
        return player.getName();
    }
}
 