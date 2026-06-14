package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p0 extends b0 implements com.fyber.inneractive.sdk.interfaces.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f20855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f20856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v1 f20857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f20858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v1 f20859o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20862r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m0 f20866v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20860p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20861q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20863s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20864t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f20865u = new com.fyber.inneractive.sdk.util.a();

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f20855k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f20855k.getLayout().getWidth();
    }

    public abstract boolean K();

    public final void L() {
        if (this.f20856l == null) {
            long jO = O();
            this.f20862r = jO;
            this.f20856l = new l0(this, jO);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.f20862r));
            x xVar = this.f20622b;
            boolean zB = xVar != null ? b(xVar) : false;
            if (zB && !K()) {
                if (zB) {
                    com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
                    if (eVar != null) {
                        eVar.showCloseCountdown();
                    }
                    m0 m0Var = new m0(this, this.f20862r + 100);
                    this.f20866v = m0Var;
                    m0Var.start();
                    return;
                }
                return;
            }
            if (this.f20861q) {
                return;
            }
            this.f20861q = true;
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, this.f20862r);
            this.f20857m = v1Var;
            v1Var.f23920e = new n0(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f23918c = t1Var;
            v1Var.f23919d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    public abstract int M();

    public abstract int N();

    public abstract long O();

    public abstract boolean P();

    public abstract long a(long j10);

    public void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f20621a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (eVar != null) {
            this.f20855k = eVar;
        } else {
            IAlog.f("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError(LogConstants.MSG_ACTIVITY_IS_NULL);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void b(boolean z10) {
    }

    public abstract boolean b(x xVar);

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.network.w wVar;
        if (this.f20622b == null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
            wVar.f21418c = uVar;
            wVar.f21416a = null;
            wVar.f21419d = null;
        } else {
            com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            x xVar = this.f20622b;
            InneractiveAdRequest inneractiveAdRequest = xVar.f21035a;
            com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
            JSONArray jSONArrayB = this.f20622b.f21037c.b();
            wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f21418c = uVar2;
            wVar.f21416a = inneractiveAdRequest;
            wVar.f21419d = jSONArrayB;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            jSONObject.put("fyber_close_enabled", boolValueOf);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", boolValueOf);
        }
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void d(boolean z10) {
        com.fyber.inneractive.sdk.network.w wVar;
        this.f20860p = true;
        if (z10) {
            if (this.f20622b == null) {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
                wVar.f21418c = uVar;
                wVar.f21416a = null;
                wVar.f21419d = null;
            } else {
                com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                x xVar = this.f20622b;
                InneractiveAdRequest inneractiveAdRequest = xVar.f21035a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
                JSONArray jSONArrayB = this.f20622b.f21037c.b();
                wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f21418c = uVar2;
                wVar.f21416a = inneractiveAdRequest;
                wVar.f21419d = jSONArrayB;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean boolValueOf = Boolean.valueOf(P());
            try {
                jSONObject.put("is_endcard", boolValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "is_endcard", boolValueOf);
            }
            wVar.f21421f.put(jSONObject);
            wVar.a((String) null);
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar != null) {
            eVar.showCloseButton(z10, N(), M());
            if (z10) {
                return;
            }
            com.fyber.inneractive.sdk.util.a aVar = this.f20865u;
            aVar.f23846d = 0L;
            aVar.f23847e = 0L;
            aVar.f23848f = 0L;
            aVar.f23844b = false;
            aVar.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f20856l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(runnable);
            this.f20856l = null;
        }
        Runnable runnable2 = this.f20858n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(runnable2);
            this.f20858n = null;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f20855k = null;
        m0 m0Var = this.f20866v;
        if (m0Var != null) {
            m0Var.cancel();
            this.f20866v = null;
        }
        v1 v1Var = this.f20859o;
        if (v1Var != null) {
            v1Var.f23920e = null;
            this.f20859o = null;
        }
        v1 v1Var2 = this.f20857m;
        if (v1Var2 != null) {
            v1Var2.f23920e = null;
            this.f20857m = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f20865u.f23843a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void n() {
        v1 v1Var = this.f20857m;
        if (v1Var != null) {
            v1Var.f23919d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        v1 v1Var2 = this.f20859o;
        if (v1Var2 != null) {
            v1Var2.f23919d = false;
            v1Var2.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void s() {
        v1 v1Var = this.f20857m;
        if (v1Var != null) {
            v1Var.f23919d = true;
            t1 t1Var = v1Var.f23918c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        v1 v1Var2 = this.f20859o;
        if (v1Var2 != null) {
            v1Var2.f23919d = true;
            t1 t1Var2 = v1Var2.f23918c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f20855k;
        if (eVar != null) {
            return eVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }
}
