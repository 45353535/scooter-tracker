package com.appodeal.ads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class p7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f14275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f14276t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f14275s = context;
        this.f14276t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p7(this.f14275s, this.f14276t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p7(this.f14275s, this.f14276t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r6.c(r1, r5) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r5.f14274r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r6)
            goto L56
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.d.b(r6)
            goto L3f
        L1e:
            kotlin.d.b(r6)
            com.appodeal.ads.context.u r6 = com.appodeal.ads.context.u.f13215b
            android.content.Context r1 = r5.f14275s
            r6.getClass()
            java.lang.String r4 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            com.appodeal.ads.context.t r6 = r6.f13216a
            r6.setApplicationContext(r1)
            com.appodeal.ads.storage.d0 r6 = com.appodeal.ads.storage.d0.f14795b
            r5.f14274r = r3
            com.appodeal.ads.storage.a0 r6 = r6.f14796a
            java.lang.Object r6 = r6.e(r5)
            if (r6 != r0) goto L3f
            goto L55
        L3f:
            android.content.Context r6 = r5.f14275s
            java.lang.String r1 = r5.f14276t
            boolean r6 = com.appodeal.ads.utils.InstallTrackingHelper.packageInTrackingList(r6, r1)
            if (r6 == 0) goto L56
            com.appodeal.ads.k7 r6 = com.appodeal.ads.k7.f13545a
            java.lang.String r1 = r5.f14276t
            r5.f14274r = r2
            java.lang.Object r6 = r6.c(r1, r5)
            if (r6 != r0) goto L56
        L55:
            return r0
        L56:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.p7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
