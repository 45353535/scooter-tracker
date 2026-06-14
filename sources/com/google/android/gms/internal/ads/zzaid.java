package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaid extends zzain {
    public final String zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;

    public zzaid(String str, @Nullable String str2, int i10, byte[] bArr) {
        super("APIC");
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaid.class == obj.getClass()) {
            zzaid zzaidVar = (zzaid) obj;
            if (this.zzc == zzaidVar.zzc && Objects.equals(this.zza, zzaidVar.zza) && Objects.equals(this.zzb, zzaidVar.zzb) && Arrays.equals(this.zzd, zzaidVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i10 = this.zzc;
        String str2 = this.zzb;
        return ((((((i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzd, this.zzc);
    }
}
