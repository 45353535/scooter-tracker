package com.amazon.device.ads;

import com.amazon.aps.ads.model.ApsAdNetwork;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class DTBAdNetworkInfo {
    private static final String LOGTAG = "DTBAdNetworkInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f7403a = 0;
    private final String adNetworkName;
    private final HashMap<String, String> adNetworkProperties;

    public DTBAdNetworkInfo(DTBAdNetwork dTBAdNetwork) {
        this.adNetworkName = dTBAdNetwork != null ? dTBAdNetwork.toString() : DTBAdNetwork.UNKNOWN.toString();
        this.adNetworkProperties = new HashMap<>();
    }

    public String getAdNetworkName() {
        return this.adNetworkName;
    }

    public String getAdNetworkProperties(String str) {
        if (this.adNetworkProperties.containsKey(str)) {
            return this.adNetworkProperties.get(str);
        }
        DtbLog.error(LOGTAG, "DTB Ad NetworkProperties not found");
        return null;
    }

    public DTBAdNetworkInfo setAdNetworkProperties(String str, String str2) {
        this.adNetworkProperties.put(str, str2);
        return this;
    }

    public DTBAdNetworkInfo(ApsAdNetwork apsAdNetwork) {
        String string;
        if (apsAdNetwork != null) {
            string = apsAdNetwork.toString();
        } else {
            string = ApsAdNetwork.UNKNOWN.toString();
        }
        this.adNetworkName = string;
        this.adNetworkProperties = new HashMap<>();
    }
}
