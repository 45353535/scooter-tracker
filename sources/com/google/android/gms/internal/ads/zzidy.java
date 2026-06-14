package com.google.android.gms.internal.ads;

import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzidy implements Map.Entry, Comparable {
    final /* synthetic */ zzieb zza;
    private final Comparable zzb;
    private Object zzc;

    zzidy(zzieb zziebVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(zziebVar);
        this.zza = zziebVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzidy) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzh();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append(C4240b4.j.f42668b);
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
