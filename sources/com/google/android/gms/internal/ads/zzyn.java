package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzyn {
    public static final zzyn zza = new zzyn(new zzbg[0]);
    public final int zzb;
    private final zzguf zzc;
    private int zzd;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
    }

    public zzyn(zzbg... zzbgVarArr) {
        this.zzc = zzguf.zzr(zzbgVarArr);
        this.zzb = zzbgVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbg) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzee.zzf("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzyn.class == obj.getClass()) {
            zzyn zzynVar = (zzyn) obj;
            if (this.zzb == zzynVar.zzb && this.zzc.equals(zzynVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzbg zza(int i10) {
        return (zzbg) this.zzc.get(i10);
    }

    public final int zzb(zzbg zzbgVar) {
        int iIndexOf = this.zzc.indexOf(zzbgVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzguf zzc() {
        return zzguf.zzq(zzgvf.zzc(this.zzc, zzym.zza));
    }
}
