package com.appodeal.ads.adapters.meta.banner;

import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f12467b;

    public a(b bVar, UnifiedBannerCallback unifiedBannerCallback) {
        this.f12467b = bVar;
        this.f12466a = unifiedBannerCallback;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        this.f12466a.onAdClicked();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad2) {
        UnifiedBannerCallback unifiedBannerCallback = this.f12466a;
        b bVar = this.f12467b;
        unifiedBannerCallback.onAdLoaded(bVar.f12469b, bVar.f12468a.getHeight());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad2, AdError adError) {
        if (ad2 != null) {
            ad2.destroy();
        }
        if (adError != null) {
            this.f12466a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
        }
        this.f12466a.onAdLoadFailed(MetaNetwork.mapError(adError));
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad2) {
    }
}
