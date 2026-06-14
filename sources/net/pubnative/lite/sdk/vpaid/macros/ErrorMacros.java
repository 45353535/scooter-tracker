package net.pubnative.lite.sdk.vpaid.macros;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorMacros {
    private static final String MACRO_ERROR_CODE = "[ERRORCODE]";

    public String processUrl(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str.replace("[ERRORCODE]", str2);
    }
}
