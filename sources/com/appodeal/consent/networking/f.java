package com.appodeal.consent.networking;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.appodeal.consent.networking.a r5, kotlin.coroutines.jvm.internal.d r6) {
        /*
            boolean r0 = r6 instanceof com.appodeal.consent.networking.b
            if (r0 == 0) goto L13
            r0 = r6
            com.appodeal.consent.networking.b r0 = (com.appodeal.consent.networking.b) r0
            int r1 = r0.f15483s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15483s = r1
            goto L18
        L13:
            com.appodeal.consent.networking.b r0 = new com.appodeal.consent.networking.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15482r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15483s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = eg.o0.b()
            com.appodeal.consent.networking.d r2 = new com.appodeal.consent.networking.d
            r4 = 0
            r2.<init>(r5, r5, r4)
            r0.f15483s = r3
            java.lang.Object r6 = eg.g.g(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.l()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.networking.f.a(com.appodeal.consent.networking.a, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.lang.String r4, com.appodeal.consent.networking.a r5, java.lang.Throwable r6, kotlin.coroutines.jvm.internal.d r7) {
        /*
            boolean r0 = r7 instanceof com.appodeal.consent.networking.e
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.consent.networking.e r0 = (com.appodeal.consent.networking.e) r0
            int r1 = r0.f15496s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15496s = r1
            goto L18
        L13:
            com.appodeal.consent.networking.e r0 = new com.appodeal.consent.networking.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15495r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15496s
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r4 = r7.l()
            return r4
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.d.b(r7)
            boolean r7 = androidx.activity.s.a(r5)
            if (r7 == 0) goto L42
            r7 = r5
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 == 0) goto L6e
            boolean r7 = r7.isRetryEnabled()
            if (r7 != r3) goto L6e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[FileRequest] - Applying retry logic (Failed at "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ")"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.appodeal.consent.logger.a.a(r4)
            r0.f15496s = r3
            java.lang.Object r4 = a(r5, r0)
            if (r4 != r1) goto L6d
            return r1
        L6d:
            return r4
        L6e:
            java.lang.Object r4 = com.appodeal.ads.ext.ResultExtKt.asFailure(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.networking.f.b(java.lang.String, com.appodeal.consent.networking.a, java.lang.Throwable, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
