package gg;

import gg.k;
import jg.s0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes3.dex */
public class r extends e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f72834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final a f72835o;

    public r(int i10, a aVar, Function1 function1) {
        super(i10, function1);
        this.f72834n = i10;
        this.f72835o = aVar;
        if (aVar == a.f72765b) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + v0.b(e.class).getSimpleName() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ Object n1(r rVar, Object obj, Continuation continuation) throws Throwable {
        s0 s0VarC;
        Object objP1 = rVar.p1(obj, true);
        if (!(objP1 instanceof k.a)) {
            return Unit.f93236a;
        }
        k.e(objP1);
        Function1 function1 = rVar.f72786c;
        if (function1 == null || (s0VarC = jg.x.c(function1, obj, null, 2, null)) == null) {
            throw rVar.i0();
        }
        lf.c.a(s0VarC, rVar.i0());
        throw s0VarC;
    }

    private final Object o1(Object obj, boolean z10) {
        Function1 function1;
        s0 s0VarC;
        Object objE = super.e(obj);
        if (k.i(objE) || k.h(objE)) {
            return objE;
        }
        if (!z10 || (function1 = this.f72786c) == null || (s0VarC = jg.x.c(function1, obj, null, 2, null)) == null) {
            return k.f72824b.c(Unit.f93236a);
        }
        throw s0VarC;
    }

    private final Object p1(Object obj, boolean z10) {
        return this.f72835o == a.f72767d ? o1(obj, z10) : d1(obj);
    }

    @Override // gg.e, gg.y
    public Object e(Object obj) {
        return p1(obj, false);
    }

    @Override // gg.e, gg.y
    public Object w(Object obj, Continuation continuation) {
        return n1(this, obj, continuation);
    }

    @Override // gg.e
    protected boolean w0() {
        return this.f72835o == a.f72766c;
    }
}
