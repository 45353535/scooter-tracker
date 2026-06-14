package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.D5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1dSDK {
    public static Map<String, String> getMediationNetwork(Map<String, String> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                map2.put(URLEncoder.encode(entry.getKey(), D5.N), URLEncoder.encode(entry.getValue(), D5.N));
            } catch (UnsupportedEncodingException e10) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e10);
            }
        }
        return map2;
    }
}
