package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
class C4307f3 extends P0 {
    C4307f3(N0 n02, @NotNull Db db2) {
        super(n02, db2);
    }

    private boolean n() {
        return b().b() > 0;
    }

    private boolean p() {
        return b().d() >= 0;
    }

    void l() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    void m() {
        if (o()) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    boolean o() {
        return b().a() == N0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    void q() {
        if (o() && d()) {
            IronLog.INTERNAL.verbose();
            a(b().c());
        }
    }

    void r() {
        if (!n()) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else if (o() && p()) {
            IronLog.INTERNAL.verbose();
            a(b().d());
        }
    }
}
