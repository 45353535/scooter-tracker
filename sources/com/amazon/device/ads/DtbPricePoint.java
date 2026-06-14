package com.amazon.device.ads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes5.dex */
public class DtbPricePoint {
    private final DTBAdSize adSize;
    private final String pricePoint;

    public DtbPricePoint(String str, String str2, String str3, AdType adType) {
        this.pricePoint = str;
        String[] strArrSplit = str2.split("x");
        if (strArrSplit.length == 2) {
            this.adSize = new DTBAdSize(DtbCommonUtils.parseInt(strArrSplit[0], 0), DtbCommonUtils.parseInt(strArrSplit[1], 0), adType, str3);
            return;
        }
        throw new IllegalArgumentException("AdSize " + str2 + " is not valid");
    }

    public DTBAdSize getAdSize() {
        return this.adSize;
    }

    public String getPricePoint() {
        return this.pricePoint;
    }

    public String toString() {
        return "DtbPricePoint [pricePoint=" + this.pricePoint + ", adSize=" + this.adSize + C4240b4.j.f42674e;
    }
}
