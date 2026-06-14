package eg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b1 extends jg.p implements p0, y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.b0 f69126e;

    @Override // eg.y0
    public f1 b() {
        return null;
    }

    @Override // eg.p0
    public void dispose() {
        t().L0(this);
    }

    @Override // eg.y0
    public boolean isActive() {
        return true;
    }

    public final kotlinx.coroutines.b0 t() {
        kotlinx.coroutines.b0 b0Var = this.f69126e;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    @Override // jg.p
    public String toString() {
        return h0.a(this) + '@' + h0.b(this) + "[job@" + h0.b(t()) + ']';
    }

    public abstract boolean u();

    public abstract void v(Throwable th2);

    public final void w(kotlinx.coroutines.b0 b0Var) {
        this.f69126e = b0Var;
    }
}
