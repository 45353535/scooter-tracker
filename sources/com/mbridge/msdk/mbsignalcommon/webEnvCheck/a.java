package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Boolean f49783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f49784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Boolean f49785c;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    class RunnableC0544a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f49786a;

        RunnableC0544a(Context context) {
            this.f49786a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.f49783a == null) {
                try {
                    Boolean unused = a.f49783a = Boolean.valueOf(a.a(this.f49786a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.f49783a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVarB;
        try {
            gVarB = h.b().b(c.n().b());
        } catch (Exception unused) {
            gVarB = null;
        }
        if (gVarB != null) {
            f49785c = Boolean.valueOf(gVarB.D0());
        } else {
            f49785c = Boolean.FALSE;
        }
        Boolean bool = f49785c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f49783a == null) {
                try {
                    f49783a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    f49783a = Boolean.FALSE;
                }
            }
            if (f49783a == null) {
                f49783a = new Boolean(false);
            }
            return f49783a.booleanValue();
        }
        if (f49783a == null && f49784b == null) {
            f49784b = new Handler(Looper.getMainLooper());
            f49784b.post(new RunnableC0544a(context));
        }
        if (f49783a == null) {
            return true;
        }
        return f49783a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e10);
            }
        }
    }
}
