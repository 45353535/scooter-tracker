package df;

import kotlin.jvm.internal.Intrinsics;
import yh.d;
import yh.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final d a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        d dVarK = f.k(name);
        Intrinsics.checkNotNullExpressionValue(dVarK, "getLogger(...)");
        return dVarK;
    }
}
