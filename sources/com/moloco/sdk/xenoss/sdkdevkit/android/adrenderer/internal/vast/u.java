package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements t {

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58350r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58351s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f58353u;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58351s = obj;
            this.f58353u |= Integer.MIN_VALUE;
            return u.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: all -> 0x002d, TryCatch #3 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x005d, B:26:0x0061, B:27:0x0067), top: B:44:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #3 {all -> 0x002d, blocks: (B:12:0x0029, B:24:0x005d, B:26:0x0061, B:27:0x0067), top: B:44:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u.a
            if (r0 == 0) goto L13
            r0 = r8
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u.a) r0
            int r1 = r0.f58353u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f58353u = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f58351s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f58353u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r7 = r0.f58350r
            java.io.Closeable r7 = (java.io.Closeable) r7
            kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L2d:
            r8 = move-exception
            goto L77
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.d.b(r8)
            java.io.StringReader r8 = new java.io.StringReader     // Catch: java.lang.Exception -> L7d
            r8.<init>(r7)     // Catch: java.lang.Exception -> L7d
            org.xmlpull.v1.XmlPullParser r7 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r4 = 0
            r7.setFeature(r2, r4)     // Catch: java.lang.Throwable -> L73
            r7.setInput(r8)     // Catch: java.lang.Throwable -> L73
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> L73
            r0.f58350r = r8     // Catch: java.lang.Throwable -> L73
            r0.f58353u = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r7 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.w.C0(r7, r0)     // Catch: java.lang.Throwable -> L73
            if (r7 != r1) goto L5a
            return r1
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
        L5d:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r8 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y) r8     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L67
            com.moloco.sdk.internal.h0$b r0 = new com.moloco.sdk.internal.h0$b     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            goto L6e
        L67:
            com.moloco.sdk.internal.h0$a r0 = new com.moloco.sdk.internal.h0$a     // Catch: java.lang.Throwable -> L2d
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f56068d     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L2d
        L6e:
            r8 = 0
            uf.c.a(r7, r8)     // Catch: java.lang.Exception -> L7d
            return r0
        L73:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L77:
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r0 = move-exception
            uf.c.a(r7, r8)     // Catch: java.lang.Exception -> L7d
            throw r0     // Catch: java.lang.Exception -> L7d
        L7d:
            com.moloco.sdk.internal.h0$a r7 = new com.moloco.sdk.internal.h0$a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k r8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f56067c
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
