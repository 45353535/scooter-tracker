package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zziba {
    private final Object zza;
    private final int zzb;

    zziba(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziba)) {
            return false;
        }
        zziba zzibaVar = (zziba) obj;
        return this.zza == zzibaVar.zza && this.zzb == zzibaVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
