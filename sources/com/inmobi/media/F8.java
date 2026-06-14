package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class F8 extends AbstractC3785ig {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3876m7 f36830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F8(C3935og dao) {
        super(dao);
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.f36830d = new C3876m7(dao, new E8(this), this.f38766c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.inmobi.media.Rf r13, kotlin.coroutines.jvm.internal.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.inmobi.media.C8
            if (r0 == 0) goto L13
            r0 = r14
            com.inmobi.media.C8 r0 = (com.inmobi.media.C8) r0
            int r1 = r0.f36663d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36663d = r1
            goto L18
        L13:
            com.inmobi.media.C8 r0 = new com.inmobi.media.C8
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f36661b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f36663d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.inmobi.media.Rf r13 = r0.f36660a
            kotlin.d.b(r14)
            goto L68
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            kotlin.d.b(r14)
            com.inmobi.media.if r14 = r12.f38766c
            r0.f36660a = r13
            r0.f36663d = r3
            r14.getClass()
            java.util.HashMap r6 = new java.util.HashMap
            java.util.Map r2 = r13.f37660c
            r6.<init>(r2)
            java.lang.String r2 = com.inmobi.media.Ji.c()
            java.lang.String r3 = "user-agent"
            r6.put(r3, r2)
            com.inmobi.media.Je r4 = new com.inmobi.media.Je
            java.lang.String r5 = r13.f37658a
            boolean r10 = r13.f37661d
            r11 = 28
            r7 = 0
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            com.inmobi.media.u9 r14 = r14.f38763a
            com.inmobi.media.x4 r14 = r14.f39655a
            java.lang.Object r14 = r14.a(r4, r0)
            if (r14 != r1) goto L68
            return r1
        L68:
            com.inmobi.media.Ne r14 = (com.inmobi.media.Ne) r14
            com.inmobi.media.Xf r0 = new com.inmobi.media.Xf
            int r1 = r14.c()
            java.lang.String r14 = r14.e()
            r0.<init>(r13, r1, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F8.a(com.inmobi.media.Rf, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        if (r0.a(r15) != r1) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0189, code lost:
    
        if (r14.a(r15) == r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c1, code lost:
    
        if (r14.a(r15) == r1) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[Catch: Error -> 0x00b9, Exception -> 0x00bd, TryCatch #5 {Error -> 0x00b9, Exception -> 0x00bd, blocks: (B:47:0x00a2, B:49:0x00aa, B:55:0x00c1, B:58:0x00db), top: B:104:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1 A[Catch: Error -> 0x00b9, Exception -> 0x00bd, TryCatch #5 {Error -> 0x00b9, Exception -> 0x00bd, blocks: (B:47:0x00a2, B:49:0x00aa, B:55:0x00c1, B:58:0x00db), top: B:104:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb A[Catch: Error -> 0x0054, Exception -> 0x0057, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130 A[Catch: Error -> 0x0054, Exception -> 0x0057, TRY_LEAVE, TryCatch #4 {Error -> 0x0054, Exception -> 0x0057, blocks: (B:24:0x004f, B:66:0x00f3, B:68:0x00fb, B:72:0x0123, B:75:0x012a, B:71:0x0121, B:78:0x0130, B:31:0x005e, B:34:0x0069), top: B:103:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a5  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.inmobi.media.Rf r14, kotlin.coroutines.jvm.internal.d r15) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.F8.b(com.inmobi.media.Rf, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
