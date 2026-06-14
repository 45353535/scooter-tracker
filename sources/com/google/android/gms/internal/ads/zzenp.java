package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzenp implements zzgzl {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfiu zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfqg zze;
    final /* synthetic */ zzfjc zzf;
    final /* synthetic */ zzenr zzg;

    zzenp(zzenr zzenrVar, long j10, zzfiu zzfiuVar, zzfir zzfirVar, String str, zzfqg zzfqgVar, zzfjc zzfjcVar) {
        this.zza = j10;
        this.zzb = zzfiuVar;
        this.zzc = zzfirVar;
        this.zzd = str;
        this.zze = zzfqgVar;
        this.zzf = zzfjcVar;
        Objects.requireNonNull(zzenrVar);
        this.zzg = zzenrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenp.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(Object obj) {
        long j10;
        zzenr zzenrVar = this.zzg;
        long jElapsedRealtime = zzenrVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzenrVar) {
            try {
                if (zzenrVar.zzn()) {
                    j10 = jElapsedRealtime;
                    zzenrVar.zzk().zza(this.zzb, this.zzc, 0, null, j10);
                } else {
                    j10 = jElapsedRealtime;
                }
                if (zzenrVar.zzp()) {
                    return;
                }
                zzfir zzfirVar = this.zzc;
                if (zzenrVar.zzi(zzfirVar)) {
                    ((zzenq) zzenrVar.zzm().get(zzfirVar)).zzd = j10;
                } else {
                    long j11 = j10;
                    j10 = j11;
                    zzenrVar.zzm().put(zzfirVar, new zzenq(this.zzd, zzfirVar.zzaf, 0, j11, null));
                }
                zzenrVar.zzo().zzd(zzfirVar, j10, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
