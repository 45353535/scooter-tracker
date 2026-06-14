package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import net.pubnative.lite.sdk.utils.ViewUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PNWebView extends WebView {
    private static boolean sDeadlockCleared;

    public PNWebView(Context context) {
        this(context.getApplicationContext(), null);
    }

    private void fixWebViewDeadlock(Context context) {
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.views.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96049b.destroy();
                }
            });
            return;
        }
        ViewUtils.removeFromParent(this);
        removeAllViews();
        super.destroy();
    }

    public void enablePlugins(boolean z10) {
    }

    public void enableWebDebugging() {
        if ((getContext().getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    public PNWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        enableWebDebugging();
        enablePlugins(false);
        setWebChromeClient(new WebChromeClient() { // from class: net.pubnative.lite.sdk.views.PNWebView.1
            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
                jsResult.confirm();
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                jsPromptResult.confirm();
                return true;
            }
        });
        if (sDeadlockCleared) {
            return;
        }
        fixWebViewDeadlock(getContext());
        sDeadlockCleared = true;
    }
}
