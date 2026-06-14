package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgyc {
    public static long[] zza(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i10 = (int) length;
        zzgrc.zze(length == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", length);
        long[] jArr3 = new long[i10];
        int i11 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i11, length2);
            i11 += length2;
        }
        return jArr3;
    }
}
