package ug;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public interface n {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj);
}
