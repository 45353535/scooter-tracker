package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzezj implements zzfax {
    private final zzfax zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzezj(zzfax zzfaxVar, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfaxVar;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcV)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.zzb;
        if (j10 > 0) {
            listenableFutureZza = zzgzo.zzi(listenableFutureZza, j10, timeUnit, this.zzc);
        }
        return zzgzo.zzh(listenableFutureZza, Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzezi
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcei.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcT)).booleanValue()) {
            zzfax zzfaxVar = this.zza;
            zzcdu zzcduVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzfaxVar.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb2.append("OptionalSignalTimeout:");
            sb2.append(iZzb);
            zzcduVarZzh.zzg(th2, sb2.toString());
        }
        return zzgzo.zza(null);
    }
}
