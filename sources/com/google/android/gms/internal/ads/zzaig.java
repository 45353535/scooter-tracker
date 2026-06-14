package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaig extends zzain {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzain[] zze;

    public zzaig(String str, boolean z10, boolean z11, String[] strArr, zzain[] zzainVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzainVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaig.class == obj.getClass()) {
            zzaig zzaigVar = (zzaig) obj;
            if (this.zzb == zzaigVar.zzb && this.zzc == zzaigVar.zzc && Objects.equals(this.zza, zzaigVar.zza) && Arrays.equals(this.zzd, zzaigVar.zzd) && Arrays.equals(this.zze, zzaigVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31) + this.zza.hashCode();
    }
}
