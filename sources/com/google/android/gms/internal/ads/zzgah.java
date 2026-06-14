package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgah {
    private final String zza;
    private final long zzb;

    public zzgah() {
        this.zza = null;
        this.zzb = -1L;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    public final long zzb() {
        return this.zzb;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb > 0;
    }

    public zzgah(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }
}
