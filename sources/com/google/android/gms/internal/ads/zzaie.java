package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaie extends zzain {
    public final byte[] zza;

    public zzaie(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaie.class == obj.getClass()) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zzf.equals(zzaieVar.zzf) && Arrays.equals(this.zza, zzaieVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zza);
    }
}
