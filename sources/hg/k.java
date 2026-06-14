package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class k {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73254r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73255s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73256t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f73257u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f73258v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f73259w;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73258v = obj;
            this.f73259w |= Integer.MIN_VALUE;
            return k.d(null, null, false, this);
        }
    }

    public static final Flow b(gg.x xVar) {
        return new e(xVar, true, null, 0, null, 28, null);
    }

    public static final Object c(FlowCollector flowCollector, gg.x xVar, Continuation continuation) {
        Object objD = d(flowCollector, xVar, true, continuation);
        return objD == pf.b.g() ? objD : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(kotlinx.coroutines.flow.FlowCollector r6, gg.x r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof hg.k.a
            if (r0 == 0) goto L13
            r0 = r9
            hg.k$a r0 = (hg.k.a) r0
            int r1 = r0.f73259w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73259w = r1
            goto L18
        L13:
            hg.k$a r0 = new hg.k$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f73258v
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73259w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f73257u
            java.lang.Object r6 = r0.f73256t
            gg.i r6 = (gg.i) r6
            java.lang.Object r7 = r0.f73255s
            gg.x r7 = (gg.x) r7
            java.lang.Object r2 = r0.f73254r
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f73257u
            java.lang.Object r6 = r0.f73256t
            gg.i r6 = (gg.i) r6
            java.lang.Object r7 = r0.f73255s
            gg.x r7 = (gg.x) r7
            java.lang.Object r2 = r0.f73254r
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            kotlin.d.b(r9)
            hg.i.v(r6)
            gg.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f73254r = r6     // Catch: java.lang.Throwable -> L3c
            r0.f73255s = r7     // Catch: java.lang.Throwable -> L3c
            r0.f73256t = r9     // Catch: java.lang.Throwable -> L3c
            r0.f73257u = r8     // Catch: java.lang.Throwable -> L3c
            r0.f73259w = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f73254r = r2     // Catch: java.lang.Throwable -> L3c
            r0.f73255s = r7     // Catch: java.lang.Throwable -> L3c
            r0.f73256t = r6     // Catch: java.lang.Throwable -> L3c
            r0.f73257u = r8     // Catch: java.lang.Throwable -> L3c
            r0.f73259w = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            gg.m.a(r7, r6)
        L9a:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            gg.m.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.k.d(kotlinx.coroutines.flow.FlowCollector, gg.x, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Flow e(gg.x xVar) {
        return new e(xVar, false, null, 0, null, 28, null);
    }
}
