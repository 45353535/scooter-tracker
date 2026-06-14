package mg;

import eg.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.b0;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public class h implements kotlinx.coroutines.d, j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f94886g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f94887b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f94889d;
    private volatile /* synthetic */ Object state$volatile = k.f94906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f94888c = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94890e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f94891f = k.f94909e;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f94892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function3 f94893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function3 f94894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f94895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f94896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Function3 f94897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f94898g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f94899h = -1;

        public a(Object obj, Function3 function3, Function3 function32, Object obj2, Object obj3, Function3 function33) {
            this.f94892a = obj;
            this.f94893b = function3;
            this.f94894c = function32;
            this.f94895d = obj2;
            this.f94896e = obj3;
            this.f94897f = function33;
        }

        public final Function3 a(i iVar, Object obj) {
            Function3 function3 = this.f94897f;
            if (function3 != null) {
                return (Function3) function3.invoke(iVar, this.f94895d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f94898g;
            h hVar = h.this;
            if (obj instanceof b0) {
                ((b0) obj).s(this.f94899h, null, hVar.getContext());
                return;
            }
            p0 p0Var = obj instanceof p0 ? (p0) obj : null;
            if (p0Var != null) {
                p0Var.dispose();
            }
        }

        public final Object c(Object obj, Continuation continuation) {
            Object obj2 = this.f94896e;
            if (this.f94895d == k.i()) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Function1) obj2).invoke(continuation);
            }
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function2) obj2).invoke(obj, continuation);
        }

        public final Object d(Object obj) {
            return this.f94894c.invoke(this.f94892a, this.f94895d, obj);
        }

        public final boolean e(h hVar) {
            this.f94893b.invoke(this.f94892a, hVar, this.f94895d);
            return hVar.f94891f == k.f94909e;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f94901r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f94902s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f94904u;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f94902s = obj;
            this.f94904u |= Integer.MIN_VALUE;
            return h.this.o(this);
        }
    }

    public h(CoroutineContext coroutineContext) {
        this.f94887b = coroutineContext;
    }

    private final void j(Object obj) {
        List list = this.f94888c;
        Intrinsics.checkNotNull(list);
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).f94892a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    private final void k(a aVar) {
        List<a> list = this.f94888c;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        f94886g.set(this, k.f94907c);
        this.f94891f = k.f94909e;
        this.f94888c = null;
    }

    private final Object l(Continuation continuation) {
        Object obj = f94886g.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f94891f;
        k(aVar);
        return aVar.c(aVar.d(obj2), continuation);
    }

    static /* synthetic */ Object n(h hVar, Continuation continuation) {
        return hVar.t() ? hVar.l(continuation) : hVar.o(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mg.h.b
            if (r0 == 0) goto L13
            r0 = r6
            mg.h$b r0 = (mg.h.b) r0
            int r1 = r0.f94904u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94904u = r1
            goto L18
        L13:
            mg.h$b r0 = new mg.h$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f94902s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f94904u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r6)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f94901r
            mg.h r2 = (mg.h) r2
            kotlin.d.b(r6)
            goto L4b
        L3c:
            kotlin.d.b(r6)
            r0.f94901r = r5
            r0.f94904u = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L4a
            goto L56
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.f94901r = r6
            r0.f94904u = r3
            java.lang.Object r6 = r2.l(r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final a p(Object obj) {
        List list = this.f94888c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f94892a == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final boolean t() {
        return f94886g.get(this) instanceof a;
    }

    public static /* synthetic */ void v(h hVar, a aVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        hVar.u(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Object obj) {
        a aVarP = p(obj);
        Intrinsics.checkNotNull(aVarP);
        aVarP.f94898g = null;
        aVarP.f94899h = -1;
        u(aVarP, true);
    }

    private final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = f94886g.get(this);
            if (obj3 instanceof CancellableContinuation) {
                a aVarP = p(obj);
                if (aVarP == null) {
                    continue;
                } else {
                    Function3 function3A = aVarP.a(this, obj2);
                    if (androidx.concurrent.futures.a.a(f94886g, this, obj3, aVarP)) {
                        this.f94891f = obj2;
                        if (k.j((CancellableContinuation) obj3, function3A)) {
                            return 0;
                        }
                        this.f94891f = k.f94909e;
                        return 2;
                    }
                }
            } else {
                if (Intrinsics.areEqual(obj3, k.f94907c) || (obj3 instanceof a)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, k.f94908d)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, k.f94906b)) {
                    if (androidx.concurrent.futures.a.a(f94886g, this, obj3, CollectionsKt.listOf(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (androidx.concurrent.futures.a.a(f94886g, this, obj3, CollectionsKt.plus((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r0 = r0.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r0 != pf.b.g()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        kotlin.coroutines.jvm.internal.g.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0 != pf.b.g()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return kotlin.Unit.f93236a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object z(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            kotlinx.coroutines.e r0 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r1 = pf.b.d(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.I()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = h()
        L11:
            java.lang.Object r2 = r1.get(r5)
            jg.e0 r3 = mg.k.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = h()
            boolean r2 = androidx.concurrent.futures.a.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            eg.l.c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = h()
            jg.e0 r4 = mg.k.g()
            boolean r3 = androidx.concurrent.futures.a.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            i(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof mg.h.a
            if (r1 == 0) goto L79
            kotlin.Unit r1 = kotlin.Unit.f93236a
            mg.h$a r2 = (mg.h.a) r2
            java.lang.Object r3 = g(r5)
            kotlin.jvm.functions.Function3 r2 = r2.a(r5, r3)
            r0.t(r1, r2)
        L62:
            java.lang.Object r0 = r0.C()
            java.lang.Object r1 = pf.b.g()
            if (r0 != r1) goto L6f
            kotlin.coroutines.jvm.internal.g.c(r6)
        L6f:
            java.lang.Object r6 = pf.b.g()
            if (r0 != r6) goto L76
            return r0
        L76:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.h.z(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.d
    public void a(Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f94886g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f94907c) {
                return;
            }
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj, k.f94908d));
        List list = this.f94888c;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.f94891f = k.f94909e;
        this.f94888c = null;
    }

    @Override // eg.a2
    public void b(b0 b0Var, int i10) {
        this.f94889d = b0Var;
        this.f94890e = i10;
    }

    @Override // mg.i
    public void c(p0 p0Var) {
        this.f94889d = p0Var;
    }

    @Override // mg.i
    public void d(Object obj) {
        this.f94891f = obj;
    }

    @Override // mg.i
    public boolean e(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    @Override // mg.i
    public CoroutineContext getContext() {
        return this.f94887b;
    }

    public Object m(Continuation continuation) {
        return n(this, continuation);
    }

    public void r(mg.a aVar, Function1 function1) {
        v(this, new a(aVar.d(), aVar.c(), aVar.b(), k.i(), function1, aVar.a()), false, 1, null);
    }

    public void s(c cVar, Function2 function2) {
        v(this, new a(cVar.d(), cVar.c(), cVar.b(), null, function2, cVar.a()), false, 1, null);
    }

    public final void u(a aVar, boolean z10) {
        if (f94886g.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            j(aVar.f94892a);
        }
        if (!aVar.e(this)) {
            f94886g.set(this, aVar);
            return;
        }
        if (!z10) {
            List list = this.f94888c;
            Intrinsics.checkNotNull(list);
            list.add(aVar);
        }
        aVar.f94898g = this.f94889d;
        aVar.f94899h = this.f94890e;
        this.f94889d = null;
        this.f94890e = -1;
    }

    public final l x(Object obj, Object obj2) {
        return k.a(y(obj, obj2));
    }
}
