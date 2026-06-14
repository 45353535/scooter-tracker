package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4006rd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dd f39468b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4006rd(Dd dd2, Continuation continuation) {
        super(2, continuation);
        this.f39468b = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4006rd(this.f39468b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4006rd(this.f39468b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r12.f39467a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            kotlin.d.b(r13)
            goto Lb9
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            kotlin.d.b(r13)
            goto L4d
        L23:
            kotlin.d.b(r13)
            goto L42
        L27:
            kotlin.d.b(r13)
            com.inmobi.media.Dd r13 = r12.f39468b
            r12.f39467a = r4
            r13.getClass()
            eg.e1 r1 = eg.o0.c()
            com.inmobi.media.sd r4 = new com.inmobi.media.sd
            r4.<init>(r13, r5)
            java.lang.Object r13 = eg.g.g(r1, r4, r12)
            if (r13 != r0) goto L42
            goto Lb8
        L42:
            com.inmobi.media.pf r13 = com.inmobi.media.C3959pf.f39284a
            r12.f39467a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L4d
            goto Lb8
        L4d:
            com.inmobi.media.Dd r13 = r12.f39468b
            com.inmobi.media.Ec r1 = r13.f36725b
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r1 = r1.f36790b
            com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject r1 = r1.getAssetsObject()
            if (r1 == 0) goto L5e
            com.inmobi.media.ads.network.inmobiJson.model.NativeMedia r1 = r1.getMedia()
            goto L5f
        L5e:
            r1 = r5
        L5f:
            java.lang.String r3 = "NativeLoadingState"
            if (r1 != 0) goto L71
            com.inmobi.media.m9 r13 = r13.l()
            if (r13 == 0) goto L9d
            com.inmobi.media.n9 r13 = (com.inmobi.media.C3903n9) r13
            java.lang.String r1 = "listenToVideoLoadAndErrorEvents - no media assets, skipping"
            r13.a(r3, r1)
            goto L9d
        L71:
            com.inmobi.media.m9 r1 = r13.l()
            if (r1 == 0) goto L7e
            com.inmobi.media.n9 r1 = (com.inmobi.media.C3903n9) r1
            java.lang.String r4 = "listenToVideoLoadAndErrorEvents - media assets found, setting up listener"
            r1.a(r3, r4)
        L7e:
            com.inmobi.media.Ec r1 = r13.f36725b
            kotlin.Lazy r1 = r1.f36795g
            java.lang.Object r1 = r1.getValue()
            com.inmobi.media.lc r1 = (com.inmobi.media.C3856lc) r1
            kotlinx.coroutines.flow.MutableSharedFlow r1 = r1.f38974e
            com.inmobi.media.xd r3 = new com.inmobi.media.xd
            r3.<init>(r1)
            kotlinx.coroutines.CoroutineScope r6 = r13.f36728e
            com.inmobi.media.ud r9 = new com.inmobi.media.ud
            r9.<init>(r3, r5, r13)
            r10 = 3
            r11 = 0
            r7 = 0
            r8 = 0
            eg.g.d(r6, r7, r8, r9, r10, r11)
        L9d:
            com.inmobi.media.Dd r13 = r12.f39468b
            r12.f39467a = r2
            r13.getClass()
            com.inmobi.media.Ad r1 = new com.inmobi.media.Ad
            r1.<init>(r13, r5)
            java.lang.Object r13 = eg.m1.c(r1, r12)
            java.lang.Object r1 = pf.b.g()
            if (r13 != r1) goto Lb4
            goto Lb6
        Lb4:
            kotlin.Unit r13 = kotlin.Unit.f93236a
        Lb6:
            if (r13 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            kotlin.Unit r13 = kotlin.Unit.f93236a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4006rd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
