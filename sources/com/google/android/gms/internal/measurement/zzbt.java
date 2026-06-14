package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
final class zzbt extends zzbz {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzbt() {
    }

    public final zzbz zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzbz zzb(boolean z10) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzca zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzbu(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb2.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    final zzbz zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzbz
    public final zzbz zze(int i10) {
        this.zzd = 1;
        return this;
    }
}
