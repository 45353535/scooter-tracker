package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgct {
    protected final File zza;

    public zzgct(File file) {
        this.zza = file;
    }

    public final File zza() {
        return this.zza;
    }

    public abstract ListenableFuture zzb();

    public abstract ListenableFuture zzc(Object obj);
}
