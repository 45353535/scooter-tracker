package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mobilefuse.sdk.device.UserAgentInfo;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes11.dex */
public final class al implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f64287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f64290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7 f64291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f3 f64292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f64293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f64294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f64295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f64296j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Lazy f64297k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedList f64298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile String f64299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f64300n;

    static {
        Intrinsics.checkNotNullExpressionValue(al.class.getSimpleName(), "getSimpleName(...)");
    }

    public al(Context context, lb prefs, lb threadPool, lb uiExecutor, lb looperIdleDetector, k7 metadataHolder, f3 clock) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(threadPool, "threadPool");
        Intrinsics.checkNotNullParameter(uiExecutor, "uiExecutor");
        Intrinsics.checkNotNullParameter(looperIdleDetector, "looperIdleDetector");
        Intrinsics.checkNotNullParameter(metadataHolder, "metadataHolder");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f64287a = prefs;
        this.f64288b = threadPool;
        this.f64289c = uiExecutor;
        this.f64290d = looperIdleDetector;
        this.f64291e = metadataHolder;
        this.f64292f = clock;
        if (Build.VERSION.SDK_INT >= 31 && !context.isUiContext()) {
            context = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
            Intrinsics.checkNotNull(context);
        }
        this.f64293g = context;
        this.f64294h = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.nl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return al.b(this.f64972b);
            }
        });
        this.f64295i = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.ol
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(al.j(this.f65054b));
            }
        });
        this.f64296j = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return al.c(this.f65124b);
            }
        });
        this.f64297k = lf.i.a(new Function0() { // from class: com.startapp.sdk.internal.el
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(al.e(this.f64467b));
            }
        });
        this.f64298l = new LinkedList();
        this.f64300n = true;
    }

    public static final WvfMetadata b(al this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (WvfMetadata) this$0.f64291e.a();
    }

    public static final String c(al this$0) {
        WeightedChoice weightedChoiceB;
        String strA;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f64294h.getValue();
        return (wvfMetadata == null || (weightedChoiceB = wvfMetadata.b()) == null || (strA = weightedChoiceB.a()) == null) ? "default" : strA;
    }

    public static final long e(al this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f64294h.getValue();
        return Math.min(Math.max(60000L, wvfMetadata != null ? wvfMetadata.d() : UserAgentInfo.USER_AGENT_MAX_VALIDITY_TIME_MILLIS), 31536000000L);
    }

    public static final void g(final al this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getClass();
        try {
            if (this$0.f64292f.a() < ((vf) this$0.f64287a.a()).getLong("06202469550e108e", 0L) + ((Number) this$0.f64297k.getValue()).longValue()) {
                String string = ((vf) this$0.f64287a.a()).getString("5b47fb537d32a117", null);
                String strC = string != null ? vi.c(string) : null;
                if (strC != null && !StringsKt.y0(strC)) {
                    this$0.f64299m = strC;
                }
            }
        } catch (Throwable th2) {
            if (this$0.a(4096)) {
                g9.a(th2);
            }
        }
        ((m8) this$0.f64289c.a()).f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.kl
            @Override // java.lang.Runnable
            public final void run() {
                this.f64836b.f();
            }
        });
    }

    public static final boolean j(al this$0) {
        EnabledConfig enabledConfigE;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WvfMetadata wvfMetadata = (WvfMetadata) this$0.f64294h.getValue();
        if (wvfMetadata == null || (enabledConfigE = wvfMetadata.e()) == null) {
            return false;
        }
        return enabledConfigE.a(this$0.f64292f);
    }

    public final boolean a(int i10) {
        ComponentInfoEventConfig componentInfoEventConfigA;
        WvfMetadata wvfMetadata = (WvfMetadata) this.f64294h.getValue();
        if (wvfMetadata == null || (componentInfoEventConfigA = wvfMetadata.a()) == null) {
            return false;
        }
        return componentInfoEventConfigA.a(i10);
    }

    public final void d() {
        try {
            if (!this.f64298l.isEmpty()) {
                if (!this.f64300n) {
                    return;
                }
                String str = this.f64299m;
                if (str != null && !StringsKt.y0(str)) {
                    return;
                }
            }
            gc gcVar = (gc) this.f64290d.a();
            Runnable runnable = new Runnable() { // from class: com.startapp.sdk.internal.ll
                @Override // java.lang.Runnable
                public final void run() {
                    al.a(this.f64897b);
                }
            };
            synchronized (gcVar) {
                if (gcVar.f64565c != null) {
                    return;
                }
                Thread thread = new Thread(new fc(gcVar, runnable), "startapp-lid-" + gc.f64562g.incrementAndGet());
                gcVar.f64565c = thread;
                thread.start();
            }
        } catch (Throwable th2) {
            if (a(256)) {
                g9.a(th2);
            }
        }
    }

    public final void f() {
        try {
            if (this.f64300n) {
                String str = this.f64299m;
                if (str != null && !StringsKt.y0(str)) {
                    return;
                }
                this.f64300n = false;
                String str2 = (String) this.f64296j.getValue();
                if (Intrinsics.areEqual(str2, "default")) {
                    e();
                } else if (Intrinsics.areEqual(str2, "headers")) {
                    a(c());
                }
            }
        } catch (Throwable th2) {
            if (a(8192)) {
                g9.a(th2);
            }
        }
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
        try {
            String str = this.f64299m;
            boolean z10 = str == null || StringsKt.y0(str);
            if (z10) {
                ((Executor) this.f64288b.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.hl
                    @Override // java.lang.Runnable
                    public final void run() {
                        al.g(this.f64655b);
                    }
                });
            }
            if (((Boolean) this.f64295i.getValue()).booleanValue()) {
                ((m8) this.f64289c.a()).f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.il
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64735b.d();
                    }
                });
            } else {
                if (z10) {
                    return;
                }
                ((m8) this.f64289c.a()).f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.jl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64805b.f();
                    }
                });
            }
        } catch (Throwable th2) {
            if (a(16384)) {
                g9.a(th2);
            }
        }
    }

    @Override // com.startapp.sdk.internal.tk
    public final String a() {
        String str = this.f64299m;
        if (str != null) {
            if (StringsKt.y0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String property = System.getProperty("http.agent");
        if (property == null || StringsKt.y0(property)) {
            return null;
        }
        return property;
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        WebView webView = (WebView) this.f64298l.poll();
        if (webView == null) {
            webView = new WebView(this.f64293g);
            webView.setWebViewClient(new sk());
        }
        if (((Boolean) this.f64295i.getValue()).booleanValue()) {
            d();
        }
        return webView;
    }

    public final void e() {
        try {
            ((Executor) this.f64288b.a()).execute(new Runnable() { // from class: com.startapp.sdk.internal.fl
                @Override // java.lang.Runnable
                public final void run() {
                    al.d(this.f64524b);
                }
            });
            Unit unit = Unit.f93236a;
        } catch (Throwable th2) {
            if (a(8)) {
                g9.a(th2);
            }
        }
    }

    public final void a(String str) {
        if (str != null) {
            try {
                String strG = vi.g(str);
                if (strG != null) {
                    uf ufVarEdit = ((vf) this.f64287a.a()).edit();
                    ufVarEdit.a("5b47fb537d32a117", strG);
                    ufVarEdit.f65346a.putString("5b47fb537d32a117", strG);
                    long jA = this.f64292f.a();
                    ufVarEdit.a("06202469550e108e", Long.valueOf(jA));
                    ufVarEdit.f65346a.putLong("06202469550e108e", jA);
                    ufVarEdit.f65346a.commit();
                }
            } catch (IOException e10) {
                if (a(2048)) {
                    g9.a(e10);
                }
            }
        }
    }

    public static final void b(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        String strA = vi.a();
        Intrinsics.checkNotNullExpressionValue(strA, "cipherVigenere(...)");
        webView.loadUrl(strA);
    }

    public static final void d(al alVar) {
        alVar.getClass();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(alVar.f64293g);
            if (defaultUserAgent != null) {
                if (!StringsKt.y0(defaultUserAgent)) {
                    alVar.f64299m = defaultUserAgent;
                }
                alVar.a(defaultUserAgent);
            }
        } catch (Throwable th2) {
            if (alVar.a(16)) {
                g9.a(th2);
            }
        }
    }

    public static final void a(al alVar) {
        WebView webView;
        alVar.getClass();
        try {
            if (alVar.f64298l.isEmpty()) {
                try {
                    webView = new WebView(alVar.f64293g);
                    webView.setWebViewClient(new sk());
                } catch (Throwable th2) {
                    if (alVar.a(2)) {
                        g9.a(th2);
                    }
                    webView = null;
                }
                if (webView != null) {
                    alVar.f64298l.add(webView);
                    alVar.d();
                    return;
                }
                return;
            }
            alVar.f();
        } catch (Throwable th3) {
            if (alVar.a(1024)) {
                g9.a(th3);
            }
        }
    }

    public final void a(final WebView webView) {
        try {
            webView.setWebViewClient(new zk(this));
            m8 m8Var = (m8) this.f64289c.a();
            m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.ml
                @Override // java.lang.Runnable
                public final void run() {
                    al.b(webView);
                }
            });
            Unit unit = Unit.f93236a;
        } catch (Throwable th2) {
            if (a(32)) {
                g9.a(th2);
            }
        }
    }

    public static final void a(WebView webView, al this$0) {
        Intrinsics.checkNotNullParameter(webView, "$webView");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        webView.setWebViewClient(new sk());
        this$0.f64298l.add(webView);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final android.webkit.WebView r2, android.webkit.WebResourceRequest r3) {
        /*
            r1 = this;
            java.lang.String r0 = "webView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L2d
            java.util.Map r3 = r3.getRequestHeaders()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L2d
            java.lang.String r0 = "User-Agent"
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L2d
            boolean r0 = kotlin.text.StringsKt.y0(r3)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L2e
            goto L2d
        L1e:
            r3 = move-exception
            r0 = 128(0x80, float:1.8E-43)
            boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            com.startapp.sdk.internal.g9.a(r3)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r2 = move-exception
            goto L51
        L2d:
            r3 = 0
        L2e:
            if (r3 == 0) goto L39
            boolean r0 = kotlin.text.StringsKt.y0(r3)     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L37
            goto L39
        L37:
            r1.f64299m = r3     // Catch: java.lang.Throwable -> L2b
        L39:
            r1.a(r3)     // Catch: java.lang.Throwable -> L2b
            com.startapp.sdk.internal.lb r3 = r1.f64289c     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r3.a()     // Catch: java.lang.Throwable -> L2b
            com.startapp.sdk.internal.m8 r3 = (com.startapp.sdk.internal.m8) r3     // Catch: java.lang.Throwable -> L2b
            com.startapp.sdk.internal.gl r0 = new com.startapp.sdk.internal.gl     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r2 = r3.f64912a     // Catch: java.lang.Throwable -> L2b
            r2.post(r0)     // Catch: java.lang.Throwable -> L2b
            kotlin.Unit r2 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L2b
            goto L5c
        L51:
            r3 = 64
            boolean r3 = r1.a(r3)
            if (r3 == 0) goto L5c
            com.startapp.sdk.internal.g9.a(r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.al.a(android.webkit.WebView, android.webkit.WebResourceRequest):void");
    }
}
