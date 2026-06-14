package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes8.dex */
public final class zzio {
    public final String zza;
    public final zzv zzb;
    public final zzv zzc;
    public final int zzd;
    public final int zze;

    public zzio(String str, zzv zzvVar, zzv zzvVar2, int i10, int i11) {
        boolean z10;
        if (i10 != 0) {
            z10 = false;
            if (i11 == 0) {
                i11 = 0;
                z10 = true;
            }
        } else {
            z10 = true;
        }
        zzgrc.zza(z10);
        zzgrc.zza(true ^ TextUtils.isEmpty(str));
        this.zza = str;
        this.zzb = zzvVar;
        zzvVar2.getClass();
        this.zzc = zzvVar2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzio.class == obj.getClass()) {
            zzio zzioVar = (zzio) obj;
            if (this.zzd == zzioVar.zzd && this.zze == zzioVar.zze && this.zza.equals(zzioVar.zza) && this.zzb.equals(zzioVar.zzb) && this.zzc.equals(zzioVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zzd + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
