package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes8.dex */
public class zzgzg extends zzgzp {
    zzgzg() {
    }

    public static zzgzg zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgzg ? (zzgzg) listenableFuture : new zzgzh(listenableFuture);
    }
}
