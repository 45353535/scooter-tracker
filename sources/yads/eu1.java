package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class eu1 implements ou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su1 f110462a;

    public eu1(su1 su1Var) {
        this.f110462a = su1Var;
    }

    @Override // yads.ou
    public final void a(td1 td1Var, qu quVar) {
        this.f110462a.setClickListener(new du1(td1Var, quVar));
    }
}
