package com.ironsource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C4240b4;
import com.ironsource.H8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4430m8 implements H8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f43699g = "loadWithUrl | webView is not null";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f43700h = "m8";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f43701i = "file://";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f43704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C4396k8 f43705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4312f8 f43706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f43707f;

    /* JADX INFO: renamed from: com.ironsource.m8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f43709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f43710c;

        a(String str, JSONObject jSONObject, String str2) {
            this.f43708a = str;
            this.f43709b = jSONObject;
            this.f43710c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4430m8.this.f43704c != null) {
                C4618x8.a(Xd.f42083q, new C4533s8().a(D5.A, C4430m8.f43699g).a());
            }
            try {
                C4430m8.this.b(this.f43708a);
                C4430m8.this.f43704c.loadUrl(C4430m8.this.a(this.f43709b.getString("urlForWebView")));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4430m8.this.f43702a);
                C4430m8.this.f43705d.a(this.f43710c, jSONObject);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                C4430m8.this.b(this.f43708a, e10.getMessage());
                C4618x8.a(Xd.f42083q, new C4533s8().a(D5.A, e10.getMessage()).a());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43713b;

        b(String str, String str2) {
            this.f43712a = str;
            this.f43713b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebView webView = C4430m8.this.f43704c;
                if (webView != null) {
                    webView.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", C4430m8.this.f43702a);
                C4396k8 c4396k8 = C4430m8.this.f43705d;
                if (c4396k8 != null) {
                    c4396k8.a(this.f43712a, jSONObject);
                    C4430m8.this.f43705d.b();
                }
                C4430m8 c4430m8 = C4430m8.this;
                c4430m8.f43705d = null;
                c4430m8.f43707f = null;
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                Log.e(C4430m8.f43700h, "performCleanup | could not destroy ISNAdView webView ID: " + C4430m8.this.f43702a);
                C4618x8.a(Xd.f42084r, new C4533s8().a(D5.A, e10.getMessage()).a());
                C4430m8.this.b(this.f43713b, e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$c */
    class c implements H8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43715a;

        c(String str) {
            this.f43715a = str;
        }

        @Override // com.ironsource.H8.a
        public void a(String str) {
            Logger.i(C4430m8.f43700h, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            C4430m8.this.b(this.f43715a, str);
        }

        @Override // com.ironsource.H8.a
        public void b(String str) {
            Logger.i(C4430m8.f43700h, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) C4430m8.this.f43704c.getParent()).removeView(C4430m8.this.f43704c);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
            C4430m8.this.d();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$d */
    private class d extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(C4430m8.this.new d());
            webView2.setWebViewClient(new e());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        private d() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m8$e */
    private class e extends WebViewClient {
        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(C4430m8.f43700h, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Context context = webView.getContext();
            Intent intentA = new OpenUrlActivity.e(new k.c()).a(str).b(false).a(context);
            intentA.addFlags(268435456);
            context.startActivity(intentA);
            return true;
        }

        private e() {
        }
    }

    public C4430m8(InterfaceC4363i8 interfaceC4363i8, Context context, String str, C4312f8 c4312f8) {
        this.f43707f = context;
        C4396k8 c4396k8 = new C4396k8();
        this.f43705d = c4396k8;
        c4396k8.g(str);
        this.f43702a = str;
        this.f43705d.a(interfaceC4363i8);
        this.f43706e = c4312f8;
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.f43704c;
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        this.f43705d.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        a("", "");
    }

    public String a() {
        return this.f43702a;
    }

    public C4396k8 b() {
        return this.f43705d;
    }

    public C4312f8 c() {
        return this.f43706e;
    }

    public void e(String str) {
        this.f43703b = str;
    }

    private String d(String str) {
        String strSubstring = str.substring(str.indexOf("/") + 1);
        return strSubstring.substring(strSubstring.indexOf("/"));
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.f43705d.e(str);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Logger.i(f43700h, "sendHandleGetViewVisibility fail with reason: " + e10.getMessage());
        }
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        S7.f41731a.d(new a(str2, jSONObject, str));
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        try {
            this.f43705d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            Logger.i(f43700h, "sendMessageToAd fail message: " + e10.getMessage());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface"})
    public void b(String str) {
        Logger.i(f43700h, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(this.f43707f);
        this.f43704c = webView;
        webView.addJavascriptInterface(new C4379j8(this), C4329g8.f43160e);
        this.f43704c.setWebViewClient(new C4413l8(new c(str)));
        this.f43704c.setWebChromeClient(new d());
        Ag.a(this.f43704c);
        this.f43705d.a(this.f43704c);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        if (this.f43707f == null) {
            return;
        }
        Logger.i(f43700h, "performCleanup");
        S7.f41731a.d(new b(str, str2));
    }

    private boolean c(String str) {
        return str.startsWith(".");
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, C4240b4.c.D);
            return;
        }
        Logger.i(f43700h, "trying to perform WebView Action: " + str);
        try {
            if (str.equals(C4240b4.i.f42653t0)) {
                this.f43704c.onPause();
                this.f43705d.f(str2);
            } else if (str.equals(C4240b4.i.f42655u0)) {
                this.f43704c.onResume();
                this.f43705d.f(str2);
            } else {
                b(str3, C4240b4.c.C);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            b(str3, C4240b4.c.E);
        }
    }

    public void b(String str, String str2) {
        C4396k8 c4396k8 = this.f43705d;
        if (c4396k8 != null) {
            c4396k8.a(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (!c(str)) {
            return str;
        }
        return "file://" + this.f43703b + d(str);
    }
}
