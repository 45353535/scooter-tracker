package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.j0;
import com.applovin.impl.m8;

/* JADX INFO: loaded from: classes6.dex */
public class l extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8356c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, m8 m8Var, Context context) {
        super(context);
        this.f8356c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.I0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (bVar.D0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(m8Var);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f8356c, str, "text/html", null, "");
    }
}
