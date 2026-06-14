package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhlw extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhlv zzc;

    /* synthetic */ zzhlw(int i10, int i11, zzhlv zzhlvVar, byte[] bArr) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzhlvVar;
    }

    public static zzhlu zzb() {
        return new zzhlu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlw)) {
            return false;
        }
        zzhlw zzhlwVar = (zzhlw) obj;
        return zzhlwVar.zza == this.zza && zzhlwVar.zze() == zze() && zzhlwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzhlw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        int length = strValueOf.length();
        int i10 = this.zzb;
        int length2 = String.valueOf(i10).length();
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i11).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("-byte tags, and ");
        sb2.append(i11);
        sb2.append("-byte key)");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzc != zzhlv.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhlv zzhlvVar = this.zzc;
        if (zzhlvVar == zzhlv.zzd) {
            return this.zzb;
        }
        if (zzhlvVar == zzhlv.zza || zzhlvVar == zzhlv.zzb || zzhlvVar == zzhlv.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhlv zzf() {
        return this.zzc;
    }
}
