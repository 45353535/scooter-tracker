package com.appsflyer.internal;

import com.appsflyer.AppsFlyerConsent;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFc1eSDK {

    @Nullable
    public String AFAdRevenueData;

    @Nullable
    public AppsFlyerConsent areAllFieldsValid;
    public boolean component1;

    @Nullable
    public AdvertisingIdData component2;
    public boolean component3;

    @Nullable
    public AFd1aSDK component4;

    @Nullable
    public AFb1gSDK equals;

    @Nullable
    public AFb1rSDK getCurrencyIso4217Code;

    @Nullable
    public String getMediationNetwork;

    @Nullable
    public String getMonetizationNetwork;

    @Nullable
    public AFb1uSDK getRevenue;

    public final synchronized void getMediationNetwork(@Nullable AFd1aSDK aFd1aSDK) {
        this.component4 = aFd1aSDK;
    }

    public final boolean getRevenue() {
        return this.component3;
    }

    public final boolean getMediationNetwork() {
        return this.component1;
    }
}
