package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
