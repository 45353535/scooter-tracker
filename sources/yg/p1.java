package yg;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 extends b3 {
    protected abstract String e0(String str, String str2);

    protected String f0(SerialDescriptor descriptor, int i10) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.f(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.b3
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final String Z(SerialDescriptor serialDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return h0(f0(serialDescriptor, i10));
    }

    protected final String h0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) Y();
        if (str == null) {
            str = "";
        }
        return e0(str, nestedName);
    }

    protected final String i0() {
        return a0().isEmpty() ? "$" : CollectionsKt.joinToString$default(a0(), ".", "$.", null, 0, null, null, 60, null);
    }
}
