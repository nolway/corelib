package de.maxhenkel.corelib.net;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.network.NetworkEvent;

public interface Message<T extends Message> {

    Dist getExecutingSide();

    default void executeServerSide(NetworkEvent.Context context){

    }

    default void executeClientSide(NetworkEvent.Context context){

    }

    T fromBytes(PacketBuffer buf);

    void toBytes(PacketBuffer buf);


}
