package com.appsflyer.internal;

import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AFh1jSDK {

    @Nullable
    public Map<String, Object> AFAdRevenueData;
    public String areAllFieldsValid;
    public int component1;

    @Nullable
    public String component2;
    public String component3;
    public String component4;
    private final boolean copy;
    public Map<String, Object> getCurrencyIso4217Code;

    @Nullable
    public String getMediationNetwork;

    @Nullable
    public AppsFlyerRequestListener getMonetizationNetwork;
    public String getRevenue;
    private byte[] hashCode;

    public AFh1jSDK() {
        this(null, null, null);
    }

    public static boolean getCurrencyIso4217Code(double d10) {
        if (d10 < 0.0d || d10 >= 1.0d) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        int i10 = (int) (1.0d / d10);
        if (i10 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i10)) + 1.0d)) != i10;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }

    public final byte[] AFAdRevenueData() {
        return this.hashCode;
    }

    public boolean areAllFieldsValid() {
        return true;
    }

    public boolean component1() {
        return true;
    }

    public boolean component3() {
        return false;
    }

    public abstract AFe1mSDK getCurrencyIso4217Code();

    public final boolean getMediationNetwork() {
        return this.component4 == null && this.getRevenue == null;
    }

    public boolean getMonetizationNetwork() {
        return true;
    }

    public final boolean getRevenue() {
        return this.copy;
    }

    public AFh1jSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.getCurrencyIso4217Code = new HashMap();
        this.component4 = str;
        this.component3 = str2;
        this.copy = bool != null ? bool.booleanValue() : true;
    }

    public final AFh1jSDK getMonetizationNetwork(Map<String, ?> map) {
        synchronized (map) {
            this.getCurrencyIso4217Code.putAll(map);
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(String str, Object obj) {
        synchronized (this.getCurrencyIso4217Code) {
            this.getCurrencyIso4217Code.put(str, obj);
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(int i10) {
        this.component1 = i10;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                if (this.getCurrencyIso4217Code.containsKey("counter")) {
                    this.getCurrencyIso4217Code.put("counter", Integer.toString(i10));
                }
                if (this.getCurrencyIso4217Code.containsKey("launch_counter")) {
                    this.getCurrencyIso4217Code.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final AFh1jSDK getMonetizationNetwork(byte[] bArr) {
        this.hashCode = bArr;
        return this;
    }
}
