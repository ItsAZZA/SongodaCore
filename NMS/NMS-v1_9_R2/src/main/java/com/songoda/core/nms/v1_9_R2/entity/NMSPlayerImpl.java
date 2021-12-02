package com.songoda.core.nms.v1_9_R2.entity;

import com.songoda.core.nms.entity.NMSPlayer;
import net.minecraft.server.v1_9_R2.Packet;
import org.bukkit.craftbukkit.v1_9_R2.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class NMSPlayerImpl implements NMSPlayer {
    @Override
    public void sendPacket(Player p, Object packet) {
        ((CraftPlayer) p).getHandle().playerConnection.sendPacket((Packet<?>) packet);
    }
}
