package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzgor extends zzgps {
    private final int zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzgor(int i10, String str, int i11, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgps) {
            zzgps zzgpsVar = (zzgps) obj;
            if (this.zza == zzgpsVar.zza() && ((str = this.zzb) != null ? str.equals(zzgpsVar.zzb()) : zzgpsVar.zzb() == null) && this.zzc == zzgpsVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zzb;
        return (((str == null ? 0 : str.hashCode()) ^ ((this.zza ^ 1000003) * 1000003)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        int i11 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 46 + length2 + 9 + String.valueOf(i11).length() + 1);
        sb2.append("OverlayDisplayState{statusCode=");
        sb2.append(i10);
        sb2.append(", sessionToken=");
        sb2.append(str);
        sb2.append(", uiMode=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgps
    public final int zzc() {
        return this.zzc;
    }
}
