package eg;

import kotlin.collections.ArrayDeque;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f69166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayDeque f69168d;

    public static /* synthetic */ void n0(r0 r0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        r0Var.R(z10);
    }

    public static /* synthetic */ void p(r0 r0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        r0Var.m(z10);
    }

    private final long w(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void R(boolean z10) {
        this.f69166b += w(z10);
        if (z10) {
            return;
        }
        this.f69167c = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i10, String str) {
        jg.m.a(i10);
        return jg.m.b(this, str);
    }

    public final void m(boolean z10) {
        long jW = this.f69166b - w(z10);
        this.f69166b = jW;
        if (jW <= 0 && this.f69167c) {
            shutdown();
        }
    }

    public final boolean r0() {
        return this.f69166b >= w(true);
    }

    public final boolean s0() {
        ArrayDeque arrayDeque = this.f69168d;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    public abstract void shutdown();

    public abstract long t0();

    public final boolean u0() {
        kotlinx.coroutines.m mVar;
        ArrayDeque arrayDeque = this.f69168d;
        if (arrayDeque == null || (mVar = (kotlinx.coroutines.m) arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        mVar.run();
        return true;
    }

    public boolean x0() {
        return false;
    }

    public final void y(kotlinx.coroutines.m mVar) {
        ArrayDeque arrayDeque = this.f69168d;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque();
            this.f69168d = arrayDeque;
        }
        arrayDeque.addLast(mVar);
    }

    protected long z() {
        ArrayDeque arrayDeque = this.f69168d;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }
}
