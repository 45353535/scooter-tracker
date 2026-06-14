package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class mn1 implements nm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f113560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to1 f113561b;

    public mn1(t9 t9Var, to1 to1Var) {
        this.f113560a = t9Var;
        this.f113561b = to1Var;
    }

    @Override // yads.nm
    public final mm a(cm cmVar) {
        return new com.monetization.ads.mediation.banner.c(cmVar, this.f113560a, this.f113561b);
    }
}
