package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
final class zzfxk extends zzfxq {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfxk(String str, boolean z10, int i10, zzfxi zzfxiVar, int i11, byte[] bArr) {
        this.zzb = str;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfxq) {
            zzfxq zzfxqVar = (zzfxq) obj;
            if (this.zzb.equals(zzfxqVar.zza())) {
                zzfxqVar.zzb();
                int i10 = this.zzc;
                int iZzd = zzfxqVar.zzd();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iZzd) {
                    zzfxqVar.zzc();
                    int i11 = this.zzd;
                    int iZze = zzfxqVar.zze();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iZze == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i10 = this.zzc;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.zzd != 0) {
            return (i11 * (-721379959)) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.zzc;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.zzd == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 52 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxi zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final int zze() {
        return this.zzd;
    }
}
