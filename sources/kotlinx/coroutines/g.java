package kotlinx.coroutines;

import eg.b1;

/* JADX INFO: loaded from: classes3.dex */
final class g extends b1 implements eg.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final eg.o f93613f;

    public g(eg.o oVar) {
        this.f93613f = oVar;
    }

    @Override // eg.n
    public boolean a(Throwable th2) {
        return t().R(th2);
    }

    @Override // eg.n
    public Job getParent() {
        return t();
    }

    @Override // eg.b1
    public boolean u() {
        return true;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        this.f93613f.V(t());
    }
}
