package com.inmobi.media;

/* JADX INFO: loaded from: classes9.dex */
public final class Il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Il f37077a = new Il();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r8, com.inmobi.media.C4142x r9, java.util.ArrayList r10, kotlin.coroutines.jvm.internal.d r11) throws com.inmobi.media.C4064tl {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.inmobi.media.Hl
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.Hl r0 = (com.inmobi.media.Hl) r0
            int r1 = r0.f37032d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37032d = r1
            goto L18
        L13:
            com.inmobi.media.Hl r0 = new com.inmobi.media.Hl
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f37030b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37032d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.inmobi.media.nl r8 = r0.f37029a
            kotlin.d.b(r11)     // Catch: com.inmobi.media.C4064tl -> L2b
            goto L6d
        L2b:
            r9 = move-exception
            goto L80
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.d.b(r11)
            com.inmobi.media.nl r11 = new com.inmobi.media.nl
            com.inmobi.media.G r2 = r9.f39883b
            r11.<init>(r2)
            com.inmobi.media.Fl r4 = new com.inmobi.media.Fl
            com.inmobi.media.G r5 = r9.f39883b
            com.inmobi.media.p1 r5 = r5.f36898a
            com.inmobi.media.core.config.models.AdConfig r5 = r5.f39234b
            com.inmobi.media.core.config.models.AdConfig$VastVideoConfig r5 = r5.getVastVideo()
            com.inmobi.media.o1 r9 = r9.f39882a
            com.inmobi.media.n9 r9 = r9.f39145c
            r4.<init>(r5, r11, r9)
            java.lang.String r9 = "VastParseStart"
            java.util.Map r2 = com.inmobi.media.AbstractC3789ik.a(r2)     // Catch: com.inmobi.media.C4064tl -> L82
            com.inmobi.media.Wj r5 = com.inmobi.media.Wj.f37959a     // Catch: com.inmobi.media.C4064tl -> L82
            com.inmobi.media.ak r5 = com.inmobi.media.EnumC3585ak.f38215a     // Catch: com.inmobi.media.C4064tl -> L82
            com.inmobi.media.Wj.b(r9, r2, r5)     // Catch: com.inmobi.media.C4064tl -> L82
            r0.f37029a = r11     // Catch: com.inmobi.media.C4064tl -> L82
            r0.f37032d = r3     // Catch: com.inmobi.media.C4064tl -> L85
            java.lang.Object r8 = r4.a(r8, r10, r0)     // Catch: com.inmobi.media.C4064tl -> L82
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r6 = r11
            r11 = r8
            r8 = r6
        L6d:
            r9 = r11
            com.inmobi.media.ql r9 = (com.inmobi.media.C3990ql) r9     // Catch: com.inmobi.media.C4064tl -> L2b
            java.lang.String r9 = "VastParseSuccess"
            com.inmobi.media.G r10 = r8.f39117a     // Catch: com.inmobi.media.C4064tl -> L2b
            java.util.Map r10 = com.inmobi.media.AbstractC3789ik.a(r10)     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.Wj r0 = com.inmobi.media.Wj.f37959a     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.ak r0 = com.inmobi.media.EnumC3585ak.f38215a     // Catch: com.inmobi.media.C4064tl -> L2b
            com.inmobi.media.Wj.b(r9, r10, r0)     // Catch: com.inmobi.media.C4064tl -> L2b
            return r11
        L80:
            r11 = r8
            goto L86
        L82:
            r8 = move-exception
            r9 = r8
            goto L86
        L85:
            r9 = move-exception
        L86:
            short r8 = r9.f39610a
            com.inmobi.media.G r10 = r11.f39117a
            java.util.Map r10 = com.inmobi.media.AbstractC3789ik.a(r10)
            java.lang.Short r8 = java.lang.Short.valueOf(r8)
            java.lang.String r11 = "errorCode"
            r10.put(r11, r8)
            com.inmobi.media.Wj r8 = com.inmobi.media.Wj.f37959a
            com.inmobi.media.ak r8 = com.inmobi.media.EnumC3585ak.f38215a
            java.lang.String r11 = "VastParseFailure"
            com.inmobi.media.Wj.b(r11, r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Il.a(java.lang.String, com.inmobi.media.x, java.util.ArrayList, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
