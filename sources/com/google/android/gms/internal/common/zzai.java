package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes8.dex */
public final class zzai {
    static Object[] zza(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 9);
                sb2.append("at index ");
                sb2.append(i11);
                throw new NullPointerException(sb2.toString());
            }
        }
        return objArr;
    }
}
