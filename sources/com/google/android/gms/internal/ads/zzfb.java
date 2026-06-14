package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfb extends IllegalStateException {
    public final int zza;
    public final int zzb;

    public zzfb(int i10, int i11) {
        String string;
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 46);
            sb2.append("Player stuck buffering and not loading for ");
            sb2.append(i11);
            sb2.append(" ms");
            string = sb2.toString();
        } else if (i10 == 1) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 47);
            sb3.append("Player stuck buffering with no progress for ");
            sb3.append(i11);
            sb3.append(" ms");
            string = sb3.toString();
        } else if (i10 == 2) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 45);
            sb4.append("Player stuck playing with no progress for ");
            sb4.append(i11);
            sb4.append(" ms");
            string = sb4.toString();
        } else if (i10 != 3) {
            StringBuilder sb5 = new StringBuilder(String.valueOf(i11).length() + 31);
            sb5.append("Player stuck suppressed for ");
            sb5.append(i11);
            sb5.append(" ms");
            string = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder(String.valueOf(i11).length() + 43);
            sb6.append("Player stuck playing without ending for ");
            sb6.append(i11);
            sb6.append(" ms");
            string = sb6.toString();
        }
        super(string);
        this.zza = i10;
        this.zzb = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb;
    }
}
