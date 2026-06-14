package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class xq1 implements bl1, al1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bl1 f117926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public al1 f117928d;

    public xq1(bl1 bl1Var, long j10) {
        this.f117926b = bl1Var;
        this.f117927c = j10;
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        return this.f117926b.a(j10 - this.f117927c, ou2Var) + this.f117927c;
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        return this.f117926b.continueLoading(j10 - this.f117927c);
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) {
        this.f117926b.discardBuffer(j10 - this.f117927c, z10);
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f117926b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.f117927c;
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f117926b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.f117927c;
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        return this.f117926b.getTrackGroups();
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f117926b.isLoading();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() {
        this.f117926b.maybeThrowPrepareError();
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        long discontinuity = this.f117926b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return discontinuity + this.f117927c;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        this.f117926b.reevaluateBuffer(j10 - this.f117927c);
    }

    @Override // yads.bl1
    public final long seekToUs(long j10) {
        return this.f117926b.seekToUs(j10 - this.f117927c) + this.f117927c;
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        al1 al1Var = this.f117928d;
        al1Var.getClass();
        al1Var.a((ev2) this);
    }

    @Override // yads.al1
    public final void a(bl1 bl1Var) {
        al1 al1Var = this.f117928d;
        al1Var.getClass();
        al1Var.a((bl1) this);
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f117928d = al1Var;
        this.f117926b.a(this, j10 - this.f117927c);
    }

    @Override // yads.bl1
    public final long a(bo0[] bo0VarArr, boolean[] zArr, iq2[] iq2VarArr, boolean[] zArr2, long j10) {
        iq2[] iq2VarArr2 = new iq2[iq2VarArr.length];
        int i10 = 0;
        while (true) {
            iq2 iq2Var = null;
            if (i10 >= iq2VarArr.length) {
                break;
            }
            yq1 yq1Var = (yq1) iq2VarArr[i10];
            if (yq1Var != null) {
                iq2Var = yq1Var.f118325b;
            }
            iq2VarArr2[i10] = iq2Var;
            i10++;
        }
        long jA = this.f117926b.a(bo0VarArr, zArr, iq2VarArr2, zArr2, j10 - this.f117927c);
        for (int i11 = 0; i11 < iq2VarArr.length; i11++) {
            iq2 iq2Var2 = iq2VarArr2[i11];
            if (iq2Var2 == null) {
                iq2VarArr[i11] = null;
            } else {
                iq2 iq2Var3 = iq2VarArr[i11];
                if (iq2Var3 == null || ((yq1) iq2Var3).f118325b != iq2Var2) {
                    iq2VarArr[i11] = new yq1(iq2Var2, this.f117927c);
                }
            }
        }
        return jA + this.f117927c;
    }
}
