package com.fyber.inneractive.sdk.config;

import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static r0 a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        HashMap map = iAConfigManager.f20296b;
        if (map != null && map.containsKey(str)) {
            return (r0) iAConfigManager.f20296b.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static String a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return DtbConstants.HTTPS + str + "/simpleM2M/" + str2;
        }
        return DtbConstants.HTTPS + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
