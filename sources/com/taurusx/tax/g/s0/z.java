package com.taurusx.tax.g.s0;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taurusx.tax.g.r0.s;
import com.taurusx.tax.g.r0.y;
import com.taurusx.tax.utils.webview.TaxBrowserActivity;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes11.dex */
public class z extends WebViewClient {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumSet<y> f66362w = EnumSet.of(y.HANDLE_PHONE_SCHEME, y.OPEN_APP_MARKET, y.OPEN_IN_APP_BROWSER, y.HANDLE_SHARE_TWEET, y.FOLLOW_DEEP_LINK_WITH_FALLBACK, y.FOLLOW_DEEP_LINK);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TaxBrowserActivity f66363z;

    /* JADX INFO: renamed from: com.taurusx.tax.g.s0.z$z, reason: collision with other inner class name */
    public class C0809z implements s.o {
        public C0809z() {
        }

        @Override // com.taurusx.tax.g.r0.s.o
        public void w(String str, y yVar) {
        }

        @Override // com.taurusx.tax.g.r0.s.o
        public void z(String str, y yVar) {
            if (yVar.equals(y.OPEN_IN_APP_BROWSER)) {
                z.this.f66363z.s().loadUrl(str);
            } else {
                z.this.f66363z.finish();
            }
        }
    }

    public z(TaxBrowserActivity taxBrowserActivity) {
        this.f66363z = taxBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new s.c().z(f66362w).w().z(new C0809z()).z().z(this.f66363z.getApplicationContext(), str, true, (Iterable<String>) null);
    }
}
