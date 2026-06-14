package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.model.AdPreferences;

/* JADX INFO: loaded from: classes11.dex */
public final class r2 extends q2 {
    public r2(x2 x2Var) {
        super(x2Var);
    }

    @Override // com.startapp.sdk.internal.q2
    public final boolean a() {
        jh jhVar = ih.f64695a;
        AdPreferences.Placement placement = this.f65130a.f65511l;
        return (jhVar.f64777e || jhVar.f64775c) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // com.startapp.sdk.internal.q2
    public final long b() {
        ?? r02 = this.f65130a.f65514o;
        if (r02 == 0) {
            return -1L;
        }
        Long adCacheTtl = r02.getAdCacheTtl();
        Long lastLoadTime = r02.getLastLoadTime();
        if (adCacheTtl == null || lastLoadTime == null) {
            return -1L;
        }
        long jLongValue = adCacheTtl.longValue() - (System.currentTimeMillis() - lastLoadTime.longValue());
        if (jLongValue >= 0) {
            return jLongValue;
        }
        return 0L;
    }
}
