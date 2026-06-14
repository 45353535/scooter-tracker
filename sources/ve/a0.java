package ve;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import ve.z;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f106541a;

    static {
        z.a aVar = z.f106771b;
        f106541a = SetsKt.setOf((Object[]) new z[]{aVar.b(), aVar.c(), aVar.d(), new z("TRACE")});
    }

    public static final boolean a(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return !f106541a.contains(zVar);
    }
}
