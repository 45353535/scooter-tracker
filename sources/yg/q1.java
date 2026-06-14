package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q1 extends c3 {
    protected abstract String a0(String str, String str2);

    protected abstract String b0(SerialDescriptor serialDescriptor, int i10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.c3
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final String X(SerialDescriptor serialDescriptor, int i10) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return d0(b0(serialDescriptor, i10));
    }

    protected final String d0(String nestedName) {
        Intrinsics.checkNotNullParameter(nestedName, "nestedName");
        String str = (String) W();
        if (str == null) {
            str = "";
        }
        return a0(str, nestedName);
    }
}
