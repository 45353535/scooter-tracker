package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4240b4;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CookieManager f64749a;

    public static void a(HttpURLConnection httpURLConnection, String str) {
        Map<String, List<String>> map;
        List<String> list;
        CookieManager cookieManager = f64749a;
        if (cookieManager == null || (map = cookieManager.get(URI.create(str), httpURLConnection.getRequestProperties())) == null || map.size() <= 0 || (list = map.get(HttpHeaders.COOKIE)) == null || list.size() <= 0) {
            return;
        }
        httpURLConnection.addRequestProperty(HttpHeaders.COOKIE, TextUtils.join(C4240b4.j.f42668b, list));
    }
}
