package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        Intrinsics.checkNotNullParameter(header, "header");
    }
}
