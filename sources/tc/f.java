package tc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import pd.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f105059a = new f();

    private f() {
    }

    public static final b a(id.a params, boolean z10) {
        Intrinsics.checkNotNullParameter(params, "params");
        return f105059a.c(new z("AdElementAnimator (" + params.j() + ')'), params.b(), new m(params, z10));
    }

    public static final b b(id.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return f105059a.c(new z("AdPhaseAnimator"), params.b(), new n(params));
    }

    private final b c(z zVar, Map map, h hVar) {
        return new b(zVar, new k(map), hVar);
    }
}
