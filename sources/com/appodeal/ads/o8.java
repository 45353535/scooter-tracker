package com.appodeal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u8 f14255s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(u8 u8Var, Continuation continuation) {
        super(2, continuation);
        this.f14255s = u8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o8(this.f14255s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new o8(this.f14255s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r5 == r0) goto L15;
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
            int r1 = r4.f14254r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r5)
            goto L4b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.d.b(r5)
            goto L36
        L1e:
            kotlin.d.b(r5)
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            com.appodeal.ads.u8 r1 = r4.f14255s
            com.appodeal.ads.context.o r1 = r1.f14928c
            com.appodeal.ads.context.t r1 = r1.f13206a
            android.content.Context r1 = r1.getApplicationContext()
            r4.f14254r = r3
            java.lang.Object r5 = r5.fetchAdvertisingProfile(r1, r4)
            if (r5 != r0) goto L36
            goto L4a
        L36:
            com.appodeal.advertising.AdvertisingInfo r5 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            com.appodeal.ads.u8 r1 = r4.f14255s
            com.appodeal.ads.context.o r1 = r1.f14928c
            com.appodeal.ads.context.t r1 = r1.f13206a
            android.content.Context r1 = r1.getApplicationContext()
            r4.f14254r = r2
            java.lang.Object r5 = r5.getAdvertisingProfile(r1, r4)
            if (r5 != r0) goto L4b
        L4a:
            return r0
        L4b:
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r5 = (com.appodeal.advertising.AdvertisingInfo.AdvertisingProfile) r5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "AdvertisingProfile"
            java.lang.String r2 = "Extract"
            com.appodeal.ads.utils.Log.log(r1, r2, r0)
            com.appodeal.ads.v4 r0 = com.appodeal.ads.v4.f15140a
            java.lang.String r0 = "applyAdvertisingProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = com.appodeal.ads.v4.f15145f
            boolean r0 = r0.getIsLimitAdTrackingEnabled()
            boolean r1 = r5.getIsLimitAdTrackingEnabled()
            if (r0 != r1) goto L7b
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r0 = com.appodeal.ads.v4.f15145f
            java.lang.String r0 = r0.getId()
            java.lang.String r1 = r5.getId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L8a
        L7b:
            boolean r0 = com.appodeal.ads.v4.j()
            com.appodeal.ads.v4.f15145f = r5
            boolean r5 = com.appodeal.ads.v4.j()
            if (r0 == r5) goto L8a
            com.appodeal.ads.db.g()
        L8a:
            kotlin.Unit r5 = kotlin.Unit.f93236a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.o8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
