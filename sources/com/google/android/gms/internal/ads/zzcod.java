package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzcod implements zzdzk {
    private final Long zza;
    private final String zzb;
    private final zzcnp zzc;
    private final zzcof zzd;

    zzcod(zzcnp zzcnpVar, zzcof zzcofVar, Long l10, String str) {
        this.zzc = zzcnpVar;
        this.zzd = zzcofVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzt zza() {
        long jLongValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzu.zza(jLongValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public final zzdzx zzb() {
        long jLongValue = this.zza.longValue();
        zzcof zzcofVar = this.zzd;
        return zzdzy.zza(jLongValue, zzcofVar.zzd(), zzcofVar.zza(), this.zzc, this.zzb);
    }
}
