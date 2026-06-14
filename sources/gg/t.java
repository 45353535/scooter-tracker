package gg;

import eg.a0;
import eg.f0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f72836r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f72837s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f72838t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f72839u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f72838t = obj;
            this.f72839u |= Integer.MIN_VALUE;
            return t.b(null, null, this);
        }
    }

    static final class b implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CancellableContinuation f72840b;

        b(CancellableContinuation cancellableContinuation) {
            this.f72840b = cancellableContinuation;
        }

        public final void a(Throwable th2) {
            CancellableContinuation cancellableContinuation = this.f72840b;
            Result.Companion companion = Result.f93230c;
            cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(gg.v r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof gg.t.a
            if (r0 == 0) goto L13
            r0 = r6
            gg.t$a r0 = (gg.t.a) r0
            int r1 = r0.f72839u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f72839u = r1
            goto L18
        L13:
            gg.t$a r0 = new gg.t$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f72838t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f72839u
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f72837s
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f72836r
            gg.v r4 = (gg.v) r4
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.d.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            kotlinx.coroutines.Job$b r2 = kotlinx.coroutines.Job.N8
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f72836r = r4     // Catch: java.lang.Throwable -> L32
            r0.f72837s = r5     // Catch: java.lang.Throwable -> L32
            r0.f72839u = r3     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.e r6 = new kotlinx.coroutines.e     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.Continuation r2 = pf.b.d(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.I()     // Catch: java.lang.Throwable -> L32
            gg.t$b r2 = new gg.t$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.b(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.C()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = pf.b.g()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.g.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.t.b(gg.v, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(v vVar, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: gg.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return t.d();
                }
            };
        }
        return b(vVar, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d() {
        return Unit.f93236a;
    }

    public static final x e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i10, gg.a aVar, f0 f0Var, Function1 function1, Function2 function2) {
        u uVar = new u(a0.k(coroutineScope, coroutineContext), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            uVar.q(function1);
        }
        uVar.a1(f0Var, uVar, function2);
        return uVar;
    }

    public static final x f(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i10, Function2 function2) {
        return e(coroutineScope, coroutineContext, i10, gg.a.f72765b, f0.f69146b, null, function2);
    }

    public static /* synthetic */ x g(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i10, gg.a aVar, f0 f0Var, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = gg.a.f72765b;
        }
        if ((i11 & 8) != 0) {
            f0Var = f0.f69146b;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return e(coroutineScope, coroutineContext, i10, aVar, f0Var, function12, function2);
    }

    public static /* synthetic */ x h(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return f(coroutineScope, coroutineContext, i10, function2);
    }
}
