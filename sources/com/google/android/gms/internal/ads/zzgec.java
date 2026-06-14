package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzgec {
    private final zzika zza;
    private final zzika zzb;
    private final zzika zzc;
    private final ExecutorService zzd;
    private final zzgoe zze;

    zzgec(zzika zzikaVar, zzika zzikaVar2, zzika zzikaVar3, ExecutorService executorService, zzgoe zzgoeVar) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = zzikaVar3;
        this.zzd = executorService;
        this.zze = zzgoeVar;
    }

    private final ListenableFuture zze(final int i10) {
        return (zzgzg) zzgzo.zzj(zzgzg.zzw(zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgdy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(i10);
            }
        }, this.zzd)), zzgdz.zza, zzhaf.zza());
    }

    final /* synthetic */ zzgoe zza() {
        return this.zze;
    }

    final ListenableFuture zzb(int i10, boolean z10) {
        ListenableFuture listenableFutureZze = zze(i10);
        return (!z10 || i10 == 2) ? listenableFutureZze : (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzg.zzw(listenableFutureZze), Throwable.class, zzgeb.zza, zzhaf.zza()), new zzgdx(this), zzhaf.zza());
    }

    final /* synthetic */ zzgdv zzc(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return (zzgdv) this.zza.zzb();
        }
        if (i11 == 2) {
            return (zzgdv) this.zzb.zzb();
        }
        if (i11 == 3) {
            return (zzgdv) this.zzc.zzb();
        }
        throw new IllegalArgumentException();
    }

    final /* synthetic */ ListenableFuture zzd(int i10) {
        return zze(2);
    }
}
