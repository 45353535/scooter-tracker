package kotlinx.coroutines;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class y extends b0 implements eg.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f93647d;

    public y(Job job) {
        super(true);
        r0(job);
        this.f93647d = X0();
    }

    private final boolean X0() {
        b0 b0VarT;
        eg.n nVarK0 = k0();
        g gVar = nVarK0 instanceof g ? (g) nVarK0 : null;
        if (gVar != null && (b0VarT = gVar.t()) != null) {
            while (!b0VarT.d0()) {
                eg.n nVarK02 = b0VarT.k0();
                g gVar2 = nVarK02 instanceof g ? (g) nVarK02 : null;
                if (gVar2 == null || (b0VarT = gVar2.t()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // eg.s
    public boolean complete() {
        return x0(Unit.f93236a);
    }

    @Override // eg.s
    public boolean d(Throwable th2) {
        return x0(new eg.t(th2, false, 2, null));
    }

    @Override // kotlinx.coroutines.b0
    public boolean d0() {
        return this.f93647d;
    }

    @Override // kotlinx.coroutines.b0
    public boolean g0() {
        return true;
    }
}
