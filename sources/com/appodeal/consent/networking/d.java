package com.appodeal.consent.networking;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f15491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f15493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f15494u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f15493t = aVar;
        this.f15494u = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f15493t, this.f15494u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f15493t, this.f15494u, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0096, code lost:
    
        if (r10 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r9.f15492s
            r2 = 20000(0x4e20, double:9.8813E-320)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2a
            if (r1 == r6) goto L24
            if (r1 != r5) goto L1c
            kotlin.d.b(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.l()
            goto L99
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            java.lang.String r1 = r9.f15491r
            kotlin.d.b(r10)
            goto L65
        L2a:
            kotlin.d.b(r10)
            com.appodeal.consent.networking.a r10 = r9.f15493t
            com.appodeal.ads.network.HttpClient$File r10 = r10.b()
            java.lang.String r10 = r10.getHost()
            com.appodeal.consent.networking.a r1 = r9.f15494u
            java.lang.String r1 = r1.e()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r10 = "/"
            r7.append(r10)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            com.appodeal.consent.networking.c r10 = new com.appodeal.consent.networking.c
            com.appodeal.consent.networking.a r7 = r9.f15493t
            com.appodeal.consent.networking.a r8 = r9.f15494u
            r10.<init>(r7, r1, r8, r4)
            r9.f15491r = r1
            r9.f15492s = r6
            java.lang.Object r10 = eg.x1.e(r2, r10, r9)
            if (r10 != r0) goto L65
            goto L98
        L65:
            kotlin.Result r10 = (kotlin.Result) r10
            if (r10 == 0) goto L6e
            java.lang.Object r10 = r10.l()
            goto L99
        L6e:
            com.appodeal.consent.networking.a r10 = r9.f15494u
            com.appodeal.consent.ConsentManagerError$TimeoutError r6 = new com.appodeal.consent.ConsentManagerError$TimeoutError
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[FileRequest] - Request timeout: "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = ". "
            r7.append(r2)
            r7.append(r1)
            java.lang.String r2 = r7.toString()
            r6.<init>(r2)
            r9.f15491r = r4
            r9.f15492s = r5
            java.lang.Object r10 = com.appodeal.consent.networking.f.c(r1, r10, r6, r9)
            if (r10 != r0) goto L99
        L98:
            return r0
        L99:
            kotlin.Result r10 = kotlin.Result.a(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.networking.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
