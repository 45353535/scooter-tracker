package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class u extends a implements ValueCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.vast.a f20716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.d f20717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f20720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f20721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f20722i;

    public u(b bVar) {
        super(bVar);
        this.f20719f = false;
        this.f20721h = new AtomicBoolean(false);
        this.f20722i = new s(this);
        x0 x0Var = bVar.f20648c;
        t0 t0Var = x0Var.f21042b;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        this.f20716c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.f23736p, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.f23725e, gVar.f23726f, t0Var.f21038d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        i1 i1Var = e().f21489a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        ViewGroup viewGroup = this.f20720g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f20719f) {
            return null;
        }
        i1 i1Var = e().f21489a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.f23971b;
        if (mVar == null) {
            return null;
        }
        ViewGroup viewGroupA = a.a(mVar);
        this.f20720g = viewGroupA;
        return viewGroupA;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f21489a;
        if (i1Var != null) {
            UnitDisplayType unitDisplayType = dVarE.f21491c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    public q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f21489a;
        if (i1Var != null) {
            i1Var.e();
            dVarE.f21489a = null;
        }
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.f20717d;
        if (dVar == null) {
            b bVar = this.f20645b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.f20648c.f21041a, this.f20716c, bVar.i(), d());
            x0 x0Var = this.f20645b.f20648c;
            i1 i1Var = dVar.f21489a;
            if (i1Var != null) {
                if (i1Var.f23988s == null) {
                    i1Var.setAdContent(x0Var.f21042b);
                }
                if (i1Var.f23987r == null) {
                    i1Var.setAdRequest(x0Var.f21043c);
                }
                if (i1Var.f23989t == null) {
                    i1Var.setAdResponse(x0Var.f21044d);
                }
            }
            this.f20717d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f20315u;
        return sVar != null && sVar.f20484b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("%s Playable detected: %s", this.f20644a, str);
            try {
                this.f20645b.a(new JSONArray(str));
            } catch (JSONException e10) {
                IAlog.f("%s invalid playable detection method: %s", this.f20644a, e10.getMessage());
            }
        }
        this.f20645b.m();
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        com.fyber.inneractive.sdk.web.g tVar;
        String str = this.f20718e;
        if (!TextUtils.isEmpty(str)) {
            com.fyber.inneractive.sdk.player.controller.d dVarE = e();
            if (aVar == null) {
                tVar = this.f20722i;
            } else {
                tVar = new t(this, aVar);
            }
            dVarE.a(str, tVar, !(this instanceof p));
            return;
        }
        throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
    }
}
