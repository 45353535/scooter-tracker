package com.appodeal.consent.ump;

/* JADX INFO: loaded from: classes6.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.appodeal.consent.ConsentUpdateRequestParameters r7, kotlin.coroutines.jvm.internal.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.appodeal.consent.ump.h
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.consent.ump.h r0 = (com.appodeal.consent.ump.h) r0
            int r1 = r0.f15576u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15576u = r1
            goto L18
        L13:
            com.appodeal.consent.ump.h r0 = new com.appodeal.consent.ump.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f15574s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15576u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            com.appodeal.consent.ConsentUpdateRequestParameters r7 = r0.f15573r
            kotlin.d.b(r8)
            goto L58
        L3a:
            kotlin.d.b(r8)
            r0.f15573r = r7
            r0.f15576u = r4
            boolean r8 = r7 instanceof com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync
            if (r8 == 0) goto L51
            r8 = r7
            com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync r8 = (com.appodeal.consent.parameters.ConsentUpdateRequestParametersAsync) r8
            kotlin.jvm.functions.Function1 r8 = r8.getGetActivity()
            java.lang.Object r8 = r8.invoke(r0)
            goto L55
        L51:
            android.app.Activity r8 = r7.getRequiredActivity()
        L55:
            if (r8 != r1) goto L58
            goto Laa
        L58:
            android.app.Activity r8 = (android.app.Activity) r8
            r0.f15573r = r7
            r0.f15576u = r3
            of.e r2 = new of.e
            kotlin.coroutines.Continuation r3 = pf.b.d(r0)
            r2.<init>(r3)
            java.lang.String r3 = "[UMP] requestConsentInfoUpdate"
            r4 = 0
            com.appodeal.consent.logger.a.b(r3, r4)
            java.lang.Boolean r7 = r7.getTagForUnderAgeOfConsent()
            if (r7 == 0) goto L78
            boolean r7 = r7.booleanValue()
            goto L79
        L78:
            r7 = 0
        L79:
            com.google.android.ump.ConsentRequestParameters$Builder r3 = new com.google.android.ump.ConsentRequestParameters$Builder
            r3.<init>()
            com.google.android.ump.ConsentRequestParameters$Builder r7 = r3.setTagForUnderAgeOfConsent(r7)
            com.google.android.ump.ConsentRequestParameters r7 = r7.build()
            android.content.Context r3 = r8.getApplicationContext()
            com.google.android.ump.ConsentInformation r3 = com.google.android.ump.UserMessagingPlatform.getConsentInformation(r3)
            com.appodeal.consent.ump.i r4 = new com.appodeal.consent.ump.i
            r4.<init>(r2, r3)
            com.appodeal.consent.ump.j r5 = new com.appodeal.consent.ump.j
            r5.<init>(r2)
            r3.requestConsentInfoUpdate(r8, r7, r4, r5)
            java.lang.Object r7 = r2.b()
            java.lang.Object r8 = pf.b.g()
            if (r7 != r8) goto La8
            kotlin.coroutines.jvm.internal.g.c(r0)
        La8:
            if (r7 != r1) goto Lab
        Laa:
            return r1
        Lab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.ump.k.a(com.appodeal.consent.ConsentUpdateRequestParameters, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
