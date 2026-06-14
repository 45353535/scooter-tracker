package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhdv extends zzhch {
    private final int zza;
    private final zzhdu zzb;

    /* synthetic */ zzhdv(int i10, zzhdu zzhduVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = zzhduVar;
    }

    public static zzhdt zzb() {
        return new zzhdt(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhdv)) {
            return false;
        }
        zzhdv zzhdvVar = (zzhdv) obj;
        return zzhdvVar.zza == this.zza && zzhdvVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhdv.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = strValueOf.length();
        int i10 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i10).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzb != zzhdu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhdu zzd() {
        return this.zzb;
    }
}
