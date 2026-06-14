package me;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f94858r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f94859s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f94860t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f94859s = obj;
            this.f94860t |= Integer.MIN_VALUE;
            return d.a(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.OutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(ye.c r7, java.io.OutputStream r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.Continuation r10) throws java.io.IOException {
        /*
            boolean r9 = r10 instanceof me.d.a
            if (r9 == 0) goto L14
            r9 = r10
            me.d$a r9 = (me.d.a) r9
            int r0 = r9.f94860t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r9.f94860t = r0
        L12:
            r4 = r9
            goto L1a
        L14:
            me.d$a r9 = new me.d$a
            r9.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f94859s
            java.lang.Object r10 = pf.b.g()
            int r0 = r4.f94860t
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 == r1) goto L4e
            r7 = 2
            if (r0 == r7) goto L45
            r7 = 3
            if (r0 != r7) goto L3d
            java.lang.Object r7 = r4.f94858r
            r8 = r7
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L39
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L39
            goto L98
        L39:
            r0 = move-exception
        L3a:
            r7 = r0
            goto La7
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            java.lang.Object r7 = r4.f94858r
            r8 = r7
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L98
        L4e:
            java.lang.Object r7 = r4.f94858r
            r8 = r7
            java.io.Closeable r8 = (java.io.Closeable) r8
            kotlin.d.b(r9)     // Catch: java.lang.Throwable -> L39
            goto L86
        L57:
            kotlin.d.b(r9)
            boolean r9 = r7 instanceof ye.c.a     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L6b
            ye.c$a r7 = (ye.c.a) r7     // Catch: java.lang.Throwable -> L39
            byte[] r7 = r7.d()     // Catch: java.lang.Throwable -> L39
            r8.write(r7)     // Catch: java.lang.Throwable -> L39
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L39
            r1 = r8
            goto L97
        L6b:
            boolean r9 = r7 instanceof ye.c.AbstractC1337c     // Catch: java.lang.Throwable -> L8d
            if (r9 == 0) goto L90
            ye.c$c r7 = (ye.c.AbstractC1337c) r7     // Catch: java.lang.Throwable -> L8d
            io.ktor.utils.io.e r0 = r7.d()     // Catch: java.lang.Throwable -> L8d
            r4.f94858r = r8     // Catch: java.lang.Throwable -> L8d
            r4.f94860t = r1     // Catch: java.lang.Throwable -> L8d
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            java.lang.Object r7 = p002if.d.b(r0, r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L89
            if (r7 != r10) goto L85
            return r10
        L85:
            r8 = r1
        L86:
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L39
            goto L98
        L89:
            r0 = move-exception
            r7 = r0
            r8 = r1
            goto La7
        L8d:
            r0 = move-exception
            r1 = r8
            goto L3a
        L90:
            r1 = r8
            boolean r7 = r7 instanceof ye.c.b     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto La1
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L89
        L97:
            r8 = r1
        L98:
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L39
            r7 = 0
            uf.c.a(r8, r7)
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        La1:
            lf.m r7 = new lf.m     // Catch: java.lang.Throwable -> L89
            r7.<init>()     // Catch: java.lang.Throwable -> L89
            throw r7     // Catch: java.lang.Throwable -> L89
        La7:
            throw r7     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            r9 = r0
            uf.c.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: me.d.a(ye.c, java.io.OutputStream, kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
