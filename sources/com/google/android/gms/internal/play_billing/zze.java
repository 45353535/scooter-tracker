package com.google.android.gms.internal.play_billing;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zze {
    static final zze zza;
    static final zze zzb;

    @Nullable
    final Throwable zzc;

    static {
        if (zzo.zza) {
            zzb = null;
            zza = null;
        } else {
            zzb = new zze(false, null);
            zza = new zze(true, null);
        }
    }

    zze(boolean z10, @Nullable Throwable th2) {
        this.zzc = th2;
    }
}
