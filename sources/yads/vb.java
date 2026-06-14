package yads;

import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class vb implements wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f116950b = {ub.a(vb.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f116951a;

    public vb(eb1 eb1Var) {
        this.f116951a = hk2.a(eb1Var);
    }

    @Override // yads.wb
    public final boolean a() {
        gk2 gk2Var = this.f116951a;
        KProperty kProperty = f116950b[0];
        eb1 eb1Var = (eb1) gk2Var.f111244a.get();
        return eb1Var != null && qi3.f115019a.a(eb1Var).f109937a >= 1;
    }
}
