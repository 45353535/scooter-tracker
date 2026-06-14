package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbln;

/* JADX INFO: loaded from: classes7.dex */
@VisibleForTesting
final class zze extends AdListener implements zzg, com.google.android.gms.ads.formats.zze, com.google.android.gms.ads.formats.zzd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AbstractAdViewAdapter f24105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final MediationNativeListener f24106e;

    public zze(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f24105d = abstractAdViewAdapter;
        this.f24106e = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f24106e.onAdClicked(this.f24105d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f24106e.onAdClosed(this.f24105d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f24106e.onAdFailedToLoad(this.f24105d, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f24106e.onAdImpression(this.f24105d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f24106e.onAdOpened(this.f24105d);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        this.f24106e.onAdLoaded(this.f24105d, new zza(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zze
    public final void zzb(zzbln zzblnVar) {
        this.f24106e.zzc(this.f24105d, zzblnVar);
    }

    @Override // com.google.android.gms.ads.formats.zzd
    public final void zzc(zzbln zzblnVar, String str) {
        this.f24106e.zzd(this.f24105d, zzblnVar, str);
    }
}
