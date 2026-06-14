package com.google.android.gms.internal.play_billing;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class zzh {
    static final zzh zza = new zzh(null, null);
    final Runnable zzb;
    final Executor zzc;

    @Nullable
    zzh zzd;

    zzh(Runnable runnable, Executor executor) {
        this.zzb = runnable;
        this.zzc = executor;
    }
}
