package xg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xg.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    static {
        d.a aVar = d.f108200a;
    }

    public static int a(d dVar, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    public static boolean b(d dVar) {
        return false;
    }

    public static /* synthetic */ Object c(d dVar, SerialDescriptor serialDescriptor, int i10, ug.c cVar, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i11 & 8) != 0) {
            obj = null;
        }
        return dVar.s(serialDescriptor, i10, cVar, obj);
    }
}
