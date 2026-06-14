package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgyh;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgyu extends zzgyh.zzf {
    private static final zzgyr zzbn;
    private static final zzgzw zzbo = new zzgzw(zzgyu.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th2;
        zzgyr zzgytVar;
        byte[] bArr = null;
        try {
            zzgytVar = new zzgys(bArr);
            th2 = null;
        } catch (Throwable th3) {
            th2 = th3;
            zzgytVar = new zzgyt(bArr);
        }
        zzbn = zzgytVar;
        if (th2 != null) {
            zzbo.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    zzgyu(int i10) {
        this.remainingField = i10;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbn.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int zzC() {
        return zzbn.zzb(this);
    }

    abstract void zzf(Set set);
}
