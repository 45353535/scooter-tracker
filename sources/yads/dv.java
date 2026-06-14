package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class dv implements bl1, al1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl1 f110077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public al1 f110078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cv[] f110079d = new cv[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f110080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f110081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f110082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fv f110083h;

    public dv(bl1 bl1Var, boolean z10, long j10, long j11) {
        this.f110077b = bl1Var;
        this.f110080e = z10 ? j10 : -9223372036854775807L;
        this.f110081f = j10;
        this.f110082g = j11;
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        long j11 = this.f110081f;
        if (j10 == j11) {
            return j11;
        }
        int i10 = w83.f117341a;
        long jMax = Math.max(0L, Math.min(ou2Var.f114420a, j10 - j11));
        long j12 = ou2Var.f114421b;
        long j13 = this.f110082g;
        long jMax2 = Math.max(0L, Math.min(j12, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10));
        if (jMax != ou2Var.f114420a || jMax2 != ou2Var.f114421b) {
            ou2Var = new ou2(jMax, jMax2);
        }
        return this.f110077b.a(j10, ou2Var);
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        return this.f110077b.continueLoading(j10);
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) {
        this.f110077b.discardBuffer(j10, z10);
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f110077b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j10 = this.f110082g;
            if (j10 == Long.MIN_VALUE || bufferedPositionUs < j10) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f110077b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j10 = this.f110082g;
            if (j10 == Long.MIN_VALUE || nextLoadPositionUs < j10) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        return this.f110077b.getTrackGroups();
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f110077b.isLoading();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() throws fv {
        fv fvVar = this.f110083h;
        if (fvVar != null) {
            throw fvVar;
        }
        this.f110077b.maybeThrowPrepareError();
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        long j10 = this.f110080e;
        if (j10 != -9223372036854775807L) {
            this.f110080e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j10;
        }
        long discontinuity2 = this.f110077b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (discontinuity2 < this.f110081f) {
            throw new IllegalStateException();
        }
        long j11 = this.f110082g;
        if (j11 == Long.MIN_VALUE || discontinuity2 <= j11) {
            return discontinuity2;
        }
        throw new IllegalStateException();
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        this.f110077b.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f110080e = r0
            yads.cv[] r0 = r5.f110079d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f109608c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            yads.bl1 r0 = r5.f110077b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L3a
            long r6 = r5.f110081f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f110082g
            r2 = -9223372036854775808
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L3a
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
            goto L3a
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dv.seekToUs(long):long");
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        al1 al1Var = this.f110078c;
        al1Var.getClass();
        al1Var.a((ev2) this);
    }

    @Override // yads.al1
    public final void a(bl1 bl1Var) {
        if (this.f110083h != null) {
            return;
        }
        al1 al1Var = this.f110078c;
        al1Var.getClass();
        al1Var.a((bl1) this);
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f110078c = al1Var;
        this.f110077b.a(this, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r11 > r1) goto L32;
     */
    @Override // yads.bl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(yads.bo0[] r18, boolean[] r19, yads.iq2[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            yads.cv[] r1 = new yads.cv[r1]
            r0.f110079d = r1
            int r1 = r8.length
            yads.iq2[] r4 = new yads.iq2[r1]
            r9 = 0
            r1 = r9
        Le:
            int r2 = r8.length
            r10 = 0
            if (r1 >= r2) goto L23
            yads.cv[] r2 = r0.f110079d
            r3 = r8[r1]
            yads.cv r3 = (yads.cv) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            yads.iq2 r10 = r3.f109607b
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Le
        L23:
            yads.bl1 r1 = r0.f110077b
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.a(r2, r3, r4, r5, r6)
            long r5 = r0.f110080e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 == 0) goto L63
            long r5 = r0.f110081f
            int r1 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r1 != 0) goto L63
            r15 = 0
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r1 == 0) goto L63
            int r1 = r2.length
            r3 = r9
        L4a:
            if (r3 >= r1) goto L63
            r5 = r2[r3]
            if (r5 == 0) goto L60
            yads.yv0 r5 = r5.d()
            java.lang.String r6 = r5.f118398m
            java.lang.String r5 = r5.f118395j
            boolean r5 = yads.tr1.a(r6, r5)
            if (r5 != 0) goto L60
            r13 = r11
            goto L63
        L60:
            int r3 = r3 + 1
            goto L4a
        L63:
            r0.f110080e = r13
            int r1 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r1 == 0) goto L82
            long r1 = r0.f110081f
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 < 0) goto L7c
            long r1 = r0.f110082g
            r5 = -9223372036854775808
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L82
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L82
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L82:
            int r1 = r8.length
            if (r9 >= r1) goto La8
            r1 = r4[r9]
            if (r1 != 0) goto L8e
            yads.cv[] r1 = r0.f110079d
            r1[r9] = r10
            goto L9f
        L8e:
            yads.cv[] r2 = r0.f110079d
            r3 = r2[r9]
            if (r3 == 0) goto L98
            yads.iq2 r3 = r3.f109607b
            if (r3 == r1) goto L9f
        L98:
            yads.cv r3 = new yads.cv
            r3.<init>(r0, r1)
            r2[r9] = r3
        L9f:
            yads.cv[] r1 = r0.f110079d
            r1 = r1[r9]
            r8[r9] = r1
            int r9 = r9 + 1
            goto L82
        La8:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.dv.a(yads.bo0[], boolean[], yads.iq2[], boolean[], long):long");
    }
}
