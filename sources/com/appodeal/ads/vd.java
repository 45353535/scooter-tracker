package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;

/* JADX INFO: loaded from: classes6.dex */
public final class vd extends c3 {
    public vd(ce ceVar, AdNetwork adNetwork, x2 x2Var) {
        super(ceVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createRewarded();
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdCallback b() {
        return new fd(this);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdParams i() {
        return new kd();
    }
}
