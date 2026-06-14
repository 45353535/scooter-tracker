package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbes extends zzbez {

    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbes(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(zzbex zzbexVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbet(zzbexVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
