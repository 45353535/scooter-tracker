package se;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f100033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ie.c f100034b;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f100035r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f100036s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f100038u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f100036s = obj;
            this.f100038u |= Integer.MIN_VALUE;
            return g.this.a(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f100039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f100040s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f100042u;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f100040s = obj;
            this.f100042u |= Integer.MIN_VALUE;
            return g.this.c(this);
        }
    }

    public g(re.d builder, ie.c client) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f100033a = builder;
        this.f100034b = client;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(se.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof se.g.a
            if (r0 == 0) goto L13
            r0 = r6
            se.g$a r0 = (se.g.a) r0
            int r1 = r0.f100038u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100038u = r1
            goto L18
        L13:
            se.g$a r0 = new se.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f100036s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f100038u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f100035r
            eg.s r5 = (eg.s) r5
            kotlin.d.b(r6)
            goto L5c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r5.getCoroutineContext()
            kotlinx.coroutines.Job$b r2 = kotlinx.coroutines.Job.N8
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            eg.s r6 = (eg.s) r6
            r6.complete()
            io.ktor.utils.io.e r5 = r5.a()     // Catch: java.lang.Throwable -> L51
            io.ktor.utils.io.f.a(r5)     // Catch: java.lang.Throwable -> L51
        L51:
            r0.f100035r = r6
            r0.f100038u = r3
            java.lang.Object r5 = r6.i0(r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.g.a(se.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(Continuation continuation) {
        return c(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof se.g.b
            if (r0 == 0) goto L13
            r0 = r7
            se.g$b r0 = (se.g.b) r0
            int r1 = r0.f100042u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100042u = r1
            goto L18
        L13:
            se.g$b r0 = new se.g$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100040s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f100042u
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f100039r
            se.c r0 = (se.c) r0
            kotlin.d.b(r7)     // Catch: java.util.concurrent.CancellationException -> L33
            return r0
        L33:
            r7 = move-exception
            goto L86
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3d:
            java.lang.Object r2 = r0.f100039r
            je.b r2 = (je.b) r2
            kotlin.d.b(r7)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L70
        L45:
            kotlin.d.b(r7)     // Catch: java.util.concurrent.CancellationException -> L33
            goto L62
        L49:
            kotlin.d.b(r7)
            re.d r7 = new re.d     // Catch: java.util.concurrent.CancellationException -> L33
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L33
            re.d r2 = r6.f100033a     // Catch: java.util.concurrent.CancellationException -> L33
            re.d r7 = r7.q(r2)     // Catch: java.util.concurrent.CancellationException -> L33
            ie.c r2 = r6.f100034b     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f100042u = r5     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r7 = r2.f(r7, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r7 != r1) goto L62
            goto L84
        L62:
            r2 = r7
            je.b r2 = (je.b) r2     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f100039r = r2     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f100042u = r4     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r7 = je.d.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r7 != r1) goto L70
            goto L84
        L70:
            je.b r7 = (je.b) r7     // Catch: java.util.concurrent.CancellationException -> L33
            se.c r7 = r7.e()     // Catch: java.util.concurrent.CancellationException -> L33
            se.c r2 = r2.e()     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f100039r = r7     // Catch: java.util.concurrent.CancellationException -> L33
            r0.f100042u = r3     // Catch: java.util.concurrent.CancellationException -> L33
            java.lang.Object r0 = r6.a(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L33
            if (r0 != r1) goto L85
        L84:
            return r1
        L85:
            return r7
        L86:
            java.lang.Throwable r7 = te.c.a(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se.g.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public String toString() {
        return "HttpStatement[" + this.f100033a.i() + ']';
    }
}
