package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgvz implements Comparator {
    protected zzgvz() {
    }

    public static zzgvz zzb() {
        return zzgvx.zza;
    }

    public static zzgvz zzc(Comparator comparator) {
        return new zzgto(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgvz zza() {
        return new zzgwi(this);
    }

    public final zzgvz zzd(zzgqt zzgqtVar) {
        return new zzgta(zzgqtVar, this);
    }
}
