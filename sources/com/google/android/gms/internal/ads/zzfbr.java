package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfbr implements zzfax {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgzy zzc;
    private final ScheduledExecutorService zzd;
    private final zzeke zze;
    private final zzfjk zzf;
    private final VersionInfoParcel zzg;

    zzfbr(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzeke zzekeVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgzyVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzekeVar;
        this.zzf = zzfjkVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA)).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.zzfax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbr.zza():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th2) {
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzgzo.zza(th2 instanceof SecurityException ? new zzfbs("", 2, null) : th2 instanceof IllegalStateException ? new zzfbs("", 3, null) : th2 instanceof IllegalArgumentException ? new zzfbs("", 4, null) : th2 instanceof TimeoutException ? new zzfbs("", 5, null) : new zzfbs("", 0, null));
    }
}
