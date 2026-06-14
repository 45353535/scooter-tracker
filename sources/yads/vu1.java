package yads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class vu1 extends wz0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f117206c;

    public vu1(hu1 hu1Var) {
        super(hu1Var);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String str = this.f117206c;
        if (str == null || str.length() <= 0 || (url = webResourceRequest.getUrl()) == null || !Intrinsics.areEqual("mraid.js", url.getLastPathSegment())) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }
}
