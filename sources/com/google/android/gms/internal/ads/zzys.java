package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzys {
    public final long zza;
    public final long zzb;

    public zzys(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzys)) {
            return false;
        }
        zzys zzysVar = (zzys) obj;
        return this.zza == zzysVar.zza && this.zzb == zzysVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
