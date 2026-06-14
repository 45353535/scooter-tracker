package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzgrl implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgrr zzb;

    zzgrl(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgrrVar);
        this.zzb = zzgrrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzgqw.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
