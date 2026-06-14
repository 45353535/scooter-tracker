package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzieg {
    private static final zzieg zza = new zzieg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzieg(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzieg zza() {
        return zza;
    }

    static zzieg zzb() {
        return new zzieg();
    }

    static zzieg zzc(zzieg zziegVar, zzieg zziegVar2) {
        int i10 = zziegVar.zzb + zziegVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zziegVar.zzc, i10);
        System.arraycopy(zziegVar2.zzc, 0, iArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zziegVar.zzd, i10);
        System.arraycopy(zziegVar2.zzd, 0, objArrCopyOf, zziegVar.zzb, zziegVar2.zzb);
        return new zzieg(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zzn(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzieg)) {
            return false;
        }
        zzieg zziegVar = (zzieg) obj;
        int i10 = this.zzb;
        if (i10 == zziegVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zziegVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zziegVar.zzd;
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
        int i11 = i10 + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzieu zzieuVar) throws IOException {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zzieuVar.zzv(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzg(zzieu zzieuVar) throws IOException {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zzieuVar.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zzieuVar.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zzieuVar.zzn(i13, (zzian) obj);
                } else if (i12 == 3) {
                    zzieuVar.zzt(i13);
                    ((zzieg) obj).zzg(zzieuVar);
                    zzieuVar.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    zzieuVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzA = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zzian zzianVar = (zzian) this.zzd[i11];
            int iZzA2 = zziaw.zzA(8);
            int iZzA3 = zziaw.zzA(16) + zziaw.zzA(i12);
            int iZzA4 = zziaw.zzA(24);
            int iZzc = zzianVar.zzc();
            iZzA += iZzA2 + iZzA2 + iZzA3 + iZzA4 + zziaw.zzA(iZzc) + iZzc;
        }
        this.zze = iZzA;
        return iZzA;
    }

    public final int zzi() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).getClass();
                    iZzA2 = zziaw.zzA(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zzian zzianVar = (zzian) this.zzd[i12];
                    int iZzA3 = zziaw.zzA(i16);
                    int iZzc = zzianVar.zzc();
                    iZzA2 = iZzA3 + zziaw.zzA(iZzc) + iZzc;
                } else if (i15 == 3) {
                    int iZzA4 = zziaw.zzA(i14 << 3);
                    iZzA = iZzA4 + iZzA4;
                    iZzB = ((zzieg) this.zzd[i12]).zzi();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzicf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i12]).getClass();
                    iZzA2 = zziaw.zzA(i14 << 3) + 4;
                }
                i11 += iZzA2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzA = zziaw.zzA(i17);
                iZzB = zziaw.zzB(jLongValue);
            }
            iZzA2 = iZzA + iZzB;
            i11 += iZzA2;
        }
        this.zze = i11;
        return i11;
    }

    final void zzj(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzide.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzk(int i10, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final boolean zzl(int i10, zziaq zziaqVar) throws IOException {
        int iZza;
        zze();
        int i11 = i10 & 7;
        if (i11 == 0) {
            zzk(i10, Long.valueOf(zziaqVar.zzg()));
            return true;
        }
        if (i11 == 1) {
            zzk(i10, Long.valueOf(zziaqVar.zzi()));
            return true;
        }
        if (i11 == 2) {
            zzk(i10, zziaqVar.zzn());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                zziaqVar.zzI();
                return false;
            }
            if (i11 != 5) {
                throw new zzicf("Protocol message tag had invalid wire type.");
            }
            zzk(i10, Integer.valueOf(zziaqVar.zzj()));
            return true;
        }
        zzieg zziegVar = new zzieg();
        do {
            iZza = zziaqVar.zza();
            if (iZza == 0) {
                break;
            }
        } while (zziegVar.zzl(iZza, zziaqVar));
        zziaqVar.zzb(4 | ((i10 >>> 3) << 3));
        zzk(i10, zziegVar);
        return true;
    }

    final zzieg zzm(zzieg zziegVar) {
        if (zziegVar.equals(zza)) {
            return this;
        }
        zze();
        int i10 = this.zzb + zziegVar.zzb;
        zzn(i10);
        System.arraycopy(zziegVar.zzc, 0, this.zzc, this.zzb, zziegVar.zzb);
        System.arraycopy(zziegVar.zzd, 0, this.zzd, this.zzb, zziegVar.zzb);
        this.zzb = i10;
        return this;
    }

    private zzieg() {
        this(0, new int[8], new Object[8], true);
    }
}
