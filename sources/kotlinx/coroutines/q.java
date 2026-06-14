package kotlinx.coroutines;

import eg.g1;
import eg.p0;
import eg.p1;
import eg.t0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.q0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.k;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends r implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93631e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93632f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f93633g = AtomicIntegerFieldUpdater.newUpdater(q.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    private final class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CancellableContinuation f93634d;

        public a(long j10, CancellableContinuation cancellableContinuation) {
            super(j10);
            this.f93634d = cancellableContinuation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f93634d.A(q.this, Unit.f93236a);
        }

        @Override // kotlinx.coroutines.q.c
        public String toString() {
            return super.toString() + this.f93634d;
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f93636d;

        public b(long j10, Runnable runnable) {
            super(j10);
            this.f93636d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f93636d.run();
        }

        @Override // kotlinx.coroutines.q.c
        public String toString() {
            return super.toString() + this.f93636d;
        }
    }

    public static abstract class c implements Runnable, Comparable, p0, q0 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f93637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f93638c = -1;

        public c(long j10) {
            this.f93637b = j10;
        }

        @Override // jg.q0
        public jg.p0 d() {
            Object obj = this._heap;
            if (obj instanceof jg.p0) {
                return (jg.p0) obj;
            }
            return null;
        }

        @Override // eg.p0
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == t0.f69174a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.h(this);
                    }
                    this._heap = t0.f69174a;
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // jg.q0
        public void e(jg.p0 p0Var) {
            if (this._heap == t0.f69174a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = p0Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j10 = this.f93637b - cVar.f93637b;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        public final int g(long j10, d dVar, q qVar) {
            synchronized (this) {
                if (this._heap == t0.f69174a) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.b();
                        if (qVar.n()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f93639c = j10;
                        } else {
                            long j11 = cVar.f93637b;
                            if (j11 - j10 < 0) {
                                j10 = j11;
                            }
                            if (j10 - dVar.f93639c > 0) {
                                dVar.f93639c = j10;
                            }
                        }
                        long j12 = this.f93637b;
                        long j13 = dVar.f93639c;
                        if (j12 - j13 < 0) {
                            this.f93637b = j13;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // jg.q0
        public int getIndex() {
            return this.f93638c;
        }

        public final boolean h(long j10) {
            return j10 - this.f93637b >= 0;
        }

        @Override // jg.q0
        public void setIndex(int i10) {
            this.f93638c = i10;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f93637b + ']';
        }
    }

    public static final class d extends jg.p0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f93639c;

        public d(long j10) {
            this.f93639c = j10;
        }
    }

    private final void C0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93631e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f93631e, this, null, t0.f69175b)) {
                    return;
                }
            } else if (obj instanceof jg.r) {
                ((jg.r) obj).d();
                return;
            } else {
                if (obj == t0.f69175b) {
                    return;
                }
                jg.r rVar = new jg.r(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar.a((Runnable) obj);
                if (androidx.concurrent.futures.a.a(f93631e, this, obj, rVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable D0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93631e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof jg.r) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                jg.r rVar = (jg.r) obj;
                Object objM = rVar.m();
                if (objM != jg.r.f85909h) {
                    return (Runnable) objM;
                }
                androidx.concurrent.futures.a.a(f93631e, this, obj, rVar.l());
            } else {
                if (obj == t0.f69175b) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(f93631e, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void F0() {
        q0 q0VarI;
        d dVar = (d) f93632f.get(this);
        if (dVar == null || dVar.e()) {
            return;
        }
        eg.b.a();
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    q0 q0VarB = dVar.b();
                    if (q0VarB != null) {
                        c cVar = (c) q0VarB;
                        q0VarI = cVar.h(jNanoTime) ? G0(cVar) : false ? dVar.i(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (((c) q0VarI) != null);
    }

    private final boolean G0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93631e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (n()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(f93631e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof jg.r) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                jg.r rVar = (jg.r) obj;
                int iA = rVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    androidx.concurrent.futures.a.a(f93631e, this, obj, rVar.l());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == t0.f69175b) {
                    return false;
                }
                jg.r rVar2 = new jg.r(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                rVar2.a((Runnable) obj);
                rVar2.a(runnable);
                if (androidx.concurrent.futures.a.a(f93631e, this, obj, rVar2)) {
                    return true;
                }
            }
        }
    }

    private final void L0() {
        c cVar;
        eg.b.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f93632f.get(this);
            if (dVar == null || (cVar = (c) dVar.j()) == null) {
                return;
            } else {
                z0(jNanoTime, cVar);
            }
        }
    }

    private final int O0(long j10, c cVar) {
        if (n()) {
            return 1;
        }
        d dVar = (d) f93632f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(f93632f, this, null, new d(j10));
            Object obj = f93632f.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.g(j10, dVar, this);
    }

    private final void Q0(boolean z10) {
        f93633g.set(this, z10 ? 1 : 0);
    }

    private final boolean R0(c cVar) {
        d dVar = (d) f93632f.get(this);
        return (dVar != null ? (c) dVar.f() : null) == cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return f93633g.get(this) == 1;
    }

    public void E0(Runnable runnable) {
        F0();
        if (G0(runnable)) {
            A0();
        } else {
            j.f93624h.E0(runnable);
        }
    }

    protected boolean K0() {
        if (!s0()) {
            return false;
        }
        d dVar = (d) f93632f.get(this);
        if (dVar != null && !dVar.e()) {
            return false;
        }
        Object obj = f93631e.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof jg.r ? ((jg.r) obj).j() : obj == t0.f69175b;
    }

    protected final void M0() {
        f93631e.set(this, null);
        f93632f.set(this, null);
    }

    public final void N0(long j10, c cVar) {
        int iO0 = O0(j10, cVar);
        if (iO0 == 0) {
            if (R0(cVar)) {
                A0();
            }
        } else if (iO0 == 1) {
            z0(j10, cVar);
        } else if (iO0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    protected final p0 P0(long j10, Runnable runnable) {
        long jC = t0.c(j10);
        if (jC >= 4611686018427387903L) {
            return g1.f69152b;
        }
        eg.b.a();
        long jNanoTime = System.nanoTime();
        b bVar = new b(jC + jNanoTime, runnable);
        N0(jNanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        E0(runnable);
    }

    @Override // kotlinx.coroutines.k
    public void e(long j10, CancellableContinuation cancellableContinuation) {
        long jC = t0.c(j10);
        if (jC < 4611686018427387903L) {
            eg.b.a();
            long jNanoTime = System.nanoTime();
            a aVar = new a(jC + jNanoTime, cancellableContinuation);
            N0(jNanoTime, aVar);
            eg.l.a(cancellableContinuation, aVar);
        }
    }

    public p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return k.a.a(this, j10, runnable, coroutineContext);
    }

    @Override // eg.r0
    public void shutdown() {
        p1.f69163a.c();
        Q0(true);
        C0();
        while (t0() <= 0) {
        }
        L0();
    }

    @Override // eg.r0
    public long t0() {
        if (u0()) {
            return 0L;
        }
        F0();
        Runnable runnableD0 = D0();
        if (runnableD0 == null) {
            return z();
        }
        runnableD0.run();
        return 0L;
    }

    @Override // eg.r0
    protected long z() {
        c cVar;
        if (super.z() == 0) {
            return 0L;
        }
        Object obj = f93631e.get(this);
        if (obj != null) {
            if (!(obj instanceof jg.r)) {
                return obj == t0.f69175b ? Long.MAX_VALUE : 0L;
            }
            if (!((jg.r) obj).j()) {
                return 0L;
            }
        }
        d dVar = (d) f93632f.get(this);
        if (dVar == null || (cVar = (c) dVar.f()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVar.f93637b;
        eg.b.a();
        return kotlin.ranges.g.f(j10 - System.nanoTime(), 0L);
    }
}
