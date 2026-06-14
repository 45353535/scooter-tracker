package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: classes8.dex */
final class zzgzt extends AbstractOwnableSynchronizer implements Runnable {
    private final zzgzv zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    final /* synthetic */ void zza(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
