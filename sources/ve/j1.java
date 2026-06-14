package ve;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 {
    public static final String a(f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        return b(f1Var) + w0.i(f1Var);
    }

    public static final String b(f1 f1Var) {
        Intrinsics.checkNotNullParameter(f1Var, "<this>");
        StringBuilder sb2 = new StringBuilder();
        w0.g(sb2, f1Var.u(), f1Var.r());
        return sb2.toString();
    }
}
