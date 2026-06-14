package f1;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import f1.z2;

/* JADX INFO: loaded from: classes6.dex */
public class b5 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f69430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cif f69431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zb f69432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ga f69433d;

    public b5(v5 v5Var, Cif cif, zb zbVar, ga gaVar) {
        this.f69430a = v5Var;
        this.f69431b = cif;
        this.f69432c = zbVar;
        this.f69433d = gaVar;
    }

    public final void a(String str) {
        v5 v5Var = this.f69430a;
        if (v5Var != null) {
            v5Var.a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        v5 v5Var = this.f69430a;
        if (v5Var != null) {
            v5Var.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                eg.d("WebView version: " + currentWebViewPackage.versionName, null);
            } else {
                a("Device was not set up correctly.");
            }
        }
        this.f69430a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error loading ");
        sb2.append(webResourceRequest.getUrl().toString());
        sb2.append(": ");
        sb2.append(webResourceResponse == null ? "unknown error" : webResourceResponse.getReasonPhrase());
        eg.d(sb2.toString(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f69431b.mo4436e(oc.s(z2.i.f71753i, sslError.toString()));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String str;
        if (renderProcessGoneDetail.didCrash()) {
            str = "Webview crashed: " + renderProcessGoneDetail;
        } else {
            str = "Webview killed, likely due to low memory";
        }
        a(str);
        if (webView == null || !(webView.getContext() instanceof Activity)) {
            return true;
        }
        ((Activity) webView.getContext()).finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!this.f69433d.A) {
            return false;
        }
        this.f69432c.g(new n2(webResourceRequest.getUrl().toString(), Boolean.FALSE));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            a("Error loading " + webResourceRequest.getUrl().toString() + ": " + ((Object) webResourceError.getDescription()));
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!this.f69433d.A) {
            return false;
        }
        this.f69432c.g(new n2(str, Boolean.FALSE));
        return true;
    }
}
