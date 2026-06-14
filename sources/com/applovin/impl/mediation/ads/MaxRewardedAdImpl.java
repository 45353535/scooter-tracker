package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: loaded from: classes6.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    private class b extends MaxFullscreenAdImpl.b implements MaxRewardedAdListener {
        private b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.a((c3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.a((c3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            com.applovin.impl.sdk.o oVar = MaxRewardedAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                maxRewardedAdImpl.logger.a(maxRewardedAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            t2.a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.a aVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, aVar, str2, kVar, context);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    protected MaxFullscreenAdImpl.b createAdListenerWrapper() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var, MaxError maxError) {
        if (c3Var.t0().get() || !c3Var.v0().compareAndSet(false, true)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "User not rewarded for ad: " + c3Var + " with error: " + maxError);
        }
        this.sdk.P().a(d2.f8604w0, c3Var, maxError);
    }
}
