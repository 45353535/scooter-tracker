package com.appsflyer.internal;

/* JADX INFO: loaded from: classes6.dex */
public class AFd1aSDK {
    public final long getRevenue;

    public AFd1aSDK(long j10) {
        this.getRevenue = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFd1aSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j10 = this.getRevenue;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
