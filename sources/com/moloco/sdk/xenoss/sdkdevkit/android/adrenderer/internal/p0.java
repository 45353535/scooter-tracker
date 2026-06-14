package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m f56598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.error.b f56599b;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f56600r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f56601s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f56602t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f56603u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f56604v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f56606x;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56604v = obj;
            this.f56606x |= Integer.MIN_VALUE;
            return p0.this.a(null, null, this);
        }
    }

    public p0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        this.f56598a = mediaCacheRepository;
        this.f56599b = errorReportingService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0 r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p0.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
