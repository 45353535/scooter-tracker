package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes8.dex */
final class zzhan extends zzgzf implements RunnableFuture {
    private volatile zzgzv zza;

    zzhan(zzgyv zzgyvVar) {
        this.zza = new zzhal(this, zzgyvVar);
    }

    static zzhan zze(Runnable runnable, Object obj) {
        return new zzhan(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar != null) {
            zzgzvVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzgzv zzgzvVar;
        if (zzj() && (zzgzvVar = this.zza) != null) {
            zzgzvVar.zzh();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        zzgzv zzgzvVar = this.zza;
        if (zzgzvVar == null) {
            return super.zzd();
        }
        String string = zzgzvVar.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 7);
        sb2.append("task=[");
        sb2.append(string);
        sb2.append(C4240b4.j.f42674e);
        return sb2.toString();
    }

    zzhan(Callable callable) {
        this.zza = new zzham(this, callable);
    }
}
