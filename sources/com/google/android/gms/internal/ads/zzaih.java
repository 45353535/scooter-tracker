package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaih extends zzain {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaih(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaih.class == obj.getClass()) {
            zzaih zzaihVar = (zzaih) obj;
            if (Objects.equals(this.zzb, zzaihVar.zzb) && Objects.equals(this.zza, zzaihVar.zza) && Objects.equals(this.zzc, zzaihVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = length + 11 + str3.length();
        String str4 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        sb2.append(", text=");
        sb2.append(str2);
        return sb2.toString();
    }
}
