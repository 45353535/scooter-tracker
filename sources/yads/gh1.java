package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class gh1 implements bl1, al1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f111194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f111195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ke f111196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ml1 f111197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bl1 f111198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public al1 f111199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f111200h = -9223372036854775807L;

    public gh1(kl1 kl1Var, ke keVar, long j10) {
        this.f111194b = kl1Var;
        this.f111196d = keVar;
        this.f111195c = j10;
    }

    public final void a(kl1 kl1Var) {
        long j10 = this.f111195c;
        long j11 = this.f111200h;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        ml1 ml1Var = this.f111197e;
        ml1Var.getClass();
        bl1 bl1VarCreatePeriod = ml1Var.createPeriod(kl1Var, this.f111196d, j10);
        this.f111198f = bl1VarCreatePeriod;
        if (this.f111199g != null) {
            bl1VarCreatePeriod.a(this, j10);
        }
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        bl1 bl1Var = this.f111198f;
        return bl1Var != null && bl1Var.continueLoading(j10);
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        bl1Var.discardBuffer(j10, z10);
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.getBufferedPositionUs();
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.getNextLoadPositionUs();
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.getTrackGroups();
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        bl1 bl1Var = this.f111198f;
        return bl1Var != null && bl1Var.isLoading();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() {
        bl1 bl1Var = this.f111198f;
        if (bl1Var != null) {
            bl1Var.maybeThrowPrepareError();
            return;
        }
        ml1 ml1Var = this.f111197e;
        if (ml1Var != null) {
            ml1Var.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.readDiscontinuity();
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        bl1Var.reevaluateBuffer(j10);
    }

    @Override // yads.bl1
    public final long seekToUs(long j10) {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.seekToUs(j10);
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.a(j10, ou2Var);
    }

    @Override // yads.dv2
    public final void a(ev2 ev2Var) {
        al1 al1Var = this.f111199g;
        int i10 = w83.f117341a;
        al1Var.a((ev2) this);
    }

    @Override // yads.al1
    public final void a(bl1 bl1Var) {
        al1 al1Var = this.f111199g;
        int i10 = w83.f117341a;
        al1Var.a((bl1) this);
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        this.f111199g = al1Var;
        bl1 bl1Var = this.f111198f;
        if (bl1Var != null) {
            long j11 = this.f111195c;
            long j12 = this.f111200h;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            bl1Var.a(this, j11);
        }
    }

    public final void a() {
        if (this.f111198f != null) {
            ml1 ml1Var = this.f111197e;
            ml1Var.getClass();
            ml1Var.releasePeriod(this.f111198f);
        }
    }

    @Override // yads.bl1
    public final long a(bo0[] bo0VarArr, boolean[] zArr, iq2[] iq2VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f111200h;
        if (j12 == -9223372036854775807L || j10 != this.f111195c) {
            j11 = j10;
        } else {
            this.f111200h = -9223372036854775807L;
            j11 = j12;
        }
        bl1 bl1Var = this.f111198f;
        int i10 = w83.f117341a;
        return bl1Var.a(bo0VarArr, zArr, iq2VarArr, zArr2, j11);
    }
}
