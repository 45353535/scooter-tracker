package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzeil extends zzejh {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    /* synthetic */ zzeil(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzejh) {
            zzejh zzejhVar = (zzejh) obj;
            if (this.zza.equals(zzejhVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzejhVar.zzb()) : zzejhVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzejhVar.zzc()) : zzejhVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzejhVar.zzd()) : zzejhVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        sb2.append("OfflineUtilsParams{activity=");
        sb2.append(string);
        sb2.append(", adOverlay=");
        sb2.append(strValueOf);
        sb2.append(", gwsQueryId=");
        sb2.append(str);
        sb2.append(", uri=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzejh
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
