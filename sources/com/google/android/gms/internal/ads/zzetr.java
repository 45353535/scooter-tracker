package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetr {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzetq zzb;

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzetq zzetqVar) {
        this.zzb = zzetqVar;
    }

    @Nullable
    final zzetq zzd() {
        return this.zzb;
    }
}
