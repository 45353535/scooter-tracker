package jg;

import androidx.core.internal.view.SupportMenu;
import eg.h1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends c implements h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f85863e = AtomicIntegerFieldUpdater.newUpdater(b0.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f85864d;

    public b0(long j10, b0 b0Var, int i10) {
        super(b0Var);
        this.f85864d = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // jg.c
    public boolean k() {
        return f85863e.get(this) == r() && !l();
    }

    public final boolean p() {
        return f85863e.addAndGet(this, SupportMenu.CATEGORY_MASK) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, CoroutineContext coroutineContext);

    public final void t() {
        if (f85863e.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f85863e;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
