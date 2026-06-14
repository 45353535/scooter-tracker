package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzdza extends zzdze {
    private long zza;
    private int zzb;
    private byte zzc;

    zzdza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdze zza(long j10) {
        this.zza = j10;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdze zzb(int i10) {
        this.zzb = i10;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdze
    public final zzdzf zzc() {
        if (this.zzc == 3) {
            return new zzdzb(this.zza, this.zzb, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb2.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb2.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
