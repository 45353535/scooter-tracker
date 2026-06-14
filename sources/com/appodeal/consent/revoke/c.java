package com.appodeal.consent.revoke;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r5, com.appodeal.consent.cache.i r6, com.appodeal.consent.ConsentInformation r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.appodeal.consent.revoke.a
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.consent.revoke.a r0 = (com.appodeal.consent.revoke.a) r0
            int r1 = r0.f15549t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15549t = r1
            goto L18
        L13:
            com.appodeal.consent.revoke.a r0 = new com.appodeal.consent.revoke.a
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f15547r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15549t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L5d
        L29:
            r5 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.d.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L29
            boolean r8 = r7 instanceof com.appodeal.consent.g     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto L44
            com.google.android.ump.ConsentInformation r5 = com.google.android.ump.UserMessagingPlatform.getConsentInformation(r5)     // Catch: java.lang.Throwable -> L29
            r5.reset()     // Catch: java.lang.Throwable -> L29
            goto L5d
        L44:
            boolean r8 = r7 instanceof com.appodeal.consent.f     // Catch: java.lang.Throwable -> L29
            if (r8 == 0) goto L5b
            kotlinx.coroutines.CoroutineDispatcher r7 = eg.o0.b()     // Catch: java.lang.Throwable -> L29
            com.appodeal.consent.revoke.b r8 = new com.appodeal.consent.revoke.b     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r8.<init>(r6, r5, r2)     // Catch: java.lang.Throwable -> L29
            r0.f15549t = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = eg.g.g(r7, r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r5 != r1) goto L5d
            return r1
        L5b:
            if (r7 != 0) goto L64
        L5d:
            kotlin.Unit r5 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L29
            return r5
        L64:
            lf.m r5 = new lf.m     // Catch: java.lang.Throwable -> L29
            r5.<init>()     // Catch: java.lang.Throwable -> L29
            throw r5     // Catch: java.lang.Throwable -> L29
        L6a:
            kotlin.Result$Companion r6 = kotlin.Result.f93230c
            java.lang.Object r5 = kotlin.d.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.consent.revoke.c.a(android.content.Context, com.appodeal.consent.cache.i, com.appodeal.consent.ConsentInformation, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
