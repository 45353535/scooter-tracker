package kotlinx.coroutines;

import eg.a2;
import eg.g1;
import eg.h1;
import eg.m0;
import eg.p0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/* JADX INFO: loaded from: classes3.dex */
public class e extends m implements CancellableContinuation, CoroutineStackFrame, a2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f93605g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93606h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93607i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Continuation f93608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineContext f93609f;

    public e(Continuation continuation, int i10) {
        super(i10);
        this.f93608e = continuation;
        this.f93609f = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f93571b;
    }

    private final String E() {
        Object objD = D();
        return objD instanceof h1 ? "Active" : objD instanceof eg.m ? "Cancelled" : "Completed";
    }

    private final p0 J() {
        Job job = (Job) getContext().get(Job.N8);
        if (job == null) {
            return null;
        }
        p0 p0VarQ = a0.q(job, false, new f(this), 1, null);
        androidx.concurrent.futures.a.a(f93607i, this, null, p0VarQ);
        return p0VarQ;
    }

    private final void K(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93606h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof b) {
                if (androidx.concurrent.futures.a.a(f93606h, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof d) || (obj2 instanceof jg.b0)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof eg.t) {
                    eg.t tVar = (eg.t) obj2;
                    if (!tVar.c()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof eg.m) {
                        if (!androidx.activity.s.a(obj2)) {
                            tVar = null;
                        }
                        Throwable th2 = tVar != null ? tVar.f69173a : null;
                        if (obj instanceof d) {
                            l((d) obj, th2);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((jg.b0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof h) {
                    h hVar = (h) obj2;
                    if (hVar.f93617b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof jg.b0) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    d dVar = (d) obj;
                    if (hVar.c()) {
                        l(dVar, hVar.f93620e);
                        return;
                    } else {
                        if (androidx.concurrent.futures.a.a(f93606h, this, obj2, h.b(hVar, null, dVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof jg.b0) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (androidx.concurrent.futures.a.a(f93606h, this, obj2, new h(obj2, (d) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean M() {
        if (!m0.c(this.f93627d)) {
            return false;
        }
        Continuation continuation = this.f93608e;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((jg.i) continuation).p();
    }

    private final void N(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f93236a;
    }

    public static /* synthetic */ void U(e eVar, Object obj, int i10, Function3 function3, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            function3 = null;
        }
        eVar.T(obj, i10, function3);
    }

    private final Object V(h1 h1Var, Object obj, int i10, Function3 function3, Object obj2) {
        if (obj instanceof eg.t) {
            return obj;
        }
        if ((m0.b(i10) || obj2 != null) && !(function3 == null && !(h1Var instanceof d) && obj2 == null)) {
            return new h(obj, h1Var instanceof d ? (d) h1Var : null, function3, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean W() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f93605g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f93605g.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final jg.e0 X(Object obj, Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93606h;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof h1)) {
                Object obj4 = obj2;
                if ((obj3 instanceof h) && obj4 != null && ((h) obj3).f93619d == obj4) {
                    return eg.k.f69156a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            Function3 function32 = function3;
            if (androidx.concurrent.futures.a.a(f93606h, this, obj3, V((h1) obj3, obj5, this.f93627d, function32, obj6))) {
                s();
                return eg.k.f69156a;
            }
            obj = obj5;
            function3 = function32;
            obj2 = obj6;
        }
    }

    private final boolean Y() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f93605g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f93605g.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void o(jg.b0 b0Var, Throwable th2) {
        int i10 = f93605g.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            b0Var.s(i10, th2, getContext());
        } catch (Throwable th3) {
            eg.d0.a(getContext(), new eg.u("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean p(Throwable th2) {
        if (!M()) {
            return false;
        }
        Continuation continuation = this.f93608e;
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((jg.i) continuation).q(th2);
    }

    private final void s() {
        if (M()) {
            return;
        }
        q();
    }

    private final void w(int i10) {
        if (W()) {
            return;
        }
        m0.a(this, i10);
    }

    private final p0 z() {
        return (p0) f93607i.get(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void A(CoroutineDispatcher coroutineDispatcher, Object obj) {
        Continuation continuation = this.f93608e;
        jg.i iVar = continuation instanceof jg.i ? (jg.i) continuation : null;
        U(this, obj, (iVar != null ? iVar.f85876e : null) == coroutineDispatcher ? 4 : this.f93627d, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object B(Object obj, Object obj2, Function3 function3) {
        return X(obj, obj2, function3);
    }

    public final Object C() {
        Job job;
        boolean zM = M();
        if (Y()) {
            if (z() == null) {
                J();
            }
            if (zM) {
                Q();
            }
            return pf.b.g();
        }
        if (zM) {
            Q();
        }
        Object objD = D();
        if (objD instanceof eg.t) {
            throw ((eg.t) objD).f69173a;
        }
        if (!m0.b(this.f93627d) || (job = (Job) getContext().get(Job.N8)) == null || job.isActive()) {
            return g(objD);
        }
        CancellationException cancellationExceptionW = job.W();
        d(objD, cancellationExceptionW);
        throw cancellationExceptionW;
    }

    public final Object D() {
        return f93606h.get(this);
    }

    public void I() {
        p0 p0VarJ = J();
        if (p0VarJ != null && n()) {
            p0VarJ.dispose();
            f93607i.set(this, g1.f69152b);
        }
    }

    public final void L(d dVar) {
        K(dVar);
    }

    protected String O() {
        return "CancellableContinuation";
    }

    public final void P(Throwable th2) {
        if (p(th2)) {
            return;
        }
        a(th2);
        s();
    }

    public final void Q() {
        Throwable thW;
        Continuation continuation = this.f93608e;
        jg.i iVar = continuation instanceof jg.i ? (jg.i) continuation : null;
        if (iVar == null || (thW = iVar.w(this)) == null) {
            return;
        }
        q();
        a(thW);
    }

    public final boolean R() {
        Object obj = f93606h.get(this);
        if ((obj instanceof h) && ((h) obj).f93619d != null) {
            q();
            return false;
        }
        f93605g.set(this, 536870911);
        f93606h.set(this, b.f93571b);
        return true;
    }

    public final void T(Object obj, int i10, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93606h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof h1)) {
                Object obj3 = obj;
                Function3 function32 = function3;
                if (obj2 instanceof eg.m) {
                    eg.m mVar = (eg.m) obj2;
                    if (mVar.e()) {
                        if (function32 != null) {
                            m(function32, mVar.f69173a, obj3);
                            return;
                        }
                        return;
                    }
                }
                k(obj3);
                throw new lf.g();
            }
            Object obj4 = obj;
            int i11 = i10;
            Function3 function33 = function3;
            if (androidx.concurrent.futures.a.a(f93606h, this, obj2, V((h1) obj2, obj4, i11, function33, null))) {
                s();
                w(i11);
                return;
            } else {
                obj = obj4;
                i10 = i11;
                function3 = function33;
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean a(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93606h;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof h1)) {
                return false;
            }
        } while (!androidx.concurrent.futures.a.a(f93606h, this, obj, new eg.m(this, th2, (obj instanceof d) || (obj instanceof jg.b0))));
        h1 h1Var = (h1) obj;
        if (h1Var instanceof d) {
            l((d) obj, th2);
        } else if (h1Var instanceof jg.b0) {
            o((jg.b0) obj, th2);
        }
        s();
        w(this.f93627d);
        return true;
    }

    @Override // eg.a2
    public void b(jg.b0 b0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f93605g;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        K(b0Var);
    }

    @Override // kotlinx.coroutines.m
    public void d(Object obj, Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f93606h;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof h1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof eg.t) {
                return;
            }
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                if (hVar.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.a.a(f93606h, this, obj2, h.b(hVar, null, null, null, null, th4, 15, null))) {
                    hVar.d(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.a.a(f93606h, this, obj2, new h(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // kotlinx.coroutines.m
    public final Continuation e() {
        return this.f93608e;
    }

    @Override // kotlinx.coroutines.m
    public Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // kotlinx.coroutines.m
    public Object g(Object obj) {
        return obj instanceof h ? ((h) obj).f93616a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f93608e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f93609f;
    }

    @Override // kotlinx.coroutines.m
    public Object i() {
        return D();
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean isActive() {
        return D() instanceof h1;
    }

    public final void l(d dVar, Throwable th2) {
        try {
            dVar.a(th2);
        } catch (Throwable th3) {
            eg.d0.a(getContext(), new eg.u("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(Function3 function3, Throwable th2, Object obj) {
        try {
            function3.invoke(th2, obj, getContext());
        } catch (Throwable th3) {
            eg.d0.a(getContext(), new eg.u("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public boolean n() {
        return !(D() instanceof h1);
    }

    public final void q() {
        p0 p0VarZ = z();
        if (p0VarZ == null) {
            return;
        }
        p0VarZ.dispose();
        f93607i.set(this, g1.f69152b);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void r(Object obj, final Function1 function1) {
        T(obj, this.f93627d, function1 != null ? new Function3() { // from class: eg.j
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return kotlinx.coroutines.e.S(function1, (Throwable) obj2, obj3, (CoroutineContext) obj4);
            }
        } : null);
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        U(this, eg.v.c(obj, this), this.f93627d, null, 4, null);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void t(Object obj, Function3 function3) {
        T(obj, this.f93627d, function3);
    }

    public String toString() {
        return O() + '(' + eg.h0.c(this.f93608e) + "){" + E() + "}@" + eg.h0.b(this);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void u(Object obj) {
        w(this.f93627d);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public void v(Function1 function1) {
        eg.l.c(this, new d.a(function1));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public Object x(Throwable th2) {
        return X(new eg.t(th2, false, 2, null), null, null);
    }

    public Throwable y(Job job) {
        return job.W();
    }
}
