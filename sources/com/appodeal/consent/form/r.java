package com.appodeal.consent.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.OnConsentFormDismissedListener;
import eg.e1;
import eg.o0;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements ConsentForm, ConsentFormBridge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.appodeal.consent.cache.i f15450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f15451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f15452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f15453d;

    public r(com.appodeal.consent.cache.i privacyPreferences) {
        Intrinsics.checkNotNullParameter(privacyPreferences, "privacyPreferences");
        this.f15450a = privacyPreferences;
        e1 e1VarW = o0.c().w();
        this.f15451b = e1VarW;
        this.f15452c = kotlinx.coroutines.i.a(e1VarW);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.appodeal.consent.form.r r4, android.webkit.WebView r5, java.lang.String r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.appodeal.consent.form.c
            if (r0 == 0) goto L16
            r0 = r7
            com.appodeal.consent.form.c r0 = (com.appodeal.consent.form.c) r0
            int r1 = r0.f15412t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15412t = r1
            goto L1b
        L16:
            com.appodeal.consent.form.c r0 = new com.appodeal.consent.form.c
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f15410r
            java.lang.Object r7 = pf.b.g()
            int r1 = r0.f15412t
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            kotlin.d.b(r4)
            goto L6c
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.d.b(r4)
            r0.f15412t = r2
            kotlinx.coroutines.e r4 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r1 = pf.b.d(r0)
            r4.<init>(r1, r2)
            r4.I()
            java.lang.String r1 = "[WebView] - loadData"
            r2 = 0
            com.appodeal.consent.logger.a.b(r1, r2)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r1.<init>(r2)
            com.appodeal.consent.form.d r2 = new com.appodeal.consent.form.d
            r2.<init>(r1, r6, r4)
            r5.setWebViewClient(r2)
            r5.loadUrl(r6)
            java.lang.Object r4 = r4.C()
            java.lang.Object r5 = pf.b.g()
            if (r4 != r5) goto L69
            kotlin.coroutines.jvm.internal.g.c(r0)
        L69:
            if (r4 != r7) goto L6c
            return r7
        L6c:
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.l()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.form.r.c(com.appodeal.consent.form.r, android.webkit.WebView, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public static void d(WebView webView) {
        com.appodeal.consent.logger.a.b("[WebView] - dismiss", null);
        webView.clearCache(true);
        webView.clearHistory();
        CookieManager.getInstance().removeAllCookies(null);
        webView.clearFormData();
        webView.destroy();
    }

    public static final void e(r rVar) {
        WebView webView = rVar.f15453d;
        if (webView != null) {
            d(webView);
        }
        rVar.f15453d = null;
    }

    public static final void f(r rVar, WebView webView) {
        rVar.getClass();
        com.appodeal.consent.logger.a.b("[WebView] - init", null);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "getSettings(...)");
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, false);
        WebView.setWebContentsDebuggingEnabled((webView.getContext().getApplicationInfo().flags & 2) != 0);
        webView.addJavascriptInterface(rVar, "cmphandler");
    }

    public static final void g(String str) {
        com.appodeal.consent.logger.a.b("[WebView] - setApp, result: " + str, null);
    }

    public static boolean h(Context context, WebResourceRequest webResourceRequest) {
        Uri url;
        if (webResourceRequest != null) {
            try {
                url = webResourceRequest.getUrl();
            } catch (Exception e10) {
                com.appodeal.consent.logger.a.b("[WebView] - handleUrl", e10);
                return false;
            }
        } else {
            url = null;
        }
        String strValueOf = String.valueOf(url);
        com.appodeal.consent.logger.a.b("[WebView] - handleUrl: " + strValueOf, null);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strValueOf));
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    public static void j(WebView webView) {
        PackageManager packageManager = webView.getContext().getPackageManager();
        ApplicationInfo applicationInfo = webView.getContext().getApplicationInfo();
        String string = applicationInfo.loadLabel(packageManager).toString();
        String str = packageManager.getPackageInfo(webView.getContext().getPackageName(), 0).versionName;
        Intrinsics.checkNotNull(packageManager);
        Intrinsics.checkNotNull(applicationInfo);
        Drawable applicationIcon = packageManager.getApplicationIcon(applicationInfo);
        Intrinsics.checkNotNullExpressionValue(applicationIcon, "getApplicationIcon(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        String str2 = "window.cmp.setApp('" + string + "', '" + str + "', '" + ("data:image/png;base64," + Base64.encodeToString(byteArray, 2)) + "')";
        com.appodeal.consent.logger.a.b("[WebView] - setApp: " + str2, null);
        webView.evaluateJavascript(str2, new ValueCallback() { // from class: com.appodeal.consent.form.n
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                r.g((String) obj);
            }
        });
    }

    public static final void l(String str) {
        com.appodeal.consent.logger.a.b("[WebView] - setConsent, result: " + str, null);
    }

    public static void n(WebView webView) {
        com.appodeal.consent.logger.a.b("[WebView] - setNativeBridge: (function(){function a(a){c.onLog?c.onLog(\"[CMP-Bridge]\",a):console.error(\"onLog handler not found in messageHandlers\")}console.log(\"Install bridge\");var b=window.cmp,c=window.cmphandler;b&&c?(b.onUpdateConsent=function(a,b){console.log(\"onUpdateConsent called with tcf: \"+a+\" and consent: \"+b),c.onUpdateConsent?c.onUpdateConsent(a,JSON.stringify(b)):console.error(\"onUpdateConsent handler not found in messageHandlers\")},b.onException=function(a){c.onException?c.onException(a+\"\"):console.error(\"onException handler not found in messageHandlers\")},c.show=function(){b.show?b.show().then(function(a){console.log(\"onConsentFormDismissed called with result: \"+a),c.onConsentFormDismissed&&c.onConsentFormDismissed(a)}).catch(function(a){console.log(\"onConsentFormDismissed called with: \"+a),c.onException&&c.onException(\"Consent form finished with: \"+a)}):console.error(\"show method not found in consentManagerPlatform\")}):console.error(\"cmp or cmphandler not found\");const d={};d.log=console.log,d.error=console.error,d.warn=console.warn,d.info=console.info,d.debug=console.debug,console.log=function(b){d.log(b),a(b)},console.error=function(b){d.error(b),a(b)},console.warn=function(b){d.warn(b),a(b)},console.info=function(b){d.info(b),a(b)},console.debug=function(b){d.debug(b),a(b)}})();", null);
        webView.evaluateJavascript("(function(){function a(a){c.onLog?c.onLog(\"[CMP-Bridge]\",a):console.error(\"onLog handler not found in messageHandlers\")}console.log(\"Install bridge\");var b=window.cmp,c=window.cmphandler;b&&c?(b.onUpdateConsent=function(a,b){console.log(\"onUpdateConsent called with tcf: \"+a+\" and consent: \"+b),c.onUpdateConsent?c.onUpdateConsent(a,JSON.stringify(b)):console.error(\"onUpdateConsent handler not found in messageHandlers\")},b.onException=function(a){c.onException?c.onException(a+\"\"):console.error(\"onException handler not found in messageHandlers\")},c.show=function(){b.show?b.show().then(function(a){console.log(\"onConsentFormDismissed called with result: \"+a),c.onConsentFormDismissed&&c.onConsentFormDismissed(a)}).catch(function(a){console.log(\"onConsentFormDismissed called with: \"+a),c.onException&&c.onException(\"Consent form finished with: \"+a)}):console.error(\"show method not found in consentManagerPlatform\")}):console.error(\"cmp or cmphandler not found\");const d={};d.log=console.log,d.error=console.error,d.warn=console.warn,d.info=console.info,d.debug=console.debug,console.log=function(b){d.log(b),a(b)},console.error=function(b){d.error(b),a(b)},console.warn=function(b){d.warn(b),a(b)},console.info=function(b){d.info(b),a(b)},console.debug=function(b){d.debug(b),a(b)}})();", new ValueCallback() { // from class: com.appodeal.consent.form.p
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                r.o((String) obj);
            }
        });
    }

    public static final void o(String str) {
        com.appodeal.consent.logger.a.b("[WebView] - setNativeBridge, result: " + str, null);
    }

    public static final void q(String str) {
        com.appodeal.consent.logger.a.b("[WebView] - show, result: " + str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, java.lang.String r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.appodeal.consent.form.i
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.consent.form.i r0 = (com.appodeal.consent.form.i) r0
            int r1 = r0.f15428t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15428t = r1
            goto L18
        L13:
            com.appodeal.consent.form.i r0 = new com.appodeal.consent.form.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f15426r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15428t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            eg.e1 r8 = r5.f15451b
            com.appodeal.consent.form.j r2 = new com.appodeal.consent.form.j
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.f15428t = r3
            java.lang.Object r8 = eg.g.g(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r6 = r8.l()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.form.r.a(android.content.Context, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r14 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0090 -> B:27:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.webkit.WebView r12, com.appodeal.consent.cache.i r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.form.r.b(android.webkit.WebView, com.appodeal.consent.cache.i, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.appodeal.consent.form.ConsentFormBridge
    @JavascriptInterface
    public void onConsentFormDismissed(boolean z10) {
        eg.i.d(this.f15452c, null, null, new e(z10, this, null), 3, null);
    }

    @Override // com.appodeal.consent.form.ConsentFormBridge
    @JavascriptInterface
    public void onException(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        eg.i.d(this.f15452c, null, null, new f(message, this, null), 3, null);
    }

    @Override // com.appodeal.consent.form.ConsentFormBridge
    @JavascriptInterface
    public void onLog(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        eg.i.d(this.f15452c, null, null, new g(tag, message, null), 3, null);
    }

    @Override // com.appodeal.consent.form.ConsentFormBridge
    @JavascriptInterface
    public void onUpdateConsent(@NotNull String tcf, @NotNull String consent) {
        Intrinsics.checkNotNullParameter(tcf, "tcf");
        Intrinsics.checkNotNullParameter(consent, "consent");
        eg.i.d(this.f15452c, null, null, new h(tcf, consent, this, null), 3, null);
    }

    public final void p(WebView webView) {
        com.appodeal.consent.logger.a.b("[WebView] - show: window.cmphandler.show()", null);
        webView.evaluateJavascript("window.cmphandler.show()", new ValueCallback() { // from class: com.appodeal.consent.form.q
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                r.q((String) obj);
            }
        });
        webView.setWebViewClient(new m(this, webView));
    }

    @Override // com.appodeal.consent.ConsentForm
    public final void show(Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        eg.i.d(this.f15452c, null, null, new l(this, activity, onConsentFormDismissedListener, null), 3, null);
    }
}
