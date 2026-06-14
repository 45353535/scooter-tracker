package androidx.webkit.internal;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(26)
public class ApiHelperForO {
    private ApiHelperForO() {
    }

    @NonNull
    public static PackageInfo getCurrentWebViewPackage() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean getSafeBrowsingEnabled(@NonNull WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    @Nullable
    public static WebChromeClient getWebChromeClient(@NonNull WebView webView) {
        return webView.getWebChromeClient();
    }

    @Nullable
    public static WebViewClient getWebViewClient(@NonNull WebView webView) {
        return webView.getWebViewClient();
    }

    public static void setSafeBrowsingEnabled(@NonNull WebSettings webSettings, boolean z10) {
        webSettings.setSafeBrowsingEnabled(z10);
    }
}
