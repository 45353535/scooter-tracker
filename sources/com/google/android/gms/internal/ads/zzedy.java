package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzedy implements zzefe {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzecz zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final ScheduledExecutorService zzd;
    private final zzehr zze;
    private final zzfoo zzf;
    private final Context zzg;

    zzedy(Context context, zzfjk zzfjkVar, zzecz zzeczVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzehr zzehrVar, zzfoo zzfooVar) {
        this.zzg = context;
        this.zzc = zzfjkVar;
        this.zza = zzeczVar;
        this.zzb = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzehrVar;
        this.zzf = zzfooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final ListenableFuture zza(zzbzu zzbzuVar) {
        Context context = this.zzg;
        ListenableFuture listenableFutureZza = this.zza.zza(zzbzuVar);
        zzfoe zzfoeVarA = u0.a(context, 11);
        zzfon.zzb(listenableFutureZza, zzfoeVarA);
        ListenableFuture listenableFutureZzj = zzgzo.zzj(listenableFutureZza, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedx
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb((zzefg) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgB)).booleanValue()) {
            listenableFutureZzj = zzgzo.zzh(zzgzo.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzedw.zza, zzcei.zzg);
        }
        zzfon.zzd(listenableFutureZzj, this.zzf, zzfoeVarA);
        zzgzo.zzr(listenableFutureZzj, new zzedv(this), zzcei.zzg);
        return listenableFutureZzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzefg zzefgVar) {
        return zzgzo.zza(new zzfjc(new zzfiz(this.zzc), zzfjb.zza(new InputStreamReader(zzefgVar.zza()), zzefgVar.zzb().zzm)));
    }

    final /* synthetic */ zzehr zzc() {
        return this.zze;
    }
}
