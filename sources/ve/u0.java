package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {
    public static final boolean a(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return Intrinsics.areEqual(t0Var.i(), "https") || Intrinsics.areEqual(t0Var.i(), "wss");
    }

    public static final boolean b(t0 t0Var) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        return Intrinsics.areEqual(t0Var.i(), "ws") || Intrinsics.areEqual(t0Var.i(), "wss");
    }
}
