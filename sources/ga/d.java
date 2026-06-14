package ga;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oa.x f72229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private oa.r f72230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private oa.s f72231c;

    public d(oa.x xVar) {
        this.f72229a = xVar;
    }

    @Override // ga.r0
    public int a(oa.l0 l0Var) {
        return ((oa.r) q9.a.e(this.f72230b)).a((oa.s) q9.a.e(this.f72231c), l0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // ga.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(n9.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, oa.t r15) throws ga.n1 {
        /*
            r7 = this;
            oa.j r1 = new oa.j
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.f72231c = r1
            oa.r r8 = r7.f72230b
            if (r8 == 0) goto Lf
            return
        Lf:
            oa.x r8 = r7.f72229a
            oa.r[] r8 = r8.createExtractors(r9, r10)
            int r10 = r8.length
            com.google.common.collect.ImmutableList$Builder r10 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r10)
            int r11 = r8.length
            r12 = 0
            r13 = 1
            if (r11 != r13) goto L25
            r8 = r8[r12]
            r7.f72230b = r8
            goto L83
        L25:
            int r11 = r8.length
            r14 = r12
        L27:
            if (r14 >= r11) goto L7f
            r0 = r8[r14]
            boolean r2 = r0.c(r1)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            if (r2 == 0) goto L3d
            r7.f72230b = r0     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            q9.a.g(r13)
            r1.resetPeekPosition()
            goto L7f
        L3a:
            r0 = move-exception
            r8 = r0
            goto L5b
        L3d:
            java.util.List r0 = r0.getSniffFailureDetails()     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            r10.addAll(r0)     // Catch: java.lang.Throwable -> L3a java.io.EOFException -> L6f
            oa.r r0 = r7.f72230b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = r12
            goto L54
        L53:
            r0 = r13
        L54:
            q9.a.g(r0)
            r1.resetPeekPosition()
            goto L7c
        L5b:
            oa.r r9 = r7.f72230b
            if (r9 != 0) goto L67
            long r9 = r1.getPosition()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L68
        L67:
            r12 = r13
        L68:
            q9.a.g(r12)
            r1.resetPeekPosition()
            throw r8
        L6f:
            oa.r r0 = r7.f72230b
            if (r0 != 0) goto L53
            long r5 = r1.getPosition()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L53
        L7c:
            int r14 = r14 + 1
            goto L27
        L7f:
            oa.r r11 = r7.f72230b
            if (r11 == 0) goto L89
        L83:
            oa.r r8 = r7.f72230b
            r8.b(r15)
            return
        L89:
            ga.n1 r11 = new ga.n1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            com.google.common.base.Joiner r13 = com.google.common.base.Joiner.on(r13)
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.copyOf(r8)
            ga.c r14 = new ga.c
            r14.<init>()
            java.util.List r8 = com.google.common.collect.Lists.transform(r8, r14)
            java.lang.String r8 = r13.join(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = q9.a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            com.google.common.collect.ImmutableList r10 = r10.build()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.d.b(n9.h, android.net.Uri, java.util.Map, long, long, oa.t):void");
    }

    @Override // ga.r0
    public void disableSeekingOnMp3Streams() {
        oa.r rVar = this.f72230b;
        if (rVar == null) {
            return;
        }
        oa.r underlyingImplementation = rVar.getUnderlyingImplementation();
        if (underlyingImplementation instanceof hb.f) {
            ((hb.f) underlyingImplementation).i();
        }
    }

    @Override // ga.r0
    public long getCurrentInputPosition() {
        oa.s sVar = this.f72231c;
        if (sVar != null) {
            return sVar.getPosition();
        }
        return -1L;
    }

    @Override // ga.r0
    public void release() {
        oa.r rVar = this.f72230b;
        if (rVar != null) {
            rVar.release();
            this.f72230b = null;
        }
        this.f72231c = null;
    }

    @Override // ga.r0
    public void seek(long j10, long j11) {
        ((oa.r) q9.a.e(this.f72230b)).seek(j10, j11);
    }
}
