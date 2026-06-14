package com.appodeal.ads.adapters.admobnative.banner;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UnifiedBannerCallback f11937d;

    public a(UnifiedBannerCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f11937d = callback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11937d.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11937d.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11937d.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        this.f11937d.onAdClicked();
    }
}
