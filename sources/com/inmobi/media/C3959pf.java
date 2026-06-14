package com.inmobi.media;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3959pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3959pf f39284a = new C3959pf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f39285b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C4033sf f39286c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.inmobi.media.C3859lf
            if (r0 == 0) goto L13
            r0 = r10
            com.inmobi.media.lf r0 = (com.inmobi.media.C3859lf) r0
            int r1 = r0.f38980e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38980e = r1
            goto L18
        L13:
            com.inmobi.media.lf r0 = new com.inmobi.media.lf
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f38978c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38980e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            android.content.Context r1 = r0.f38977b
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r0 = r0.f38976a
            kotlin.d.b(r10)
            goto L69
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.d.b(r10)
            com.inmobi.media.i4 r10 = com.inmobi.media.Y3.f38021a
            java.lang.String r10 = "clazz"
            java.lang.Class<com.inmobi.media.core.config.models.AdConfig> r2 = com.inmobi.media.core.config.models.AdConfig.class
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r10)
            com.inmobi.media.i4 r10 = com.inmobi.media.Y3.f38021a
            com.inmobi.media.core.config.models.Config r10 = r10.a(r2)
            com.inmobi.media.core.config.models.AdConfig r10 = (com.inmobi.media.core.config.models.AdConfig) r10
            com.inmobi.media.core.config.models.AdConfig$ViewabilityConfig r10 = r10.getViewability()
            com.inmobi.media.core.config.models.AdConfig$OmidConfig r10 = r10.getOmidConfig()
            android.content.Context r2 = com.inmobi.media.Ji.f37157a
            if (r2 != 0) goto L58
            kotlin.Unit r10 = kotlin.Unit.f93236a
            return r10
        L58:
            r0.f38976a = r10
            r0.f38977b = r2
            r0.f38980e = r3
            java.lang.Object r0 = r9.a(r2, r10, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r0
            r0 = r10
            r10 = r1
            r1 = r2
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L74
            kotlin.Unit r10 = kotlin.Unit.f93236a
            return r10
        L74:
            java.util.concurrent.atomic.AtomicInteger r10 = com.inmobi.media.C3959pf.f39285b
            r2 = 2
            r10.set(r2)
            kotlinx.coroutines.CoroutineScope r3 = com.inmobi.media.A9.f36557c
            com.inmobi.media.mf r6 = new com.inmobi.media.mf
            r10 = 0
            r6.<init>(r0, r1, r10)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            eg.g.d(r3, r4, r5, r6, r7, r8)
            kotlin.Unit r10 = kotlin.Unit.f93236a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3959pf.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r6, com.inmobi.media.core.config.models.AdConfig.OmidConfig r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3934of
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.of r0 = (com.inmobi.media.C3934of) r0
            int r1 = r0.f39202c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39202c = r1
            goto L18
        L13:
            com.inmobi.media.of r0 = new com.inmobi.media.of
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f39200a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39202c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r8)
            goto L61
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r8)
            java.util.concurrent.atomic.AtomicInteger r8 = com.inmobi.media.C3959pf.f39285b
            int r2 = r8.get()
            if (r2 == r3) goto L6b
            int r8 = r8.get()
            r2 = 2
            if (r8 == r2) goto L6b
            com.inmobi.media.sf r8 = com.inmobi.media.C3959pf.f39286c
            if (r8 != 0) goto L4e
            com.inmobi.media.sf r8 = new com.inmobi.media.sf
            r8.<init>(r6)
            com.inmobi.media.C3959pf.f39286c = r8
        L4e:
            r0.f39202c = r3
            kotlinx.coroutines.CoroutineDispatcher r6 = eg.o0.b()
            com.inmobi.media.qf r2 = new com.inmobi.media.qf
            r4 = 0
            r2.<init>(r8, r7, r4)
            java.lang.Object r8 = eg.g.g(r6, r2, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L6a
            goto L6b
        L6a:
            r3 = 0
        L6b:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3959pf.a(android.content.Context, com.inmobi.media.core.config.models.AdConfig$OmidConfig, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
