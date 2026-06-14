package ng;

import eg.a2;
import eg.h0;
import eg.p0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.sync.Mutex;
import ng.e;

/* JADX INFO: loaded from: classes3.dex */
public class e extends i implements Mutex {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f96120j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Function3 f96121i;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements CancellableContinuation, a2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kotlinx.coroutines.e f96122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f96123c;

        public a(kotlinx.coroutines.e eVar, Object obj) {
            this.f96122b = eVar;
            this.f96123c = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(e eVar, a aVar, Throwable th2) {
            eVar.unlock(aVar.f96123c);
            return Unit.f93236a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit j(e eVar, a aVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
            e.w().set(eVar, aVar.f96123c);
            eVar.unlock(aVar.f96123c);
            return Unit.f93236a;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean a(Throwable th2) {
            return this.f96122b.a(th2);
        }

        @Override // eg.a2
        public void b(b0 b0Var, int i10) {
            this.f96122b.b(b0Var, i10);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void r(Unit unit, Function1 function1) {
            this.f96122b.r(unit, function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void t(Unit unit, Function3 function3) {
            e.w().set(e.this, this.f96123c);
            kotlinx.coroutines.e eVar = this.f96122b;
            final e eVar2 = e.this;
            eVar.r(unit, new Function1() { // from class: ng.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.a.g(eVar2, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlin.coroutines.Continuation
        public CoroutineContext getContext() {
            return this.f96122b.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void A(CoroutineDispatcher coroutineDispatcher, Unit unit) {
            this.f96122b.A(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object B(Unit unit, Object obj, Function3 function3) {
            final e eVar = e.this;
            Object objB = this.f96122b.B(unit, obj, new Function3() { // from class: ng.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return e.a.j(eVar, this, (Throwable) obj2, (Unit) obj3, (CoroutineContext) obj4);
                }
            });
            if (objB != null) {
                e.w().set(e.this, this.f96123c);
            }
            return objB;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.f96122b.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean n() {
            return this.f96122b.n();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object obj) {
            this.f96122b.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void u(Object obj) {
            this.f96122b.u(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void v(Function1 function1) {
            this.f96122b.v(function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public Object x(Throwable th2) {
            return this.f96122b.x(th2);
        }
    }

    private final class b implements mg.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mg.j f96125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f96126c;

        public b(mg.j jVar, Object obj) {
            this.f96125b = jVar;
            this.f96126c = obj;
        }

        @Override // eg.a2
        public void b(b0 b0Var, int i10) {
            this.f96125b.b(b0Var, i10);
        }

        @Override // mg.i
        public void c(p0 p0Var) {
            this.f96125b.c(p0Var);
        }

        @Override // mg.i
        public void d(Object obj) {
            e.w().set(e.this, this.f96126c);
            this.f96125b.d(obj);
        }

        @Override // mg.i
        public boolean e(Object obj, Object obj2) {
            boolean zE = this.f96125b.e(obj, obj2);
            e eVar = e.this;
            if (zE) {
                e.w().set(eVar, this.f96126c);
            }
            return zE;
        }

        @Override // mg.i
        public CoroutineContext getContext() {
            return this.f96125b.getContext();
        }
    }

    /* synthetic */ class c extends y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f96128b = new c();

        c() {
            super(3, e.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(e eVar, mg.i iVar, Object obj) {
            eVar.B(iVar, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (mg.i) obj2, obj3);
            return Unit.f93236a;
        }
    }

    /* synthetic */ class d extends y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f96129b = new d();

        d() {
            super(3, e.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, Object obj, Object obj2) {
            return eVar.A(obj, obj2);
        }
    }

    public e(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner$volatile = z10 ? null : f.f96130a;
        this.f96121i = new Function3() { // from class: ng.a
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.C(this.f96113b, (mg.i) obj, obj2, obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 C(final e eVar, mg.i iVar, final Object obj, Object obj2) {
        return new Function3() { // from class: ng.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.D(this.f96114b, obj, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(e eVar, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        eVar.unlock(obj);
        return Unit.f93236a;
    }

    private final int E(Object obj) {
        while (!q()) {
            if (obj == null) {
                return 1;
            }
            int iX = x(obj);
            if (iX == 1) {
                return 2;
            }
            if (iX == 2) {
                return 1;
            }
        }
        f96120j.set(this, obj);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater w() {
        return f96120j;
    }

    private final int x(Object obj) {
        while (isLocked()) {
            Object obj2 = f96120j.get(this);
            if (obj2 != f.f96130a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object y(e eVar, Object obj, Continuation continuation) {
        if (eVar.tryLock(obj)) {
            return Unit.f93236a;
        }
        Object objZ = eVar.z(obj, continuation);
        return objZ == pf.b.g() ? objZ : Unit.f93236a;
    }

    private final Object z(Object obj, Continuation continuation) {
        kotlinx.coroutines.e eVarB = eg.l.b(pf.b.d(continuation));
        try {
            e(new a(eVarB, obj));
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

    protected Object A(Object obj, Object obj2) {
        if (!Intrinsics.areEqual(obj2, f.f96131b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    protected void B(mg.i iVar, Object obj) {
        if (obj != null && holdsLock(obj)) {
            iVar.d(f.f96131b);
        } else {
            Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            o(new b((mg.j) iVar, obj), obj);
        }
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public mg.e getOnLock() {
        c cVar = c.f96128b;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) b1.g(cVar, 3);
        d dVar = d.f96129b;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new mg.f(this, function3, (Function3) b1.g(dVar, 3), this.f96121i);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        return x(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return a() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, Continuation continuation) {
        return y(this, obj, continuation);
    }

    public String toString() {
        return "Mutex@" + h0.b(this) + "[isLocked=" + isLocked() + ",owner=" + f96120j.get(this) + ']';
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iE = E(obj);
        if (iE == 0) {
            return true;
        }
        if (iE == 1) {
            return false;
        }
        if (iE != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = f96120j.get(this);
            if (obj2 != f.f96130a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (androidx.concurrent.futures.a.a(f96120j, this, obj2, f.f96130a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
