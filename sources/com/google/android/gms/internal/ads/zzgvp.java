package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
final class zzgvp extends zzgvt {
    final /* synthetic */ Comparator zza;

    zzgvp(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    final Map zza() {
        return new TreeMap(this.zza);
    }
}
