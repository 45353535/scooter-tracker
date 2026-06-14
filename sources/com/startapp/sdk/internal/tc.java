package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tc {
    public static void a(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        vi.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(li.b(context, i10)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        vi.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(li.b(context, i10)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        vi.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }
}
