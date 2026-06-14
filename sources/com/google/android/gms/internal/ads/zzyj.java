package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzyj implements zzyc {
    private final zzyc zza;
    private final long zzb;

    public zzyj(zzyc zzycVar, long j10) {
        this.zza = zzycVar;
        this.zzb = j10;
    }

    public final zzyc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final boolean zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zzd(zzlh zzlhVar, zzih zzihVar, int i10) {
        int iZzd = this.zza.zzd(zzlhVar, zzihVar, i10);
        if (iZzd != -4) {
            return iZzd;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzyc
    public final int zze(long j10) {
        return this.zza.zze(j10 - this.zzb);
    }
}
