package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbem {
    final long zza;
    final String zzb;
    final int zzc;

    zzbem(long j10, String str, int i10) {
        this.zza = j10;
        this.zzb = str;
        this.zzc = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzbem)) {
            return false;
        }
        zzbem zzbemVar = (zzbem) obj;
        return zzbemVar.zza == this.zza && zzbemVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
