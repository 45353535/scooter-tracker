package ze;

import kotlin.jvm.internal.Intrinsics;
import ze.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {
    public static final t a(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return t.a.f119364a;
    }

    public static final boolean b(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}
