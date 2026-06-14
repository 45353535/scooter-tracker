package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.service.ServiceOptions;
import com.appodeal.ads.modules.common.internal.service.ServiceVariant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n6 f14332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n8 f14333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ServiceVariant f14334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ServiceOptions f14335v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(n6 n6Var, n8 n8Var, ServiceOptions serviceOptions, ServiceVariant serviceVariant, Continuation continuation) {
        super(2, continuation);
        this.f14332s = n6Var;
        this.f14333t = n8Var;
        this.f14334u = serviceVariant;
        this.f14335v = serviceOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new r7(this.f14332s, this.f14333t, this.f14335v, this.f14334u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r4.f14331r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.d.b(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.l()
            goto L58
        L21:
            kotlin.d.b(r5)
            com.appodeal.ads.n6 r5 = r4.f14332s
            com.appodeal.ads.i6 r1 = com.appodeal.ads.i6.f13420b
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r1 == 0) goto L3f
            com.appodeal.ads.n8 r5 = r4.f14333t
            com.appodeal.ads.modules.common.internal.service.ServicesRegistry r5 = r5.f13813c
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r1 = r4.f14334u
            com.appodeal.ads.modules.common.internal.service.ServiceOptions r2 = r4.f14335v
            r4.f14331r = r3
            java.lang.Object r5 = r5.mo4432preInitialize0E7RQCE(r1, r2, r4)
            if (r5 != r0) goto L58
            goto L57
        L3f:
            com.appodeal.ads.e6 r1 = com.appodeal.ads.e6.f13272b
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r1)
            if (r5 == 0) goto L5d
            com.appodeal.ads.n8 r5 = r4.f14333t
            com.appodeal.ads.modules.common.internal.service.ServicesRegistry r5 = r5.f13813c
            com.appodeal.ads.modules.common.internal.service.ServiceVariant r1 = r4.f14334u
            com.appodeal.ads.modules.common.internal.service.ServiceOptions r3 = r4.f14335v
            r4.f14331r = r2
            java.lang.Object r5 = r5.mo4431initialize0E7RQCE(r1, r3, r4)
            if (r5 != r0) goto L58
        L57:
            return r0
        L58:
            kotlin.Result r5 = kotlin.Result.a(r5)
            return r5
        L5d:
            lf.m r5 = new lf.m
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.r7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
