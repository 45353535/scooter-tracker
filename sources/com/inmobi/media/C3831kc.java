package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3831kc extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3856lc f38873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC4174y6 f38874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3831kc(C3856lc c3856lc, AbstractC4174y6 abstractC4174y6, Continuation continuation) {
        super(2, continuation);
        this.f38873b = c3856lc;
        this.f38874c = abstractC4174y6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3831kc(this.f38873b, this.f38874c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3831kc(this.f38873b, this.f38874c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r1.a(r13, r12) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r12.f38872a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r13)
            goto L7a
        L12:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1a:
            kotlin.d.b(r13)
            goto L69
        L1e:
            kotlin.d.b(r13)
            com.inmobi.media.lc r13 = r12.f38873b
            com.inmobi.media.x6 r1 = r13.f38973d
            com.inmobi.media.y6 r4 = r12.f38874c
            r1.getClass()
            java.lang.String r5 = "experienceModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            boolean r5 = r4 instanceof com.inmobi.media.C4162xj
            if (r5 == 0) goto L44
            com.inmobi.media.wj r6 = new com.inmobi.media.wj
            android.content.Context r7 = r1.f39911a
            kotlinx.coroutines.CoroutineScope r8 = r1.f39912b
            r9 = r4
            com.inmobi.media.xj r9 = (com.inmobi.media.C4162xj) r9
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r1.f39913c
            com.inmobi.media.n9 r11 = r1.f39914d
            r6.<init>(r7, r8, r9, r10, r11)
            goto L58
        L44:
            boolean r5 = r4 instanceof com.inmobi.media.C3966pm
            if (r5 == 0) goto L7f
            com.inmobi.media.om r6 = new com.inmobi.media.om
            android.content.Context r7 = r1.f39911a
            kotlinx.coroutines.CoroutineScope r8 = r1.f39912b
            r9 = r4
            com.inmobi.media.pm r9 = (com.inmobi.media.C3966pm) r9
            kotlinx.coroutines.flow.MutableSharedFlow r10 = r1.f39913c
            com.inmobi.media.n9 r11 = r1.f39914d
            r6.<init>(r7, r8, r9, r10, r11)
        L58:
            r13.f38971b = r6
            com.inmobi.media.lc r13 = r12.f38873b
            com.inmobi.media.j2 r13 = r13.f38971b
            if (r13 == 0) goto L69
            r12.f38872a = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L69
            goto L79
        L69:
            com.inmobi.media.lc r13 = r12.f38873b
            com.inmobi.media.j2 r1 = r13.f38971b
            if (r1 == 0) goto L7a
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f38972c
            r12.f38872a = r2
            java.lang.Object r13 = r1.a(r13, r12)
            if (r13 != r0) goto L7a
        L79:
            return r0
        L7a:
            com.inmobi.media.lc r13 = r12.f38873b
            com.inmobi.media.ads.nativeAd.MediaView r13 = r13.f38972c
            return r13
        L7f:
            lf.m r13 = new lf.m
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3831kc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
