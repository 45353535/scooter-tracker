package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class rn1 implements ow0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f115529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to1 f115530b;

    public rn1(t9 t9Var, to1 to1Var) {
        this.f115529a = t9Var;
        this.f115530b = to1Var;
    }

    @Override // yads.ow0
    public final nw0 b(rw0 rw0Var) {
        return new ko1(rw0Var, this.f115529a, this.f115530b);
    }

    @Override // yads.ow0
    public final nw0 c(rw0 rw0Var) {
        return new com.monetization.ads.mediation.interstitial.c(rw0Var, this.f115529a, this.f115530b);
    }
}
