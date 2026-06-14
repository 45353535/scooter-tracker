package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AFh1tSDK {
    public final AFc1oSDK getCurrencyIso4217Code;
    public final AFc1pSDK getMediationNetwork;
    public long hashCode;
    public final Map<String, Object> getMonetizationNetwork = new ConcurrentHashMap();
    public final Map<String, Object> getRevenue = new ConcurrentHashMap();
    public final Map<String, Object> AFAdRevenueData = new ConcurrentHashMap();
    public long component2 = 0;
    public long component3 = 0;
    public final long[] component4 = new long[2];
    public final long[] component1 = new long[2];
    public final long[] areAllFieldsValid = new long[2];
    public long copydefault = 0;
    public long toString = 0;

    public AFh1tSDK(AFc1oSDK aFc1oSDK, AFc1pSDK aFc1pSDK) {
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getMediationNetwork = aFc1pSDK;
    }

    public final Map<String, Object> AFAdRevenueData(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork(str, null);
        if (monetizationNetwork != null) {
            try {
                return AFg1hSDK.getMonetizationNetwork(new JSONObject(monetizationNetwork));
            } catch (Exception e10) {
                AFLogger.afErrorLog("Error while parsing cached json data", e10, true);
            }
        }
        return map;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) == 0;
    }

    public final void getMonetizationNetwork() {
        this.component3 = System.currentTimeMillis();
        if (getCurrencyIso4217Code()) {
            long j10 = this.component2;
            if (j10 == 0) {
                AFLogger.afInfoLog("Metrics: init ts is missing");
                return;
            }
            this.getMonetizationNetwork.put("init_to_fg", Long.valueOf(this.component3 - j10));
            this.getCurrencyIso4217Code.AFAdRevenueData("first_launch", new JSONObject(this.getMonetizationNetwork).toString());
        }
    }

    public final void getRevenue(AFh1uSDK aFh1uSDK) {
        if (getCurrencyIso4217Code()) {
            this.getMonetizationNetwork.put("start_with", aFh1uSDK.toString());
            this.getCurrencyIso4217Code.AFAdRevenueData("first_launch", new JSONObject(this.getMonetizationNetwork).toString());
        }
    }

    public final boolean getRevenue() {
        return this.getMediationNetwork.getMonetizationNetwork.getMediationNetwork("appsFlyerCount", 0) == 1;
    }

    public final void getMonetizationNetwork(DeepLinkResult deepLinkResult, long j10) {
        this.getRevenue.put("status", deepLinkResult.getStatus().toString());
        this.getRevenue.put("timeout_value", Long.valueOf(j10));
    }

    public final void getMonetizationNetwork(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.toString;
        if (j10 != 0) {
            this.AFAdRevenueData.put("net", Long.valueOf(jCurrentTimeMillis - j10));
        } else {
            AFLogger.afInfoLog("Metrics: gcdStart ts is missing");
        }
        this.AFAdRevenueData.put("retries", Integer.valueOf(i10));
        this.getCurrencyIso4217Code.AFAdRevenueData("gcd", new JSONObject(this.AFAdRevenueData).toString());
    }
}
