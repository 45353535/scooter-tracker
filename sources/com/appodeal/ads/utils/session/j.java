package com.appodeal.ads.utils.session;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f15082t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f15083u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f15084v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CoroutineScope coroutineScope, q qVar, Continuation continuation) {
        super(2, continuation);
        this.f15083u = coroutineScope;
        this.f15084v = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f15083u, this.f15084v, continuation);
        jVar.f15082t = ((Boolean) obj).booleanValue();
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        return ((j) create(bool, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:15:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r9.f15081s
            r2 = 4
            java.lang.String r3 = "SessionTracker"
            java.lang.String r4 = " ms"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1f
            if (r1 != r5) goto L17
            long r7 = r9.f15080r
            kotlin.d.b(r10)
            goto L60
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            kotlin.d.b(r10)
            boolean r10 = r9.f15082t
            if (r10 == 0) goto L7d
        L26:
            kotlinx.coroutines.CoroutineScope r10 = r9.f15083u
            boolean r10 = kotlinx.coroutines.i.i(r10)
            if (r10 == 0) goto L7d
            com.appodeal.ads.utils.session.q r10 = r9.f15084v
            kotlinx.coroutines.flow.StateFlow r10 = r10.e()
            java.lang.Object r10 = r10.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            long r7 = r10.longValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Session update timer started with "
            r10.append(r1)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r3, r10, r6, r2, r6)
            r9.f15080r = r7
            r9.f15081s = r5
            java.lang.Object r10 = eg.k0.a(r7, r9)
            if (r10 != r0) goto L60
            return r0
        L60:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "Session update timer finished with "
            r10.append(r1)
            r10.append(r7)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.appodeal.ads.ext.LogExtKt.logInternal$default(r3, r10, r6, r2, r6)
            com.appodeal.ads.utils.session.q r10 = r9.f15084v
            com.appodeal.ads.utils.session.q.c(r10)
            goto L26
        L7d:
            kotlin.Unit r10 = kotlin.Unit.f93236a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.session.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
