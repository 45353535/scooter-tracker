package yads;

import android.content.Context;
import com.appsflyer.AdRevenueScheme;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i12 extends d22 implements jz1 {
    public final h12 P;
    public final hg2 Q;

    public i12(Context context, h12 h12Var, hg2 hg2Var, mp mpVar, rx1 rx1Var) {
        super(context, mpVar, rx1Var);
        this.P = h12Var;
        this.Q = hg2Var;
        a(a(mpVar.d().a()));
    }

    @Override // yads.jz1
    public final void a(e02 e02Var, gu guVar) {
        this.P.a(e02Var, guVar);
    }

    public final void b(l00 l00Var) {
        super.a(l00Var);
    }

    @Override // yads.jz1
    public final k00 getAdAssets() {
        return this.P.getAdAssets();
    }

    @Override // yads.jz1
    public final xn2 getAdType() {
        return this.P.getAdType();
    }

    @Override // yads.jz1
    public final String getCampaignId() {
        return this.P.getCampaignId();
    }

    @Override // yads.jz1
    public final String getCreativeId() {
        return this.P.getCreativeId();
    }

    @Override // yads.jz1
    public final String getInfo() {
        return this.P.getInfo();
    }

    public final ArrayList i() {
        return new ArrayList(this.P.f111436a);
    }

    @Override // yads.d22, yads.jz1
    public final void loadImages() {
        this.P.loadImages();
    }

    @Override // yads.jz1
    public final void a(e02 e02Var) {
        this.P.a(e02Var);
    }

    @Override // yads.jz1
    public final ec a() {
        return this.P.a();
    }

    @Override // yads.d22, yads.jz1
    public final void a(l00 l00Var) {
        this.P.a(l00Var);
    }

    public final v02 a(c4 c4Var) {
        k32 k32Var = k32.f112571c;
        v02 v02Var = new v02(c4Var, AdRevenueScheme.AD_UNIT, this.f109710i, this.f109711j, new s02(), null);
        v02Var.f116827f = d12.f109692c;
        return v02Var;
    }
}
