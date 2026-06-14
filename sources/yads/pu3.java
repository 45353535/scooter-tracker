package yads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class pu3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pu3 f114791a = new pu3();

    public final void a(WebView webView, String str, Object... objArr) {
        String string;
        if (webView != null) {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("if(window.omidBridge!==undefined){omidBridge.");
            sb2.append(str);
            sb2.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        string = "null";
                    } else {
                        if (obj instanceof String) {
                            string = obj.toString();
                            if (!string.startsWith("{")) {
                                sb2.append('\"');
                                sb2.append(string);
                                sb2.append('\"');
                            }
                        } else {
                            sb2.append(obj);
                        }
                        sb2.append(StringUtils.COMMA);
                    }
                    sb2.append(string);
                    sb2.append(StringUtils.COMMA);
                }
                sb2.setLength(sb2.length() - 1);
            }
            sb2.append(")}");
            String string2 = sb2.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                a(webView, string2);
            } else {
                handler.post(new nu3(this, webView, string2));
            }
        }
    }

    public static void a(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        } catch (Exception unused2) {
        }
    }
}
