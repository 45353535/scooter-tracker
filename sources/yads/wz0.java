package yads;

import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public class wz0 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xz0 f117650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ml3 f117651b;

    public /* synthetic */ wz0(xz0 xz0Var) {
        this(xz0Var, xp2.b());
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f117650a.a();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.f117650a.a(i10);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (((ol3) this.f117651b).a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        } else {
            this.f117650a.a(-11);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f117650a.a(webView.getContext(), str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f117650a.a(webResourceError.getErrorCode());
    }

    public wz0(xz0 xz0Var, ml3 ml3Var) {
        this.f117650a = xz0Var;
        this.f117651b = ml3Var;
    }
}
