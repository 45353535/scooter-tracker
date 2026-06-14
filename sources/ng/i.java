package ng;

import com.google.common.util.concurrent.h0;
import eg.a2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.b0;
import jg.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96133d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f96134e = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96135f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f96136g = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f96137h = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function3 f96139c;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends y implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96140b = new a();

        a() {
            super(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final l a(long j10, l lVar) {
            return k.j(j10, lVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (l) obj2);
        }
    }

    /* synthetic */ class b extends y implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f96141b = new b();

        b() {
            super(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final l a(long j10, l lVar) {
            return k.j(j10, lVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (l) obj2);
        }
    }

    public i(int i10, int i11) {
        this.f96138b = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i10 - i11;
        this.f96139c = new Function3() { // from class: ng.h
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return i.p(this.f96132b, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    private final Object f(Continuation continuation) {
        kotlinx.coroutines.e eVarB = eg.l.b(pf.b.d(continuation));
        try {
            if (!g(eVarB)) {
                e(eVarB);
            }
            Object objC = eVarB.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objC == pf.b.g() ? objC : Unit.f93236a;
        } catch (Throwable th2) {
            eVarB.Q();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(a2 a2Var) {
        Object objC;
        l lVar = (l) f96135f.get(this);
        long andIncrement = f96136g.getAndIncrement(this);
        a aVar = a.f96140b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f96135f;
        long j10 = andIncrement / ((long) k.f96147f);
        loop0: while (true) {
            objC = jg.b.c(lVar, j10, aVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.f85864d >= b0VarB.f85864d) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (b0Var.p()) {
                            b0Var.n();
                        }
                    } else if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) c0.b(objC);
        int i10 = (int) (andIncrement % ((long) k.f96147f));
        if (h0.a(lVar2.v(), i10, null, a2Var)) {
            a2Var.b(lVar2, i10);
            return true;
        }
        if (!h0.a(lVar2.v(), i10, k.f96143b, k.f96144c)) {
            return false;
        }
        if (a2Var instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(a2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((CancellableContinuation) a2Var).t(Unit.f93236a, this.f96139c);
        } else {
            if (!(a2Var instanceof mg.i)) {
                throw new IllegalStateException(("unexpected: " + a2Var).toString());
            }
            ((mg.i) a2Var).d(Unit.f93236a);
        }
        return true;
    }

    private final void h() {
        int i10;
        do {
            i10 = f96137h.get(this);
            if (i10 <= this.f96138b) {
                return;
            }
        } while (!f96137h.compareAndSet(this, i10, this.f96138b));
    }

    private final int i() {
        int andDecrement;
        do {
            andDecrement = f96137h.getAndDecrement(this);
        } while (andDecrement > this.f96138b);
        return andDecrement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(i iVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        iVar.release();
        return Unit.f93236a;
    }

    private final boolean r(Object obj) {
        if (!(obj instanceof CancellableContinuation)) {
            if (obj instanceof mg.i) {
                return ((mg.i) obj).e(this, Unit.f93236a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objB = cancellableContinuation.B(Unit.f93236a, null, this.f96139c);
        if (objB == null) {
            return false;
        }
        cancellableContinuation.u(objB);
        return true;
    }

    private final boolean s() {
        Object objC;
        l lVar = (l) f96133d.get(this);
        long andIncrement = f96134e.getAndIncrement(this);
        long j10 = andIncrement / ((long) k.f96147f);
        b bVar = b.f96141b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f96133d;
        loop0: while (true) {
            objC = jg.b.c(lVar, j10, bVar);
            if (c0.c(objC)) {
                break;
            }
            b0 b0VarB = c0.b(objC);
            while (true) {
                b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                if (b0Var.f85864d >= b0VarB.f85864d) {
                    break loop0;
                }
                if (!b0VarB.u()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                    if (b0Var.p()) {
                        b0Var.n();
                    }
                } else if (b0VarB.p()) {
                    b0VarB.n();
                }
            }
        }
        l lVar2 = (l) c0.b(objC);
        lVar2.c();
        if (lVar2.f85864d > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) k.f96147f));
        Object andSet = lVar2.v().getAndSet(i10, k.f96143b);
        if (andSet != null) {
            if (andSet == k.f96146e) {
                return false;
            }
            return r(andSet);
        }
        int i11 = k.f96142a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (lVar2.v().get(i10) == k.f96144c) {
                return true;
            }
        }
        return !h0.a(lVar2.v(), i10, k.f96143b, k.f96145d);
    }

    public final int a() {
        return Math.max(f96137h.get(this), 0);
    }

    public final Object b(Continuation continuation) {
        if (i() > 0) {
            return Unit.f93236a;
        }
        Object objF = f(continuation);
        return objF == pf.b.g() ? objF : Unit.f93236a;
    }

    protected final void e(CancellableContinuation cancellableContinuation) {
        while (i() <= 0) {
            Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((a2) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.t(Unit.f93236a, this.f96139c);
    }

    protected final void o(mg.i iVar, Object obj) {
        while (i() <= 0) {
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (g((a2) iVar)) {
                return;
            }
        }
        iVar.d(Unit.f93236a);
    }

    public final boolean q() {
        while (true) {
            int i10 = f96137h.get(this);
            if (i10 > this.f96138b) {
                h();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f96137h.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final void release() {
        do {
            int andIncrement = f96137h.getAndIncrement(this);
            if (andIncrement >= this.f96138b) {
                h();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f96138b).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!s());
    }
}
