package yg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f119038a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f119038a = z10;
    }

    public static final u2 a(Function1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f119038a ? new t(factory) : new y(factory);
    }

    public static final b2 b(Function2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return f119038a ? new u(factory) : new z(factory);
    }
}
