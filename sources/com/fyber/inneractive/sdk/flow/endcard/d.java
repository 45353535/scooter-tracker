package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.x0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends b {
    public d(int i10, x0 x0Var) {
        super(i10, x0Var);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        f fVar = (f) f();
        fVar.a(bVar, null);
        ViewGroup viewGroup2 = fVar.f20657c;
        com.fyber.inneractive.sdk.util.v.a(viewGroup2);
        viewGroup.addView(viewGroup2);
        a(this.f20650e, this.f20648c);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final n c() {
        return new f(this);
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
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Default;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return com.fyber.inneractive.sdk.model.vast.i.Default_End_Card;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final boolean l() {
        return true;
    }

    public final void a(int i10, x0 x0Var) {
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_DEFAULT_COMPANION_DISPLAYED;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f21043c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f21044d;
        JSONArray jSONArray = x0Var.f21046f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArray;
        wVar.a((String) null);
    }
}
