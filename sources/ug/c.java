package ug;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    Object deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
