package jg;

import eg.p1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f85880a = new e0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f85881b = new e0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(kotlin.coroutines.Continuation r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof jg.i
            if (r0 == 0) goto Lb2
            jg.i r6 = (jg.i) r6
            java.lang.Object r0 = eg.v.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r1 = r6.f85876e
            kotlin.coroutines.CoroutineContext r2 = r6.getContext()
            boolean r1 = d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f85878g = r0
            r6.f93627d = r2
            kotlinx.coroutines.CoroutineDispatcher r7 = r6.f85876e
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            c(r7, r0, r6)
            goto Lac
        L26:
            eg.p1 r1 = eg.p1.f69163a
            eg.r0 r1 = r1.b()
            boolean r3 = r1.r0()
            if (r3 == 0) goto L3b
            r6.f85878g = r0
            r6.f93627d = r2
            r1.y(r6)
            goto Lac
        L3b:
            r1.R(r2)
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.Job$b r4 = kotlinx.coroutines.Job.N8     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.W()     // Catch: java.lang.Throwable -> L67
            r6.d(r0, r7)     // Catch: java.lang.Throwable -> L67
            kotlin.Result$Companion r0 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.d.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            kotlin.coroutines.Continuation r0 = r6.f85877f     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f85879h     // Catch: java.lang.Throwable -> L67
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = jg.l0.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            jg.e0 r5 = jg.l0.f85891a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            eg.y1 r0 = eg.a0.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            kotlin.coroutines.Continuation r5 = r6.f85877f     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            kotlin.Unit r7 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.c1()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            jg.l0.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.u0()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.m(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.c1()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            jg.l0.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.h(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.m(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jg.j.b(kotlin.coroutines.Continuation, java.lang.Object):void");
    }

    public static final void c(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            coroutineDispatcher.dispatch(coroutineContext, runnable);
        } catch (Throwable th2) {
            throw new eg.l0(th2, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean d(CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) throws eg.l0 {
        try {
            return coroutineDispatcher.isDispatchNeeded(coroutineContext);
        } catch (Throwable th2) {
            throw new eg.l0(th2, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean e(i iVar) {
        Unit unit = Unit.f93236a;
        eg.r0 r0VarB = p1.f69163a.b();
        if (r0VarB.s0()) {
            return false;
        }
        if (r0VarB.r0()) {
            iVar.f85878g = unit;
            iVar.f93627d = 1;
            r0VarB.y(iVar);
            return true;
        }
        r0VarB.R(true);
        try {
            iVar.run();
            do {
            } while (r0VarB.u0());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
