package net.pubnative.lite.sdk.utils.browser;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class BaseWebView extends WebView {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static final String DEFAULT_MIME_TYPE = "text/html";

    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        init();
    }

    private void disableContentAccess() {
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    private void init() {
        initWebViewSettings();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void initWebViewSettings() {
        getSettings().setJavaScriptEnabled(true);
        disableContentAccess();
    }

    public void loadHtml(String str) {
        if (str != null) {
            loadDataWithBaseURL(null, str, DEFAULT_MIME_TYPE, "UTF-8", null);
        }
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        init();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context.getApplicationContext(), attributeSet, i10);
        init();
    }
}
