package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i implements j, com.fyber.inneractive.sdk.util.m0, l, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f23971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f23972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f23973d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f23975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j1 f23976g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f23980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f23981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f23982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f23983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f23984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f23985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f23986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InneractiveAdRequest f23987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.x f23988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f23989t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23970a = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f23977h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f23978i = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23974e = false;

    public i(boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f23980k = z10;
        this.f23971b = a(rVar);
        i1 i1Var = (i1) this;
        this.f23983n = new c(i1Var);
        this.f23982m = new d(i1Var);
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(WebView webView) {
    }

    public abstract boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    public void b(boolean z10) {
        IAlog.a("%s destroy is fatal: %b", IAlog.a(this), Boolean.valueOf(z10));
        e eVar = this.f23984o;
        if (eVar != null && !eVar.f23946a.isTerminated() && !eVar.f23946a.isShutdown()) {
            e eVar2 = this.f23984o;
            eVar2.f23951f = true;
            eVar2.f23946a.shutdownNow();
            Handler handler = eVar2.f23947b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.f23949d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.f23948c;
                if (eVar3 != null) {
                    eVar2.f23947b.removeCallbacks(eVar3);
                }
                eVar2.f23947b = null;
            }
            this.f23984o = null;
        }
        m mVar = this.f23971b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f23879a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.f23971b);
            this.f23971b.setWebChromeClient(null);
            if (f() == null) {
                this.f23971b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e eVarF = f();
                AdSession adSession = eVarF.f21120a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (Throwable unused) {
                    }
                    com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVarF), z10 ? 0 : 1000);
                    eVarF.f21120a = null;
                    eVarF.f21121b = null;
                }
            }
        }
        k0 k0Var = this.f23973d;
        if (k0Var != null) {
            k0Var.f24016e = null;
        }
        c cVar = this.f23983n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(cVar);
        }
        d dVar2 = this.f23982m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar2);
        }
        this.f23976g = null;
        if (!z10) {
            this.f23975f = null;
        }
        this.f23971b = null;
        this.f23972c = null;
        this.f23973d = null;
        this.f23988s = null;
        this.f23987r = null;
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public com.fyber.inneractive.sdk.util.g1 g() {
        m mVar = this.f23971b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        WebSettings settings = this.f23971b.getSettings();
        boolean z10 = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.O.f20311q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f23974e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        m mVar = this.f23971b;
        mVar.setHorizontalScrollBarEnabled(false);
        mVar.setHorizontalScrollbarOverlay(false);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setVerticalScrollbarOverlay(false);
        mVar.getSettings().setSupportZoom(false);
        this.f23971b.setFocusable(true);
        this.f23971b.setBackgroundColor(0);
        j0 j0Var = new j0();
        this.f23972c = j0Var;
        this.f23971b.setWebChromeClient(j0Var);
        try {
            Context context = this.f23971b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception unused) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f23971b.setListener(this);
    }

    public final void i() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        c cVar = this.f23983n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(cVar);
        }
        d dVar = this.f23982m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar);
        }
        this.f23979j = false;
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.f23988s = xVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f23987r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.f23989t = eVar;
    }

    public void setListener(j1 j1Var) {
        this.f23976g = j1Var;
    }

    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f23971b;
        if (mVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(mVar, layoutParams);
            } else {
                viewGroup.addView(mVar);
            }
            com.fyber.inneractive.sdk.util.l0.f23879a.a(viewGroup.getContext(), this.f23971b, this);
            this.f23971b.setTapListener(this);
        }
    }

    public final m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        int i10;
        int i11;
        m mVar = new m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            Boolean boolC = fVar.c("agg_res");
            zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            Integer numA = fVar.a("agg_res_ct");
            int iMax = Math.max(numA != null ? numA.intValue() : 500, 50);
            Integer numA2 = fVar.a("agg_res_rt");
            int iMax2 = Math.max(numA2 != null ? numA2.intValue() : 500, 50);
            Integer numA3 = fVar.a("agg_res_retries");
            iMax = Math.max(numA3 != null ? numA3.intValue() : 2, 1);
            i11 = iMax2;
            i10 = iMax;
        } else {
            i10 = 500;
            i11 = 500;
        }
        k0 k0Var = new k0(this, zBooleanValue, i10, i11, iMax);
        this.f23973d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        if (f10 == this.f23977h && rect.equals(this.f23978i)) {
            return;
        }
        this.f23977h = f10;
        this.f23978i.set(rect);
        m mVar = this.f23971b;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f23971b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            this.f23971b.loadUrl("chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g1VarG = g();
        if (a(str, g1VarG)) {
            return true;
        }
        a(new h(this, str, g1VarG));
        return true;
    }

    public void a(boolean z10) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z10));
        j1 j1Var = this.f23976g;
        if (j1Var != null) {
            j1Var.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        j1 j1Var = this.f23976g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    public final void a(f fVar) {
        IAlog.e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f23979j) {
            IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            fVar.d();
            i();
            return;
        }
        if (this.f23980k) {
            IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            d dVar = this.f23982m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar);
            }
            this.f23981l = fVar;
            if (this.f23982m != null) {
                com.fyber.inneractive.sdk.util.r.f23896b.postDelayed(this.f23982m, IAConfigManager.O.f20315u.f20484b.a("click_timeout", 1000, 1000));
                return;
            }
            return;
        }
        d dVar2 = this.f23982m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(dVar2);
        }
        this.f23981l = null;
        fVar.d();
    }
}
