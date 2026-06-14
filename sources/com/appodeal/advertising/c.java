package com.appodeal.advertising;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15334s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, Continuation continuation) {
        super(2, continuation);
        this.f15334s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f15334s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f15334s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f15333r
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.d.b(r7)
            goto L4f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.d.b(r7)
            goto L3d
        L1f:
            kotlin.d.b(r7)
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.access$getState$p()
            com.appodeal.advertising.g r1 = com.appodeal.advertising.g.f15338a
            com.appodeal.advertising.f r5 = com.appodeal.advertising.f.f15337a
            boolean r7 = r7.b(r1, r5)
            if (r7 == 0) goto L3d
            com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            android.content.Context r1 = r6.f15334s
            r6.f15333r = r4
            java.lang.Object r7 = r7.fetchAdvertisingProfile(r1, r6)
            if (r7 != r0) goto L3d
            goto L4e
        L3d:
            kotlinx.coroutines.flow.MutableStateFlow r7 = com.appodeal.advertising.AdvertisingInfo.access$getState$p()
            com.appodeal.advertising.b r1 = new com.appodeal.advertising.b
            r1.<init>(r2)
            r6.f15333r = r3
            java.lang.Object r7 = hg.i.y(r7, r1, r6)
            if (r7 != r0) goto L4f
        L4e:
            return r0
        L4f:
            boolean r0 = r7 instanceof com.appodeal.advertising.e
            if (r0 == 0) goto L56
            r2 = r7
            com.appodeal.advertising.e r2 = (com.appodeal.advertising.e) r2
        L56:
            if (r2 == 0) goto L5e
            com.appodeal.advertising.AdvertisingInfo$AdvertisingProfile r7 = r2.f15336a
            if (r7 != 0) goto L5d
            goto L5e
        L5d:
            return r7
        L5e:
            com.appodeal.advertising.AdvertisingInfo r7 = com.appodeal.advertising.AdvertisingInfo.INSTANCE
            android.content.Context r0 = r6.f15334s
            com.appodeal.advertising.AdvertisingInfo$DefaultAdvertisingProfile r7 = com.appodeal.advertising.AdvertisingInfo.access$getDefaultProfile(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
