package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class zzfvh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfvh(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z10) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z10;
    }

    public static zzfvh zza(@NonNull final Context context, @NonNull Executor executor, boolean z10) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z10) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfvh.zza;
                    taskCompletionSource.setResult(zzfxd.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i10 = zzfvh.zza;
                    taskCompletionSource.setResult(zzfxd.zzc());
                }
            });
        }
        return new zzfvh(context, executor, taskCompletionSource.getTask(), z10);
    }

    static void zzg(int i10) {
        zzf = i10;
    }

    private final Task zzh(final int i10, long j10, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfvg.zza);
        }
        Context context = this.zzb;
        final zzavm zzavmVarZza = zzavq.zza();
        zzavmVarZza.zza(context.getPackageName());
        zzavmVarZza.zzb(j10);
        zzavmVarZza.zzg(zzf);
        if (exc != null) {
            int i11 = zzgrz.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzavmVarZza.zzc(stringWriter.toString());
            zzavmVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzavmVarZza.zze(str2);
        }
        if (str != null) {
            zzavmVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfve
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i12 = zzfvh.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i13 = i10;
                zzfxc zzfxcVarZza = ((zzfxd) task.getResult()).zza(((zzavq) zzavmVarZza.zzbu()).zzaN());
                zzfxcVarZza.zzc(i13);
                zzfxcVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i10, long j10) {
        return zzh(i10, j10, null, null, null, null);
    }

    public Task zzc(int i10, long j10, Exception exc) {
        return zzh(i10, j10, exc, null, null, null);
    }

    public final Task zzd(int i10, long j10, String str, Map map) {
        return zzh(i10, j10, null, str, null, null);
    }

    public Task zze(int i10, String str) {
        return zzh(i10, 0L, null, null, null, str);
    }

    public final Task zzf(int i10, long j10, String str) {
        return zzh(i10, j10, null, null, null, str);
    }
}
