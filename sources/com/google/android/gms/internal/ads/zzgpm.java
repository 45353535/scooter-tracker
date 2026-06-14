package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgpm extends zzgok {
    final /* synthetic */ zzgpo zza;
    private final zzgpt zzb;

    zzgpm(zzgpo zzgpoVar, zzgpt zzgptVar) {
        Objects.requireNonNull(zzgpoVar);
        this.zza = zzgpoVar;
        this.zzb = zzgptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgol
    public final void zzb(Bundle bundle) {
        int i10 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i11 = bundle.getInt("uiMode", 0);
        zzgpr zzgprVarZzd = zzgps.zzd();
        zzgprVarZzd.zza(i10);
        if (string != null) {
            zzgprVarZzd.zzb(string);
        }
        zzgprVarZzd.zzc(i11);
        this.zzb.zza(zzgprVarZzd.zzd());
        if (i10 == 8157) {
            this.zza.zzd();
        }
    }
}
