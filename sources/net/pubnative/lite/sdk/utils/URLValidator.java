package net.pubnative.lite.sdk.utils;

import android.util.Patterns;
import android.webkit.URLUtil;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes3.dex */
public class URLValidator {
    public static boolean isValidURL(String str) {
        if (str != null && !str.trim().isEmpty()) {
            String strReplace = str.replace(C4240b4.j.f42672d, "%5B").replace(C4240b4.j.f42674e, "%5D");
            if (URLUtil.isValidUrl(strReplace) && Patterns.WEB_URL.matcher(strReplace).matches()) {
                return true;
            }
        }
        return false;
    }
}
