package eg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f69182r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f69183s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f69184t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f69185u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f69186v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f69185u = obj;
            this.f69186v |= Integer.MIN_VALUE;
            return x1.e(0L, null, this);
        }
    }

    public static final v1 a(long j10, kotlinx.coroutines.k kVar, Job job) {
        return new v1("Timed out waiting for " + j10 + " ms", job);
    }

    private static final Object b(w1 w1Var, Function2 function2) {
        kotlinx.coroutines.z.l(w1Var, k0.c(w1Var.f85861e.getContext()).f(w1Var.f69180f, w1Var, w1Var.getContext()));
        return kg.b.e(w1Var, w1Var, function2);
    }

    public static final Object c(long j10, Function2 function2, Continuation continuation) {
        if (j10 <= 0) {
            throw new v1("Timed out immediately");
        }
        Object objB = b(new w1(j10, continuation), function2);
        if (objB == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objB;
    }

    public static final Object d(long j10, Function2 function2, Continuation continuation) {
        return c(k0.d(j10), function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(long r7, kotlin.jvm.functions.Function2 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof eg.x1.a
            if (r0 == 0) goto L13
            r0 = r10
            eg.x1$a r0 = (eg.x1.a) r0
            int r1 = r0.f69186v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69186v = r1
            goto L18
        L13:
            eg.x1$a r0 = new eg.x1$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f69185u
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f69186v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f69184t
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.f69183s
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.d.b(r10)     // Catch: eg.v1 -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.d.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f69183s = r9     // Catch: eg.v1 -> L68
            r0.f69184t = r10     // Catch: eg.v1 -> L68
            r0.f69182r = r7     // Catch: eg.v1 -> L68
            r0.f69186v = r4     // Catch: eg.v1 -> L68
            eg.w1 r2 = new eg.w1     // Catch: eg.v1 -> L68
            r2.<init>(r7, r0)     // Catch: eg.v1 -> L68
            r10.f93280b = r2     // Catch: eg.v1 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: eg.v1 -> L68
            java.lang.Object r8 = pf.b.g()     // Catch: eg.v1 -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.g.c(r0)     // Catch: eg.v1 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            kotlinx.coroutines.Job r9 = r8.f69179b
            java.lang.Object r7 = r7.f93280b
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.x1.e(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object f(long j10, Function2 function2, Continuation continuation) {
        return e(k0.d(j10), function2, continuation);
    }
}
