package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzfxj extends zzfxp {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfxj() {
    }

    public final zzfxp zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final zzfxp zzb(boolean z10) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final zzfxq zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfxk(this.zza, false, this.zzc, null, this.zzd, null);
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

    @Override // com.google.android.gms.internal.ads.zzfxp
    final zzfxp zzd(int i10) {
        this.zzc = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfxp
    public final zzfxp zze(int i10) {
        this.zzd = 1;
        return this;
    }
}
