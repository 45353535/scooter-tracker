package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzgoa implements zzgnb, zzgdd {
    static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private final Context zzb;
    private final ExecutorService zzc;
    private final String[] zzd;
    private long zze = 0;
    private long zzf = 0;
    private long zzg = -1;
    private boolean zzh = false;

    zzgoa(Context context, zzgao zzgaoVar, ExecutorService executorService, String[] strArr) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = strArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgdd
    public final ListenableFuture zza() {
        return Build.VERSION.SDK_INT < 30 ? zzgzo.zzb() : zzgzo.zze(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgnz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzb(Map map) {
        long j10;
        long j11;
        zze();
        synchronized (this) {
            try {
                j10 = this.zzh ? this.zzf - this.zze : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.zzg;
            this.zzg = -1L;
        }
        map.put(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzc(Map map, Context context, View view) {
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnb
    public final void zzd(Map map) {
        zze();
    }

    final void zze() {
        synchronized (this) {
            try {
                if (this.zzh) {
                    this.zzf = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzf() {
        zzgny zzgnyVar = new zzgny(this);
        try {
            Object systemService = this.zzb.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(this.zzd, this.zzc, zzgnyVar);
        } catch (Throwable unused) {
        }
    }

    final /* synthetic */ void zzg(long j10) {
        this.zze = j10;
    }

    final /* synthetic */ long zzh() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(long j10) {
        this.zzg = j10;
    }

    final /* synthetic */ void zzj(boolean z10) {
        this.zzh = z10;
    }
}
