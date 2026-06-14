package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class U0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U0 f37814a = new U0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "type"
            boolean r3 = r9 instanceof com.inmobi.media.T0
            if (r3 == 0) goto L17
            r3 = r9
            com.inmobi.media.T0 r3 = (com.inmobi.media.T0) r3
            int r4 = r3.f37752c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f37752c = r4
            goto L1c
        L17:
            com.inmobi.media.T0 r3 = new com.inmobi.media.T0
            r3.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r3.f37750a
            java.lang.Object r4 = pf.b.g()
            int r5 = r3.f37752c
            java.lang.String r6 = "errorCode"
            if (r5 == 0) goto L38
            if (r5 != r1) goto L30
            kotlin.d.b(r9)     // Catch: java.lang.Exception -> L2e
            goto L60
        L2e:
            r8 = move-exception
            goto L89
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.d.b(r9)
            java.lang.Class<com.inmobi.media.ads.network.common.model.AdResponse> r9 = com.inmobi.media.ads.network.common.model.AdResponse.class
            java.lang.String r5 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)     // Catch: java.lang.Exception -> L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)     // Catch: java.lang.Exception -> L2e
            r3.f37752c = r1     // Catch: java.lang.Exception -> L2e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2e
            r3.<init>(r8)     // Catch: java.lang.Exception -> L2e
            java.lang.String r8 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r8)     // Catch: java.lang.Exception -> L2e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)     // Catch: java.lang.Exception -> L2e
            r8 = 0
            java.lang.Object r8 = com.inmobi.media.AbstractC3879ma.a(r3, r9, r8, r8)     // Catch: java.lang.Exception -> L2e
            java.lang.Object r9 = r9.cast(r8)     // Catch: java.lang.Exception -> L2e
            if (r9 != r4) goto L60
            return r4
        L60:
            com.inmobi.media.ads.network.common.model.AdResponse r9 = (com.inmobi.media.ads.network.common.model.AdResponse) r9     // Catch: java.lang.Exception -> L2e
            if (r9 == 0) goto L65
            return r9
        L65:
            r8 = 2232(0x8b8, float:3.128E-42)
            java.lang.Short r8 = kotlin.coroutines.jvm.internal.b.f(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r6, r8)
            kotlin.Pair[] r9 = new kotlin.Pair[r1]
            r9[r0] = r8
            java.util.Map r8 = kotlin.collections.MapsKt.mutableMapOf(r9)
            com.inmobi.media.Y r9 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            com.inmobi.media.Ni r1 = new com.inmobi.media.Ni
            r1.<init>(r8)
            r9.<init>(r0, r1)
            throw r9
        L89:
            boolean r9 = r8 instanceof org.json.JSONException
            if (r9 != 0) goto L97
            boolean r9 = r8 instanceof java.lang.ClassCastException
            if (r9 == 0) goto L94
            r9 = 2207(0x89f, float:3.093E-42)
            goto L99
        L94:
            r9 = 2204(0x89c, float:3.088E-42)
            goto L99
        L97:
            r9 = 2113(0x841, float:2.961E-42)
        L99:
            r8.toString()
            short r8 = (short) r9
            java.lang.Short r8 = kotlin.coroutines.jvm.internal.b.f(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r6, r8)
            kotlin.Pair[] r9 = new kotlin.Pair[r1]
            r9[r0] = r8
            java.util.Map r8 = kotlin.collections.MapsKt.mutableMapOf(r9)
            com.inmobi.media.Y r9 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r0.<init>(r1)
            com.inmobi.media.Ni r1 = new com.inmobi.media.Ni
            r1.<init>(r8)
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.U0.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
