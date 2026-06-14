package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class wu1 implements zz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su1 f117594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju1 f117595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ze3 f117596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl3 f117597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gu1 f117598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vz0 f117599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hr2 f117600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public nu f117601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f117602i;

    public /* synthetic */ wu1(su1 su1Var, ju1 ju1Var) {
        ze3 ze3Var = new ze3();
        fl3 fl3Var = new fl3(su1Var);
        gu1 gu1Var = new gu1();
        vz0 vz0Var = new vz0();
        Object obj = vt2.f117186j;
        this(su1Var, ju1Var, ze3Var, fl3Var, gu1Var, vz0Var, ut2.a().a(su1Var.f()));
    }

    @Override // yads.zz0
    public final void a(u92 u92Var, Map map) {
    }

    @Override // yads.zz0
    public final void a(boolean z10) {
    }

    @Override // yads.zz0
    public final void a(String str) {
        hr2 hr2Var = this.f117600g;
        if (hr2Var == null || !hr2Var.B0 || this.f117602i) {
            nu nuVar = this.f117601h;
            if (nuVar != null) {
                su1 su1Var = this.f117594a;
                du1 du1Var = (du1) nuVar;
                td1 td1Var = du1Var.f110074a;
                td1 td1Var2 = new td1(td1Var.f116205a, td1Var.f116206b, td1Var.f116207c, str, td1Var.f116209e);
                qu quVar = du1Var.f110075b;
                yz1 yz1Var = quVar.f115163c;
                yz1Var.f118467a.a(quVar.f115161a, td1Var2, quVar.f115162b, yz1Var, quVar.f115164d, quVar.f115165e).onClick(su1Var);
            }
            this.f117602i = false;
        }
    }

    public wu1(su1 su1Var, ju1 ju1Var, ze3 ze3Var, fl3 fl3Var, gu1 gu1Var, vz0 vz0Var, hr2 hr2Var) {
        this.f117594a = su1Var;
        this.f117595b = ju1Var;
        this.f117596c = ze3Var;
        this.f117597d = fl3Var;
        this.f117598e = gu1Var;
        this.f117599f = vz0Var;
        this.f117600g = hr2Var;
    }

    @Override // yads.zz0
    public final void a() {
        this.f117602i = true;
    }
}
