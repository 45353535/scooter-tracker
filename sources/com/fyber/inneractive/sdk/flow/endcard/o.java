package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.a f20705h;

    public o(x0 x0Var, String str, int i10) {
        super(i10, x0Var);
        this.f20705h = new com.fyber.inneractive.sdk.web.a(null, 0);
        this.f20704g = str;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        p pVar = (p) f();
        View viewB = pVar.b();
        if (viewB != null) {
            com.fyber.inneractive.sdk.util.v.a(viewB);
            viewGroup.addView(viewB);
            i1 i1Var = pVar.e().f21489a;
            if (i1Var != null) {
                i1Var.a(true);
            }
        }
        a(this.f20650e, this.f20648c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new p(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        View viewB = f().b();
        com.fyber.inneractive.sdk.player.ui.c cVarD = super.d();
        cVarD.f23349e = viewB;
        return cVarD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        com.fyber.inneractive.sdk.web.a aVar = this.f20705h;
        com.fyber.inneractive.sdk.util.g gVar = com.fyber.inneractive.sdk.util.g.FMP_ENDCARD;
        gVar.a(aVar.f23925a);
        gVar.a(aVar.f23926b);
        return gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Fmp;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.FMP_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean j() {
        return this.f20650e > 1;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        p pVar = (p) f();
        return pVar.f20719f && pVar.b() != null;
    }

    public final String n() {
        q qVar;
        com.fyber.inneractive.sdk.web.b bVar = (com.fyber.inneractive.sdk.web.b) ((p) f()).e().f21489a;
        if (bVar == null || (qVar = bVar.N) == null) {
            return null;
        }
        return qVar.f20711c;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (inneractiveInfrastructureError.isErrorAlreadyReported(com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING)) {
            return;
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", this.f20646a);
        JSONObject jSONObject = new JSONObject();
        String strA = com.fyber.inneractive.sdk.util.v.a(cause);
        if (!TextUtils.isEmpty(strA)) {
            try {
                jSONObject.put("error", strA);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error", strA);
            }
        }
        String strN = n();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put("version", strN);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        x0 x0Var = this.f20648c;
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        JSONArray jSONArray = x0Var.f21046f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f21417b = tVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArray;
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(int i10, x0 x0Var) {
        String strN = n();
        this.f20705h = new com.fyber.inneractive.sdk.web.a(strN, i10);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(strN)) {
            try {
                jSONObject.put("version", strN);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "version", strN);
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((p) f()).f20708l);
        try {
            jSONObject.put("loaded_from_cache", boolValueOf);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", boolValueOf);
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FMP_COMPANION_SUCCESSFULLY_SHOWN;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        JSONArray jSONArray = x0Var.f21046f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArray;
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }
}
