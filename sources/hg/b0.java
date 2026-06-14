package hg;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends ig.b implements MutableSharedFlow, hg.c, ig.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f73177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f73178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gg.a f73179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Object[] f73180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f73181j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f73182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f73183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f73184m;

    private static final class a implements eg.p0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0 f73185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f73186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f73187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Continuation f73188e;

        public a(b0 b0Var, long j10, Object obj, Continuation continuation) {
            this.f73185b = b0Var;
            this.f73186c = j10;
            this.f73187d = obj;
            this.f73188e = continuation;
        }

        @Override // eg.p0
        public void dispose() {
            this.f73185b.y(this);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gg.a.values().length];
            try {
                iArr[gg.a.f72765b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg.a.f72767d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gg.a.f72766c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73189r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73190s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f73192u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f73193v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f73195x;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73193v = obj;
            this.f73195x |= Integer.MIN_VALUE;
            return b0.A(b0.this, null, this);
        }
    }

    public b0(int i10, int i11, gg.a aVar) {
        this.f73177f = i10;
        this.f73178g = i11;
        this.f73179h = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((hg.n0) r9).a(r0) == r1) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object A(hg.b0 r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.b0.A(hg.b0, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void B(long j10) {
        ig.d[] dVarArr;
        if (((ig.b) this).f74750c != 0 && (dVarArr = ((ig.b) this).f74749b) != null) {
            for (ig.d dVar : dVarArr) {
                if (dVar != null) {
                    d0 d0Var = (d0) dVar;
                    long j11 = d0Var.f73202a;
                    if (j11 >= 0 && j11 < j10) {
                        d0Var.f73202a = j10;
                    }
                }
            }
        }
        this.f73182k = j10;
    }

    private final void E() {
        Object[] objArr = this.f73180i;
        Intrinsics.checkNotNull(objArr);
        c0.g(objArr, K(), null);
        this.f73183l--;
        long jK = K() + 1;
        if (this.f73181j < jK) {
            this.f73181j = jK;
        }
        if (this.f73182k < jK) {
            B(jK);
        }
    }

    static /* synthetic */ Object F(b0 b0Var, Object obj, Continuation continuation) throws Throwable {
        if (b0Var.g(obj)) {
            return Unit.f93236a;
        }
        Object objG = b0Var.G(obj, continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    private final Object G(Object obj, Continuation continuation) throws Throwable {
        Throwable th2;
        Continuation[] continuationArrI;
        a aVar;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        Continuation[] continuationArrI2 = ig.c.f74753a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        Result.Companion companion = Result.f93230c;
                        eVar.resumeWith(Result.b(Unit.f93236a));
                        continuationArrI = I(continuationArrI2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), obj, eVar);
                        H(aVar);
                        this.f73184m++;
                        if (this.f73178g == 0) {
                            continuationArrI2 = I(continuationArrI2);
                        }
                        continuationArrI = continuationArrI2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    eg.l.a(eVar, aVar);
                }
                for (Continuation continuation2 : continuationArrI) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.f93230c;
                        continuation2.resumeWith(Result.b(Unit.f93236a));
                    }
                }
                Object objC = eVar.C();
                if (objC == pf.b.g()) {
                    kotlin.coroutines.jvm.internal.g.c(continuation);
                }
                return objC == pf.b.g() ? objC : Unit.f93236a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int iP = P();
        Object[] objArrQ = this.f73180i;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        c0.g(objArrQ, K() + ((long) iP), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] I(Continuation[] continuationArr) {
        ig.d[] dVarArr;
        d0 d0Var;
        Continuation continuation;
        int length = continuationArr.length;
        if (((ig.b) this).f74750c != 0 && (dVarArr = ((ig.b) this).f74749b) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            continuationArr = continuationArr;
            while (i10 < length2) {
                ig.d dVar = dVarArr[i10];
                if (dVar != null && (continuation = (d0Var = (d0) dVar).f73203b) != null && T(d0Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = continuation;
                    d0Var.f73203b = null;
                    length++;
                }
                i10++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    private final long J() {
        return K() + ((long) this.f73183l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f73182k, this.f73181j);
    }

    private final Object M(long j10) {
        Object[] objArr = this.f73180i;
        Intrinsics.checkNotNull(objArr);
        Object objF = c0.f(objArr, j10);
        return objF instanceof a ? ((a) objF).f73187d : objF;
    }

    private final long N() {
        return K() + ((long) this.f73183l) + ((long) this.f73184m);
    }

    private final int O() {
        return (int) ((K() + ((long) this.f73183l)) - this.f73181j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f73183l + this.f73184m;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.f73180i = objArr2;
        if (objArr != null) {
            long jK = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = ((long) i12) + jK;
                c0.g(objArr2, j10, c0.f(objArr, j10));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f73183l >= this.f73178g && this.f73182k <= this.f73181j) {
            int i10 = b.$EnumSwitchMapping$0[this.f73179h.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new lf.m();
            }
        }
        H(obj);
        int i11 = this.f73183l + 1;
        this.f73183l = i11;
        if (i11 > this.f73178g) {
            E();
        }
        if (O() > this.f73177f) {
            V(this.f73181j + 1, this.f73182k, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f73177f == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f73183l + 1;
        this.f73183l = i10;
        if (i10 > this.f73177f) {
            E();
        }
        this.f73182k = K() + ((long) this.f73183l);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(d0 d0Var) {
        long j10 = d0Var.f73202a;
        if (j10 >= J() && (this.f73178g > 0 || j10 > K() || this.f73184m == 0)) {
            return -1L;
        }
        return j10;
    }

    private final Object U(d0 d0Var) {
        Object obj;
        Continuation[] continuationArrW = ig.c.f74753a;
        synchronized (this) {
            try {
                long jT = T(d0Var);
                if (jT < 0) {
                    obj = c0.f73196a;
                } else {
                    long j10 = d0Var.f73202a;
                    Object objM = M(jT);
                    d0Var.f73202a = jT + 1;
                    continuationArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArrW) {
            if (continuation != null) {
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(Unit.f93236a));
            }
        }
        return obj;
    }

    private final void V(long j10, long j11, long j12, long j13) {
        long jMin = Math.min(j11, j10);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.f73180i;
            Intrinsics.checkNotNull(objArr);
            c0.g(objArr, jK, null);
        }
        this.f73181j = j10;
        this.f73182k = j11;
        this.f73183l = (int) (j12 - jMin);
        this.f73184m = (int) (j13 - j12);
    }

    private final Object x(d0 d0Var, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        synchronized (this) {
            try {
                if (T(d0Var) < 0) {
                    d0Var.f73203b = eVar;
                } else {
                    Result.Companion companion = Result.f93230c;
                    eVar.resumeWith(Result.b(Unit.f93236a));
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        synchronized (this) {
            if (aVar.f73186c < K()) {
                return;
            }
            Object[] objArr = this.f73180i;
            Intrinsics.checkNotNull(objArr);
            if (c0.f(objArr, aVar.f73186c) != aVar) {
                return;
            }
            c0.g(objArr, aVar.f73186c, c0.f73196a);
            z();
            Unit unit = Unit.f93236a;
        }
    }

    private final void z() {
        if (this.f73178g != 0 || this.f73184m > 1) {
            Object[] objArr = this.f73180i;
            Intrinsics.checkNotNull(objArr);
            while (this.f73184m > 0 && c0.f(objArr, (K() + ((long) P())) - 1) == c0.f73196a) {
                this.f73184m--;
                c0.g(objArr, K() + ((long) P()), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ig.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d0 i() {
        return new d0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ig.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public d0[] j(int i10) {
        return new d0[i10];
    }

    protected final Object L() {
        Object[] objArr = this.f73180i;
        Intrinsics.checkNotNull(objArr);
        return c0.f(objArr, (this.f73181j + ((long) O())) - 1);
    }

    public final Continuation[] W(long j10) {
        long j11;
        long j12;
        long j13;
        ig.d[] dVarArr;
        if (j10 > this.f73182k) {
            return ig.c.f74753a;
        }
        long jK = K();
        long j14 = ((long) this.f73183l) + jK;
        if (this.f73178g == 0 && this.f73184m > 0) {
            j14++;
        }
        if (((ig.b) this).f74750c != 0 && (dVarArr = ((ig.b) this).f74749b) != null) {
            for (ig.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((d0) dVar).f73202a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f73182k) {
            return ig.c.f74753a;
        }
        long J = J();
        int iMin = l() > 0 ? Math.min(this.f73184m, this.f73178g - ((int) (J - j14))) : this.f73184m;
        Continuation[] continuationArr = ig.c.f74753a;
        long j16 = ((long) this.f73184m) + J;
        if (iMin > 0) {
            continuationArr = new Continuation[iMin];
            Object[] objArr = this.f73180i;
            Intrinsics.checkNotNull(objArr);
            j13 = 1;
            long j17 = J;
            int i10 = 0;
            while (true) {
                if (J >= j16) {
                    j11 = jK;
                    j12 = j14;
                    J = j17;
                    break;
                }
                Object objF = c0.f(objArr, J);
                j11 = jK;
                jg.e0 e0Var = c0.f73196a;
                if (objF != e0Var) {
                    Intrinsics.checkNotNull(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j12 = j14;
                    continuationArr[i10] = aVar.f73188e;
                    c0.g(objArr, J, e0Var);
                    c0.g(objArr, j17, aVar.f73187d);
                    long j18 = j17 + 1;
                    if (i11 >= iMin) {
                        J = j18;
                        break;
                    }
                    i10 = i11;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J++;
                jK = j11;
                j14 = j12;
            }
        } else {
            j11 = jK;
            j12 = j14;
            j13 = 1;
        }
        Continuation[] continuationArr2 = continuationArr;
        int i12 = (int) (J - j11);
        long j19 = l() == 0 ? J : j12;
        long jMax = Math.max(this.f73181j, J - ((long) Math.min(this.f73177f, i12)));
        if (this.f73178g == 0 && jMax < j16) {
            Object[] objArr2 = this.f73180i;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.areEqual(c0.f(objArr2, jMax), c0.f73196a)) {
                J += j13;
                jMax += j13;
            }
        }
        V(jMax, j19, J, j16);
        z();
        return !(continuationArr2.length == 0) ? I(continuationArr2) : continuationArr2;
    }

    public final long X() {
        long j10 = this.f73181j;
        if (j10 < this.f73182k) {
            this.f73182k = j10;
        }
        return j10;
    }

    @Override // ig.q
    public Flow a(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return c0.e(this, coroutineContext, i10, aVar);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return A(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void d() throws Throwable {
        synchronized (this) {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                V(J(), this.f73182k, J(), N());
                Unit unit = Unit.f93236a;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        return F(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean g(Object obj) {
        int i10;
        boolean z10;
        Continuation[] continuationArrI = ig.c.f74753a;
        synchronized (this) {
            if (R(obj)) {
                continuationArrI = I(continuationArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Continuation continuation : continuationArrI) {
            if (continuation != null) {
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(Unit.f93236a));
            }
        }
        return z10;
    }
}
