package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
final class zzgwh extends zzgvz implements Serializable {
    static final zzgwh zza = new zzgwh();

    private zzgwh() {
    }

    @Override // com.google.android.gms.internal.ads.zzgvz, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
