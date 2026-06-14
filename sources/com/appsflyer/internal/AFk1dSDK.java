package com.appsflyer.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class AFk1dSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void AFAdRevenueData(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }

    public static int getCurrencyIso4217Code(int i10) {
        int[][] iArr = AFk1tSDK.getMediationNetwork.getMonetizationNetwork;
        return ((iArr[0][(i10 >>> 24) & 255] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }
}
