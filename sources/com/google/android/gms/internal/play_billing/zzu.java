package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public final class zzu {
    @NonNull
    public static zzdc zza(@NonNull zzr zzrVar) {
        zzp zzpVar = new zzp();
        zzt zztVar = new zzt(zzpVar);
        zzpVar.zzb = zztVar;
        zzpVar.zza = zzrVar.getClass();
        try {
            zzpVar.zza = zzrVar.zza(zzpVar);
            return zztVar;
        } catch (Exception e10) {
            zztVar.zzc(e10);
            return zztVar;
        }
    }
}
