package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.WeightedChoice;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class xk implements tk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f65579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f65580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f65581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k7 f65582e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f65584g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lb f65586i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f65583f = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f65585h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Runnable f65587j = new Runnable() { // from class: com.startapp.sdk.internal.gn
        @Override // java.lang.Runnable
        public final void run() {
            this.f64590b.e();
        }
    };

    public xk(Context context, lb lbVar, lb lbVar2, lb lbVar3, final k7 k7Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f65578a = context;
        } else {
            this.f65578a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, null);
        }
        this.f65579b = lbVar;
        this.f65580c = lbVar2;
        this.f65581d = lbVar3;
        this.f65582e = k7Var;
        this.f65586i = new lb(new k7() { // from class: com.startapp.sdk.internal.hn
            @Override // com.startapp.sdk.internal.k7
            public final Object a() {
                return xk.a(k7Var);
            }
        });
    }

    public final void a(String str) {
        this.f65584g = str;
    }

    @Override // com.startapp.sdk.internal.tk
    public final void b() {
        d();
    }

    @Override // com.startapp.sdk.internal.tk
    public final WebView c() {
        if (this.f65583f.isEmpty()) {
            WebView webView = new WebView(this.f65578a);
            webView.setWebViewClient(new sk());
            return webView;
        }
        if (this.f65583f.size() == 1) {
            d();
        }
        return (WebView) this.f65583f.removeFirst();
    }

    public final void d() {
        try {
            gc gcVar = (gc) this.f65581d.a();
            Runnable runnable = this.f65587j;
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

    public final void e() {
        WebView webView;
        if (!this.f65583f.isEmpty()) {
            if (this.f65585h && TextUtils.isEmpty(this.f65584g)) {
                this.f65585h = false;
                if (!"default".equals(this.f65586i.a())) {
                    if ("headers".equals(this.f65586i.a())) {
                        a((WebView) this.f65583f.removeFirst());
                        return;
                    }
                    return;
                } else {
                    try {
                        ((Executor) this.f65579b.a()).execute(new uk(this));
                        return;
                    } catch (Throwable th2) {
                        if (a(8)) {
                            g9.a(th2);
                            return;
                        }
                        return;
                    }
                }
            }
            return;
        }
        try {
            webView = new WebView(this.f65578a);
            webView.setWebViewClient(new sk());
        } catch (Throwable th3) {
            if (a(2)) {
                g9.a(th3);
            }
            webView = null;
        }
        if (webView != null) {
            try {
                this.f65583f.addLast(webView);
            } catch (Throwable th4) {
                if (a(4)) {
                    g9.a(th4);
                }
            }
            if (this.f65585h && TextUtils.isEmpty(this.f65584g)) {
                d();
            }
        }
    }

    public final void f() {
        try {
            final String defaultUserAgent = WebSettings.getDefaultUserAgent(this.f65578a);
            m8 m8Var = (m8) this.f65580c.a();
            m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.fn
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64531b.a(defaultUserAgent);
                }
            });
        } catch (Throwable th2) {
            if (a(16)) {
                g9.a(th2);
            }
        }
    }

    public static /* synthetic */ String a(k7 k7Var) {
        WvfMetadata wvfMetadata = (WvfMetadata) k7Var.a();
        WeightedChoice weightedChoiceB = wvfMetadata != null ? wvfMetadata.b() : null;
        String strA = weightedChoiceB != null ? weightedChoiceB.a() : null;
        return strA != null ? strA : "default";
    }

    public final boolean a(int i10) {
        WvfMetadata wvfMetadata = (WvfMetadata) this.f65582e.a();
        ComponentInfoEventConfig componentInfoEventConfigA = wvfMetadata != null ? wvfMetadata.a() : null;
        return componentInfoEventConfigA != null && componentInfoEventConfigA.a((long) i10);
    }

    @Override // com.startapp.sdk.internal.tk
    public final String a() {
        String str = this.f65584g;
        WeakHashMap weakHashMap = vi.f65408a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        try {
            String property = System.getProperty("http.agent");
            if (property != null) {
                if (property.length() > 0) {
                    return property;
                }
            }
            return null;
        } catch (Throwable th2) {
            if (a(1)) {
                g9.a(th2);
            }
            return null;
        }
    }

    public final void a(final WebView webView) {
        try {
            webView.setWebViewClient(new vk(this));
            final String strA = vi.a();
            m8 m8Var = (m8) this.f65580c.a();
            m8Var.f64912a.post(new Runnable() { // from class: com.startapp.sdk.internal.in
                @Override // java.lang.Runnable
                public final void run() {
                    webView.loadUrl(strA);
                }
            });
        } catch (Throwable th2) {
            if (a(32)) {
                g9.a(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.webkit.WebView r3, android.webkit.WebResourceRequest r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L2a
            java.util.Map r4 = r4.getRequestHeaders()     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2a
            java.lang.String r0 = "User-Agent"
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L1b
            java.util.WeakHashMap r0 = com.startapp.sdk.internal.vi.f65408a     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L2a
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            if (r0 <= 0) goto L2a
            goto L2b
        L1b:
            r4 = move-exception
            r0 = 128(0x80, float:1.8E-43)
            boolean r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            com.startapp.sdk.internal.g9.a(r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r3 = move-exception
            goto L3e
        L2a:
            r4 = 0
        L2b:
            com.startapp.sdk.internal.lb r0 = r2.f65580c     // Catch: java.lang.Throwable -> L28
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L28
            com.startapp.sdk.internal.m8 r0 = (com.startapp.sdk.internal.m8) r0     // Catch: java.lang.Throwable -> L28
            com.startapp.sdk.internal.wk r1 = new com.startapp.sdk.internal.wk     // Catch: java.lang.Throwable -> L28
            r1.<init>(r2, r4, r3)     // Catch: java.lang.Throwable -> L28
            android.os.Handler r3 = r0.f64912a     // Catch: java.lang.Throwable -> L28
            r3.post(r1)     // Catch: java.lang.Throwable -> L28
            goto L49
        L3e:
            r4 = 64
            boolean r4 = r2.a(r4)
            if (r4 == 0) goto L49
            com.startapp.sdk.internal.g9.a(r3)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.xk.a(android.webkit.WebView, android.webkit.WebResourceRequest):void");
    }
}
