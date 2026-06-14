package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;

/* JADX INFO: loaded from: classes6.dex */
public final class be extends ad {
    public be(fe feVar) {
        super(AdType.Mrec, feVar);
    }

    @Override // com.appodeal.ads.l0
    public final String D() {
        return "mrec_disabled";
    }

    @Override // com.appodeal.ads.ad
    public final xe O() {
        return new re();
    }

    @Override // com.appodeal.ads.ad
    public final ac P() {
        return ve.c();
    }

    @Override // com.appodeal.ads.l0
    public final uc a(te teVar, AdNetwork adNetwork, x2 x2Var) {
        return new b((i) teVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.l0
    public final te b(xe xeVar) {
        return new i((re) xeVar);
    }
}
