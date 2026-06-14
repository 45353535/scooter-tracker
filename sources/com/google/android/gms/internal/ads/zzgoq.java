package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzgoq extends zzgpr {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    zzgoq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zza(int i10) {
        this.zza = i10;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgpr zzc(int i10) {
        this.zzc = i10;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpr
    public final zzgps zzd() {
        if (this.zzd == 3) {
            return new zzgor(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb2.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb2.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
