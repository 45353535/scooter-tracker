package oe;

import io.ktor.utils.io.e;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.Job;
import pe.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final yh.d f96844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ue.a f96845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final pe.b f96846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ze.a f96847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ze.a f96848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ze.a f96849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ze.a f96850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ze.a f96851h;

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f96852b = new a();

        a() {
            super(0, m0.class, "<init>", "<init>()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final m0 invoke() {
            return new m0();
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {
        private /* synthetic */ Object A;
        /* synthetic */ Object B;
        final /* synthetic */ Function3 C;
        final /* synthetic */ Function3 D;
        final /* synthetic */ int E;
        final /* synthetic */ Function2 F;
        final /* synthetic */ Function2 G;
        final /* synthetic */ pe.d H;
        final /* synthetic */ Function2 I;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f96853r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f96854s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f96855t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f96856u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f96857v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f96858w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f96859x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f96860y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f96861z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function3 function3, Function3 function32, int i10, Function2 function2, Function2 function22, pe.d dVar, Function2 function23, Continuation continuation) {
            super(3, continuation);
            this.C = function3;
            this.D = function32;
            this.E = i10;
            this.F = function2;
            this.G = function22;
            this.H = dVar;
            this.I = function23;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(m.a aVar, re.d dVar, Continuation continuation) {
            b bVar = new b(this.C, this.D, this.E, this.F, this.G, this.H, this.I, continuation);
            bVar.A = aVar;
            bVar.B = dVar;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0154 A[Catch: all -> 0x0135, PHI: r0 r7 r8 r9 r10 r11 r12 r13 r14 r15
  0x0154: PHI (r0v6 java.lang.Object) = (r0v11 java.lang.Object), (r0v23 java.lang.Object) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r7v5 int) = (r7v6 int), (r7v11 int) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r8v6 int) = (r8v8 int), (r8v16 int) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r9v3 re.d) = (r9v4 re.d), (r9v14 re.d) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r10v4 kotlin.jvm.functions.Function2) = (r10v5 kotlin.jvm.functions.Function2), (r10v17 kotlin.jvm.functions.Function2) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r11v4 kotlin.jvm.functions.Function2) = (r11v5 kotlin.jvm.functions.Function2), (r11v15 kotlin.jvm.functions.Function2) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r12v4 kotlin.jvm.functions.Function3) = (r12v5 kotlin.jvm.functions.Function3), (r12v16 kotlin.jvm.functions.Function3) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r13v4 kotlin.jvm.functions.Function3) = (r13v5 kotlin.jvm.functions.Function3), (r13v12 kotlin.jvm.functions.Function3) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r14v4 re.d) = (r14v5 re.d), (r14v11 re.d) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r15v5 pe.m$a) = (r15v6 pe.m$a), (r15v11 pe.m$a) binds: [B:42:0x0150, B:18:0x00a2] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0135, blocks: (B:38:0x0120, B:41:0x0138, B:44:0x0154, B:46:0x015c), top: B:64:0x0120 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015c A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #1 {all -> 0x0135, blocks: (B:38:0x0120, B:41:0x0138, B:44:0x0154, B:46:0x015c), top: B:64:0x0120 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0180 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:48:0x0175, B:52:0x0180, B:12:0x0071, B:17:0x009f), top: B:63:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01f1 -> B:8:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 546
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: oe.p0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        KType kTypeO;
        char c10;
        KType kTypeR;
        KType kTypeR2;
        KType kTypeR3;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        f96844a = df.a.a("io.ktor.client.plugins.HttpRequestRetry");
        f96845b = new ue.a();
        f96846c = pe.i.b("RetryFeature", a.f96852b, new Function1() { // from class: oe.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p0.c((pe.d) obj);
            }
        });
        KClass kClassB = kotlin.jvm.internal.v0.b(Integer.class);
        KType kTypeR4 = null;
        try {
            kTypeO = kotlin.jvm.internal.v0.o(cls2);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f96847d = new ze.a("MaxRetriesPerRequestAttributeKey", new ff.a(kClassB, kTypeO));
        KClass kClassB2 = kotlin.jvm.internal.v0.b(Function3.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            c10 = 2;
            try {
                kTypeR = kotlin.jvm.internal.v0.r(Function3.class, companion.invariant(kotlin.jvm.internal.v0.o(u0.class)), companion.invariant(kotlin.jvm.internal.v0.o(re.b.class)), companion.invariant(kotlin.jvm.internal.v0.o(se.c.class)), companion.invariant(kotlin.jvm.internal.v0.o(cls)));
            } catch (Throwable unused2) {
                kTypeR = null;
            }
        } catch (Throwable unused3) {
            c10 = 2;
        }
        f96848e = new ze.a("ShouldRetryPerRequestAttributeKey", new ff.a(kClassB2, kTypeR));
        KClass kClassB3 = kotlin.jvm.internal.v0.b(Function3.class);
        try {
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KTypeProjection kTypeProjectionInvariant = companion2.invariant(kotlin.jvm.internal.v0.o(u0.class));
            KTypeProjection kTypeProjectionInvariant2 = companion2.invariant(kotlin.jvm.internal.v0.o(re.d.class));
            KTypeProjection kTypeProjectionInvariant3 = companion2.invariant(kotlin.jvm.internal.v0.o(Throwable.class));
            KTypeProjection kTypeProjectionInvariant4 = companion2.invariant(kotlin.jvm.internal.v0.o(cls));
            KTypeProjection[] kTypeProjectionArr = new KTypeProjection[4];
            kTypeProjectionArr[0] = kTypeProjectionInvariant;
            kTypeProjectionArr[1] = kTypeProjectionInvariant2;
            kTypeProjectionArr[c10] = kTypeProjectionInvariant3;
            kTypeProjectionArr[3] = kTypeProjectionInvariant4;
            kTypeR2 = kotlin.jvm.internal.v0.r(Function3.class, kTypeProjectionArr);
        } catch (Throwable unused4) {
            kTypeR2 = null;
        }
        f96849f = new ze.a("ShouldRetryOnExceptionPerRequestAttributeKey", new ff.a(kClassB3, kTypeR2));
        KClass kClassB4 = kotlin.jvm.internal.v0.b(Function2.class);
        try {
            KTypeProjection.Companion companion3 = KTypeProjection.INSTANCE;
            KTypeProjection kTypeProjectionInvariant5 = companion3.invariant(kotlin.jvm.internal.v0.o(t0.class));
            KTypeProjection kTypeProjectionInvariant6 = companion3.invariant(kotlin.jvm.internal.v0.o(re.d.class));
            KTypeProjection kTypeProjectionInvariant7 = companion3.invariant(kotlin.jvm.internal.v0.o(Unit.class));
            KTypeProjection[] kTypeProjectionArr2 = new KTypeProjection[3];
            kTypeProjectionArr2[0] = kTypeProjectionInvariant5;
            kTypeProjectionArr2[1] = kTypeProjectionInvariant6;
            kTypeProjectionArr2[c10] = kTypeProjectionInvariant7;
            kTypeR3 = kotlin.jvm.internal.v0.r(Function2.class, kTypeProjectionArr2);
        } catch (Throwable unused5) {
            kTypeR3 = null;
        }
        f96850g = new ze.a("ModifyRequestPerRequestAttributeKey", new ff.a(kClassB4, kTypeR3));
        KClass kClassB5 = kotlin.jvm.internal.v0.b(Function2.class);
        try {
            KTypeProjection.Companion companion4 = KTypeProjection.INSTANCE;
            KTypeProjection kTypeProjectionInvariant8 = companion4.invariant(kotlin.jvm.internal.v0.o(r0.class));
            KTypeProjection kTypeProjectionInvariant9 = companion4.invariant(kotlin.jvm.internal.v0.o(cls2));
            KTypeProjection kTypeProjectionInvariant10 = companion4.invariant(kotlin.jvm.internal.v0.o(Long.TYPE));
            KTypeProjection[] kTypeProjectionArr3 = new KTypeProjection[3];
            kTypeProjectionArr3[0] = kTypeProjectionInvariant8;
            kTypeProjectionArr3[1] = kTypeProjectionInvariant9;
            kTypeProjectionArr3[c10] = kTypeProjectionInvariant10;
            kTypeR4 = kotlin.jvm.internal.v0.r(Function2.class, kTypeProjectionArr3);
        } catch (Throwable unused6) {
        }
        f96851h = new ze.a("RetryDelayPerRequestAttributeKey", new ff.a(kClassB5, kTypeR4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(pe.d createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        Function3 function3P = ((m0) createClientPlugin.e()).p();
        Function3 function3Q = ((m0) createClientPlugin.e()).q();
        Function2 function2M = ((m0) createClientPlugin.e()).m();
        Function2 function2L = ((m0) createClientPlugin.e()).l();
        createClientPlugin.f(pe.m.f98287a, new b(function3P, function3Q, ((m0) createClientPlugin.e()).n(), function2M, ((m0) createClientPlugin.e()).o(), createClientPlugin, function2L, null));
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final re.d d(re.d dVar) {
        final re.d dVarP = new re.d().p(dVar);
        dVar.g().q(new Function1() { // from class: oe.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p0.e(dVarP, (Throwable) obj);
            }
        });
        return dVarP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(re.d dVar, Throwable th2) {
        Job jobG = dVar.g();
        Intrinsics.checkNotNull(jobG, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        eg.s sVar = (eg.s) jobG;
        if (th2 == null) {
            sVar.complete();
        } else {
            sVar.d(th2);
        }
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(int i10, int i11, Function3 function3, je.b bVar) {
        return i10 < i11 && ((Boolean) function3.invoke(new u0(i10 + 1), bVar.d(), bVar.e())).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(int i10, int i11, Function3 function3, re.d dVar, Throwable th2) {
        return i10 < i11 && ((Boolean) function3.invoke(new u0(i10 + 1), dVar, th2)).booleanValue();
    }

    public static final pe.b s() {
        return f96846c;
    }

    public static final ue.a t() {
        return f96845b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(Throwable th2) {
        Throwable thA = te.c.a(th2);
        return (thA instanceof q0) || (thA instanceof ne.a) || (thA instanceof SocketTimeoutException);
    }

    public static final void v(re.d dVar, Function1 block) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        m0 m0Var = new m0();
        block.invoke(m0Var);
        dVar.c().e(f96848e, m0Var.p());
        dVar.c().e(f96849f, m0Var.q());
        dVar.c().e(f96851h, m0Var.m());
        dVar.c().e(f96847d, Integer.valueOf(m0Var.n()));
        dVar.c().e(f96850g, m0Var.o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w(se.c cVar, Continuation continuation) {
        return q.l(cVar) ? e.b.a(cVar.a(), 0, continuation, 1, null) : kotlin.coroutines.jvm.internal.b.a(false);
    }
}
