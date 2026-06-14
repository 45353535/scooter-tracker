package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhsg extends zzhuu {
    private final zzhse zza;
    private final zzhsc zzb;
    private final zzhsd zzc;
    private final zzhsf zzd;

    /* synthetic */ zzhsg(zzhse zzhseVar, zzhsc zzhscVar, zzhsd zzhsdVar, zzhsf zzhsfVar, byte[] bArr) {
        this.zza = zzhseVar;
        this.zzb = zzhscVar;
        this.zzc = zzhsdVar;
        this.zzd = zzhsfVar;
    }

    public static zzhsb zzb() {
        return new zzhsb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhsg)) {
            return false;
        }
        zzhsg zzhsgVar = (zzhsg) obj;
        return zzhsgVar.zza == this.zza && zzhsgVar.zzb == this.zzb && zzhsgVar.zzc == this.zzc && zzhsgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhsg.class, this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        String string = this.zzd.toString();
        int length = string.length();
        String string2 = this.zzc.toString();
        int length2 = string2.length();
        String string3 = this.zza.toString();
        int length3 = string3.length();
        String string4 = this.zzb.toString();
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + string4.length() + 1);
        sb2.append("ECDSA Parameters (variant: ");
        sb2.append(string);
        sb2.append(", hashType: ");
        sb2.append(string2);
        sb2.append(", encoding: ");
        sb2.append(string3);
        sb2.append(", curve: ");
        sb2.append(string4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean zza() {
        return this.zzd != zzhsf.zzd;
    }

    public final zzhse zzc() {
        return this.zza;
    }

    public final zzhsc zzd() {
        return this.zzb;
    }

    public final zzhsd zze() {
        return this.zzc;
    }

    public final zzhsf zzf() {
        return this.zzd;
    }
}
