package com.google.android.gms.ads.internal.util.client;

/* JADX INFO: loaded from: classes7.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    zzm(int i10, int i11, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zza() && this.zzb == zzwVar.zzb() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        boolean z10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z10).length() + 1);
        sb2.append("OfflineAdConfig{impressionPrerequisite=");
        sb2.append(i10);
        sb2.append(", clickPrerequisite=");
        sb2.append(i11);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}
