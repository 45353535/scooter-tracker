package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes8.dex */
public final class zzgvy {
    static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            zzb(objArr[i11], i11);
        }
        return objArr;
    }

    static Object zzb(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }
}
