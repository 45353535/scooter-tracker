package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhii {
    static void zza(long[] jArr, long[] jArr2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = (int) jArr[i11];
            jArr[i11] = ((-i10) & (((int) jArr2[i11]) ^ i12)) ^ i12;
        }
    }
}
