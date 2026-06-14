package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcad extends zzcaf {
    private final String zza;
    private final int zzb;

    public zzcad(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcad)) {
            return false;
        }
        zzcad zzcadVar = (zzcad) obj;
        if (Objects.equal(this.zza, zzcadVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcadVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcag
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcag
    public final int zzc() {
        return this.zzb;
    }
}
