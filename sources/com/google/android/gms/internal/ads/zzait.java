package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class zzait extends zzain {

    @Nullable
    public final String zza;
    public final String zzb;

    public zzait(String str, @Nullable String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzait.class == obj.getClass()) {
            zzait zzaitVar = (zzait) obj;
            if (this.zzf.equals(zzaitVar.zzf) && Objects.equals(this.zza, zzaitVar.zza) && Objects.equals(this.zzb, zzaitVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 6 + str2.length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }
}
