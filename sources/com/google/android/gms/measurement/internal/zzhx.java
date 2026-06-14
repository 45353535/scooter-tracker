package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import j$.util.Objects;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes8.dex */
final class zzhx extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzhz zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhx(zzhz zzhzVar, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(zzhzVar);
        this.zzb = zzhzVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzhz.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzhzVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzhx zzhxVar = (zzhx) obj;
        boolean z10 = zzhxVar.zza;
        boolean z11 = this.zza;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.zzc;
        long j11 = zzhxVar.zzc;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.zzb.zzu.zzaV().zzc().zzb("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaV().zzb().zzb(this.zzd, th2);
        if ((th2 instanceof zzhv) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhx(zzhz zzhzVar, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(zzhzVar);
        this.zzb = zzhzVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzhz.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzhzVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }
}
