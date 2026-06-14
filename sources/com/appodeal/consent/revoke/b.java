package com.appodeal.consent.revoke;

import android.content.Context;
import com.appodeal.consent.cache.i;
import com.appodeal.consent.cache.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p[] f15550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f15551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15552t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15553u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15554v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f15555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f15556x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f15555w = iVar;
        this.f15556x = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f15555w, this.f15556x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f15555w, this.f15556x, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (kotlin.Unit.f93236a != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (r11 != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r10.f15554v
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L27
            if (r1 != r3) goto L1f
            int r1 = r10.f15553u
            int r4 = r10.f15552t
            com.appodeal.consent.cache.i r6 = r10.f15551s
            com.appodeal.consent.cache.p[] r7 = r10.f15550r
            kotlin.d.b(r11)
            goto La3
        L1f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L27:
            kotlin.d.b(r11)
            goto L68
        L2b:
            kotlin.d.b(r11)
            goto L48
        L2f:
            kotlin.d.b(r11)
            com.appodeal.consent.cache.i r11 = r10.f15555w
            android.content.Context r1 = r10.f15556x
            android.content.Context r1 = r1.getApplicationContext()
            java.lang.String r6 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r6)
            r10.f15554v = r5
            java.lang.Object r11 = r11.b(r1, r10)
            if (r11 != r0) goto L48
            goto La2
        L48:
            com.appodeal.consent.cache.i r11 = r10.f15555w
            r10.f15554v = r4
            r11.getClass()
            kotlinx.coroutines.CoroutineDispatcher r1 = eg.o0.b()
            com.appodeal.consent.cache.b r4 = new com.appodeal.consent.cache.b
            r4.<init>(r11, r2)
            java.lang.Object r11 = eg.g.g(r1, r4, r10)
            java.lang.Object r1 = pf.b.g()
            if (r11 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r11 = kotlin.Unit.f93236a
        L65:
            if (r11 != r0) goto L68
            goto La2
        L68:
            kotlin.Lazy r11 = com.appodeal.consent.cache.r.f15402a
            java.lang.Object r11 = r11.getValue()
            com.appodeal.consent.cache.p[] r11 = (com.appodeal.consent.cache.p[]) r11
            com.appodeal.consent.cache.i r1 = r10.f15555w
            int r4 = r11.length
            r6 = 0
            r7 = r6
            r6 = r1
            r1 = r4
            r4 = r7
            r7 = r11
        L79:
            if (r4 >= r1) goto La5
            r11 = r7[r4]
            r10.f15550r = r7
            r10.f15551s = r6
            r10.f15552t = r4
            r10.f15553u = r1
            r10.f15554v = r3
            r6.getClass()
            kotlinx.coroutines.CoroutineDispatcher r8 = eg.o0.b()
            com.appodeal.consent.cache.c r9 = new com.appodeal.consent.cache.c
            r9.<init>(r11, r6, r2)
            java.lang.Object r11 = eg.g.g(r8, r9, r10)
            java.lang.Object r8 = pf.b.g()
            if (r11 != r8) goto L9e
            goto La0
        L9e:
            kotlin.Unit r11 = kotlin.Unit.f93236a
        La0:
            if (r11 != r0) goto La3
        La2:
            return r0
        La3:
            int r4 = r4 + r5
            goto L79
        La5:
            kotlin.Unit r11 = kotlin.Unit.f93236a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.revoke.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
