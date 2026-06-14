package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
final class zzd extends FullScreenContentCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AbstractAdViewAdapter f24103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final MediationInterstitialListener f24104c;

    public zzd(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f24103b = abstractAdViewAdapter;
        this.f24104c = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f24104c.onAdClosed(this.f24103b);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f24104c.onAdOpened(this.f24103b);
    }
}
