package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(29)
public class ApiHelperForQ {
    private ApiHelperForQ() {
    }

    @Deprecated
    public static int getForceDark(@NonNull WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    @Nullable
    public static WebViewRenderProcess getWebViewRenderProcess(@NonNull WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    @Nullable
    public static WebViewRenderProcessClient getWebViewRenderProcessClient(@NonNull WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    public static void setForceDark(@NonNull WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @NonNull Executor executor, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(executor, webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }

    public static boolean terminate(@NonNull WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }

    public static void setWebViewRenderProcessClient(@NonNull WebView webView, @Nullable androidx.webkit.WebViewRenderProcessClient webViewRenderProcessClient) {
        webView.setWebViewRenderProcessClient(webViewRenderProcessClient != null ? new WebViewRenderProcessClientFrameworkAdapter(webViewRenderProcessClient) : null);
    }
}
