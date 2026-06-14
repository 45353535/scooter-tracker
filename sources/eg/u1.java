package eg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
final class u1 extends b1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f69176h = AtomicIntegerFieldUpdater.newUpdater(u1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Thread f69177f = Thread.currentThread();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p0 f69178g;

    private final Void z(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void A(Job job) {
        int i10;
        this.f69178g = kotlinx.coroutines.a0.q(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69176h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                z(i10);
                throw new lf.g();
            }
        } while (!f69176h.compareAndSet(this, i10, 0));
    }

    @Override // eg.b1
    public boolean u() {
        return true;
    }

    @Override // eg.b1
    public void v(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69176h;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                z(i10);
                throw new lf.g();
            }
        } while (!f69176h.compareAndSet(this, i10, 2));
        this.f69177f.interrupt();
        f69176h.set(this, 3);
    }

    public final void x() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f69176h;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        z(i10);
                        throw new lf.g();
                    }
                }
            } else if (f69176h.compareAndSet(this, i10, 1)) {
                p0 p0Var = this.f69178g;
                if (p0Var != null) {
                    p0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
