package jg;

import eg.p1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kotlinx.coroutines.m implements CoroutineStackFrame, Continuation {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f85875i = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineDispatcher f85876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Continuation f85877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f85878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f85879h;

    public i(CoroutineDispatcher coroutineDispatcher, Continuation continuation) {
        super(-1);
        this.f85876e = coroutineDispatcher;
        this.f85877f = continuation;
        this.f85878g = j.f85880a;
        this.f85879h = l0.g(getContext());
    }

    private final kotlinx.coroutines.e m() {
        Object obj = f85875i.get(this);
        if (obj instanceof kotlinx.coroutines.e) {
            return (kotlinx.coroutines.e) obj;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f85877f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f85877f.getContext();
    }

    @Override // kotlinx.coroutines.m
    public Object i() {
        Object obj = this.f85878g;
        this.f85878g = j.f85880a;
        return obj;
    }

    public final void j() {
        while (f85875i.get(this) == j.f85881b) {
        }
    }

    public final kotlinx.coroutines.e k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85875i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f85875i.set(this, j.f85881b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.e) {
                if (androidx.concurrent.futures.a.a(f85875i, this, obj, j.f85881b)) {
                    return (kotlinx.coroutines.e) obj;
                }
            } else if (obj != j.f85881b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void l(CoroutineContext coroutineContext, Object obj) {
        this.f85878g = obj;
        this.f93627d = 1;
        this.f85876e.dispatchYield(coroutineContext, this);
    }

    public final boolean p() {
        return f85875i.get(this) != null;
    }

    public final boolean q(Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85875i;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0 e0Var = j.f85881b;
            if (Intrinsics.areEqual(obj, e0Var)) {
                if (androidx.concurrent.futures.a.a(f85875i, this, e0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.a.a(f85875i, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        Object objB = eg.v.b(obj);
        if (j.d(this.f85876e, getContext())) {
            this.f85878g = objB;
            this.f93627d = 0;
            j.c(this.f85876e, getContext(), this);
            return;
        }
        eg.r0 r0VarB = p1.f69163a.b();
        if (r0VarB.r0()) {
            this.f85878g = objB;
            this.f93627d = 0;
            r0VarB.y(this);
            return;
        }
        r0VarB.R(true);
        try {
            CoroutineContext context = getContext();
            Object objI = l0.i(context, this.f85879h);
            try {
                this.f85877f.resumeWith(obj);
                Unit unit = Unit.f93236a;
                while (r0VarB.u0()) {
                }
            } finally {
                l0.f(context, objI);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void s() {
        j();
        kotlinx.coroutines.e eVarM = m();
        if (eVarM != null) {
            eVarM.q();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f85876e + ", " + eg.h0.c(this.f85877f) + ']';
    }

    public final Throwable w(CancellableContinuation cancellableContinuation) {
        e0 e0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f85875i;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            e0Var = j.f85881b;
            if (obj != e0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.a.a(f85875i, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f85875i, this, e0Var, cancellableContinuation));
        return null;
    }

    @Override // kotlinx.coroutines.m
    public Continuation e() {
        return this;
    }
}
