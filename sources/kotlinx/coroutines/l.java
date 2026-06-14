package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends jg.a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f93626f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public l(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean e1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f93626f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f93626f.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean f1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f93626f;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f93626f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // jg.a0, kotlinx.coroutines.b0
    protected void H(Object obj) {
        X0(obj);
    }

    @Override // jg.a0, kotlinx.coroutines.a
    protected void X0(Object obj) {
        if (e1()) {
            return;
        }
        jg.j.b(pf.b.d(this.f85861e), eg.v.a(obj, this.f85861e));
    }

    public final Object c1() {
        if (f1()) {
            return pf.b.g();
        }
        Object objH = c0.h(l0());
        if (objH instanceof eg.t) {
            throw ((eg.t) objH).f69173a;
        }
        return objH;
    }
}
