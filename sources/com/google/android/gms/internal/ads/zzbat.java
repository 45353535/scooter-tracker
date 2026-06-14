package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbat {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    zzbat(@NonNull Context context, @NonNull Executor executor, @NonNull String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzbas(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static zzbat zza(@NonNull Context context, @NonNull Executor executor) {
        return new zzbat(context, executor, zza);
    }

    public final void zzb() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public final long zzd() {
        long j10 = this.zzd;
        this.zzd = -1L;
        return j10;
    }

    final /* synthetic */ void zze(long j10) {
        this.zzb = j10;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(long j10) {
        this.zzd = j10;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zze = z10;
    }
}
