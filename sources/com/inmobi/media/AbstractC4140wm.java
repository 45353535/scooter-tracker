package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4140wm {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3965pl r4, double r5, com.inmobi.media.Pe r7, int r8, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig r9, kotlin.coroutines.jvm.internal.d r10) {
        /*
            boolean r0 = r10 instanceof com.inmobi.media.C3991qm
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.qm r0 = (com.inmobi.media.C3991qm) r0
            int r1 = r0.f39409e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39409e = r1
            goto L18
        L13:
            com.inmobi.media.qm r0 = new com.inmobi.media.qm
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f39408d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39409e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r8 = r0.f39407c
            com.inmobi.media.Pe r7 = r0.f39406b
            com.inmobi.media.pl r4 = r0.f39405a
            kotlin.d.b(r10)
            goto L49
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.d.b(r10)
            r0.f39405a = r4
            r0.f39406b = r7
            r0.f39407c = r8
            r0.f39409e = r3
            java.lang.Object r10 = a(r4, r5, r9, r0)
            if (r10 != r1) goto L49
            return r1
        L49:
            java.lang.Number r10 = (java.lang.Number) r10
            double r5 = r10.doubleValue()
            r9 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L5d
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.b.b(r9)
            return r4
        L5d:
            int r9 = r4.f39298a
            int r4 = r4.f39299b
            int r9 = r9 * r4
            int r9 = r9 - r8
            int r4 = java.lang.Math.abs(r9)
            double r8 = (double) r4
            int r4 = r7.ordinal()
            r7 = 2
            if (r4 == r7) goto L78
            r7 = 3
            if (r4 == r7) goto L75
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L7a
        L75:
            r0 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            goto L7a
        L78:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L7a:
            r2 = 4719209459530858496(0x417e000000000000, double:3.145728E7)
            double r5 = r5 / r2
            double r4 = java.lang.Math.exp(r5)
            double r8 = r8 * r0
            double r8 = r8 / r4
            java.lang.Double r4 = kotlin.coroutines.jvm.internal.b.b(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4140wm.a(com.inmobi.media.pl, double, com.inmobi.media.Pe, int, com.inmobi.media.core.config.models.AdConfig$VastVideoConfig, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3965pl r10, double r11, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            boolean r0 = r14 instanceof com.inmobi.media.C4015rm
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.rm r0 = (com.inmobi.media.C4015rm) r0
            int r1 = r0.f39488c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39488c = r1
            goto L18
        L13:
            com.inmobi.media.rm r0 = new com.inmobi.media.rm
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f39487b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39488c
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r5 = 0
            r7 = 1
            if (r2 == 0) goto L3a
            if (r2 != r7) goto L32
            com.inmobi.media.core.config.models.AdConfig$VastVideoConfig r13 = r0.f39486a
            kotlin.d.b(r14)
            goto L61
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.d.b(r14)
            int r14 = r10.f39301d
            double r8 = (double) r14
            double r8 = r8 * r11
            int r11 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r11 > 0) goto L54
            com.inmobi.media.core.config.models.AdConfig$BitRateConfig r12 = r13.getBitRate()
            boolean r12 = r12.getFetchFromHead()
            if (r12 != 0) goto L54
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.b.b(r3)
            return r10
        L54:
            if (r11 > 0) goto L67
            r0.f39486a = r13
            r0.f39488c = r7
            java.lang.Object r14 = a(r10, r13, r0)
            if (r14 != r1) goto L61
            return r1
        L61:
            java.lang.Number r14 = (java.lang.Number) r14
            double r8 = r14.doubleValue()
        L67:
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 <= 0) goto L76
            long r10 = r13.getVastMaxAssetSize()
            double r10 = (double) r10
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L75
            goto L76
        L75:
            r3 = r8
        L76:
            java.lang.Double r10 = kotlin.coroutines.jvm.internal.b.b(r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4140wm.a(com.inmobi.media.pl, double, com.inmobi.media.core.config.models.AdConfig$VastVideoConfig, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3965pl r11, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig r12, kotlin.coroutines.jvm.internal.d r13) {
        /*
            boolean r0 = r13 instanceof com.inmobi.media.C4040sm
            if (r0 == 0) goto L13
            r0 = r13
            com.inmobi.media.sm r0 = (com.inmobi.media.C4040sm) r0
            int r1 = r0.f39560b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39560b = r1
            goto L18
        L13:
            com.inmobi.media.sm r0 = new com.inmobi.media.sm
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f39559a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39560b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r13)     // Catch: java.lang.Exception -> L6e
            goto L6b
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r13)
            com.inmobi.media.Ke r13 = new com.inmobi.media.Ke
            java.lang.String r11 = r11.f39300c
            com.inmobi.media.pk r4 = new com.inmobi.media.pk
            com.inmobi.media.core.config.models.AdConfig$BitRateConfig r2 = r12.getBitRate()
            long r5 = r2.getHeaderTimeout()
            com.inmobi.media.core.config.models.AdConfig$BitRateConfig r2 = r12.getBitRate()
            long r7 = r2.getHeaderTimeout()
            com.inmobi.media.core.config.models.AdConfig$BitRateConfig r12 = r12.getBitRate()
            long r9 = r12.getHeaderTimeout()
            r4.<init>(r5, r7, r9)
            r13.<init>(r11, r4)
            kotlin.Lazy r11 = com.inmobi.media.He.f37018c     // Catch: java.lang.Exception -> L6e
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Exception -> L6e
            com.inmobi.media.u9 r11 = (com.inmobi.media.C4077u9) r11     // Catch: java.lang.Exception -> L6e
            r0.f39560b = r3     // Catch: java.lang.Exception -> L6e
            com.inmobi.media.x4 r11 = r11.f39655a     // Catch: java.lang.Exception -> L6e
            java.lang.Object r13 = r11.a(r13, r0)     // Catch: java.lang.Exception -> L6e
            if (r13 != r1) goto L6b
            return r1
        L6b:
            com.inmobi.media.Ne r13 = (com.inmobi.media.Ne) r13     // Catch: java.lang.Exception -> L6e
            goto L6f
        L6e:
            r13 = 0
        L6f:
            if (r13 == 0) goto L86
            int r11 = r13.c()
            r12 = 200(0xc8, float:2.8E-43)
            if (r11 == r12) goto L7a
            goto L86
        L7a:
            com.inmobi.media.Ie r11 = r13.b()
            int r11 = r11.f37072c
            double r11 = (double) r11
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.b.b(r11)
            return r11
        L86:
            r11 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            java.lang.Double r11 = kotlin.coroutines.jvm.internal.b.b(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC4140wm.a(com.inmobi.media.pl, com.inmobi.media.core.config.models.AdConfig$VastVideoConfig, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
