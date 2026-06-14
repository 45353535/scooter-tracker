package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.D5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class e0 {
    public static final void a(WebView webView, String data) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        webView.loadDataWithBaseURL("https://appassets.androidplatform.net", data, "text/html", D5.N, null);
    }
}
