package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class s3 extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f115673d = {ub.a(s3.class, POBCoreNativeConstants.NATIVE_CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f115674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ol3 f115675b = xp2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r83 f115676c = new r83();

    public s3(Context context) {
        this.f115674a = hk2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        gk2 gk2Var = this.f115674a;
        KProperty kProperty = f115673d[0];
        Object obj = (Context) gk2Var.f111244a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        gk2 gk2Var = this.f115674a;
        KProperty kProperty = f115673d[0];
        Object obj = (Context) gk2Var.f111244a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f115675b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r11) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return r9.f115676c.a(r10.getContext(), r11);
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 4
            r3 = 0
            if (r11 == 0) goto L5a
            int r4 = r11.length()
            if (r4 <= 0) goto L5a
            int r4 = r11.length()
            if (r4 != 0) goto L13
            goto L49
        L13:
            kotlin.text.Regex r4 = new kotlin.text.Regex
            java.lang.String r5 = "http(s?)://"
            r4.<init>(r5)
            java.lang.String r5 = ""
            java.lang.String r4 = r4.i(r11, r5)
            yads.n83 r5 = yads.o83.f114219c
            r5.getClass()
            yads.o83[] r5 = new yads.o83[r2]
            yads.o83 r6 = yads.o83.f114220d
            r5[r3] = r6
            yads.o83 r6 = yads.o83.f114221e
            r5[r1] = r6
            yads.o83 r6 = yads.o83.f114222f
            r5[r0] = r6
            yads.o83 r6 = yads.o83.f114223g
            r7 = 3
            r5[r7] = r6
            r6 = r3
        L39:
            if (r6 >= r2) goto L49
            r7 = r5[r6]
            java.lang.String r7 = r7.f114225b
            r8 = 0
            boolean r7 = kotlin.text.StringsKt.a0(r4, r7, r3, r0, r8)
            if (r7 == 0) goto L47
            goto L4f
        L47:
            int r6 = r6 + r1
            goto L39
        L49:
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r11)
            if (r0 != 0) goto L5a
        L4f:
            yads.r83 r0 = r9.f115676c
            android.content.Context r10 = r10.getContext()
            boolean r10 = r0.a(r10, r11)
            return r10
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.s3.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
