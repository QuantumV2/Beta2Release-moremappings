package com.github.dirtpowered.betatorelease.proxy.translator.serverbound.b18;

import com.github.dirtpowered.betaprotocollib.packet.Version_B1_8.data.RespawnPacketData;
import com.github.dirtpowered.betatorelease.network.session.Session;
import com.github.dirtpowered.betatorelease.proxy.translator.BetaToModernHandler;
import com.github.steveice10.mc.protocol.data.game.ClientRequest;
import com.github.steveice10.mc.protocol.packet.ingame.client.ClientRequestPacket;

public class RespawnPacketHandler implements BetaToModernHandler<RespawnPacketData> {

    @Override
    public void handlePacket(Session session, RespawnPacketData packetClass) {
        session.getModernClient().sendModernPacket(new ClientRequestPacket(ClientRequest.RESPAWN));
    }
}