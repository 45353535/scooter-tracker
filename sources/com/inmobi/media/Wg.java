package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37954a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37955b = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wg)) {
            return false;
        }
        Wg wg2 = (Wg) obj;
        return this.f37954a == wg2.f37954a && this.f37955b == wg2.f37955b;
    }

    public final int hashCode() {
        return this.f37955b + (this.f37954a * 31);
    }

    public final String toString() {
        return "PurchaseData(noOfInAppPurchases=" + this.f37954a + ", noOfSubscriptions=" + this.f37955b + ")";
    }
}
