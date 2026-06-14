package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
final class zzb extends AdListener implements AppEventListener, com.google.android.gms.ads.internal.client.zza {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AbstractAdViewAdapter f24099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final MediationBannerListener f24100e;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f24099d = abstractAdViewAdapter;
        this.f24100e = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f24100e.onAdClicked(this.f24099d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f24100e.onAdClosed(this.f24099d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24100e.onAdFailedToLoad(this.f24099d, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f24100e.onAdLoaded(this.f24099d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f24100e.onAdOpened(this.f24099d);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f24100e.zza(this.f24099d, str, str2);
    }
}
