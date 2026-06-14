package yads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class ft3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kt3 f110911a;

    public ft3(kt3 kt3Var) {
        this.f110911a = kt3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Log.w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + webView);
        if (((WebView) this.f110911a.f111922b.get()) == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            kt3 kt3Var = this.f110911a;
            kt3Var.getClass();
            kt3Var.f111922b = new ot3(null);
        }
        webView.destroy();
        return true;
    }
}
