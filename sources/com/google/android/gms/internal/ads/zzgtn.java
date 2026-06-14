package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgtn {
    static Object zza(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 41);
        sb2.append("must be power of 2 between 2^1 and 2^30: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int zzb(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i10] : ((int[]) obj)[i10];
    }

    static void zzc(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    static int zzd(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    static int zze(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iZzb = zzgty.zzb(obj);
        int i13 = iZzb & i10;
        int iZzb2 = zzb(obj3, i13);
        if (iZzb2 != 0) {
            int i14 = ~i10;
            int i15 = iZzb & i14;
            int i16 = -1;
            while (true) {
                i11 = iZzb2 - 1;
                int i17 = iArr[i11];
                i12 = i17 & i10;
                if ((i17 & i14) != i15 || !Objects.equals(obj, objArr[i11]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i11]))) {
                    if (i12 == 0) {
                        break;
                    }
                    i16 = i11;
                    iZzb2 = i12;
                } else {
                    break;
                }
            }
            if (i16 == -1) {
                zzc(obj3, i13, i12);
                return i11;
            }
            iArr[i16] = (iArr[i16] & i14) | (i12 & i10);
            return i11;
        }
        return -1;
    }
}
