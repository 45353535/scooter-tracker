package kotlinx.coroutines;

import eg.b1;
import eg.p0;

/* JADX INFO: loaded from: classes3.dex */
final class o extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f93629f;

    public o(p0 p0Var) {
        this.f93629f = p0Var;
    }

    @Override // eg.b1
    public boolean u() {
        return false;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        this.f93629f.dispose();
    }
}
