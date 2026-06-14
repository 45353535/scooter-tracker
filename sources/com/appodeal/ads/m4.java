package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class m4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f13635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13636s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v7 f13637t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdCallbackClickTrackListener f13638u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(v7 v7Var, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener, Continuation continuation) {
        super(2, continuation);
        this.f13637t = v7Var;
        this.f13638u = unifiedAdCallbackClickTrackListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m4(this.f13637t, this.f13638u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new m4(this.f13637t, this.f13638u, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (eg.g.g(r4, r5, r8) == r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r8.f13636s
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.d.b(r9)
            goto L7a
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f13635r
            kotlin.d.b(r9)
            goto L5e
        L24:
            kotlin.d.b(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.l()
        L2d:
            r1 = r9
            goto L3f
        L2f:
            kotlin.d.b(r9)
            com.appodeal.ads.v7 r9 = r8.f13637t
            r8.f13636s = r5
            com.appodeal.ads.networking.processors.c r1 = com.appodeal.ads.networking.processors.c.f14154b
            java.lang.Object r9 = com.appodeal.ads.networking.v.a(r9, r1, r8)
            if (r9 != r0) goto L2d
            goto L79
        L3f:
            com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener r9 = r8.f13638u
            boolean r5 = kotlin.Result.j(r1)
            if (r5 == 0) goto L5e
            r5 = r1
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            eg.e1 r6 = eg.o0.c()
            com.appodeal.ads.c4 r7 = new com.appodeal.ads.c4
            r7.<init>(r9, r5, r2)
            r8.f13635r = r1
            r8.f13636s = r4
            java.lang.Object r9 = eg.g.g(r6, r7, r8)
            if (r9 != r0) goto L5e
            goto L79
        L5e:
            com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener r9 = r8.f13638u
            java.lang.Throwable r4 = kotlin.Result.g(r1)
            if (r4 == 0) goto L7a
            eg.e1 r4 = eg.o0.c()
            com.appodeal.ads.g4 r5 = new com.appodeal.ads.g4
            r5.<init>(r9, r2)
            r8.f13635r = r1
            r8.f13636s = r3
            java.lang.Object r9 = eg.g.g(r4, r5, r8)
            if (r9 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.m4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
