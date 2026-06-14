package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class al0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f108710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hb f108711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf2 f108712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.b f108713d;

    public al0(c4 c4Var, hb hbVar, sf2 sf2Var, kotlinx.serialization.json.b bVar) {
        this.f108710a = c4Var;
        this.f108711b = hbVar;
        this.f108712c = sf2Var;
        this.f108713d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof yads.zk0
            if (r2 == 0) goto L17
            r2 = r1
            yads.zk0 r2 = (yads.zk0) r2
            int r3 = r2.f118728e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f118728e = r3
            goto L1c
        L17:
            yads.zk0 r2 = new yads.zk0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f118726c
            java.lang.Object r3 = pf.b.g()
            int r4 = r2.f118728e
            r5 = 1
            if (r4 == 0) goto L38
            if (r4 != r5) goto L30
            yads.al0 r2 = r2.f118725b
            kotlin.d.b(r1)
            goto Lb0
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            kotlin.d.b(r1)
            yads.c4 r1 = r0.f108710a
            yads.fb r1 = r1.f109196c
            java.lang.String r1 = r1.f110681a
            yads.hb r4 = r0.f108711b
            yads.zo r4 = r4.f111532a
            yads.sq1 r4 = r4.f118747c
            r6 = 0
            if (r4 != 0) goto L4b
            goto L7b
        L4b:
            java.util.List r7 = r4.f115900c
            if (r7 == 0) goto L7b
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r7.next()
            r9 = r8
            yads.jq1 r9 = (yads.jq1) r9
            java.lang.String r9 = r9.f112433b
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
            if (r9 == 0) goto L53
            goto L6a
        L69:
            r8 = r6
        L6a:
            yads.jq1 r8 = (yads.jq1) r8
            if (r8 != 0) goto L6f
            goto L7b
        L6f:
            yads.kq1 r7 = new yads.kq1
            java.lang.String r9 = r8.f112433b
            java.util.List r8 = r8.f112434c
            long r10 = r4.f115899b
            r7.<init>(r10, r9, r8)
            goto L7c
        L7b:
            r7 = r6
        L7c:
            if (r7 != 0) goto L7f
            return r6
        L7f:
            if (r1 != 0) goto L82
            return r6
        L82:
            yads.c4 r1 = r0.f108710a
            yads.qz r12 = r1.f109194a
            yads.nx2 r1 = r1.f109197d
            yads.mx2 r13 = r1.f114071a
            java.util.List r15 = r7.f112805b
            long r9 = r7.f112806c
            yads.sf2 r14 = r0.f108712c
            r2.f118725b = r0
            r2.f118728e = r5
            r14.getClass()
            eg.e1 r1 = eg.o0.c()
            eg.e1 r1 = r1.w()
            yads.of2 r8 = new yads.of2
            r16 = 0
            r11 = r18
            r8.<init>(r9, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = eg.g.g(r1, r8, r2)
            if (r1 != r3) goto Laf
            return r3
        Laf:
            r2 = r0
        Lb0:
            yads.ye2 r1 = (yads.ye2) r1
            kotlinx.serialization.json.b r2 = r2.f108713d
            r2.a()
            yads.xe2 r3 = yads.ye2.Companion
            kotlinx.serialization.KSerializer r3 = r3.serializer()
            java.lang.String r1 = r2.b(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.al0.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
