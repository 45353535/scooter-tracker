package com.ironsource;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class Ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40411a = "Ag";

    public static FrameLayout a(Context context, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(view);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        return frameLayout;
    }

    @SuppressLint({"NewApi"})
    private static void b(WebSettings webSettings) {
        webSettings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public static void a(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        try {
            a(settings);
            b(settings);
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            Logger.e(f40411a, "setWebSettings - " + th2.toString());
        }
    }

    private static void a(WebSettings webSettings) {
        webSettings.setDisplayZoomControls(false);
    }
}
