package eg;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class e extends kotlinx.coroutines.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f69141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0 f69142f;

    public e(CoroutineContext coroutineContext, Thread thread, r0 r0Var) {
        super(coroutineContext, true, true);
        this.f69141e = thread;
        this.f69142f = r0Var;
    }

    @Override // kotlinx.coroutines.b0
    protected void H(Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.f69141e)) {
            return;
        }
        Thread thread = this.f69141e;
        b.a();
        LockSupport.unpark(thread);
    }

    public final Object b1() throws Throwable {
        b.a();
        try {
            r0 r0Var = this.f69142f;
            if (r0Var != null) {
                r0.n0(r0Var, false, 1, null);
            }
            while (true) {
                try {
                    r0 r0Var2 = this.f69142f;
                    long jT0 = r0Var2 != null ? r0Var2.t0() : Long.MAX_VALUE;
                    if (n()) {
                        break;
                    }
                    b.a();
                    LockSupport.parkNanos(this, jT0);
                    if (Thread.interrupted()) {
                        K(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    r0 r0Var3 = this.f69142f;
                    if (r0Var3 != null) {
                        r0.p(r0Var3, false, 1, null);
                    }
                    throw th2;
                }
            }
            r0 r0Var4 = this.f69142f;
            if (r0Var4 != null) {
                r0.p(r0Var4, false, 1, null);
            }
            b.a();
            Object objH = kotlinx.coroutines.c0.h(l0());
            t tVar = objH instanceof t ? (t) objH : null;
            if (tVar == null) {
                return objH;
            }
            throw tVar.f69173a;
        } catch (Throwable th3) {
            b.a();
            throw th3;
        }
    }

    @Override // kotlinx.coroutines.b0
    protected boolean t0() {
        return true;
    }
}
