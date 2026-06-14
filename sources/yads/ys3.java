package yads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class ys3 extends ia {
    public ys3(WebView webView, String str) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
