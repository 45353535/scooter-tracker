package com.inmobi.media;

import android.content.Context;
import android.webkit.URLUtil;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3913nj extends T3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3903n9 f39113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39114c;

    public C3913nj(Context context, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39112a = context;
        this.f39113b = c3903n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f39114c = "Static-Companion-" + string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (eg.g.g(r13, r6, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3913nj r12, java.lang.String r13, com.inmobi.media.Cj r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            r12.getClass()
            boolean r0 = r15 instanceof com.inmobi.media.C3838kj
            if (r0 == 0) goto L16
            r0 = r15
            com.inmobi.media.kj r0 = (com.inmobi.media.C3838kj) r0
            int r1 = r0.f38899e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f38899e = r1
            goto L1b
        L16:
            com.inmobi.media.kj r0 = new com.inmobi.media.kj
            r0.<init>(r12, r15)
        L1b:
            java.lang.Object r15 = r0.f38897c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38899e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.d.b(r15)
            goto L76
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            com.inmobi.media.Cj r14 = r0.f38896b
            java.lang.String r13 = r0.f38895a
            kotlin.d.b(r15)
        L3f:
            r9 = r13
            r7 = r14
            goto L5b
        L42:
            kotlin.d.b(r15)
            eg.e1 r15 = eg.o0.c()
            com.inmobi.media.mj r2 = new com.inmobi.media.mj
            r2.<init>(r12, r5)
            r0.f38895a = r13
            r0.f38896b = r14
            r0.f38899e = r4
            java.lang.Object r15 = eg.g.g(r15, r2, r0)
            if (r15 != r1) goto L3f
            goto L75
        L5b:
            r10 = r15
            android.graphics.Bitmap$Config r10 = (android.graphics.Bitmap.Config) r10
            kotlinx.coroutines.CoroutineDispatcher r13 = eg.o0.b()
            com.inmobi.media.lj r6 = new com.inmobi.media.lj
            r11 = 0
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f38895a = r5
            r0.f38896b = r5
            r0.f38899e = r3
            java.lang.Object r12 = eg.g.g(r13, r6, r0)
            if (r12 != r1) goto L76
        L75:
            return r1
        L76:
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3913nj.a(com.inmobi.media.nj, java.lang.String, com.inmobi.media.Cj, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final Object a(C4111vi c4111vi, J3 j32) throws C3629cc {
        if (URLUtil.isNetworkUrl(c4111vi.f39783a)) {
            return eg.g.g(eg.o0.c(), new C3813jj(this, c4111vi, null), j32);
        }
        throw new C3629cc("Companion Invalid Resource Error");
    }
}
