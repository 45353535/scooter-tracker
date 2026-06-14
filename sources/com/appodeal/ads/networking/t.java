package com.appodeal.ads.networking;

import com.appodeal.ads.ed;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f14168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f14170t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ed f14171u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ed f14172v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f14173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.appodeal.ads.networking.processors.a f14174x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ed edVar, ed edVar2, long j10, com.appodeal.ads.networking.processors.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f14171u = edVar;
        this.f14172v = edVar2;
        this.f14173w = j10;
        this.f14174x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.f14171u, this.f14172v, this.f14173w, this.f14174x, continuation);
        tVar.f14170t = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r15 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r14.f14169s
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.d.b(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r15 = r15.l()
            goto Lad
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.String r1 = r14.f14168r
            java.lang.Object r3 = r14.f14170t
            kotlinx.coroutines.CoroutineScope r3 = (kotlinx.coroutines.CoroutineScope) r3
            kotlin.d.b(r15)
            goto L74
        L2b:
            kotlin.d.b(r15)
            java.lang.Object r15 = r14.f14170t
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            com.appodeal.ads.ed r1 = r14.f14171u
            com.appodeal.ads.network.HttpClient r1 = r1.e()
            com.appodeal.ads.network.HttpClient$ZipBase64 r1 = (com.appodeal.ads.network.HttpClient.ZipBase64) r1
            java.lang.String r1 = r1.getHost()
            com.appodeal.ads.ed r4 = r14.f14172v
            java.lang.String r4 = r4.c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r1 = "/"
            r5.append(r1)
            r5.append(r4)
            java.lang.String r12 = r5.toString()
            long r8 = r14.f14173w
            com.appodeal.ads.networking.s r6 = new com.appodeal.ads.networking.s
            com.appodeal.ads.ed r7 = r14.f14171u
            com.appodeal.ads.ed r10 = r14.f14172v
            com.appodeal.ads.networking.processors.a r11 = r14.f14174x
            r13 = 0
            r6.<init>(r7, r8, r10, r11, r12, r13)
            r14.f14170t = r15
            r14.f14168r = r12
            r14.f14169s = r3
            java.lang.Object r15 = eg.x1.e(r8, r6, r14)
            if (r15 != r0) goto L73
            goto Lac
        L73:
            r1 = r12
        L74:
            kotlin.Result r15 = (kotlin.Result) r15
            if (r15 == 0) goto L7d
            java.lang.Object r15 = r15.l()
            goto Lad
        L7d:
            long r3 = r14.f14173w
            com.appodeal.ads.ed r15 = r14.f14172v
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Request failed by timeout: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ". "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r3 = r5.toString()
            com.appodeal.ads.network.HttpError$TimeoutError r4 = new com.appodeal.ads.network.HttpError$TimeoutError
            r4.<init>(r3)
            r3 = 0
            r14.f14170t = r3
            r14.f14168r = r3
            r14.f14169s = r2
            java.lang.Object r15 = com.appodeal.ads.networking.v.c(r1, r15, r4, r14)
            if (r15 != r0) goto Lad
        Lac:
            return r0
        Lad:
            kotlin.Result r15 = kotlin.Result.a(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
