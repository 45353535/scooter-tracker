package com.my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.common.base.Ascii;
import com.my.target.s6;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebViewClient f60182b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f60183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s6 f60184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60186f;

    public interface a {
        void a();

        void a(Uri uri);

        void a(n6 n6Var, WebView webView);

        void a(boolean z10);

        boolean a(float f10, float f11);

        boolean a(int i10, int i11, int i12, int i13, boolean z10, int i14);

        boolean a(ConsoleMessage consoleMessage, n6 n6Var);

        boolean a(String str);

        boolean a(String str, JsResult jsResult);

        boolean a(boolean z10, p6 p6Var);

        void b();

        boolean b(Uri uri);

        void c();

        boolean d();
    }

    public static class c {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int a(java.lang.String r7) {
            /*
                r0 = 53
                if (r7 != 0) goto L5
                return r0
            L5:
                int r1 = r7.hashCode()
                r2 = 1
                r3 = 2
                r4 = 3
                r5 = 5
                r6 = 4
                switch(r1) {
                    case -1364013995: goto L4e;
                    case -1314880604: goto L44;
                    case -1012429441: goto L3a;
                    case -655373719: goto L30;
                    case 1163912186: goto L26;
                    case 1288627767: goto L1c;
                    case 1755462605: goto L12;
                    default: goto L11;
                }
            L11:
                goto L58
            L12:
                java.lang.String r1 = "top-center"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = r6
                goto L59
            L1c:
                java.lang.String r1 = "bottom-center"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = r5
                goto L59
            L26:
                java.lang.String r1 = "bottom-right"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = r4
                goto L59
            L30:
                java.lang.String r1 = "bottom-left"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = r3
                goto L59
            L3a:
                java.lang.String r1 = "top-left"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = 0
                goto L59
            L44:
                java.lang.String r1 = "top-right"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = 6
                goto L59
            L4e:
                java.lang.String r1 = "center"
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L58
                r7 = r2
                goto L59
            L58:
                r7 = -1
            L59:
                if (r7 == 0) goto L75
                if (r7 == r2) goto L72
                if (r7 == r3) goto L6f
                if (r7 == r4) goto L6c
                if (r7 == r6) goto L69
                if (r7 == r5) goto L66
                return r0
            L66:
                r7 = 81
                return r7
            L69:
                r7 = 49
                return r7
            L6c:
                r7 = 85
                return r7
            L6f:
                r7 = 83
                return r7
            L72:
                r7 = 17
                return r7
            L75:
                r7 = 51
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.target.n6.c.a(java.lang.String):int");
        }
    }

    public class d extends WebChromeClient {
        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            gb.a("MraidBridge: JS console message - " + consoleMessage.message() + " - at line " + consoleMessage.lineNumber());
            n6 n6Var = n6.this;
            a aVar = n6Var.f60183c;
            return aVar != null ? aVar.a(consoleMessage, n6Var) : super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            a aVar = n6.this.f60183c;
            return aVar != null ? aVar.a(str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public n6(String str) {
        this.f60181a = str;
    }

    public static n6 b(String str) {
        return new n6(str);
    }

    public void a(r6 r6Var) {
        a("mraidbridge.setScreenSize(" + b(r6Var.d()) + ");window.mraidbridge.setMaxSize(" + b(r6Var.c()) + ");window.mraidbridge.setCurrentPosition(" + a(r6Var.a()) + ");window.mraidbridge.setDefaultPosition(" + a(r6Var.b()) + ")");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mraidbridge.fireSizeChangeEvent(");
        sb2.append(b(r6Var.a()));
        sb2.append(")");
        a(sb2.toString());
    }

    public boolean c() {
        s6 s6Var = this.f60184d;
        return s6Var != null && s6Var.h();
    }

    public void d(String str) {
        a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    public void e(String str) {
        a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    public void f(String str) {
        s6 s6Var = this.f60184d;
        if (s6Var == null) {
            gb.a("MraidBridge: MRAID bridge called setContentHtml before WebView was attached");
        } else {
            this.f60185e = false;
            s6Var.a("https://ad.mail.ru/", str, "text/html", "UTF-8", null);
        }
    }

    public class b extends y6 {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            n6.this.b();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            gb.a("MraidBridge: Error - " + str);
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            n6.this.a(Uri.parse(str));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            n6.this.a(webResourceRequest.getUrl());
            return true;
        }
    }

    public class e implements s6.a {
        public e() {
        }

        @Override // com.my.target.s6.a
        public void a(boolean z10) {
            a aVar = n6.this.f60183c;
            if (aVar != null) {
                aVar.a(z10);
            }
        }

        @Override // com.my.target.s6.a
        public void a() {
            a aVar = n6.this.f60183c;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void b() {
        s6 s6Var;
        if (this.f60185e || (s6Var = this.f60184d) == null) {
            return;
        }
        this.f60185e = true;
        a aVar = this.f60183c;
        if (aVar != null) {
            aVar.a(this, s6Var.getWebView());
        }
    }

    public final void c(String str) {
        a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    public void d() {
        a("mraidbridge.fireReadyEvent()");
    }

    public final String b(Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    public void a(ArrayList arrayList) {
        a("mraidbridge.setSupports(" + TextUtils.join(StringUtils.COMMA, arrayList) + ")");
    }

    public void a(a aVar) {
        this.f60183c = aVar;
    }

    public void a(s6 s6Var) {
        this.f60184d = s6Var;
        WebSettings settings = s6Var.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if ("interstitial".equals(this.f60181a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.f60184d.setScrollContainer(false);
        this.f60184d.setVerticalScrollBarEnabled(false);
        this.f60184d.setHorizontalScrollBarEnabled(false);
        this.f60184d.setWebViewClient(this.f60182b);
        this.f60184d.setWebChromeClient(new d());
        this.f60184d.setVisibilityChangedListener(new e());
    }

    public void a() {
        this.f60184d = null;
    }

    public void a(boolean z10) {
        if (z10 != this.f60186f) {
            a("mraidbridge.setIsViewable(" + z10 + ")");
        }
        this.f60186f = z10;
    }

    public void a(String str, String str2) {
        a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.net.Uri r5) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.n6.a(android.net.Uri):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean a(o6 o6Var, JSONObject jSONObject) throws JSONException {
        s6 s6Var;
        String string = o6Var.toString();
        if (o6Var.f60453a && (s6Var = this.f60184d) != null && !s6Var.g()) {
            a(string, "Cannot execute this command unless the user clicks");
            return false;
        }
        if (this.f60183c == null) {
            a(string, "Invalid state to execute this command");
            return false;
        }
        if (this.f60184d == null) {
            a(string, "The current WebView is being destroyed");
            return false;
        }
        string.getClass();
        byte b10 = -1;
        switch (string.hashCode()) {
            case -1910759310:
                if (string.equals("vpaidInit")) {
                    b10 = 0;
                }
                break;
            case -1886160473:
                if (string.equals("playVideo")) {
                    b10 = 1;
                }
                break;
            case -1289167206:
                if (string.equals("expand")) {
                    b10 = 2;
                }
                break;
            case -934437708:
                if (string.equals("resize")) {
                    b10 = 3;
                }
                break;
            case -733616544:
                if (string.equals("createCalendarEvent")) {
                    b10 = 4;
                }
                break;
            case 0:
                if (string.equals("")) {
                    b10 = 5;
                }
                break;
            case 3417674:
                if (string.equals("open")) {
                    b10 = 6;
                }
                break;
            case 94756344:
                if (string.equals("close")) {
                    b10 = 7;
                }
                break;
            case 133423073:
                if (string.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                    b10 = 8;
                }
                break;
            case 459238621:
                if (string.equals(MRAIDNativeFeature.STORE_PICTURE)) {
                    b10 = 9;
                }
                break;
            case 624734601:
                if (string.equals("setResizeProperties")) {
                    b10 = 10;
                }
                break;
            case 892543864:
                if (string.equals("vpaidEvent")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1797992422:
                if (string.equals("playheadEvent")) {
                    b10 = Ascii.FF;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f60183c.c();
                return true;
            case 1:
                gb.a("MraidBridge: playVideo is currently unsupported");
                return false;
            case 2:
                return this.f60183c.b(jSONObject != null ? Uri.parse(jSONObject.getString("url")) : null);
            case 3:
                return this.f60183c.d();
            case 4:
                gb.a("MraidBridge: createCalendarEvent is currently unsupported");
                return false;
            case 5:
                a(string, "Unspecified MRAID Javascript command");
                return false;
            case 6:
                if (jSONObject == null) {
                    a(string, "open params cannot be null");
                    return false;
                }
                this.f60183c.a(Uri.parse(jSONObject.getString("url")));
                return true;
            case 7:
                this.f60183c.b();
                return true;
            case 8:
                if (jSONObject == null) {
                    a(string, "setOrientationProperties params cannot be null");
                    return false;
                }
                boolean z10 = jSONObject.getBoolean("allowOrientationChange");
                String string2 = jSONObject.getString("forceOrientation");
                p6 p6VarA = p6.a(string2);
                if (p6VarA == null) {
                    a(string, "wrong orientation " + string2);
                    return false;
                }
                return this.f60183c.a(z10, p6VarA);
            case 9:
                gb.a("MraidBridge: storePicture is currently unsupported");
                return false;
            case 10:
                if (jSONObject == null) {
                    a(string, "setResizeProperties params cannot be null");
                    return false;
                }
                return this.f60183c.a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("offsetX"), jSONObject.getInt("offsetY"), jSONObject.optBoolean("allowOffscreen", false), c.a(jSONObject.optString("customClosePosition")));
            case 11:
                if (jSONObject == null) {
                    a(string, "vpaidEvent params cannot be null");
                    return false;
                }
                return this.f60183c.a(jSONObject.getString("event"));
            case 12:
                if (jSONObject == null) {
                    a(string, "playheadEvent params cannot be null");
                    return false;
                }
                return this.f60183c.a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble("duration"));
            default:
                return true;
        }
    }

    public final void a(String str) {
        if (this.f60184d == null) {
            gb.a("MraidBridge: Attempted to inject Javascript into MRAID WebView while was not attached - \n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        gb.a("MraidBridge: Injecting Javascript into MRAID WebView " + hashCode() + " - " + str2);
        this.f60184d.a(str2);
    }

    public final String a(Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }
}
