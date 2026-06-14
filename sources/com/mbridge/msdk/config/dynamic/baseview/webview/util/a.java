package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        return "javascript:window.WindVane." + uri.getHost() + "(" + uri.getQueryParameter(String.valueOf(array[0])) + StringUtils.COMMA + (array.length > 1 ? uri.getQueryParameter(String.valueOf(array[1])) : "") + ");";
    }
}
