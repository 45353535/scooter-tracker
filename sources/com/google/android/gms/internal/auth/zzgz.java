package com.google.android.gms.internal.auth;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    private zzgz(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = z10;
    }

    public static zzgz zza() {
        return zza;
    }

    static zzgz zzb(zzgz zzgzVar, zzgz zzgzVar2) {
        int i10 = zzgzVar.zzb + zzgzVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgzVar.zzc, i10);
        System.arraycopy(zzgzVar2.zzc, 0, iArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgzVar.zzd, i10);
        System.arraycopy(zzgzVar2.zzd, 0, objArrCopyOf, zzgzVar.zzb, zzgzVar2.zzb);
        return new zzgz(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        int i10 = this.zzb;
        if (i10 == zzgzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgzVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgzVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void zzd() {
        this.zze = false;
    }

    final void zze(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzfy.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzf(int i10, Object obj) {
        if (!this.zze) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.zzb;
        int[] iArr = this.zzc;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.zzc = Arrays.copyOf(iArr, i12);
            this.zzd = Arrays.copyOf(this.zzd, i12);
        }
        int[] iArr2 = this.zzc;
        int i13 = this.zzb;
        iArr2[i13] = i10;
        this.zzd[i13] = obj;
        this.zzb = i13 + 1;
    }

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}
