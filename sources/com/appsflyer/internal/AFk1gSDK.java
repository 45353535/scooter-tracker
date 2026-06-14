package com.appsflyer.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1gSDK {
    public int getCurrencyIso4217Code;
    public int getMediationNetwork;

    public static char[] getCurrencyIso4217Code(long j10, char[] cArr, int i10) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 4;
        while (i11 < cArr.length) {
            if ((((j10 >>> i11) & 1) != i10 || i12 >= 4) && i13 < length) {
                cArr2[i13] = cArr[i11];
                i13++;
                i11++;
            } else {
                cArr2[i12] = cArr[i11];
                i12++;
                i11++;
            }
        }
        return cArr2;
    }
}
