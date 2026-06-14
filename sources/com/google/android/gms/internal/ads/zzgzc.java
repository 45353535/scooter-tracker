package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class zzgzc extends zzgyq {
    private zzgzb zza;

    zzgzc(zzgub zzgubVar, boolean z10, Executor executor, Callable callable) {
        super(zzgubVar, z10, false);
        this.zza = new zzgza(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i10) {
        super.zzA(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    final /* synthetic */ void zzD(zzgzb zzgzbVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzi() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        zzgzb zzgzbVar = this.zza;
        if (zzgzbVar != null) {
            zzgzbVar.zze();
        }
    }
}
