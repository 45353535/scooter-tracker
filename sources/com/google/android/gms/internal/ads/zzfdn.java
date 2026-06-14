package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfdn implements zzfax {
    private final zzcdu zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgzy zzd;
    private final int zze;
    private final int zzf;

    zzfdn(zzcdu zzcduVar, boolean z10, zzcdk zzcdkVar, zzgzy zzgzyVar, String str, ScheduledExecutorService scheduledExecutorService, int i10, int i11) {
        this.zza = zzcduVar;
        this.zzb = z10;
        this.zzd = zzgzyVar;
        this.zzc = scheduledExecutorService;
        this.zze = i10;
        this.zzf = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhV)).booleanValue() && this.zzb) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (this.zzf == 2) {
            return zzgzo.zza(new zzfdo(null));
        }
        if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhX)).split(StringUtils.COMMA)).contains(String.valueOf(this.zze))) {
            return zzgzo.zza(new zzfdo(null));
        }
        ListenableFuture listenableFutureZza = zzgzo.zza(null);
        zzgzy zzgzyVar = this.zzd;
        return zzgzo.zzg(zzgzo.zzi(zzgzo.zzk(listenableFutureZza, zzfdm.zza, zzgzyVar), ((Long) zzbjt.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfdl
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzgzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 50;
    }

    final /* synthetic */ zzfdo zzc(Exception exc) {
        this.zza.zzg(exc, "TrustlessTokenSignal");
        return new zzfdo(null);
    }
}
