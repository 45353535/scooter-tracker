package kotlinx.coroutines;

import eg.a1;
import eg.b1;
import eg.f1;
import eg.g1;
import eg.i1;
import eg.p0;
import eg.v1;
import eg.y0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public class b0 implements Job, eg.o, i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93572b = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f93573c = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends kotlinx.coroutines.e {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final b0 f93574j;

        public a(Continuation continuation, b0 b0Var) {
            super(continuation, 1);
            this.f93574j = b0Var;
        }

        @Override // kotlinx.coroutines.e
        protected String O() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.e
        public Throwable y(Job job) {
            Throwable thE;
            Object objL0 = this.f93574j.l0();
            return (!(objL0 instanceof c) || (thE = ((c) objL0).e()) == null) ? objL0 instanceof eg.t ? ((eg.t) objL0).f69173a : job.W() : thE;
        }
    }

    private static final class b extends b1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b0 f93575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c f93576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final kotlinx.coroutines.g f93577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Object f93578i;

        public b(b0 b0Var, c cVar, kotlinx.coroutines.g gVar, Object obj) {
            this.f93575f = b0Var;
            this.f93576g = cVar;
            this.f93577h = gVar;
            this.f93578i = obj;
        }

        @Override // eg.b1
        public boolean u() {
            return false;
        }

        @Override // eg.b1
        public void v(Throwable th2) {
            this.f93575f.T(this.f93576g, this.f93577h, this.f93578i);
        }
    }

    private static final class c implements y0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f93579c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f93580d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f93581e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f1 f93582b;

        public c(f1 f1Var, boolean z10, Throwable th2) {
            this.f93582b = f1Var;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object d() {
            return f93581e.get(this);
        }

        private final void n(Object obj) {
            f93581e.set(this, obj);
        }

        public final void a(Throwable th2) {
            Throwable thE = e();
            if (thE == null) {
                o(th2);
                return;
            }
            if (th2 == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                n(th2);
                return;
            }
            if (objD instanceof Throwable) {
                if (th2 == objD) {
                    return;
                }
                ArrayList arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(th2);
                n(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        @Override // eg.y0
        public f1 b() {
            return this.f93582b;
        }

        public final Throwable e() {
            return (Throwable) f93580d.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // eg.y0
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f93579c.get(this) == 1;
        }

        public final boolean k() {
            return d() == c0.f93600e;
        }

        public final List l(Throwable th2) {
            ArrayList arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (th2 != null && !Intrinsics.areEqual(th2, thE)) {
                arrayListC.add(th2);
            }
            n(c0.f93600e);
            return arrayListC;
        }

        public final void m(boolean z10) {
            f93579c.set(this, z10 ? 1 : 0);
        }

        public final void o(Throwable th2) {
            f93580d.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    private final class d extends b1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final mg.i f93583f;

        public d(mg.i iVar) {
            this.f93583f = iVar;
        }

        @Override // eg.b1
        public boolean u() {
            return false;
        }

        @Override // eg.b1
        public void v(Throwable th2) {
            Object objL0 = b0.this.l0();
            if (!(objL0 instanceof eg.t)) {
                objL0 = c0.h(objL0);
            }
            this.f93583f.e(b0.this, objL0);
        }
    }

    private final class e extends b1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final mg.i f93585f;

        public e(mg.i iVar) {
            this.f93585f = iVar;
        }

        @Override // eg.b1
        public boolean u() {
            return false;
        }

        @Override // eg.b1
        public void v(Throwable th2) {
            this.f93585f.e(b0.this, Unit.f93236a);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.j implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f93587r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f93588s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f93589t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f93590u;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = b0.this.new f(continuation);
            fVar.f93590u = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
        
            if (r6.b(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
        
            if (r4.b(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f93589t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f93588s
                jg.p r1 = (jg.p) r1
                java.lang.Object r3 = r5.f93587r
                jg.o r3 = (jg.o) r3
                java.lang.Object r4 = r5.f93590u
                kotlin.sequences.j r4 = (kotlin.sequences.j) r4
                kotlin.d.b(r6)
                goto L81
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                kotlin.d.b(r6)
                goto L86
            L2a:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f93590u
                kotlin.sequences.j r6 = (kotlin.sequences.j) r6
                kotlinx.coroutines.b0 r1 = kotlinx.coroutines.b0.this
                java.lang.Object r1 = r1.l0()
                boolean r4 = r1 instanceof kotlinx.coroutines.g
                if (r4 == 0) goto L48
                kotlinx.coroutines.g r1 = (kotlinx.coroutines.g) r1
                eg.o r1 = r1.f93613f
                r5.f93589t = r3
                java.lang.Object r6 = r6.b(r1, r5)
                if (r6 != r0) goto L86
                goto L80
            L48:
                boolean r3 = r1 instanceof eg.y0
                if (r3 == 0) goto L86
                eg.y0 r1 = (eg.y0) r1
                eg.f1 r1 = r1.b()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
                jg.p r3 = (jg.p) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L63:
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
                if (r6 != 0) goto L86
                boolean r6 = r1 instanceof kotlinx.coroutines.g
                if (r6 == 0) goto L81
                r6 = r1
                kotlinx.coroutines.g r6 = (kotlinx.coroutines.g) r6
                eg.o r6 = r6.f93613f
                r5.f93590u = r4
                r5.f93587r = r3
                r5.f93588s = r1
                r5.f93589t = r2
                java.lang.Object r6 = r4.b(r6, r5)
                if (r6 != r0) goto L81
            L80:
                return r0
            L81:
                jg.p r1 = r1.k()
                goto L63
            L86:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.j jVar, Continuation continuation) {
            return ((f) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* synthetic */ class g extends kotlin.jvm.internal.y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f93592b = new g();

        g() {
            super(3, b0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(b0 b0Var, mg.i iVar, Object obj) {
            b0Var.E0(iVar, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((b0) obj, (mg.i) obj2, obj3);
            return Unit.f93236a;
        }
    }

    /* synthetic */ class h extends kotlin.jvm.internal.y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f93593b = new h();

        h() {
            super(3, b0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b0 b0Var, Object obj, Object obj2) {
            return b0Var.D0(obj, obj2);
        }
    }

    /* synthetic */ class i extends kotlin.jvm.internal.y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f93594b = new i();

        i() {
            super(3, b0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(b0 b0Var, mg.i iVar, Object obj) {
            b0Var.K0(iVar, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((b0) obj, (mg.i) obj2, obj3);
            return Unit.f93236a;
        }
    }

    public b0(boolean z10) {
        this._state$volatile = z10 ? c0.f93602g : c0.f93601f;
    }

    private final kotlinx.coroutines.g A0(jg.p pVar) {
        while (pVar.p()) {
            pVar = pVar.l();
        }
        while (true) {
            pVar = pVar.k();
            if (!pVar.p()) {
                if (pVar instanceof kotlinx.coroutines.g) {
                    return (kotlinx.coroutines.g) pVar;
                }
                if (pVar instanceof f1) {
                    return null;
                }
            }
        }
    }

    private final void B0(f1 f1Var, Throwable th2) throws Throwable {
        F0(th2);
        f1Var.f(4);
        Object objJ = f1Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        eg.u uVar = null;
        for (jg.p pVarK = (jg.p) objJ; !Intrinsics.areEqual(pVarK, f1Var); pVarK = pVarK.k()) {
            if ((pVarK instanceof b1) && ((b1) pVarK).u()) {
                try {
                    ((b1) pVarK).v(th2);
                } catch (Throwable th3) {
                    if (uVar != null) {
                        lf.c.a(uVar, th3);
                    } else {
                        uVar = new eg.u("Exception in completion handler " + pVarK + " for " + this, th3);
                        Unit unit = Unit.f93236a;
                    }
                }
            }
        }
        if (uVar != null) {
            p0(uVar);
        }
        P(th2);
    }

    private final void C0(f1 f1Var, Throwable th2) throws Throwable {
        f1Var.f(1);
        Object objJ = f1Var.j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        eg.u uVar = null;
        for (jg.p pVarK = (jg.p) objJ; !Intrinsics.areEqual(pVarK, f1Var); pVarK = pVarK.k()) {
            if (pVarK instanceof b1) {
                try {
                    ((b1) pVarK).v(th2);
                } catch (Throwable th3) {
                    if (uVar != null) {
                        lf.c.a(uVar, th3);
                    } else {
                        uVar = new eg.u("Exception in completion handler " + pVarK + " for " + this, th3);
                        Unit unit = Unit.f93236a;
                    }
                }
            }
        }
        if (uVar != null) {
            p0(uVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D0(Object obj, Object obj2) throws Throwable {
        if (obj2 instanceof eg.t) {
            throw ((eg.t) obj2).f69173a;
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(mg.i iVar, Object obj) {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof y0)) {
                if (!(objL0 instanceof eg.t)) {
                    objL0 = c0.h(objL0);
                }
                iVar.d(objL0);
                return;
            }
        } while (N0(objL0) < 0);
        iVar.c(a0.q(this, false, new d(iVar), 1, null));
    }

    private final void G(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                lf.c.a(th2, th3);
            }
        }
    }

    private final void I0(p pVar) {
        f1 f1Var = new f1();
        Object uVar = f1Var;
        if (!pVar.isActive()) {
            uVar = new u(f1Var);
        }
        androidx.concurrent.futures.a.a(f93572b, this, pVar, uVar);
    }

    private final Object J(Continuation continuation) {
        a aVar = new a(pf.b.d(continuation), this);
        aVar.I();
        eg.l.a(aVar, a0.q(this, false, new e0(aVar), 1, null));
        Object objC = aVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC;
    }

    private final void J0(b1 b1Var) {
        b1Var.e(new f1());
        androidx.concurrent.futures.a.a(f93572b, this, b1Var, b1Var.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(mg.i iVar, Object obj) {
        if (u0()) {
            iVar.c(a0.q(this, false, new e(iVar), 1, null));
        } else {
            iVar.d(Unit.f93236a);
        }
    }

    private final int N0(Object obj) {
        if (obj instanceof p) {
            if (((p) obj).isActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.a.a(f93572b, this, obj, c0.f93602g)) {
                return -1;
            }
            H0();
            return 1;
        }
        if (!(obj instanceof u)) {
            return 0;
        }
        if (!androidx.concurrent.futures.a.a(f93572b, this, obj, ((u) obj).b())) {
            return -1;
        }
        H0();
        return 1;
    }

    private final Object O(Object obj) {
        Object objU0;
        do {
            Object objL0 = l0();
            if (!(objL0 instanceof y0) || ((objL0 instanceof c) && ((c) objL0).j())) {
                return c0.f93596a;
            }
            objU0 = U0(objL0, new eg.t(X(obj), false, 2, null));
        } while (objU0 == c0.f93598c);
        return objU0;
    }

    private final String O0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof y0 ? ((y0) obj).isActive() ? "Active" : "New" : obj instanceof eg.t ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    private final boolean P(Throwable th2) {
        if (t0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        eg.n nVarK0 = k0();
        return (nVarK0 == null || nVarK0 == g1.f69152b) ? z10 : nVarK0.a(th2) || z10;
    }

    public static /* synthetic */ CancellationException Q0(b0 b0Var, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return b0Var.P0(th2, str);
    }

    private final void S(y0 y0Var, Object obj) throws Throwable {
        eg.n nVarK0 = k0();
        if (nVarK0 != null) {
            nVarK0.dispose();
            M0(g1.f69152b);
        }
        eg.t tVar = obj instanceof eg.t ? (eg.t) obj : null;
        Throwable th2 = tVar != null ? tVar.f69173a : null;
        if (!(y0Var instanceof b1)) {
            f1 f1VarB = y0Var.b();
            if (f1VarB != null) {
                C0(f1VarB, th2);
                return;
            }
            return;
        }
        try {
            ((b1) y0Var).v(th2);
        } catch (Throwable th3) {
            p0(new eg.u("Exception in completion handler " + y0Var + " for " + this, th3));
        }
    }

    private final boolean S0(y0 y0Var, Object obj) throws Throwable {
        if (!androidx.concurrent.futures.a.a(f93572b, this, y0Var, c0.g(obj))) {
            return false;
        }
        F0(null);
        G0(obj);
        S(y0Var, obj);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(c cVar, kotlinx.coroutines.g gVar, Object obj) {
        kotlinx.coroutines.g gVarA0 = A0(gVar);
        if (gVarA0 == null || !W0(cVar, gVarA0, obj)) {
            cVar.b().f(2);
            kotlinx.coroutines.g gVarA02 = A0(gVar);
            if (gVarA02 == null || !W0(cVar, gVarA02, obj)) {
                H(Y(cVar, obj));
            }
        }
    }

    private final boolean T0(y0 y0Var, Throwable th2) throws Throwable {
        f1 f1VarH0 = h0(y0Var);
        if (f1VarH0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.a.a(f93572b, this, y0Var, new c(f1VarH0, false, th2))) {
            return false;
        }
        B0(f1VarH0, th2);
        return true;
    }

    private final Object U0(Object obj, Object obj2) {
        return !(obj instanceof y0) ? c0.f93596a : ((!(obj instanceof p) && !(obj instanceof b1)) || (obj instanceof kotlinx.coroutines.g) || (obj2 instanceof eg.t)) ? V0((y0) obj, obj2) : S0((y0) obj, obj2) ? obj2 : c0.f93598c;
    }

    private final Object V0(y0 y0Var, Object obj) throws Throwable {
        f1 f1VarH0 = h0(y0Var);
        if (f1VarH0 == null) {
            return c0.f93598c;
        }
        c cVar = y0Var instanceof c ? (c) y0Var : null;
        if (cVar == null) {
            cVar = new c(f1VarH0, false, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            if (cVar.j()) {
                return c0.f93596a;
            }
            cVar.m(true);
            if (cVar != y0Var && !androidx.concurrent.futures.a.a(f93572b, this, y0Var, cVar)) {
                return c0.f93598c;
            }
            boolean zI = cVar.i();
            eg.t tVar = obj instanceof eg.t ? (eg.t) obj : null;
            if (tVar != null) {
                cVar.a(tVar.f69173a);
            }
            Throwable thE = zI ? null : cVar.e();
            ref$ObjectRef.f93280b = thE;
            Unit unit = Unit.f93236a;
            if (thE != null) {
                B0(f1VarH0, thE);
            }
            kotlinx.coroutines.g gVarA0 = A0(f1VarH0);
            if (gVarA0 != null && W0(cVar, gVarA0, obj)) {
                return c0.f93597b;
            }
            f1VarH0.f(2);
            kotlinx.coroutines.g gVarA02 = A0(f1VarH0);
            return (gVarA02 == null || !W0(cVar, gVarA02, obj)) ? Y(cVar, obj) : c0.f93597b;
        }
    }

    private final boolean W0(c cVar, kotlinx.coroutines.g gVar, Object obj) {
        while (z.p(gVar.f93613f, false, new b(this, cVar, gVar, obj)) == g1.f69152b) {
            gVar = A0(gVar);
            if (gVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable X(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new a1(Q(), null, this) : th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((i1) obj).b0();
    }

    private final Object Y(c cVar, Object obj) throws Throwable {
        boolean zI;
        Throwable thC0;
        eg.t tVar = obj instanceof eg.t ? (eg.t) obj : null;
        Throwable th2 = tVar != null ? tVar.f69173a : null;
        synchronized (cVar) {
            zI = cVar.i();
            List listL = cVar.l(th2);
            thC0 = c0(cVar, listL);
            if (thC0 != null) {
                G(thC0, listL);
            }
        }
        if (thC0 != null && thC0 != th2) {
            obj = new eg.t(thC0, false, 2, null);
        }
        if (thC0 != null && (P(thC0) || o0(thC0))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((eg.t) obj).c();
        }
        if (!zI) {
            F0(thC0);
        }
        G0(obj);
        androidx.concurrent.futures.a.a(f93572b, this, cVar, c0.g(obj));
        S(cVar, obj);
        return obj;
    }

    private final Throwable a0(Object obj) {
        eg.t tVar = obj instanceof eg.t ? (eg.t) obj : null;
        if (tVar != null) {
            return tVar.f69173a;
        }
        return null;
    }

    private final Throwable c0(c cVar, List list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new a1(Q(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof v1) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th4 = (Throwable) next2;
                if (th4 != th3 && (th4 instanceof v1)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final f1 h0(y0 y0Var) {
        f1 f1VarB = y0Var.b();
        if (f1VarB != null) {
            return f1VarB;
        }
        if (y0Var instanceof p) {
            return new f1();
        }
        if (y0Var instanceof b1) {
            J0((b1) y0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + y0Var).toString());
    }

    private final boolean u0() {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof y0)) {
                return false;
            }
        } while (N0(objL0) < 0);
        return true;
    }

    private final Object v0(Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        eg.l.a(eVar, a0.q(this, false, new f0(eVar), 1, null));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    private final Object w0(Object obj) throws Throwable {
        Throwable thX = null;
        while (true) {
            Object objL0 = l0();
            if (objL0 instanceof c) {
                synchronized (objL0) {
                    if (((c) objL0).k()) {
                        return c0.f93599d;
                    }
                    boolean zI = ((c) objL0).i();
                    if (obj != null || !zI) {
                        if (thX == null) {
                            thX = X(obj);
                        }
                        ((c) objL0).a(thX);
                    }
                    Throwable thE = zI ? null : ((c) objL0).e();
                    if (thE != null) {
                        B0(((c) objL0).b(), thE);
                    }
                    return c0.f93596a;
                }
            }
            if (!(objL0 instanceof y0)) {
                return c0.f93599d;
            }
            if (thX == null) {
                thX = X(obj);
            }
            y0 y0Var = (y0) objL0;
            if (!y0Var.isActive()) {
                Object objU0 = U0(objL0, new eg.t(thX, false, 2, null));
                if (objU0 == c0.f93596a) {
                    throw new IllegalStateException(("Cannot happen in " + objL0).toString());
                }
                if (objU0 != c0.f93598c) {
                    return objU0;
                }
            } else if (T0(y0Var, thX)) {
                return c0.f93596a;
            }
        }
    }

    protected void F0(Throwable th2) {
    }

    protected void G0(Object obj) {
    }

    protected void H(Object obj) {
    }

    protected void H0() {
    }

    protected final Object I(Continuation continuation) throws Throwable {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof y0)) {
                if (objL0 instanceof eg.t) {
                    throw ((eg.t) objL0).f69173a;
                }
                return c0.h(objL0);
            }
        } while (N0(objL0) < 0);
        return J(continuation);
    }

    public final boolean K(Throwable th2) {
        return L(th2);
    }

    public final boolean L(Object obj) throws Throwable {
        Object objW0 = c0.f93596a;
        if (g0() && (objW0 = O(obj)) == c0.f93597b) {
            return true;
        }
        if (objW0 == c0.f93596a) {
            objW0 = w0(obj);
        }
        if (objW0 == c0.f93596a || objW0 == c0.f93597b) {
            return true;
        }
        if (objW0 == c0.f93599d) {
            return false;
        }
        H(objW0);
        return true;
    }

    public final void L0(b1 b1Var) {
        Object objL0;
        do {
            objL0 = l0();
            if (!(objL0 instanceof b1)) {
                if (!(objL0 instanceof y0) || ((y0) objL0).b() == null) {
                    return;
                }
                b1Var.q();
                return;
            }
            if (objL0 != b1Var) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(f93572b, this, objL0, c0.f93602g));
    }

    @Override // kotlinx.coroutines.Job
    public final mg.a M() {
        i iVar = i.f93594b;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new mg.b(this, (Function3) kotlin.jvm.internal.b1.g(iVar, 3), null, 4, null);
    }

    public final void M0(eg.n nVar) {
        f93573c.set(this, nVar);
    }

    public void N(Throwable th2) throws Throwable {
        L(th2);
    }

    protected final CancellationException P0(Throwable th2, String str) {
        CancellationException a1Var = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (a1Var == null) {
            if (str == null) {
                str = Q();
            }
            a1Var = new a1(str, th2, this);
        }
        return a1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String Q() {
        return "Job was cancelled";
    }

    public boolean R(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return L(th2) && d0();
    }

    public final String R0() {
        return z0() + '{' + O0(l0()) + '}';
    }

    @Override // kotlinx.coroutines.Job
    public final p0 U(boolean z10, boolean z11, Function1 function1) {
        return s0(z11, z10 ? new w(function1) : new x(function1));
    }

    @Override // eg.o
    public final void V(i1 i1Var) throws Throwable {
        L(i1Var);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException W() {
        Object objL0 = l0();
        if (!(objL0 instanceof c)) {
            if (objL0 instanceof y0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objL0 instanceof eg.t) {
                return Q0(this, ((eg.t) objL0).f69173a, null, 1, null);
            }
            return new a1(eg.h0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objL0).e();
        if (thE != null) {
            CancellationException cancellationExceptionP0 = P0(thE, eg.h0.a(this) + " is cancelling");
            if (cancellationExceptionP0 != null) {
                return cancellationExceptionP0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Object Z() throws Throwable {
        Object objL0 = l0();
        if (objL0 instanceof y0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objL0 instanceof eg.t) {
            throw ((eg.t) objL0).f69173a;
        }
        return c0.h(objL0);
    }

    @Override // eg.i1
    public CancellationException b0() {
        Throwable thE;
        Object objL0 = l0();
        if (objL0 instanceof c) {
            thE = ((c) objL0).e();
        } else if (objL0 instanceof eg.t) {
            thE = ((eg.t) objL0).f69173a;
        } else {
            if (objL0 instanceof y0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objL0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new a1("Parent job is " + O0(objL0), thE, this);
    }

    @Override // kotlinx.coroutines.Job, gg.x
    public void cancel(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new a1(Q(), null, this);
        }
        N(cancellationException);
    }

    public boolean d0() {
        return true;
    }

    protected final mg.c f0() {
        g gVar = g.f93592b;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) kotlin.jvm.internal.b1.g(gVar, 3);
        h hVar = h.f93593b;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new mg.d(this, function3, (Function3) kotlin.jvm.internal.b1.g(hVar, 3), null, 8, null);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return Job.a.b(this, obj, function2);
    }

    public boolean g0() {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return Job.a.c(this, bVar);
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return kotlin.sequences.k.b(new f(null));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.b getKey() {
        return Job.N8;
    }

    @Override // kotlinx.coroutines.Job
    public final eg.n h(eg.o oVar) {
        kotlinx.coroutines.g gVar = new kotlinx.coroutines.g(oVar);
        gVar.w(this);
        while (true) {
            Object objL0 = l0();
            if (objL0 instanceof p) {
                p pVar = (p) objL0;
                if (!pVar.isActive()) {
                    I0(pVar);
                } else if (androidx.concurrent.futures.a.a(f93572b, this, objL0, gVar)) {
                    return gVar;
                }
            } else {
                if (!(objL0 instanceof y0)) {
                    Object objL02 = l0();
                    eg.t tVar = objL02 instanceof eg.t ? (eg.t) objL02 : null;
                    gVar.v(tVar != null ? tVar.f69173a : null);
                    return g1.f69152b;
                }
                f1 f1VarB = ((y0) objL0).b();
                if (f1VarB != null) {
                    if (!f1VarB.c(gVar, 7)) {
                        boolean zC = f1VarB.c(gVar, 3);
                        Object objL03 = l0();
                        if (objL03 instanceof c) {
                            thE = ((c) objL03).e();
                        } else {
                            eg.t tVar2 = objL03 instanceof eg.t ? (eg.t) objL03 : null;
                            if (tVar2 != null) {
                                thE = tVar2.f69173a;
                            }
                        }
                        gVar.v(thE);
                        if (!zC) {
                            return g1.f69152b;
                        }
                    }
                    return gVar;
                }
                Intrinsics.checkNotNull(objL0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                J0((b1) objL0);
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final Object i0(Continuation continuation) {
        if (u0()) {
            Object objV0 = v0(continuation);
            return objV0 == pf.b.g() ? objV0 : Unit.f93236a;
        }
        z.m(continuation.getContext());
        return Unit.f93236a;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object objL0 = l0();
        return (objL0 instanceof y0) && ((y0) objL0).isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object objL0 = l0();
        if (objL0 instanceof eg.t) {
            return true;
        }
        return (objL0 instanceof c) && ((c) objL0).i();
    }

    public Job j0() {
        eg.n nVarK0 = k0();
        if (nVarK0 != null) {
            return nVarK0.getParent();
        }
        return null;
    }

    public final eg.n k0() {
        return (eg.n) f93573c.get(this);
    }

    public final Object l0() {
        return f93572b.get(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return Job.a.e(this, bVar);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean n() {
        return !(l0() instanceof y0);
    }

    protected boolean o0(Throwable th2) {
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return Job.a.f(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final p0 q(Function1 function1) {
        return s0(true, new x(function1));
    }

    protected final void r0(Job job) {
        if (job == null) {
            M0(g1.f69152b);
            return;
        }
        job.start();
        eg.n nVarH = job.h(this);
        M0(nVarH);
        if (n()) {
            nVarH.dispose();
            M0(g1.f69152b);
        }
    }

    public final p0 s0(boolean z10, b1 b1Var) {
        boolean z11;
        boolean zC;
        b1Var.w(this);
        while (true) {
            Object objL0 = l0();
            z11 = true;
            if (!(objL0 instanceof p)) {
                if (!(objL0 instanceof y0)) {
                    z11 = false;
                    break;
                }
                y0 y0Var = (y0) objL0;
                f1 f1VarB = y0Var.b();
                if (f1VarB == null) {
                    Intrinsics.checkNotNull(objL0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    J0((b1) objL0);
                } else {
                    if (b1Var.u()) {
                        c cVar = y0Var instanceof c ? (c) y0Var : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (z10) {
                                b1Var.v(thE);
                            }
                            return g1.f69152b;
                        }
                        zC = f1VarB.c(b1Var, 5);
                    } else {
                        zC = f1VarB.c(b1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                p pVar = (p) objL0;
                if (!pVar.isActive()) {
                    I0(pVar);
                } else if (androidx.concurrent.futures.a.a(f93572b, this, objL0, b1Var)) {
                    break;
                }
            }
        }
        if (z11) {
            return b1Var;
        }
        if (z10) {
            Object objL02 = l0();
            eg.t tVar = objL02 instanceof eg.t ? (eg.t) objL02 : null;
            b1Var.v(tVar != null ? tVar.f69173a : null);
        }
        return g1.f69152b;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iN0;
        do {
            iN0 = N0(l0());
            if (iN0 == 0) {
                return false;
            }
        } while (iN0 != 1);
        return true;
    }

    protected boolean t0() {
        return false;
    }

    public String toString() {
        return R0() + '@' + eg.h0.b(this);
    }

    public final boolean x0(Object obj) {
        Object objU0;
        do {
            objU0 = U0(l0(), obj);
            if (objU0 == c0.f93596a) {
                return false;
            }
            if (objU0 == c0.f93597b) {
                return true;
            }
        } while (objU0 == c0.f93598c);
        H(objU0);
        return true;
    }

    public final Object y0(Object obj) {
        Object objU0;
        do {
            objU0 = U0(l0(), obj);
            if (objU0 == c0.f93596a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, a0(obj));
            }
        } while (objU0 == c0.f93598c);
        return objU0;
    }

    public String z0() {
        return eg.h0.a(this);
    }

    public void p0(Throwable th2) throws Throwable {
        throw th2;
    }
}
