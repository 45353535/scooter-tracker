package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfnd {
    final /* synthetic */ zzfnm zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfnd(zzfnm zzfnmVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfnmVar);
        this.zza = zzfnmVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfnl zza(Callable callable) {
        List list = this.zzc;
        zzgzn zzgznVarZzp = zzgzo.zzp(list);
        ListenableFuture listenableFutureZza = zzgznVarZzp.zza(zzfnc.zza, zzcei.zzg);
        zzfnm zzfnmVar = this.zza;
        return new zzfnl(zzfnmVar, this.zzb, null, listenableFutureZza, list, zzgznVarZzp.zza(callable, zzfnmVar.zze()), null);
    }
}
