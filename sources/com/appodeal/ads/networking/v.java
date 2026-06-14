package com.appodeal.ads.networking;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if (r1 != r3) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.appodeal.ads.ed r17, com.appodeal.ads.networking.processors.a r18, kotlin.coroutines.jvm.internal.d r19) {
        /*
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.appodeal.ads.networking.p
            if (r2 == 0) goto L17
            r2 = r1
            com.appodeal.ads.networking.p r2 = (com.appodeal.ads.networking.p) r2
            int r3 = r2.f14149u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f14149u = r3
            goto L1c
        L17:
            com.appodeal.ads.networking.p r2 = new com.appodeal.ads.networking.p
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f14148t
            java.lang.Object r3 = pf.b.g()
            int r4 = r2.f14149u
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L51
            if (r4 == r7) goto L47
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            kotlin.d.b(r1)
            goto Lc1
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            com.appodeal.ads.networking.processors.a r0 = r2.f14147s
            com.appodeal.ads.ed r4 = r2.f14146r
            kotlin.d.b(r1)
            r15 = r0
            r11 = r4
            goto L8e
        L47:
            com.appodeal.ads.networking.processors.a r0 = r2.f14147s
            com.appodeal.ads.ed r4 = r2.f14146r
            kotlin.d.b(r1)
            r9 = r0
            r0 = r4
            goto L74
        L51:
            kotlin.d.b(r1)
            boolean r1 = r0 instanceof com.appodeal.ads.networking.c
            if (r1 == 0) goto L72
            com.appodeal.ads.utils.session.r r1 = com.appodeal.ads.utils.session.r.f15109b
            com.appodeal.ads.utils.session.q r1 = r1.f15110a
            kotlinx.coroutines.flow.MutableStateFlow r1 = r1.f15108j
            com.appodeal.ads.networking.q r4 = new com.appodeal.ads.networking.q
            r4.<init>(r8)
            r2.f14146r = r0
            r9 = r18
            r2.f14147s = r9
            r2.f14149u = r7
            java.lang.Object r1 = hg.i.y(r1, r4, r2)
            if (r1 != r3) goto L74
            goto Lc0
        L72:
            r9 = r18
        L74:
            com.appodeal.ads.network.NetworkStatus r1 = com.appodeal.ads.network.NetworkStatus.INSTANCE
            kotlinx.coroutines.flow.Flow r1 = r1.getNetworkStateFlow()
            com.appodeal.ads.networking.r r4 = new com.appodeal.ads.networking.r
            r4.<init>(r8)
            r2.f14146r = r0
            r2.f14147s = r9
            r2.f14149u = r6
            java.lang.Object r1 = hg.i.y(r1, r4, r2)
            if (r1 != r3) goto L8c
            goto Lc0
        L8c:
            r11 = r0
            r15 = r9
        L8e:
            boolean r0 = r11 instanceof com.appodeal.ads.networking.d
            if (r0 == 0) goto L96
            r0 = r11
            com.appodeal.ads.networking.d r0 = (com.appodeal.ads.networking.d) r0
            goto L97
        L96:
            r0 = r8
        L97:
            if (r0 == 0) goto L9e
            org.json.JSONObject r0 = r0.a()
            goto L9f
        L9e:
            r0 = r8
        L9f:
            if (r0 == 0) goto La5
            r0 = 10000(0x2710, double:4.9407E-320)
        La3:
            r13 = r0
            goto La8
        La5:
            r0 = 20000(0x4e20, double:9.8813E-320)
            goto La3
        La8:
            kotlinx.coroutines.CoroutineDispatcher r0 = eg.o0.b()
            com.appodeal.ads.networking.t r10 = new com.appodeal.ads.networking.t
            r16 = 0
            r12 = r11
            r10.<init>(r11, r12, r13, r15, r16)
            r2.f14146r = r8
            r2.f14147s = r8
            r2.f14149u = r5
            java.lang.Object r1 = eg.g.g(r0, r10, r2)
            if (r1 != r3) goto Lc1
        Lc0:
            return r3
        Lc1:
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r0 = r1.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.v.a(com.appodeal.ads.ed, com.appodeal.ads.networking.processors.a, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.lang.String r6, com.appodeal.ads.ed r7, com.appodeal.ads.network.HttpError r8, kotlin.coroutines.jvm.internal.d r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.networking.v.b(java.lang.String, com.appodeal.ads.ed, com.appodeal.ads.network.HttpError, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
