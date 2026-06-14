package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes8.dex */
public final class zzda {

    @GuardedBy("WebViewUtil.class")
    private static Boolean zza;

    private zzda() {
    }

    public static void zza(WebView webView, String str) {
        boolean zBooleanValue;
        synchronized (zzda.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
                zBooleanValue = zza.booleanValue();
            } else {
                zBooleanValue = zza.booleanValue();
            }
        }
        if (zBooleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
