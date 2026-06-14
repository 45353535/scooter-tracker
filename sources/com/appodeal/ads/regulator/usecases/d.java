package com.appodeal.ads.regulator.usecases;

import com.appodeal.consent.ConsentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public d(ConsentManager consentManager) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.appodeal.ads.regulator.usecases.a
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.ads.regulator.usecases.a r0 = (com.appodeal.ads.regulator.usecases.a) r0
            int r1 = r0.f14394t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14394t = r1
            goto L18
        L13:
            com.appodeal.ads.regulator.usecases.a r0 = new com.appodeal.ads.regulator.usecases.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f14392r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14394t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L5f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            r0.f14394t = r3
            kotlinx.coroutines.e r6 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r2 = pf.b.d(r0)
            r6.<init>(r2, r3)
            r6.I()
            com.appodeal.ads.regulator.usecases.b r2 = new com.appodeal.ads.regulator.usecases.b
            r2.<init>(r6)
            com.appodeal.ads.regulator.usecases.c r3 = new com.appodeal.ads.regulator.usecases.c
            r3.<init>(r6)
            com.appodeal.consent.ConsentManager.load(r5, r2, r3)
            java.lang.Object r6 = r6.C()
            java.lang.Object r5 = pf.b.g()
            if (r6 != r5) goto L5c
            kotlin.coroutines.jvm.internal.g.c(r0)
        L5c:
            if (r6 != r1) goto L5f
            return r1
        L5f:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.usecases.d.a(android.content.Context, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
