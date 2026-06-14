package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;

/* JADX INFO: loaded from: classes6.dex */
public final class l7 extends c3 {
    public l7(q7 q7Var, AdNetwork adNetwork, x2 x2Var) {
        super(q7Var, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createInterstitial();
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdCallback b() {
        return new q6(this);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdParams i() {
        return new x6();
    }
}
