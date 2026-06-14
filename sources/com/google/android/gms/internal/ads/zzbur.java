package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbur implements MediationAdLoadCallback {
    final /* synthetic */ zzbtz zza;
    final /* synthetic */ zzbuu zzb;

    zzbur(zzbuu zzbuuVar, zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
        Objects.requireNonNull(zzbuuVar);
        this.zzb = zzbuuVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            String canonicalName = this.zzb.zzb().getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(code).length() + 17 + String.valueOf(message).length() + 16 + String.valueOf(domain).length());
            sb2.append(canonicalName);
            sb2.append("failed to load mediation ad: ErrorCode = ");
            sb2.append(code);
            sb2.append(". ErrorMessage = ");
            sb2.append(message);
            sb2.append(". ErrorDomain = ");
            sb2.append(domain);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2.toString());
            zzbtz zzbtzVar = this.zza;
            zzbtzVar.zzx(adError.zza());
            zzbtzVar.zzw(adError.getCode(), adError.getMessage());
            zzbtzVar.zzg(adError.getCode());
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzR((NativeAdMapper) obj);
            this.zza.zzj();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        return new zzbuk(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, "undefined"));
    }
}
