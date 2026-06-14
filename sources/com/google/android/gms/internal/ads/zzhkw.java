package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzhkw {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhkw(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhkw)) {
            return false;
        }
        zzhkw zzhkwVar = (zzhkw) obj;
        return zzhkwVar.zza.equals(this.zza) && zzhkwVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb2.append(simpleName);
        sb2.append(" with primitive type: ");
        sb2.append(simpleName2);
        return sb2.toString();
    }
}
