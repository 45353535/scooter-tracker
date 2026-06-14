package gg;

import eg.a2;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.b0;
import jg.c0;
import jg.d0;
import jg.s0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public class e implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f72776e = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f72777f = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f72778g = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f72779h = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f72780i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f72781j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f72782k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f72783l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f72784m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f72785b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f72786c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function3 f72787d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    private final class a implements i, a2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f72788b = f.f72816p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private kotlinx.coroutines.e f72789c;

        public a() {
        }

        private final Object f(l lVar, int i10, long j10, Continuation continuation) throws Throwable {
            Boolean boolA;
            l lVarW;
            e eVar = e.this;
            kotlinx.coroutines.e eVarB = eg.l.b(pf.b.d(continuation));
            try {
                this.f72789c = eVarB;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Object objG1 = eVar.g1(lVar, i10, j10, this);
                if (objG1 == f.f72813m) {
                    eVar.O0(this, lVar, i10);
                } else {
                    Function3 function3H = null;
                    if (objG1 == f.f72815o) {
                        if (j10 < eVar.l0()) {
                            lVar.c();
                        }
                        l lVar2 = (l) e.f0().get(eVar);
                        while (true) {
                            if (eVar.t0()) {
                                h();
                                break;
                            }
                            long andIncrement = e.g0().getAndIncrement(eVar);
                            int i11 = f.f72802b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (lVar2.f85864d != j11) {
                                lVarW = eVar.W(j11, lVar2);
                                if (lVarW == null) {
                                }
                            } else {
                                lVarW = lVar2;
                            }
                            Object objG12 = eVar.g1(lVarW, i12, andIncrement, this);
                            if (objG12 == f.f72813m) {
                                eVar.O0(this, lVarW, i12);
                                break;
                            }
                            if (objG12 == f.f72815o) {
                                if (andIncrement < eVar.l0()) {
                                    lVarW.c();
                                }
                                lVar2 = lVarW;
                            } else {
                                if (objG12 == f.f72814n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                lVarW.c();
                                this.f72788b = objG12;
                                this.f72789c = null;
                                boolA = kotlin.coroutines.jvm.internal.b.a(true);
                                Function1 function1 = eVar.f72786c;
                                if (function1 != null) {
                                    function3H = eVar.H(function1, objG12);
                                }
                            }
                        }
                    } else {
                        lVar.c();
                        this.f72788b = objG1;
                        this.f72789c = null;
                        boolA = kotlin.coroutines.jvm.internal.b.a(true);
                        Function1 function12 = eVar.f72786c;
                        if (function12 != null) {
                            function3H = eVar.H(function12, objG1);
                        }
                    }
                    eVarB.t(boolA, function3H);
                }
                Object objC = eVarB.C();
                if (objC == pf.b.g()) {
                    kotlin.coroutines.jvm.internal.g.c(continuation);
                }
                return objC;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                eVarB.Q();
                throw th4;
            }
        }

        private final boolean g() throws Throwable {
            this.f72788b = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                return false;
            }
            throw d0.a(thB0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            kotlinx.coroutines.e eVar = this.f72789c;
            Intrinsics.checkNotNull(eVar);
            this.f72789c = null;
            this.f72788b = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.f93230c;
                eVar.resumeWith(Result.b(kotlin.d.a(thB0)));
            }
        }

        @Override // gg.i
        public Object a(Continuation continuation) throws Throwable {
            l lVarW;
            boolean zG = true;
            if (this.f72788b == f.f72816p || this.f72788b == f.z()) {
                e eVar = e.this;
                l lVar = (l) e.f0().get(eVar);
                while (!eVar.t0()) {
                    long andIncrement = e.g0().getAndIncrement(eVar);
                    int i10 = f.f72802b;
                    long j10 = andIncrement / ((long) i10);
                    int i11 = (int) (andIncrement % ((long) i10));
                    if (lVar.f85864d != j10) {
                        lVarW = eVar.W(j10, lVar);
                        if (lVarW == null) {
                            continue;
                        }
                    } else {
                        lVarW = lVar;
                    }
                    Object objG1 = eVar.g1(lVarW, i11, andIncrement, null);
                    if (objG1 == f.f72813m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objG1 == f.f72815o) {
                        if (andIncrement < eVar.l0()) {
                            lVarW.c();
                        }
                        lVar = lVarW;
                    } else {
                        if (objG1 == f.f72814n) {
                            return f(lVarW, i11, andIncrement, continuation);
                        }
                        lVarW.c();
                        this.f72788b = objG1;
                    }
                }
                zG = g();
            }
            return kotlin.coroutines.jvm.internal.b.a(zG);
        }

        @Override // eg.a2
        public void b(b0 b0Var, int i10) {
            kotlinx.coroutines.e eVar = this.f72789c;
            if (eVar != null) {
                eVar.b(b0Var, i10);
            }
        }

        public final boolean i(Object obj) {
            kotlinx.coroutines.e eVar = this.f72789c;
            Intrinsics.checkNotNull(eVar);
            this.f72789c = null;
            this.f72788b = obj;
            Boolean bool = Boolean.TRUE;
            e eVar2 = e.this;
            Function1 function1 = eVar2.f72786c;
            return f.B(eVar, bool, function1 != null ? eVar2.H(function1, obj) : null);
        }

        public final void j() {
            kotlinx.coroutines.e eVar = this.f72789c;
            Intrinsics.checkNotNull(eVar);
            this.f72789c = null;
            this.f72788b = f.z();
            Throwable thB0 = e.this.b0();
            if (thB0 == null) {
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(Boolean.FALSE));
            } else {
                Result.Companion companion2 = Result.f93230c;
                eVar.resumeWith(Result.b(kotlin.d.a(thB0)));
            }
        }

        @Override // gg.i
        public Object next() throws Throwable {
            Object obj = this.f72788b;
            if (obj == f.f72816p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f72788b = f.f72816p;
            if (obj != f.z()) {
                return obj;
            }
            throw d0.a(e.this.e0());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.y implements Function3 {
        b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((e) this.receiver).E0(th2, obj, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, obj2, (CoroutineContext) obj3);
            return Unit.f93236a;
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.y implements Function3 {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void a(Throwable th2, Object obj, CoroutineContext coroutineContext) {
            ((e) this.receiver).D0(th2, obj, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Throwable) obj, ((k) obj2).k(), (CoroutineContext) obj3);
            return Unit.f93236a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f72791r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72793t;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f72791r = obj;
            this.f72793t |= Integer.MIN_VALUE;
            Object objR0 = e.R0(e.this, this);
            return objR0 == pf.b.g() ? objR0 : k.b(objR0);
        }
    }

    /* JADX INFO: renamed from: gg.e$e, reason: collision with other inner class name */
    static final class C0889e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72794r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f72795s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72796t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        long f72797u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f72798v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f72800x;

        C0889e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f72798v = obj;
            this.f72800x |= Integer.MIN_VALUE;
            Object objS0 = e.this.S0(null, 0, 0L, this);
            return objS0 == pf.b.g() ? objS0 : k.b(objS0);
        }
    }

    public e(int i10, Function1 function1) {
        this.f72785b = i10;
        this.f72786c = function1;
        if (i10 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = f.A(i10);
        this.completedExpandBuffersAndPauseFlag$volatile = Z();
        l lVar = new l(0L, null, this, 3);
        this.sendSegment$volatile = lVar;
        this.receiveSegment$volatile = lVar;
        if (x0()) {
            lVar = f.f72801a;
            Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = lVar;
        this.f72787d = function1 != null ? new Function3() { // from class: gg.b
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return e.M0(this.f72770b, (mg.i) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = f.f72819s;
    }

    private final void A0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72776e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 3)));
    }

    private final void B0() {
        long j10;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72776e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 >> 60);
            if (i10 == 0) {
                jW = f.w(1152921504606846975L & j10, 2);
            } else if (i10 != 1) {
                return;
            } else {
                jW = f.w(1152921504606846975L & j10, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, jW));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C0(long r5, gg.l r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f85864d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            jg.c r0 = r7.f()
            gg.l r0 = (gg.l) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            jg.c r5 = r7.f()
            gg.l r5 = (gg.l) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            jg.b0 r6 = (jg.b0) r6
            long r0 = r6.f85864d
            long r2 = r7.f85864d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            return
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = androidx.concurrent.futures.a.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.C0(long, gg.l):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f72786c;
        Intrinsics.checkNotNull(function1);
        Object objF = k.f(obj);
        Intrinsics.checkNotNull(objF);
        jg.x.a(function1, objF, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(Throwable th2, Object obj, CoroutineContext coroutineContext) {
        Function1 function1 = this.f72786c;
        Intrinsics.checkNotNull(function1);
        jg.x.a(function1, obj, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G0(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(k.b(k.f72824b.a(b0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function3 H(final Function1 function1, final Object obj) {
        return new Function3() { // from class: gg.c
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return e.J(function1, obj, (Throwable) obj2, obj3, (CoroutineContext) obj4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(CancellableContinuation cancellableContinuation) {
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(kotlin.d.a(e0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction I(Function1 function1) {
        return new b(this);
    }

    private final Object I0(Object obj, Continuation continuation) {
        s0 s0VarC;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        Function1 function1 = this.f72786c;
        if (function1 == null || (s0VarC = jg.x.c(function1, obj, null, 2, null)) == null) {
            Throwable thI0 = i0();
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(thI0)));
        } else {
            lf.c.a(s0VarC, i0());
            Result.Companion companion2 = Result.f93230c;
            eVar.resumeWith(Result.b(kotlin.d.a(s0VarC)));
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(Function1 function1, Object obj, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        jg.x.a(function1, obj, coroutineContext);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(Object obj, CancellableContinuation cancellableContinuation) {
        Function1 function1 = this.f72786c;
        if (function1 != null) {
            jg.x.a(function1, obj, cancellableContinuation.getContext());
        }
        Throwable thI0 = i0();
        Result.Companion companion = Result.f93230c;
        cancellableContinuation.resumeWith(Result.b(kotlin.d.a(thI0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KFunction K(Function1 function1) {
        return new c(this);
    }

    private final boolean L(long j10) {
        return j10 < Z() || j10 < h0() + ((long) this.f72785b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function3 M0(final e eVar, final mg.i iVar, Object obj, final Object obj2) {
        return new Function3() { // from class: gg.d
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                return e.N0(obj2, eVar, iVar, (Throwable) obj3, obj4, (CoroutineContext) obj5);
            }
        };
    }

    private final void N(l lVar, long j10) {
        Object objB = jg.k.b(null, 1, null);
        loop0: while (lVar != null) {
            for (int i10 = f.f72802b - 1; -1 < i10; i10--) {
                if ((lVar.f85864d * ((long) f.f72802b)) + ((long) i10) < j10) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lVar.B(i10);
                    if (objB2 != null && objB2 != f.f72805e) {
                        if (!(objB2 instanceof z)) {
                            if (!(objB2 instanceof a2)) {
                                break;
                            }
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = jg.k.c(objB, objB2);
                                lVar.C(i10, true);
                                break;
                            }
                        } else {
                            if (lVar.v(i10, objB2, f.z())) {
                                objB = jg.k.c(objB, ((z) objB2).f72842a);
                                lVar.C(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (lVar.v(i10, objB2, f.z())) {
                            lVar.t();
                            break;
                        }
                    }
                }
            }
            lVar = (l) lVar.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                V0((a2) objB);
                return;
            }
            Intrinsics.checkNotNull(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                V0((a2) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N0(Object obj, e eVar, mg.i iVar, Throwable th2, Object obj2, CoroutineContext coroutineContext) {
        if (obj != f.z()) {
            jg.x.a(eVar.f72786c, obj, iVar.getContext());
        }
        return Unit.f93236a;
    }

    private final l O() {
        Object obj = f72782k.get(this);
        l lVar = (l) f72780i.get(this);
        if (lVar.f85864d > ((l) obj).f85864d) {
            obj = lVar;
        }
        l lVar2 = (l) f72781j.get(this);
        if (lVar2.f85864d > ((l) obj).f85864d) {
            obj = lVar2;
        }
        return (l) jg.b.b((jg.c) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(a2 a2Var, l lVar, int i10) {
        L0();
        a2Var.b(lVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(a2 a2Var, l lVar, int i10) {
        a2Var.b(lVar, i10 + f.f72802b);
    }

    private final void Q(long j10) {
        U0(R(j10));
    }

    static /* synthetic */ Object Q0(e eVar, Continuation continuation) throws Throwable {
        l lVar;
        l lVar2 = (l) f0().get(eVar);
        while (!eVar.t0()) {
            long andIncrement = g0().getAndIncrement(eVar);
            int i10 = f.f72802b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar2.f85864d != j10) {
                l lVarW = eVar.W(j10, lVar2);
                if (lVarW == null) {
                    continue;
                } else {
                    lVar = lVarW;
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object objG1 = eVar2.g1(lVar, i11, andIncrement, null);
            if (objG1 == f.f72813m) {
                throw new IllegalStateException("unexpected");
            }
            if (objG1 != f.f72815o) {
                if (objG1 == f.f72814n) {
                    return eVar2.T0(lVar, i11, andIncrement, continuation);
                }
                lVar.c();
                return objG1;
            }
            if (andIncrement < eVar2.l0()) {
                lVar.c();
            }
            eVar = eVar2;
            lVar2 = lVar;
        }
        throw d0.a(eVar.e0());
    }

    private final l R(long j10) {
        l lVarO = O();
        if (w0()) {
            long jY0 = y0(lVarO);
            if (jY0 != -1) {
                T(jY0);
            }
        }
        N(lVarO, j10);
        return lVarO;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object R0(gg.e r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof gg.e.d
            if (r0 == 0) goto L14
            r0 = r14
            gg.e$d r0 = (gg.e.d) r0
            int r1 = r0.f72793t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f72793t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            gg.e$d r0 = new gg.e$d
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f72791r
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f72793t
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.d.b(r14)
            gg.k r14 = (gg.k) r14
            java.lang.Object r13 = r14.k()
            return r13
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.d.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = r()
            java.lang.Object r14 = r14.get(r13)
            gg.l r14 = (gg.l) r14
        L46:
            boolean r1 = r13.t0()
            if (r1 == 0) goto L57
            gg.k$b r14 = gg.k.f72824b
            java.lang.Throwable r13 = r13.b0()
            java.lang.Object r13 = r14.a(r13)
            return r13
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = s()
            long r4 = r1.getAndIncrement(r13)
            int r1 = gg.f.f72802b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.f85864d
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            gg.l r1 = o(r13, r7, r14)
            if (r1 != 0) goto L75
            goto L46
        L75:
            r8 = r1
            goto L78
        L77:
            r8 = r14
        L78:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = F(r7, r8, r9, r10, r12)
            r1 = r7
            jg.e0 r14 = gg.f.r()
            if (r13 == r14) goto Lb6
            jg.e0 r14 = gg.f.h()
            if (r13 != r14) goto L9b
            long r13 = r1.l0()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L98
            r8.c()
        L98:
            r13 = r1
            r14 = r8
            goto L46
        L9b:
            jg.e0 r14 = gg.f.s()
            if (r13 != r14) goto Lac
            r6.f72793t = r2
            r2 = r8
            java.lang.Object r13 = r1.S0(r2, r3, r4, r6)
            if (r13 != r0) goto Lab
            return r0
        Lab:
            return r13
        Lac:
            r8.c()
            gg.k$b r14 = gg.k.f72824b
            java.lang.Object r13 = r14.c(r13)
            return r13
        Lb6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.R0(gg.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void S() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object S0(gg.l r11, int r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.S0(gg.l, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Object T0(l lVar, int i10, long j10, Continuation continuation) {
        Function3 function3;
        l lVar2;
        kotlinx.coroutines.e eVarB = eg.l.b(pf.b.d(continuation));
        try {
            Object objG1 = g1(lVar, i10, j10, eVarB);
            if (objG1 == f.f72813m) {
                O0(eVarB, lVar, i10);
            } else {
                if (objG1 == f.f72815o) {
                    if (j10 < l0()) {
                        lVar.c();
                    }
                    l lVar3 = (l) f0().get(this);
                    while (true) {
                        if (t0()) {
                            H0(eVarB);
                            break;
                        }
                        long andIncrement = g0().getAndIncrement(this);
                        int i11 = f.f72802b;
                        long j11 = andIncrement / ((long) i11);
                        int i12 = (int) (andIncrement % ((long) i11));
                        if (lVar3.f85864d != j11) {
                            l lVarW = W(j11, lVar3);
                            if (lVarW != null) {
                                lVar2 = lVarW;
                            }
                        } else {
                            lVar2 = lVar3;
                        }
                        objG1 = g1(lVar2, i12, andIncrement, eVarB);
                        l lVar4 = lVar2;
                        if (objG1 == f.f72813m) {
                            kotlinx.coroutines.e eVar = androidx.activity.s.a(eVarB) ? eVarB : null;
                            if (eVar != null) {
                                O0(eVar, lVar4, i12);
                            }
                        } else if (objG1 == f.f72815o) {
                            if (andIncrement < l0()) {
                                lVar4.c();
                            }
                            lVar3 = lVar4;
                        } else {
                            if (objG1 == f.f72814n) {
                                throw new IllegalStateException("unexpected");
                            }
                            lVar4.c();
                            Function1 function1 = this.f72786c;
                            function3 = (Function3) (function1 != null ? I(function1) : null);
                        }
                    }
                } else {
                    lVar.c();
                    Function1 function12 = this.f72786c;
                    function3 = (Function3) (function12 != null ? I(function12) : null);
                }
                eVarB.t(objG1, function3);
            }
            Object objC = eVarB.C();
            if (objC == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objC;
        } catch (Throwable th2) {
            eVarB.Q();
            throw th2;
        }
    }

    private final void U() {
        if (x0()) {
            return;
        }
        l lVar = (l) f72782k.get(this);
        while (true) {
            long andIncrement = f72778g.getAndIncrement(this);
            int i10 = f.f72802b;
            long j10 = andIncrement / ((long) i10);
            if (l0() <= andIncrement) {
                if (lVar.f85864d < j10 && lVar.f() != null) {
                    C0(j10, lVar);
                }
                p0(this, 0L, 1, null);
                return;
            }
            if (lVar.f85864d != j10) {
                l lVarV = V(j10, lVar, andIncrement);
                if (lVarV == null) {
                    continue;
                } else {
                    lVar = lVarV;
                }
            }
            if (e1(lVar, (int) (andIncrement % ((long) i10)), andIncrement)) {
                p0(this, 0L, 1, null);
                return;
            }
            p0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (gg.l) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U0(gg.l r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.U0(gg.l):void");
    }

    private final l V(long j10, l lVar, long j11) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f72782k;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = jg.b.c(lVar, j10, function2);
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
        if (c0.c(objC)) {
            S();
            C0(j10, lVar);
            p0(this, 0L, 1, null);
            return null;
        }
        l lVar2 = (l) c0.b(objC);
        if (lVar2.f85864d <= j10) {
            return lVar2;
        }
        long j12 = lVar2.f85864d;
        int i10 = f.f72802b;
        if (f72778g.compareAndSet(this, j11 + 1, j12 * ((long) i10))) {
            o0((lVar2.f85864d * ((long) i10)) - j11);
        } else {
            p0(this, 0L, 1, null);
        }
        return null;
    }

    private final void V0(a2 a2Var) {
        X0(a2Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l W(long j10, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f72781j;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = jg.b.c(lVar, j10, function2);
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
        if (c0.c(objC)) {
            S();
            if (lVar.f85864d * ((long) f.f72802b) < l0()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) c0.b(objC);
        if (!x0() && j10 <= Z() / ((long) f.f72802b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f72782k;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.f85864d >= lVar2.f85864d || !lVar2.u()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, b0Var2, lVar2)) {
                    if (b0Var2.p()) {
                        b0Var2.n();
                    }
                } else if (lVar2.p()) {
                    lVar2.n();
                }
            }
        }
        long j11 = lVar2.f85864d;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f72802b;
        k1(j11 * ((long) i10));
        if (lVar2.f85864d * ((long) i10) < l0()) {
            lVar2.c();
        }
        return null;
    }

    private final void W0(a2 a2Var) {
        X0(a2Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l X(long j10, l lVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f72780i;
        Function2 function2 = (Function2) f.y();
        loop0: while (true) {
            objC = jg.b.c(lVar, j10, function2);
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
        if (c0.c(objC)) {
            S();
            if (lVar.f85864d * ((long) f.f72802b) < h0()) {
                lVar.c();
            }
            return null;
        }
        l lVar2 = (l) c0.b(objC);
        long j11 = lVar2.f85864d;
        if (j11 <= j10) {
            return lVar2;
        }
        int i10 = f.f72802b;
        l1(j11 * ((long) i10));
        if (lVar2.f85864d * ((long) i10) < h0()) {
            lVar2.c();
        }
        return null;
    }

    private final void X0(a2 a2Var, boolean z10) {
        if (a2Var instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) a2Var;
            Result.Companion companion = Result.f93230c;
            continuation.resumeWith(Result.b(kotlin.d.a(z10 ? e0() : i0())));
        } else if (a2Var instanceof w) {
            kotlinx.coroutines.e eVar = ((w) a2Var).f72841b;
            Result.Companion companion2 = Result.f93230c;
            eVar.resumeWith(Result.b(k.b(k.f72824b.a(b0()))));
        } else if (a2Var instanceof a) {
            ((a) a2Var).j();
        } else {
            if (a2Var instanceof mg.i) {
                ((mg.i) a2Var).e(this, f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + a2Var).toString());
        }
    }

    static /* synthetic */ Object Y0(e eVar, Object obj, Continuation continuation) {
        l lVar;
        l lVar2 = (l) j0().get(eVar);
        while (true) {
            long andIncrement = k0().getAndIncrement(eVar);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zV0 = eVar.v0(andIncrement);
            int i10 = f.f72802b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (lVar2.f85864d != j11) {
                l lVarX = eVar.X(j11, lVar2);
                if (lVarX != null) {
                    lVar = lVarX;
                } else if (zV0) {
                    Object objI0 = eVar.I0(obj, continuation);
                    if (objI0 == pf.b.g()) {
                        return objI0;
                    }
                }
            } else {
                lVar = lVar2;
            }
            e eVar2 = eVar;
            Object obj2 = obj;
            int iI1 = eVar2.i1(lVar, i11, obj2, j10, null, zV0);
            if (iI1 == 0) {
                lVar.c();
                break;
            }
            if (iI1 == 1) {
                break;
            }
            if (iI1 != 2) {
                if (iI1 == 3) {
                    Object objZ0 = eVar2.Z0(lVar, i11, obj2, j10, continuation);
                    if (objZ0 == pf.b.g()) {
                        return objZ0;
                    }
                } else if (iI1 != 4) {
                    if (iI1 == 5) {
                        lVar.c();
                    }
                    eVar = eVar2;
                    lVar2 = lVar;
                    obj = obj2;
                } else {
                    if (j10 < eVar2.h0()) {
                        lVar.c();
                    }
                    Object objI02 = eVar2.I0(obj2, continuation);
                    if (objI02 == pf.b.g()) {
                        return objI02;
                    }
                }
            } else if (zV0) {
                lVar.t();
                Object objI03 = eVar2.I0(obj2, continuation);
                if (objI03 == pf.b.g()) {
                    return objI03;
                }
            }
        }
        return Unit.f93236a;
    }

    private final long Z() {
        return f72778g.get(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object Z0(gg.l r17, int r18, java.lang.Object r19, long r20, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.Z0(gg.l, int, java.lang.Object, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean a1(long j10) {
        if (v0(j10)) {
            return false;
        }
        return !L(j10 & 1152921504606846975L);
    }

    private final boolean b1(Object obj, Object obj2) {
        if (obj instanceof mg.i) {
            return ((mg.i) obj).e(this, obj2);
        }
        if (obj instanceof w) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.e eVar = ((w) obj).f72841b;
            k kVarB = k.b(k.f72824b.c(obj2));
            Function1 function1 = this.f72786c;
            return f.B(eVar, kVarB, (Function3) (function1 != null ? K(function1) : null));
        }
        if (obj instanceof a) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
            Function1 function12 = this.f72786c;
            return f.B(cancellableContinuation, obj2, (Function3) (function12 != null ? I(function12) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    private final boolean c1(Object obj, l lVar, int i10) {
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.C((CancellableContinuation) obj, Unit.f93236a, null, 2, null);
        }
        if (!(obj instanceof mg.i)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        mg.l lVarX = ((mg.h) obj).x(this, Unit.f93236a);
        if (lVarX == mg.l.f94913c) {
            lVar.w(i10);
        }
        return lVarX == mg.l.f94912b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable e0() {
        Throwable thB0 = b0();
        return thB0 == null ? new p("Channel was closed") : thB0;
    }

    private final boolean e1(l lVar, int i10, long j10) {
        Object objB = lVar.B(i10);
        if (!(objB instanceof a2) || j10 < f72777f.get(this) || !lVar.v(i10, objB, f.f72807g)) {
            return f1(lVar, i10, j10);
        }
        if (c1(objB, lVar, i10)) {
            lVar.F(i10, f.f72804d);
            return true;
        }
        lVar.F(i10, f.f72810j);
        lVar.C(i10, false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0() {
        return f72781j;
    }

    private final boolean f1(l lVar, int i10, long j10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB instanceof a2) {
                if (j10 < f72777f.get(this)) {
                    if (lVar.v(i10, objB, new z((a2) objB))) {
                        return true;
                    }
                } else if (lVar.v(i10, objB, f.f72807g)) {
                    if (c1(objB, lVar, i10)) {
                        lVar.F(i10, f.f72804d);
                        return true;
                    }
                    lVar.F(i10, f.f72810j);
                    lVar.C(i10, false);
                    return false;
                }
            } else {
                if (objB == f.f72810j) {
                    return false;
                }
                if (objB == null) {
                    if (lVar.v(i10, objB, f.f72805e)) {
                        return true;
                    }
                } else {
                    if (objB == f.f72804d || objB == f.f72808h || objB == f.f72809i || objB == f.f72811k || objB == f.z()) {
                        return true;
                    }
                    if (objB != f.f72806f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater g0() {
        return f72777f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g1(l lVar, int i10, long j10, Object obj) {
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (j10 >= (f72776e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f72814n;
                }
                if (lVar.v(i10, objB, obj)) {
                    U();
                    return f.f72813m;
                }
            }
        } else if (objB == f.f72804d && lVar.v(i10, objB, f.f72809i)) {
            U();
            return lVar.D(i10);
        }
        return h1(lVar, i10, j10, obj);
    }

    private final Object h1(l lVar, int i10, long j10, Object obj) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null || objB == f.f72805e) {
                if (j10 < (f72776e.get(this) & 1152921504606846975L)) {
                    if (lVar.v(i10, objB, f.f72808h)) {
                        U();
                        return f.f72815o;
                    }
                } else {
                    if (obj == null) {
                        return f.f72814n;
                    }
                    if (lVar.v(i10, objB, obj)) {
                        U();
                        return f.f72813m;
                    }
                }
            } else {
                if (objB != f.f72804d) {
                    if (objB != f.f72810j && objB != f.f72808h) {
                        if (objB == f.z()) {
                            U();
                            return f.f72815o;
                        }
                        if (objB != f.f72807g && lVar.v(i10, objB, f.f72806f)) {
                            boolean z10 = objB instanceof z;
                            if (z10) {
                                objB = ((z) objB).f72842a;
                            }
                            if (c1(objB, lVar, i10)) {
                                lVar.F(i10, f.f72809i);
                                U();
                                return lVar.D(i10);
                            }
                            lVar.F(i10, f.f72810j);
                            lVar.C(i10, false);
                            if (z10) {
                                U();
                            }
                            return f.f72815o;
                        }
                    }
                    return f.f72815o;
                }
                if (lVar.v(i10, objB, f.f72809i)) {
                    U();
                    return lVar.D(i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i1(l lVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        lVar.G(i10, obj);
        if (z10) {
            return j1(lVar, i10, obj, j10, obj2, z10);
        }
        Object objB = lVar.B(i10);
        if (objB == null) {
            if (L(j10)) {
                if (lVar.v(i10, null, f.f72804d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.v(i10, null, obj2)) {
                    return 2;
                }
            }
        } else if (objB instanceof a2) {
            lVar.w(i10);
            if (b1(objB, obj)) {
                lVar.F(i10, f.f72809i);
                K0();
                return 0;
            }
            if (lVar.x(i10, f.f72811k) == f.f72811k) {
                return 5;
            }
            lVar.C(i10, true);
            return 5;
        }
        return j1(lVar, i10, obj, j10, obj2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater j0() {
        return f72780i;
    }

    private final int j1(l lVar, int i10, Object obj, long j10, Object obj2, boolean z10) {
        while (true) {
            Object objB = lVar.B(i10);
            if (objB == null) {
                if (!L(j10) || z10) {
                    if (z10) {
                        if (lVar.v(i10, null, f.f72810j)) {
                            lVar.C(i10, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.v(i10, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.v(i10, null, f.f72804d)) {
                    return 1;
                }
            } else {
                if (objB != f.f72805e) {
                    if (objB == f.f72811k) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.f72808h) {
                        lVar.w(i10);
                        return 5;
                    }
                    if (objB == f.z()) {
                        lVar.w(i10);
                        S();
                        return 4;
                    }
                    lVar.w(i10);
                    if (objB instanceof z) {
                        objB = ((z) objB).f72842a;
                    }
                    if (b1(objB, obj)) {
                        lVar.F(i10, f.f72809i);
                        K0();
                        return 0;
                    }
                    if (lVar.x(i10, f.f72811k) != f.f72811k) {
                        lVar.C(i10, true);
                    }
                    return 5;
                }
                if (lVar.v(i10, objB, f.f72804d)) {
                    return 1;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater k0() {
        return f72776e;
    }

    private final void k1(long j10) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72777f;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10) {
                return;
            }
            long j12 = j10;
            if (f72777f.compareAndSet(this, j11, j12)) {
                return;
            } else {
                j10 = j12;
            }
        }
    }

    private final void l1(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72776e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 >= j10) {
                return;
            }
        } while (!f72776e.compareAndSet(this, j11, f.w(j12, (int) (j11 >> 60))));
    }

    private final void o0(long j10) {
        if ((f72779h.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            while ((f72779h.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    static /* synthetic */ void p0(e eVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i10 & 1) != 0) {
            j10 = 1;
        }
        eVar.o0(j10);
    }

    private final void q0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f72784m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, obj == null ? f.f72817q : f.f72818r));
        if (obj == null) {
            return;
        }
        ((Function1) obj).invoke(b0());
    }

    private final boolean r0(l lVar, int i10, long j10) {
        Object objB;
        do {
            objB = lVar.B(i10);
            if (objB != null && objB != f.f72805e) {
                if (objB == f.f72804d) {
                    return true;
                }
                if (objB == f.f72810j || objB == f.z() || objB == f.f72809i || objB == f.f72808h) {
                    return false;
                }
                if (objB == f.f72807g) {
                    return true;
                }
                return objB != f.f72806f && j10 == h0();
            }
        } while (!lVar.v(i10, objB, f.f72808h));
        U();
        return false;
    }

    private final boolean s0(long j10, boolean z10) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            R(j10 & 1152921504606846975L);
            return (z10 && n0()) ? false : true;
        }
        if (i10 == 3) {
            Q(j10 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i10).toString());
    }

    private final boolean u0(long j10) {
        return s0(j10, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v0(long j10) {
        return s0(j10, false);
    }

    private final boolean x0() {
        long jZ = Z();
        return jZ == 0 || jZ == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (gg.l) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long y0(gg.l r8) {
        /*
            r7 = this;
        L0:
            int r0 = gg.f.f72802b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f85864d
            int r5 = gg.f.f72802b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.h0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            jg.e0 r2 = gg.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            jg.e0 r2 = gg.f.f72804d
            if (r1 != r2) goto L39
            return r3
        L2c:
            jg.e0 r2 = gg.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            jg.c r8 = r8.h()
            gg.l r8 = (gg.l) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.y0(gg.l):long");
    }

    private final void z0() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72776e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, f.w(1152921504606846975L & j10, 1)));
    }

    public boolean M(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel was cancelled");
        }
        return P(th2, true);
    }

    protected boolean P(Throwable th2, boolean z10) {
        if (z10) {
            z0();
        }
        boolean zA = androidx.concurrent.futures.a.a(f72783l, this, f.f72819s, th2);
        if (z10) {
            A0();
        } else {
            B0();
        }
        S();
        F0();
        if (zA) {
            q0();
        }
        return zA;
    }

    protected final void T(long j10) {
        l lVarW;
        s0 s0VarC;
        l lVar = (l) f72781j.get(this);
        while (true) {
            long j11 = f72777f.get(this);
            if (j10 < Math.max(((long) this.f72785b) + j11, Z())) {
                return;
            }
            if (f72777f.compareAndSet(this, j11, 1 + j11)) {
                int i10 = f.f72802b;
                long j12 = j11 / ((long) i10);
                int i11 = (int) (j11 % ((long) i10));
                if (lVar.f85864d != j12) {
                    lVarW = W(j12, lVar);
                    if (lVarW == null) {
                        continue;
                    }
                } else {
                    lVarW = lVar;
                }
                Object objG1 = g1(lVarW, i11, j11, null);
                if (objG1 != f.f72815o) {
                    lVarW.c();
                    Function1 function1 = this.f72786c;
                    if (function1 != null && (s0VarC = jg.x.c(function1, objG1, null, 2, null)) != null) {
                        throw s0VarC;
                    }
                } else if (j11 < l0()) {
                    lVarW.c();
                }
                lVar = lVarW;
            }
        }
    }

    @Override // gg.y
    public void b(Function1 function1) {
        if (androidx.concurrent.futures.a.a(f72784m, this, null, function1)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f72784m;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != f.f72817q) {
                if (obj == f.f72818r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.a.a(f72784m, this, f.f72817q, f.f72818r));
        function1.invoke(b0());
    }

    protected final Throwable b0() {
        return (Throwable) f72783l.get(this);
    }

    @Override // gg.x
    public final void cancel(CancellationException cancellationException) {
        M(cancellationException);
    }

    protected final Object d1(Object obj) {
        l lVarX;
        int i10;
        e eVar;
        Object obj2 = f.f72804d;
        l lVar = (l) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j10 = 1152921504606846975L & andIncrement;
            boolean zV0 = v0(andIncrement);
            int i11 = f.f72802b;
            long j11 = j10 / ((long) i11);
            int i12 = (int) (j10 % ((long) i11));
            if (lVar.f85864d != j11) {
                lVarX = X(j11, lVar);
                if (lVarX != null) {
                    eVar = this;
                    i10 = i12;
                } else if (zV0) {
                    return k.f72824b.a(i0());
                }
            } else {
                lVarX = lVar;
                i10 = i12;
                eVar = this;
            }
            Object obj3 = obj;
            int iI1 = eVar.i1(lVarX, i10, obj3, j10, obj2, zV0);
            lVar = lVarX;
            if (iI1 == 0) {
                lVar.c();
                return k.f72824b.c(Unit.f93236a);
            }
            if (iI1 == 1) {
                return k.f72824b.c(Unit.f93236a);
            }
            if (iI1 == 2) {
                if (zV0) {
                    lVar.t();
                    return k.f72824b.a(i0());
                }
                a2 a2Var = obj2 instanceof a2 ? (a2) obj2 : null;
                if (a2Var != null) {
                    P0(a2Var, lVar, i10);
                }
                T((lVar.f85864d * ((long) i11)) + ((long) i10));
                return k.f72824b.c(Unit.f93236a);
            }
            if (iI1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iI1 == 4) {
                if (j10 < h0()) {
                    lVar.c();
                }
                return k.f72824b.a(i0());
            }
            if (iI1 == 5) {
                lVar.c();
            }
            obj = obj3;
        }
    }

    @Override // gg.y
    public Object e(Object obj) {
        l lVarX;
        long j10;
        e eVar;
        if (a1(f72776e.get(this))) {
            return k.f72824b.b();
        }
        Object obj2 = f.f72810j;
        l lVar = (l) j0().get(this);
        while (true) {
            long andIncrement = k0().getAndIncrement(this);
            long j11 = 1152921504606846975L & andIncrement;
            boolean zV0 = v0(andIncrement);
            int i10 = f.f72802b;
            long j12 = j11 / ((long) i10);
            int i11 = (int) (j11 % ((long) i10));
            if (lVar.f85864d != j12) {
                lVarX = X(j12, lVar);
                if (lVarX != null) {
                    eVar = this;
                    j10 = j11;
                } else if (zV0) {
                    return k.f72824b.a(i0());
                }
            } else {
                lVarX = lVar;
                j10 = j11;
                eVar = this;
            }
            Object obj3 = obj;
            int iI1 = eVar.i1(lVarX, i11, obj3, j10, obj2, zV0);
            lVar = lVarX;
            if (iI1 == 0) {
                lVar.c();
                return k.f72824b.c(Unit.f93236a);
            }
            if (iI1 == 1) {
                return k.f72824b.c(Unit.f93236a);
            }
            if (iI1 == 2) {
                if (zV0) {
                    lVar.t();
                    return k.f72824b.a(i0());
                }
                a2 a2Var = obj2 instanceof a2 ? (a2) obj2 : null;
                if (a2Var != null) {
                    P0(a2Var, lVar, i11);
                }
                lVar.t();
                return k.f72824b.b();
            }
            if (iI1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iI1 == 4) {
                if (j10 < h0()) {
                    lVar.c();
                }
                return k.f72824b.a(i0());
            }
            if (iI1 == 5) {
                lVar.c();
            }
            obj = obj3;
        }
    }

    @Override // gg.x
    public Object f() {
        l lVarW;
        long j10 = f72777f.get(this);
        long j11 = f72776e.get(this);
        if (u0(j11)) {
            return k.f72824b.a(b0());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return k.f72824b.b();
        }
        Object obj = f.f72811k;
        l lVar = (l) f0().get(this);
        while (!t0()) {
            long andIncrement = g0().getAndIncrement(this);
            int i10 = f.f72802b;
            long j12 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (lVar.f85864d != j12) {
                lVarW = W(j12, lVar);
                if (lVarW == null) {
                    continue;
                }
            } else {
                lVarW = lVar;
            }
            Object objG1 = g1(lVarW, i11, andIncrement, obj);
            if (objG1 == f.f72813m) {
                a2 a2Var = obj instanceof a2 ? (a2) obj : null;
                if (a2Var != null) {
                    O0(a2Var, lVarW, i11);
                }
                m1(andIncrement);
                lVarW.t();
                return k.f72824b.b();
            }
            if (objG1 != f.f72815o) {
                if (objG1 == f.f72814n) {
                    throw new IllegalStateException("unexpected");
                }
                lVarW.c();
                return k.f72824b.c(objG1);
            }
            if (andIncrement < l0()) {
                lVarW.c();
            }
            lVar = lVarW;
        }
        return k.f72824b.a(b0());
    }

    public final long h0() {
        return f72777f.get(this);
    }

    @Override // gg.x
    public Object i(Continuation continuation) {
        return R0(this, continuation);
    }

    protected final Throwable i0() {
        Throwable thB0 = b0();
        return thB0 == null ? new q("Channel was closed") : thB0;
    }

    @Override // gg.x
    public i iterator() {
        return new a();
    }

    @Override // gg.y
    public boolean j() {
        return v0(f72776e.get(this));
    }

    @Override // gg.x
    public Object k(Continuation continuation) {
        return Q0(this, continuation);
    }

    @Override // gg.y
    public boolean l(Throwable th2) {
        return P(th2, false);
    }

    public final long l0() {
        return f72776e.get(this) & 1152921504606846975L;
    }

    public final void m1(long j10) {
        e eVar = this;
        if (eVar.x0()) {
            return;
        }
        while (eVar.Z() <= j10) {
            eVar = this;
        }
        int i10 = f.f72803c;
        for (int i11 = 0; i11 < i10; i11++) {
            long jZ = eVar.Z();
            if (jZ == (4611686018427387903L & f72779h.get(eVar)) && jZ == eVar.Z()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f72779h;
        while (true) {
            long j11 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j11, f.v(j11 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jZ2 = eVar.Z();
            long j12 = f72779h.get(eVar);
            long j13 = j12 & 4611686018427387903L;
            boolean z10 = (4611686018427387904L & j12) != 0;
            if (jZ2 == j13 && jZ2 == eVar.Z()) {
                break;
            }
            if (z10) {
                eVar = this;
            } else {
                eVar = this;
                f72779h.compareAndSet(eVar, j12, f.v(j13, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f72779h;
        while (true) {
            long j14 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j14, f.v(j14 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }

    public final boolean n0() {
        while (true) {
            l lVarW = (l) f72781j.get(this);
            long jH0 = h0();
            if (l0() <= jH0) {
                return false;
            }
            int i10 = f.f72802b;
            long j10 = jH0 / ((long) i10);
            if (lVarW.f85864d == j10 || (lVarW = W(j10, lVarW)) != null) {
                lVarW.c();
                if (r0(lVarW, (int) (jH0 % ((long) i10)), jH0)) {
                    return true;
                }
                f72777f.compareAndSet(this, jH0, 1 + jH0);
            } else if (((l) f72781j.get(this)).f85864d < j10) {
                return false;
            }
        }
    }

    public boolean t0() {
        return u0(f72776e.get(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d7, code lost:
    
        r16 = r7;
        r3 = (gg.l) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.e.toString():java.lang.String");
    }

    @Override // gg.y
    public Object w(Object obj, Continuation continuation) {
        return Y0(this, obj, continuation);
    }

    protected boolean w0() {
        return false;
    }

    protected void F0() {
    }

    protected void K0() {
    }

    protected void L0() {
    }
}
