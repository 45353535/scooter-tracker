package oe;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function3 f96829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function3 f96830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function2 f96831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function2 f96832d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function2 f96833e = new Function2() { // from class: oe.h0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return m0.s((t0) obj, (re.d) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96834f;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f96835r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ long f96836s;

        a(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(long j10, Continuation continuation) {
            return ((a) create(Long.valueOf(j10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f96836s = ((Number) obj).longValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Number) obj).longValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f96835r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                long j10 = this.f96836s;
                this.f96835r = 1;
                if (eg.k0.a(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public m0() {
        z(3);
        j(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(u0 retryIf, re.b bVar, se.c response) {
        Intrinsics.checkNotNullParameter(retryIf, "$this$retryIf");
        Intrinsics.checkNotNullParameter(bVar, "<unused var>");
        Intrinsics.checkNotNullParameter(response, "response");
        int iE0 = response.d().e0();
        return 500 <= iE0 && iE0 < 600;
    }

    public static /* synthetic */ void g(m0 m0Var, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        m0Var.f(z10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h(boolean z10, Function2 function2, r0 r0Var, int i10) {
        ve.o headers;
        String str;
        Long lX;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        if (!z10) {
            return ((Number) function2.invoke(r0Var, Integer.valueOf(i10))).longValue();
        }
        se.c cVarA = r0Var.a();
        Long lValueOf = (cVarA == null || (headers = cVarA.getHeaders()) == null || (str = headers.get(ve.u.f106718a.u())) == null || (lX = StringsKt.x(str)) == null) ? null : Long.valueOf(lX.longValue() * ((long) 1000));
        return Math.max(((Number) function2.invoke(r0Var, Integer.valueOf(i10))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public static /* synthetic */ void j(m0 m0Var, double d10, long j10, long j11, long j12, boolean z10, int i10, Object obj) {
        m0Var.i((i10 & 1) != 0 ? 2.0d : d10, (i10 & 2) != 0 ? 1000L : j10, (i10 & 4) != 0 ? 60000L : j11, (i10 & 8) == 0 ? j12 : 1000L, (i10 & 16) != 0 ? true : z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(double d10, long j10, long j11, m0 m0Var, long j12, r0 delayMillis, int i10) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return Math.min((long) (Math.pow(d10, i10 - 1) * j10), j11) + m0Var.t(j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(t0 t0Var, re.d it) {
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f93236a;
    }

    private final long t(long j10) {
        if (j10 == 0) {
            return 0L;
        }
        return kotlin.random.d.f93341b.m(j10);
    }

    public static /* synthetic */ void w(m0 m0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        m0Var.v(i10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(boolean z10, u0 retryOnExceptionIf, re.d dVar, Throwable cause) {
        Intrinsics.checkNotNullParameter(retryOnExceptionIf, "$this$retryOnExceptionIf");
        Intrinsics.checkNotNullParameter(dVar, "<unused var>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        return p0.u(cause) ? z10 : !(cause instanceof CancellationException);
    }

    public final void A(int i10) {
        u(i10, new Function3() { // from class: oe.l0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(m0.B((u0) obj, (re.b) obj2, (se.c) obj3));
            }
        });
    }

    public final void C(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f96831c = function2;
    }

    public final void D(int i10) {
        this.f96834f = i10;
    }

    public final void E(Function3 function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.f96829a = function3;
    }

    public final void F(Function3 function3) {
        Intrinsics.checkNotNullParameter(function3, "<set-?>");
        this.f96830b = function3;
    }

    public final void f(final boolean z10, final Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        C(new Function2() { // from class: oe.j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(m0.h(z10, block, (r0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public final void i(final double d10, final long j10, final long j11, final long j12, boolean z10) {
        if (d10 <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (j10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (j12 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        f(z10, new Function2() { // from class: oe.k0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(m0.k(d10, j10, j11, this, j12, (r0) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    public final Function2 l() {
        return this.f96832d;
    }

    public final Function2 m() {
        Function2 function2 = this.f96831c;
        if (function2 != null) {
            return function2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delayMillis");
        return null;
    }

    public final int n() {
        return this.f96834f;
    }

    public final Function2 o() {
        return this.f96833e;
    }

    public final Function3 p() {
        Function3 function3 = this.f96829a;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetry");
        return null;
    }

    public final Function3 q() {
        Function3 function3 = this.f96830b;
        if (function3 != null) {
            return function3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shouldRetryOnException");
        return null;
    }

    public final void r(Function2 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f96833e = block;
    }

    public final void u(int i10, Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 != -1) {
            this.f96834f = i10;
        }
        E(block);
    }

    public final void v(int i10, final boolean z10) {
        y(i10, new Function3() { // from class: oe.i0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(m0.x(z10, (u0) obj, (re.d) obj2, (Throwable) obj3));
            }
        });
    }

    public final void y(int i10, Function3 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 != -1) {
            this.f96834f = i10;
        }
        F(block);
    }

    public final void z(int i10) {
        A(i10);
        w(this, i10, false, 2, null);
    }
}
