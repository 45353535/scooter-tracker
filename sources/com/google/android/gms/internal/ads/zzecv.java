package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes8.dex */
final /* synthetic */ class zzecv implements zzgyw {
    static final /* synthetic */ zzecv zza = new zzecv();

    private /* synthetic */ zzecv() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgzo.zzc(cause);
    }
}
