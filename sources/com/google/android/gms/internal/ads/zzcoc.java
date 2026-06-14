package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzcoc implements zzdzj {
    private final zzcnp zza;
    private final zzcof zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcoc(zzcnp zzcnpVar, zzcof zzcofVar, byte[] bArr) {
        this.zza = zzcnpVar;
        this.zzb = zzcofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final zzdzk zza() {
        zziko.zzc(this.zzc, Long.class);
        zziko.zzc(this.zzd, String.class);
        return new zzcod(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final /* bridge */ /* synthetic */ zzdzj zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public final /* bridge */ /* synthetic */ zzdzj zzc(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }
}
