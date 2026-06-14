package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class c80 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f109274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d80 f109275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d80 f109276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f109277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f109278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d80 f109279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f109280h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(d80 d80Var, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f109279g = d80Var;
        this.f109280h = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c80(this.f109279g, this.f109280h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c80(this.f109279g, this.f109280h, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f109278f
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 == r3) goto L2a
            if (r1 != r2) goto L22
            yads.d80 r0 = r7.f109276d
            yads.d80 r1 = r7.f109275c
            kotlinx.coroutines.sync.Mutex r2 = r7.f109274b
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L1f
            kotlin.Result r8 = (kotlin.Result) r8     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r8 = r8.l()     // Catch: java.lang.Throwable -> L1f
            goto L6e
        L1f:
            r8 = move-exception
            goto L8c
        L22:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2a:
            boolean r1 = r7.f109277e
            yads.d80 r3 = r7.f109275c
            kotlinx.coroutines.sync.Mutex r5 = r7.f109274b
            kotlin.d.b(r8)
            r8 = r3
            goto L50
        L35:
            kotlin.d.b(r8)
            yads.d80 r8 = r7.f109279g
            kotlinx.coroutines.sync.Mutex r1 = r8.f109835f
            boolean r5 = r7.f109280h
            r7.f109274b = r1
            r7.f109275c = r8
            r7.f109277e = r5
            r7.f109278f = r3
            java.lang.Object r3 = r1.lock(r4, r7)
            if (r3 != r0) goto L4d
            goto L69
        L4d:
            r6 = r5
            r5 = r1
            r1 = r6
        L50:
            yads.w70 r3 = r8.f109834e     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L59
            if (r1 == 0) goto L57
            goto L59
        L57:
            r2 = r5
            goto L7a
        L59:
            yads.xk2 r1 = r8.f109831b     // Catch: java.lang.Throwable -> L8e
            r7.f109274b = r5     // Catch: java.lang.Throwable -> L8e
            r7.f109275c = r8     // Catch: java.lang.Throwable -> L8e
            r7.f109276d = r8     // Catch: java.lang.Throwable -> L8e
            r7.f109278f = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r1 = r1.a(r7)     // Catch: java.lang.Throwable -> L8e
            if (r1 != r0) goto L6a
        L69:
            return r0
        L6a:
            r0 = r8
            r2 = r5
            r8 = r1
            r1 = r0
        L6e:
            boolean r3 = kotlin.Result.i(r8)     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L75
            r8 = r4
        L75:
            yads.w70 r8 = (yads.w70) r8     // Catch: java.lang.Throwable -> L1f
            r0.f109834e = r8     // Catch: java.lang.Throwable -> L1f
            r8 = r1
        L7a:
            yads.bf1 r0 = r8.f109830a     // Catch: java.lang.Throwable -> L1f
            yads.o70 r0 = r0.a()     // Catch: java.lang.Throwable -> L1f
            yads.i50 r1 = r8.f109832c     // Catch: java.lang.Throwable -> L1f
            yads.w70 r8 = r8.f109834e     // Catch: java.lang.Throwable -> L1f
            yads.h50 r8 = r1.a(r0, r8)     // Catch: java.lang.Throwable -> L1f
            r2.unlock(r4)
            return r8
        L8c:
            r5 = r2
            goto L8f
        L8e:
            r8 = move-exception
        L8f:
            r5.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.c80.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
