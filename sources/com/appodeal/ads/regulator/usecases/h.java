package com.appodeal.ads.regulator.usecases;

import com.appodeal.ads.context.o;
import com.appodeal.consent.ConsentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f14403a;

    public h(ConsentManager consentManager, o contextProvider) {
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f14403a = contextProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, boolean r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.appodeal.ads.regulator.usecases.e
            if (r0 == 0) goto L13
            r0 = r15
            com.appodeal.ads.regulator.usecases.e r0 = (com.appodeal.ads.regulator.usecases.e) r0
            int r1 = r0.f14399t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14399t = r1
            goto L18
        L13:
            com.appodeal.ads.regulator.usecases.e r0 = new com.appodeal.ads.regulator.usecases.e
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.f14397r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f14399t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r15)
            goto L6c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r15)
            r0.f14399t = r3
            kotlinx.coroutines.e r15 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r2 = pf.b.d(r0)
            r15.<init>(r2, r3)
            r15.I()
            com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync r4 = new com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r12)
            com.appodeal.ads.regulator.usecases.g r9 = new com.appodeal.ads.regulator.usecases.g
            r12 = 0
            r9.<init>(r10, r12)
            r5 = r11
            r7 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            com.appodeal.ads.regulator.usecases.f r11 = new com.appodeal.ads.regulator.usecases.f
            r11.<init>(r15)
            com.appodeal.consent.ConsentManager.requestConsentInfoUpdate(r4, r11)
            java.lang.Object r15 = r15.C()
            java.lang.Object r11 = pf.b.g()
            if (r15 != r11) goto L69
            kotlin.coroutines.jvm.internal.g.c(r0)
        L69:
            if (r15 != r1) goto L6c
            return r1
        L6c:
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r11 = r15.l()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.regulator.usecases.h.a(java.lang.String, boolean, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
