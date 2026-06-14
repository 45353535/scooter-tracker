package com.appodeal.ads;

import android.content.res.Configuration;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.unified.UnifiedBanner;

/* JADX INFO: loaded from: classes6.dex */
public final class id extends ad {
    public id(td tdVar) {
        super(AdType.Banner, tdVar);
    }

    @Override // com.appodeal.ads.l0
    public final String D() {
        return "banners_disabled";
    }

    @Override // com.appodeal.ads.ad
    public final xe O() {
        return new ae();
    }

    @Override // com.appodeal.ads.ad
    public final ac P() {
        return ee.d();
    }

    @Override // com.appodeal.ads.l0
    public final uc a(te teVar, AdNetwork adNetwork, x2 x2Var) {
        return new cf((gf) teVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.l0
    public final te b(xe xeVar) {
        return new gf((ae) xeVar);
    }

    @Override // com.appodeal.ads.l0
    public final void h(Configuration configuration) {
        UnifiedBanner unifiedBanner;
        int i10;
        gf gfVar = (gf) A();
        if (gfVar != null) {
            cf cfVar = (cf) gfVar.f14906r;
            if (cfVar == null || !((unifiedBanner = (UnifiedBanner) cfVar.f14940f) == null || !unifiedBanner.isRefreshOnRotate() || (i10 = cfVar.f13184t) == -1 || i10 == configuration.orientation)) {
                t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
        }
    }
}
