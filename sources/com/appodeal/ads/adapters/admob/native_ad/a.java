package com.appodeal.ads.adapters.admob.native_ad;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f11913a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f11913a = callback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11913a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11913a.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11913a.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        this.f11913a.onAdClicked();
    }
}
