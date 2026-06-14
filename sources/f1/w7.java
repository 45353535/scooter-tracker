package f1;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w7 extends b5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zb f71438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ig f71439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f71440g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(zb impressionInterface, ig gestureDetector, v5 callback, Cif eventTracker) {
        super(callback, eventTracker, impressionInterface, (ga) rd.f70996b.a().b().get());
        Intrinsics.checkNotNullParameter(impressionInterface, "impressionInterface");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f71438e = impressionInterface;
        this.f71439f = gestureDetector;
    }

    public final ig b() {
        return this.f71439f;
    }

    public final boolean c(String str) {
        if (this.f71440g) {
            if (!this.f71439f.a()) {
                return false;
            }
            this.f71438e.f(new n2(str, Boolean.FALSE));
            this.f71439f.c();
            return true;
        }
        eg.j("Attempt to open " + str + " detected before WebView loading finished.", null, 2, null);
        this.f71438e.r(new n2(str, Boolean.FALSE));
        return true;
    }

    @Override // f1.b5, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f71440g = true;
    }

    @Override // f1.b5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String string = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return c(string);
    }

    @Override // f1.b5, android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return c(url);
    }
}
