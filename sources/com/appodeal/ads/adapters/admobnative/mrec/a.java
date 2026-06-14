package com.appodeal.ads.adapters.admobnative.mrec;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UnifiedMrecCallback f11944d;

    public a(UnifiedMrecCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f11944d = callback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11944d.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.onAdFailedToLoad(error);
        this.f11944d.printError(error.getMessage(), Integer.valueOf(error.getCode()));
        this.f11944d.onAdLoadFailed(UnifiedAdmobNetwork.mapError(error));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        super.onAdOpened();
        this.f11944d.onAdClicked();
    }
}
