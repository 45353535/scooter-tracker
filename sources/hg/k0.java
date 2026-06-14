package hg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
final class k0 extends ig.b implements MutableStateFlow, c, ig.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f73260g = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f73261f;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73262r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73263s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73264t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f73265u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f73266v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f73267w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f73269y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73267w = obj;
            this.f73269y |= Integer.MIN_VALUE;
            return k0.this.collect(null, this);
        }
    }

    public k0(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean q(Object obj, Object obj2) {
        int i10;
        ig.d[] dVarArrM;
        synchronized (this) {
            Object obj3 = f73260g.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            f73260g.set(this, obj2);
            int i11 = this.f73261f;
            if ((i11 & 1) != 0) {
                this.f73261f = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f73261f = i12;
            ig.d[] dVarArrM2 = m();
            Unit unit = Unit.f93236a;
            while (true) {
                m0[] m0VarArr = (m0[]) dVarArrM2;
                if (m0VarArr != null) {
                    for (m0 m0Var : m0VarArr) {
                        if (m0Var != null) {
                            m0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f73261f;
                    if (i10 == i12) {
                        this.f73261f = i12 + 1;
                        return true;
                    }
                    dVarArrM = m();
                    Unit unit2 = Unit.f93236a;
                }
                dVarArrM2 = dVarArrM;
                i12 = i10;
            }
        }
    }

    @Override // ig.q
    public Flow a(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return l0.d(this, coroutineContext, i10, aVar);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean b(Object obj, Object obj2) {
        if (obj == null) {
            obj = ig.t.f74821a;
        }
        if (obj2 == null) {
            obj2 = ig.t.f74821a;
        }
        return q(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (((hg.n0) r11).a(r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:36:0x00ac, B:52:0x00e2], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:40:0x00bb, B:42:0x00c1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:40:0x00bb], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:42:0x00c1, B:50:0x00dc], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:52:0x00e2, B:36:0x00ac], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ig.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [hg.m0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ig.b] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.k0.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f93236a;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean g(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        jg.e0 e0Var = ig.t.f74821a;
        Object obj = f73260g.get(this);
        if (obj == e0Var) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ig.b
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m0 i() {
        return new m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ig.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public m0[] j(int i10) {
        return new m0[i10];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(Object obj) {
        if (obj == null) {
            obj = ig.t.f74821a;
        }
        q(null, obj);
    }
}
