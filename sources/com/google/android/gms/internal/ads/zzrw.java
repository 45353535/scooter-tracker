package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzrw implements zzsj {
    final /* synthetic */ zzsd zza;

    /* synthetic */ zzrw(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zza(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzee.zzc("AudioTrackAudioOutput", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zzb(final long j10) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzrv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zza(j10);
            }
        };
        zzed zzedVarZzs = this.zza.zzs();
        zzedVarZzs.zzd(-1, zzdyVar);
        zzedVarZzs.zze();
    }
}
