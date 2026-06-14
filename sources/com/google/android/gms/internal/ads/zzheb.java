package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzheb extends zzhch {
    private final zzhea zza;

    private zzheb(zzhea zzheaVar) {
        this.zza = zzheaVar;
    }

    public static zzheb zzb(zzhea zzheaVar) {
        return new zzheb(zzheaVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzheb) && ((zzheb) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzheb.class, this.zza);
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 39);
        sb2.append("ChaCha20Poly1305 Parameters (variant: ");
        sb2.append(string);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zza != zzhea.zzc;
    }

    public final zzhea zzc() {
        return this.zza;
    }
}
