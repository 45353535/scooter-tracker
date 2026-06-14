package eg;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.coroutines.CoroutineContext r4, kotlin.jvm.functions.Function2 r5) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            kotlin.coroutines.d$b r1 = kotlin.coroutines.d.M8
            kotlin.coroutines.CoroutineContext$Element r1 = r4.get(r1)
            kotlin.coroutines.d r1 = (kotlin.coroutines.d) r1
            if (r1 != 0) goto L1f
            eg.p1 r1 = eg.p1.f69163a
            eg.r0 r1 = r1.b()
            eg.x0 r2 = eg.x0.f69181b
            kotlin.coroutines.CoroutineContext r4 = r4.plus(r1)
            kotlin.coroutines.CoroutineContext r4 = eg.a0.k(r2, r4)
            goto L42
        L1f:
            boolean r2 = r1 instanceof eg.r0
            r3 = 0
            if (r2 == 0) goto L27
            eg.r0 r1 = (eg.r0) r1
            goto L28
        L27:
            r1 = r3
        L28:
            if (r1 == 0) goto L36
            boolean r2 = r1.x0()
            if (r2 == 0) goto L31
            r3 = r1
        L31:
            if (r3 != 0) goto L34
            goto L36
        L34:
            r1 = r3
            goto L3c
        L36:
            eg.p1 r1 = eg.p1.f69163a
            eg.r0 r1 = r1.a()
        L3c:
            eg.x0 r2 = eg.x0.f69181b
            kotlin.coroutines.CoroutineContext r4 = eg.a0.k(r2, r4)
        L42:
            eg.e r2 = new eg.e
            r2.<init>(r4, r0, r1)
            eg.f0 r4 = eg.f0.f69146b
            r2.a1(r4, r2, r5)
            java.lang.Object r4 = r2.b1()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.h.a(kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        return g.e(coroutineContext, function2);
    }
}
