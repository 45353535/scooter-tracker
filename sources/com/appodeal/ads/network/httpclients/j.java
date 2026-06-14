package com.appodeal.ads.network.httpclients;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f A[PHI: r4 r7
  0x008f: PHI (r4v3 java.net.HttpURLConnection) = (r4v2 java.net.HttpURLConnection), (r4v10 java.net.HttpURLConnection) binds: [B:32:0x008d, B:26:0x0074] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r7v5 java.lang.Object) = (r7v3 java.lang.Object), (r7v11 java.lang.Object) binds: [B:32:0x008d, B:26:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.appodeal.ads.network.httpclients.g r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.appodeal.ads.network.httpclients.h
            if (r0 == 0) goto L13
            r0 = r8
            com.appodeal.ads.network.httpclients.h r0 = (com.appodeal.ads.network.httpclients.h) r0
            int r1 = r0.f13982t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13982t = r1
            goto L18
        L13:
            com.appodeal.ads.network.httpclients.h r0 = new com.appodeal.ads.network.httpclients.h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f13980r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f13982t
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.d.b(r8)
            goto Lb5
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.d.b(r8)
            r0.f13982t = r3
            kotlinx.coroutines.e r8 = new kotlinx.coroutines.e
            kotlin.coroutines.Continuation r2 = pf.b.d(r0)
            r8.<init>(r2, r3)
            r8.I()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.appodeal.ads.network.httpclients.i r3 = new com.appodeal.ads.network.httpclients.i
            r3.<init>(r2)
            r8.v(r3)
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r5 = r7.f13975c     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r5 == 0) goto L67
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            goto L68
        L63:
            r7 = move-exception
            goto Lbc
        L65:
            r7 = move-exception
            goto L7f
        L67:
            r4 = r3
        L68:
            if (r4 == 0) goto L77
            r2.f93280b = r4     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.Object r7 = com.appodeal.ads.network.httpclients.ext.c.b(r4, r7)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.Object r4 = r2.f93280b
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            if (r4 == 0) goto L92
            goto L8f
        L77:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.String r4 = "Connection is not an HttpURLConnection"
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            throw r7     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
        L7f:
            kotlin.Result$Companion r4 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = kotlin.d.a(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r7 = kotlin.Result.b(r7)     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r2.f93280b
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4
            if (r4 == 0) goto L92
        L8f:
            r4.disconnect()
        L92:
            r2.f93280b = r3
            boolean r2 = r8.isActive()
            if (r2 == 0) goto La5
            kotlin.Result r7 = kotlin.Result.a(r7)
            java.lang.Object r7 = kotlin.Result.b(r7)
            r8.resumeWith(r7)
        La5:
            java.lang.Object r8 = r8.C()
            java.lang.Object r7 = pf.b.g()
            if (r8 != r7) goto Lb2
            kotlin.coroutines.jvm.internal.g.c(r0)
        Lb2:
            if (r8 != r1) goto Lb5
            return r1
        Lb5:
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r7 = r8.l()
            return r7
        Lbc:
            java.lang.Object r8 = r2.f93280b
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8
            if (r8 == 0) goto Lc5
            r8.disconnect()
        Lc5:
            r2.f93280b = r3
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.network.httpclients.j.a(com.appodeal.ads.network.httpclients.g, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
