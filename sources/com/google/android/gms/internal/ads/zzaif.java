package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaif extends zzain {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzain[] zzg;

    public zzaif(String str, int i10, int i11, long j10, long j11, zzain[] zzainVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzainVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaif.class == obj.getClass()) {
            zzaif zzaifVar = (zzaif) obj;
            if (this.zzb == zzaifVar.zzb && this.zzc == zzaifVar.zzc && this.zzd == zzaifVar.zzd && this.zze == zzaifVar.zze && Objects.equals(this.zza, zzaifVar.zza) && Arrays.equals(this.zzg, zzaifVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        long j10 = this.zze;
        return (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31) + str.hashCode();
    }
}
