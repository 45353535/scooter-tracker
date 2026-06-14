package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhfq extends zzhch {
    private final zzhfp zza;
    private final int zzb;

    private zzhfq(zzhfp zzhfpVar, int i10) {
        this.zza = zzhfpVar;
        this.zzb = i10;
    }

    public static zzhfq zzb(zzhfp zzhfpVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhfq(zzhfpVar, i10);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhfq)) {
            return false;
        }
        zzhfq zzhfqVar = (zzhfq) obj;
        return zzhfqVar.zza == this.zza && zzhfqVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhfq.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i10).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhfp.zzb;
    }

    public final zzhfp zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
