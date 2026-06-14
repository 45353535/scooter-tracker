package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes8.dex */
final class zzgys extends zzgyr {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgyu.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgyu.class, "remainingField");

    private zzgys() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final void zza(zzgyu zzgyuVar, Set set, Set set2) {
        androidx.concurrent.futures.a.a(zza, zzgyuVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzgyr
    final int zzb(zzgyu zzgyuVar) {
        return zzb.decrementAndGet(zzgyuVar);
    }

    /* synthetic */ zzgys(byte[] bArr) {
        super(null);
    }
}
