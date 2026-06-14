package com.google.android.gms.internal.consent_sdk;

import j$.util.Objects;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
final class zzdm implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzdo zzb;

    zzdm(zzdo zzdoVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzdoVar);
        this.zzb = zzdoVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zzdo.zzc(this.zzb, this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(zzdi.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(zzdi.zza(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
