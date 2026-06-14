package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfcc implements zzfax {
    private final Executor zza;
    private final String zzb;

    public zzfcc(zzcdm zzcdmVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i10) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzgzo.zza(this.zzb);
        zzfcb zzfcbVar = zzfcb.zza;
        Executor executor = this.zza;
        return zzgzo.zzh(zzgzo.zzk(listenableFutureZza, zzfcbVar, executor), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzfca
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th2) {
        return zzgzo.zza(new zzfcd(this.zzb));
    }
}
