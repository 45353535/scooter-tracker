package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements com.fyber.inneractive.sdk.ignite.r {
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebView f24050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.ignite.h f24051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.ignite.m f24053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.v f24057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t0 f24058i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f24060k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f24062m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f24064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n0 f24065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f24066q;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24059j = "invalid_task_id";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24061l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f24063n = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24067r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f24068s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicInteger f24069t = new AtomicInteger(0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f24070u = new AtomicBoolean(false);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicBoolean f24071v = new AtomicBoolean(false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24072w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24073x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f24074y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24075z = false;
    public boolean A = false;
    public boolean C = false;
    public boolean D = false;
    public final m0 E = new m0(this);

    public v0(w0 w0Var) {
        this.f24052c = w0Var.f24077a;
        this.f24053d = w0Var.f24078b;
        this.f24054e = w0Var.f24079c;
        this.f24062m = w0Var.f24080d;
        this.f24055f = w0Var.f24081e;
        this.f24056g = w0Var.f24082f;
        this.f24057h = w0Var.f24083g;
        com.fyber.inneractive.sdk.ignite.h hVar = IAConfigManager.O.E;
        this.f24051b = hVar;
        hVar.f21076h.add(this);
        this.f24050a = new WebView(com.fyber.inneractive.sdk.util.o.f23888a);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        if (str == null || str2 == null || !str2.equals(this.f24052c)) {
            return;
        }
        this.f24059j = str;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        this.f24075z = false;
        this.A = true;
        if (this.f24059j.equals(str)) {
            this.f24051b.m();
            d("onInstallationSuccess();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.f24071v.get() && str != null) {
            if (str.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a())) {
                if (this.f24069t.getAndIncrement() < 2) {
                    this.f24051b.a(new q0(this));
                    return;
                }
                com.fyber.inneractive.sdk.ignite.h hVar = this.f24051b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f21084p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f21070b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f24051b;
                    if (hVar2.f21077i || (vVar = this.f24057h) == null) {
                        return;
                    }
                    hVar2.f21077i = true;
                    vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                }
            }
        }
    }

    public final void d(String str) {
        com.fyber.inneractive.sdk.util.r.f23896b.post(new o0(this, str));
    }

    public final void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24060k = str;
        WebSettings settings = this.f24050a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        this.f24050a.setInitialScale(1);
        this.f24050a.setBackgroundColor(-1);
        this.f24050a.setWebViewClient(this.E);
        WebView webView = this.f24050a;
        webView.setLongClickable(false);
        webView.setOnLongClickListener(new com.fyber.inneractive.sdk.util.p0());
        this.f24050a.addJavascriptInterface(new u0(this), "nativeInterface");
        this.f24050a.loadUrl(str);
        com.fyber.inneractive.sdk.config.global.r rVar = this.f24062m;
        if (rVar != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Integer numA = ((com.fyber.inneractive.sdk.config.global.features.q) rVar.a(com.fyber.inneractive.sdk.config.global.features.q.class)).a("load_timeout");
            int i10 = 10;
            int iIntValue = numA != null ? numA.intValue() : 10;
            if (iIntValue < 30 && iIntValue > 2) {
                i10 = iIntValue;
            }
            long millis = timeUnit.toMillis(i10);
            this.f24063n = millis;
            IAlog.a("InternalStoreWebpageController: Starting load timeout with %d", Long.valueOf(millis));
        }
        this.f24064o = System.currentTimeMillis();
        n0 n0Var = new n0(this);
        this.f24065p = n0Var;
        com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(n0Var, this.f24063n);
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        this.f24075z = true;
        if (this.f24059j.equals(str)) {
            this.f24051b.m();
            d("onInstallStart();");
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        if (this.f24059j.equals(str)) {
            if (i10 == 0) {
                d(String.format("onDownloadProgress(%f);", Double.valueOf(d10)));
            } else {
                if (i10 != 1) {
                    return;
                }
                d("onInstallationProgress();");
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        com.fyber.inneractive.sdk.flow.v vVar;
        IIgniteServiceAPI iIgniteServiceAPI;
        if (this.D) {
            this.f24075z = false;
            if (this.f24059j.equals(str)) {
                this.f24051b.m();
                if (!this.f24071v.get() && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str2) && str2.equals("App already installed")) {
                    d("onInstallationSuccess();");
                    this.A = true;
                    return;
                }
            }
            if ((str2 != null && (str2.equals(com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED.a()) || str2.equals(com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED.a()))) || !this.f24051b.n()) {
                if (this.f24069t.getAndIncrement() < 2) {
                    this.f24051b.a(new p0(this, str2, str3));
                    return;
                }
                this.f24051b.m();
                d("onInstallationFailed();");
                com.fyber.inneractive.sdk.ignite.h hVar = this.f24051b;
                com.fyber.inneractive.sdk.ignite.l lVar = hVar.f21084p;
                if (lVar == null || !lVar.isConnected() || (iIgniteServiceAPI = hVar.f21070b) == null || !iIgniteServiceAPI.asBinder().isBinderAlive()) {
                    com.fyber.inneractive.sdk.ignite.j jVar = com.fyber.inneractive.sdk.ignite.j.FAILED_TO_BIND_SERVICE;
                    com.fyber.inneractive.sdk.ignite.h hVar2 = this.f24051b;
                    if (!hVar2.f21077i && (vVar = this.f24057h) != null) {
                        hVar2.f21077i = true;
                        vVar.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_START, null, jVar.a(), null);
                    }
                }
            } else if (!TextUtils.equals(str2, com.fyber.inneractive.sdk.ignite.j.DOWNLOAD_IS_CANCELLED.a())) {
                this.f24051b.m();
                d("onInstallationFailed();");
            }
            com.fyber.inneractive.sdk.ignite.m mVar = this.f24053d;
            if (mVar != null) {
                this.f24057h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, str2, str3, mVar);
            }
        }
    }
}
