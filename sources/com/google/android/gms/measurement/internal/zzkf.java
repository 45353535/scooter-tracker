package com.google.android.gms.measurement.internal;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
final class zzkf implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzlj zzc;

    zzkf(zzlj zzljVar, AtomicReference atomicReference, boolean z10) {
        this.zza = atomicReference;
        this.zzb = z10;
        Objects.requireNonNull(zzljVar);
        this.zzc = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzu.zzt().zzv(this.zza, this.zzb);
    }
}
