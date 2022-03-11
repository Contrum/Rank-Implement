package dev.panda.rank;

import dev.panda.rank.impl.Default;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public class RankManager {

    @Getter private IRank rank;

    public RankManager(JavaPlugin plugin) {
        Collection<Class<?>> classes = ClassUtil.getClassesInPackage(plugin, "dev.panda.rank.impl");

        boolean foundRank = false;

        for (Class<?> clazz : classes) {
            String className = clazz.getSimpleName();

            if (Bukkit.getPluginManager().getPlugin(className) != null) {
                try {
                    this.rank = (IRank) clazz.newInstance();
                    foundRank = true;
                    break;
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        if (!foundRank) this.rank = new Default();
    }
}


