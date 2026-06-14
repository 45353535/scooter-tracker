package com.appodeal.consent.form;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WebView f15429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f15430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f15431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ r f15433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f15434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f15435x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r rVar, String str, Context context, Continuation continuation) {
        super(2, continuation);
        this.f15433v = rVar;
        this.f15434w = str;
        this.f15435x = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f15433v, this.f15434w, this.f15435x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f15432u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            com.appodeal.consent.form.r r0 = r7.f15431t
            java.lang.Object r1 = r7.f15430s
            android.webkit.WebView r2 = r7.f15429r
            kotlin.d.b(r8)
            goto L8d
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            android.webkit.WebView r1 = r7.f15429r
            kotlin.d.b(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.l()
        L2c:
            r6 = r1
            r1 = r8
            r8 = r6
            goto L69
        L30:
            kotlin.d.b(r8)
            com.appodeal.consent.form.r r8 = r7.f15433v
            android.webkit.WebView r1 = r8.f15453d
            if (r1 != 0) goto L55
            android.content.Context r1 = r7.f15435x
            monitor-enter(r8)
            java.lang.String r4 = "[ConsentForm] - prepare, create WebView"
            r5 = 0
            com.appodeal.consent.logger.a.b(r4, r5)     // Catch: java.lang.Throwable -> L4f
            android.webkit.WebView r4 = r8.f15453d     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L4d
            android.webkit.WebView r4 = new android.webkit.WebView     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            r8.f15453d = r4     // Catch: java.lang.Throwable -> L4f
        L4d:
            r1 = r4
            goto L51
        L4f:
            r0 = move-exception
            goto L53
        L51:
            monitor-exit(r8)
            goto L55
        L53:
            monitor-exit(r8)
            throw r0
        L55:
            com.appodeal.consent.form.r r8 = r7.f15433v
            com.appodeal.consent.form.r.f(r8, r1)
            com.appodeal.consent.form.r r8 = r7.f15433v
            java.lang.String r4 = r7.f15434w
            r7.f15429r = r1
            r7.f15432u = r3
            java.lang.Object r8 = com.appodeal.consent.form.r.c(r8, r1, r4, r7)
            if (r8 != r0) goto L2c
            goto L8a
        L69:
            com.appodeal.consent.form.r r3 = r7.f15433v
            boolean r4 = kotlin.Result.j(r1)
            if (r4 == 0) goto L94
            r4 = r1
            kotlin.Unit r4 = (kotlin.Unit) r4
            r3.getClass()
            com.appodeal.consent.form.r.j(r8)
            com.appodeal.consent.cache.i r4 = r3.f15450a
            r7.f15429r = r8
            r7.f15430s = r1
            r7.f15431t = r3
            r7.f15432u = r2
            java.lang.Object r2 = r3.b(r8, r4, r7)
            if (r2 != r0) goto L8b
        L8a:
            return r0
        L8b:
            r2 = r8
            r0 = r3
        L8d:
            r0.getClass()
            com.appodeal.consent.form.r.n(r2)
            r8 = r2
        L94:
            com.appodeal.consent.form.r r0 = r7.f15433v
            java.lang.Throwable r2 = kotlin.Result.g(r1)
            if (r2 == 0) goto La2
            r0.getClass()
            com.appodeal.consent.form.r.d(r8)
        La2:
            kotlin.Result r8 = kotlin.Result.a(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.form.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
