package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcg implements zzfax {
    private final zzcdu zza;
    private final ScheduledExecutorService zzb;
    private final zzgzy zzc;

    zzfcg(String str, zzbfg zzbfgVar, zzcdu zzcduVar, ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar) {
        this.zza = zzcduVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgzyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdK)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdP)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzgat.zza(Tasks.forResult(null), null);
                zzgzy zzgzyVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFutureZza, zzfcf.zza, zzgzyVar);
                if (((Boolean) zzbir.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzgzo.zzi(listenableFutureZzj, ((Long) zzbir.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgzo.zzg(listenableFutureZzj, Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfce
                    @Override // com.google.android.gms.internal.ads.zzgqt
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzgzyVar);
            }
        }
        return zzgzo.zza(new zzfch(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzfch zzc(Exception exc) {
        this.zza.zzg(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfch(null, -1);
    }
}
