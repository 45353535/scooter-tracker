package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import net.pubnative.lite.sdk.utils.EncodingUtils;

/* JADX INFO: loaded from: classes3.dex */
public class GenericMacros {
    protected static final String MACRO_CACHE_BUSTING = "[CACHEBUSTING]";
    protected static final String MACRO_TIMESTAMP = "[TIMESTAMP]";

    private String getCacheBusting() {
        return String.valueOf(new Random().nextInt(90000000) + 10000000);
    }

    private String getTimestamp() {
        String strUrlEncode = EncodingUtils.urlEncode(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date()));
        return TextUtils.isEmpty(strUrlEncode) ? String.valueOf(-1) : strUrlEncode;
    }

    public String processUrl(String str) {
        return str.replace(MACRO_TIMESTAMP, getTimestamp()).replace("[CACHEBUSTING]", getCacheBusting());
    }
}
