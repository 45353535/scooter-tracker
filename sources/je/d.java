package je;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f85837r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f85838s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f85839t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f85838s = obj;
            this.f85839t |= Integer.MIN_VALUE;
            return d.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(je.b r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof je.d.a
            if (r0 == 0) goto L13
            r0 = r5
            je.d$a r0 = (je.d.a) r0
            int r1 = r0.f85839t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f85839t = r1
            goto L18
        L13:
            je.d$a r0 = new je.d$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f85838s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f85839t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f85837r
            je.b r4 = (je.b) r4
            kotlin.d.b(r5)
            goto L4b
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.d.b(r5)
            se.c r5 = r4.e()
            io.ktor.utils.io.e r5 = r5.a()
            r0.f85837r = r4
            r0.f85839t = r3
            java.lang.Object r5 = io.ktor.utils.io.h.j(r5, r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            pg.s r5 = (pg.s) r5
            byte[] r5 = pg.t.c(r5)
            je.e r0 = new je.e
            ie.c r1 = r4.c()
            re.b r2 = r4.d()
            se.c r4 = r4.e()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je.d.a(je.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
