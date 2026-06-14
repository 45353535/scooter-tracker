package wg;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import yg.s2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final KClass a(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof c) {
            return ((c) serialDescriptor).f107974b;
        }
        if (serialDescriptor instanceof s2) {
            return a(((s2) serialDescriptor).j());
        }
        return null;
    }

    public static final SerialDescriptor b(ah.b bVar, SerialDescriptor descriptor) {
        KSerializer kSerializerC;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass kClassA = a(descriptor);
        if (kClassA == null || (kSerializerC = ah.b.c(bVar, kClassA, null, 2, null)) == null) {
            return null;
        }
        return kSerializerC.getDescriptor();
    }

    public static final SerialDescriptor c(SerialDescriptor serialDescriptor, KClass context) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new c(serialDescriptor, context);
    }
}
