package com.my.tracker.obfuscated;

/* JADX INFO: loaded from: classes11.dex */
public abstract class l {
    public static int a(Comparable[] comparableArr, Comparable[] comparableArr2) {
        if (comparableArr == comparableArr2) {
            return 0;
        }
        if (comparableArr == null || comparableArr2 == null) {
            return comparableArr == null ? -1 : 1;
        }
        int iMin = Math.min(comparableArr.length, comparableArr2.length);
        for (int i10 = 0; i10 < iMin; i10++) {
            Comparable comparable = comparableArr[i10];
            Comparable comparable2 = comparableArr2[i10];
            if (comparable != comparable2) {
                if (comparable == null || comparable2 == null) {
                    return comparable == null ? -1 : 1;
                }
                int iCompareTo = comparable.compareTo(comparable2);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
        }
        return comparableArr.length - comparableArr2.length;
    }
}
