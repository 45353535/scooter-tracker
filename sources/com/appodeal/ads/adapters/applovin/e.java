package com.appodeal.ads.adapters.applovin;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e implements AppLovinAdClickListener, AppLovinAdLoadListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedAdCallback f11967b;

    public e(UnifiedAdCallback unifiedAdCallback) {
        this.f11967b = unifiedAdCallback;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public final void adClicked(AppLovinAd appLovinAd) {
        this.f11967b.onAdClicked();
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public final void failedToReceiveAd(int i10) {
        String str;
        LoadingError loadingError = LoadingError.NoFill;
        if (i10 == 204) {
            str = "no ad is available";
        } else if (i10 >= 500) {
            str = "internal server error";
        } else {
            loadingError = LoadingError.InternalError;
            str = "internal errors";
        }
        this.f11967b.printError(str, Integer.valueOf(i10));
        this.f11967b.onAdLoadFailed(loadingError);
    }
}
