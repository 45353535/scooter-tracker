package com.appodeal.ads.adapters.meta.mrec;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12483b;

    public a(b bVar, UnifiedMrecCallback unifiedMrecCallback) {
        this.f12483b = bVar;
        this.f12482a = unifiedMrecCallback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f12482a.onAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        this.f12482a.onAdLoaded(this.f12483b.f12484a);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        if (ad2 != null) {
            ad2.destroy();
        }
        if (adError != null) {
            this.f12482a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
        }
        this.f12482a.onAdLoadFailed(MetaNetwork.mapError(adError));
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }
}
