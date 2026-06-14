package com.inmobi.media;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.inmobi.media.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3692eo {
    public static WebResourceResponse a(WebResourceRequest request, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(request, "<this>");
        if (!StringsKt.N("GET", request.getMethod(), true)) {
            return null;
        }
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return a(string, interfaceC3878m9);
    }

    public static WebResourceResponse a(String urlRaw, InterfaceC3878m9 interfaceC3878m9) {
        String url;
        Intrinsics.checkNotNullParameter(urlRaw, "urlRaw");
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("IMResourceCacheManager", "shouldInterceptRequest " + urlRaw);
        }
        try {
            url = URLDecoder.decode(StringsKt.v1(urlRaw).toString(), "UTF-8");
        } catch (Exception unused) {
            url = null;
        }
        if (url == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.g0(url, "inmobicache=true", false, 2, null)) {
            return (WebResourceResponse) eg.h.b(null, new C3641co(url, interfaceC3878m9, null), 1, null);
        }
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("IMResourceCacheManager", "Cache is not enabled for URL: " + url);
        }
        return null;
    }
}
