package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xy implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yy f118016a;

    public xy(yy yyVar) {
        this.f118016a = yyVar;
    }

    @Override // yads.c2
    public final void a() {
        mw0 mw0Var = this.f118016a.f118444i;
        if (mw0Var != null) {
            mw0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        mw0 mw0Var = this.f118016a.f118444i;
        if (mw0Var != null) {
            mw0Var.pause();
        }
    }
}
