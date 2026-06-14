package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public final class Uf {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static F8 f37853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3949p5 f37854c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uf f37852a = new Uf();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f37855d = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r7 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r7) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ab, code lost:
    
        if (r7 == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.media.Tf
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.Tf r0 = (com.inmobi.media.Tf) r0
            int r1 = r0.f37769c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37769c = r1
            goto L18
        L13:
            com.inmobi.media.Tf r0 = new com.inmobi.media.Tf
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f37767a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37769c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r7)
            goto Lae
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            kotlin.d.b(r7)
            goto L76
        L39:
            kotlin.d.b(r7)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.media.Uf.f37855d
            r2 = 0
            boolean r7 = r7.compareAndSet(r4, r2)
            if (r7 == 0) goto Lb1
            com.inmobi.media.F8 r7 = com.inmobi.media.Uf.f37853b
            if (r7 == 0) goto L76
            r0.f37769c = r4
            com.inmobi.media.m7 r7 = r7.f36830d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.f37951a
            com.inmobi.media.Wf r4 = r7.f38123d
            com.inmobi.media.Wf r5 = com.inmobi.media.Wf.f37952b
            if (r4 != r5) goto L68
            r7.f38123d = r2
            java.lang.Object r7 = r7.e(r0)
            java.lang.Object r2 = pf.b.g()
            if (r7 != r2) goto L65
            goto L6a
        L65:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            goto L6a
        L68:
            kotlin.Unit r7 = kotlin.Unit.f93236a
        L6a:
            java.lang.Object r2 = pf.b.g()
            if (r7 != r2) goto L71
            goto L73
        L71:
            kotlin.Unit r7 = kotlin.Unit.f93236a
        L73:
            if (r7 != r1) goto L76
            goto Lad
        L76:
            com.inmobi.media.p5 r7 = com.inmobi.media.Uf.f37854c
            if (r7 == 0) goto Lb1
            r0.f37769c = r3
            java.lang.String r2 = "p5"
            java.lang.String r3 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.inmobi.media.cf r7 = r7.f39243d
            r7.getClass()
            com.inmobi.media.Wf r2 = com.inmobi.media.Wf.f37951a
            com.inmobi.media.Wf r3 = r7.f38123d
            com.inmobi.media.Wf r4 = com.inmobi.media.Wf.f37952b
            if (r3 != r4) goto La0
            r7.f38123d = r2
            java.lang.Object r7 = r7.d(r0)
            java.lang.Object r0 = pf.b.g()
            if (r7 != r0) goto L9d
            goto La2
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            goto La2
        La0:
            kotlin.Unit r7 = kotlin.Unit.f93236a
        La2:
            java.lang.Object r0 = pf.b.g()
            if (r7 != r0) goto La9
            goto Lab
        La9:
            kotlin.Unit r7 = kotlin.Unit.f93236a
        Lab:
            if (r7 != r1) goto Lae
        Lad:
            return r1
        Lae:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        Lb1:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Uf.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
