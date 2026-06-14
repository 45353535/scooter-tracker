package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5208k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77582a = new HashMap();

    public final synchronized C5182j0 a(X4 x42, PublicLogger publicLogger, C4991bf c4991bf) {
        C5182j0 c5182j0;
        c5182j0 = (C5182j0) this.f77582a.get(x42.toString());
        if (c5182j0 == null) {
            C5157i0 c5157i0D = c4991bf.d();
            c5182j0 = new C5182j0(c5157i0D.f77362a, c5157i0D.f77363b, new C5504vl(publicLogger, "[App Environment]"));
            this.f77582a.put(x42.toString(), c5182j0);
        }
        return c5182j0;
    }

    public final synchronized void a(C5157i0 c5157i0, C4991bf c4991bf) {
        c4991bf.a(c5157i0).b();
    }
}
