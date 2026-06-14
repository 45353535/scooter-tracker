package xg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import ug.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {
    public static f a(Encoder encoder, SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return encoder.b(descriptor);
    }

    public static void c(Encoder encoder, n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().b()) {
            encoder.j(serializer, obj);
        } else if (obj == null) {
            encoder.B();
        } else {
            encoder.E();
            encoder.j(serializer, obj);
        }
    }

    public static void d(Encoder encoder, n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(encoder, obj);
    }

    public static void b(Encoder encoder) {
    }
}
