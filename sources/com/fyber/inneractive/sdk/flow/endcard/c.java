package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends b implements com.fyber.inneractive.sdk.response.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.c f20652g;

    public c(x0 x0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i10) {
        super(i10, x0Var);
        this.f20652g = cVar;
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, x0 x0Var) {
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        JSONArray jSONArray = x0Var.f21046f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArray;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectA = this.f20652g.a();
        try {
            jSONObject.put("companion_data", jSONObjectA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA);
        }
        JSONArray jSONArray2 = this.f20647b;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            JSONArray jSONArray3 = this.f20647b;
            try {
                jSONObject.put("plbl_det", jSONArray3);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "plbl_det", jSONArray3);
            }
        }
        wVar.f21421f.put(jSONObject);
        wVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.u uVar = this.f20648c.f21047g;
        View viewB = f().b();
        com.fyber.inneractive.sdk.player.ui.c cVarD = super.d();
        cVarD.f23349e = viewB;
        boolean z10 = false;
        if (uVar != null) {
            Boolean boolC = uVar.c("cta_text_all_caps");
            if (boolC != null ? boolC.booleanValue() : false) {
                z10 = true;
            }
        }
        cVarD.f23346b = z10;
        boolean zB = b.b(uVar);
        Integer numValueOf = Integer.valueOf(b.a(uVar));
        if (zB) {
            cVarD.f23348d = numValueOf;
        }
        return cVarD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void e() {
        a();
        View viewB = f().b();
        if (viewB != null) {
            viewB.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.VAST_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Companion;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return this.f20652g.f21177a;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public boolean l() {
        return f().b() != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void m() {
        super.m();
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOADED, this.f20648c);
    }

    public final void a(int i10, x0 x0Var) {
        com.fyber.inneractive.sdk.player.n.a(this, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_DISPLAYED, x0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f20646a);
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.VAST_COMPANION_FAILED_LOADING;
        if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectA = this.f20652g.a();
        try {
            jSONObject.put("companion_data", jSONObjectA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", jSONObjectA);
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        String strDescription = inneractiveInfrastructureError.description();
        if (TextUtils.isEmpty(strDescription)) {
            strDescription = com.fyber.inneractive.sdk.util.v.a(cause);
        }
        if (!TextUtils.isEmpty(strDescription)) {
            try {
                jSONObject.put("reason", inneractiveInfrastructureError);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "reason", inneractiveInfrastructureError);
            }
        }
        x0 x0Var = this.f20648c;
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

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        View viewB = f().b();
        if (viewB != null) {
            ((a) f()).c();
            com.fyber.inneractive.sdk.util.v.a(viewB);
            viewGroup.addView(viewB);
            viewB.requestFocus();
            a(this.f20650e, this.f20648c);
        }
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        return this.f20652g.a(xVar);
    }
}
