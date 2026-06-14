package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdjy;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbl implements zzdjy {
    private final zzb zza;
    private final int zzb;

    @Nullable
    private final String zzc;

    @VisibleForTesting
    public zzbl(zzb zzbVar, int i10, @Nullable String str) {
        this.zza = zzbVar;
        this.zzb = i10;
        this.zzc = str;
    }

    final /* synthetic */ void zza(zzbj zzbjVar) {
        this.zza.zza(this.zzc, zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(@Nullable final zzbj zzbjVar) {
        if (zzbjVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza(zzbjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(@Nullable String str) {
    }
}
