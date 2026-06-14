package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b0 implements Job, Continuation, CoroutineScope {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineContext f93570d;

    public a(CoroutineContext coroutineContext, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            r0((Job) coroutineContext.get(Job.N8));
        }
        this.f93570d = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.b0
    protected final void G0(Object obj) {
        if (!(obj instanceof eg.t)) {
            Z0(obj);
        } else {
            eg.t tVar = (eg.t) obj;
            Y0(tVar.f69173a, tVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.b0
    public String Q() {
        return eg.h0.a(this) + " was cancelled";
    }

    protected void X0(Object obj) {
        H(obj);
    }

    protected void Y0(Throwable th2, boolean z10) {
    }

    protected void Z0(Object obj) {
    }

    public final void a1(eg.f0 f0Var, Object obj, Function2 function2) {
        f0Var.g(function2, obj, this);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f93570d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f93570d;
    }

    @Override // kotlinx.coroutines.b0, kotlinx.coroutines.Job
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.b0
    public final void p0(Throwable th2) {
        eg.d0.a(this.f93570d, th2);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object objY0 = y0(eg.v.b(obj));
        if (objY0 == c0.f93597b) {
            return;
        }
        X0(objY0);
    }

    @Override // kotlinx.coroutines.b0
    public String z0() {
        String strG = eg.a0.g(this.f93570d);
        if (strG == null) {
            return super.z0();
        }
        return '\"' + strG + "\":" + super.z0();
    }
}
