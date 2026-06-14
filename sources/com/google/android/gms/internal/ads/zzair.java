package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzair extends zzain {
    public final String zza;
    public final byte[] zzb;

    public zzair(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzair.class == obj.getClass()) {
            zzair zzairVar = (zzair) obj;
            if (Objects.equals(this.zza, zzairVar.zza) && Arrays.equals(this.zzb, zzairVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 8 + str2.length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }
}
