package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends i2 {
    public u() {
        super(t1.f14851a);
    }

    @Override // com.appodeal.ads.i2
    public final com.appodeal.ads.segments.o U(te teVar, uc ucVar, Object obj) {
        com.appodeal.ads.nativead.e eVar = (com.appodeal.ads.nativead.e) obj;
        return eVar != null ? eVar.c() : super.U((r3) teVar, (d3) ucVar, null);
    }

    @Override // com.appodeal.ads.i2
    public final void V(te teVar, uc ucVar) {
        d3 d3Var = (d3) ucVar;
        if (d3Var != null) {
            TreeSet treeSet = t1.f14853c;
            synchronized (treeSet) {
                try {
                    com.appodeal.ads.nativead.e eVar = d3Var.f13225r;
                    if (eVar != null && treeSet.remove(eVar)) {
                        eVar.destroy();
                        d3Var.f13225r = null;
                    }
                } finally {
                }
            }
        }
        t1.c(com.appodeal.ads.context.o.f13205b.f13206a.f13214b, t1.a().f13572l);
    }

    @Override // com.appodeal.ads.i2
    public final void X(te teVar, uc ucVar) {
        te teVar2 = (r3) teVar;
        d3 d3Var = (d3) ucVar;
        TreeSet treeSet = t1.f14853c;
        synchronized (treeSet) {
            try {
                com.appodeal.ads.nativead.e eVar = d3Var.f13225r;
                if (eVar != null) {
                    treeSet.add(eVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str = LogConstants.EVENT_NOTIFY_LOADED;
        Locale locale = Locale.ENGLISH;
        Log.log(LogConstants.KEY_NATIVE, str, "available count of Native Ads: " + t1.e());
        if (!t1.f14855e) {
            t1.f14855e = true;
            super.X(teVar2, d3Var);
        }
        if (teVar2.f14895g) {
            return;
        }
        t1.c(com.appodeal.ads.context.o.f13205b.f13206a.f13214b, true);
    }

    @Override // com.appodeal.ads.i2
    public final void z(te teVar, uc ucVar, LoadingError error) {
        r3 r3Var = (r3) teVar;
        d3 d3Var = (d3) ucVar;
        if (t1.e() > 0) {
            if (t1.f14855e) {
                return;
            }
            t1.f14855e = true;
            t1.f14851a.j();
            return;
        }
        if (t1.f14856f) {
            return;
        }
        t1.f14856f = true;
        Intrinsics.checkNotNullParameter(error, "error");
        o(r3Var, d3Var, error);
    }
}
