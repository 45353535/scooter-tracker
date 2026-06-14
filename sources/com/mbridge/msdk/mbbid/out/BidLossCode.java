package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes10.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f49490a;

    private BidLossCode(int i10) {
        f49490a = i10;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f49490a;
    }
}
