package yads;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class ci2 extends eo implements vh2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk1 f109406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lk1 f109407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30 f109408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final th2 f109409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nj0 f109410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fe1 f109411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f109412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f109413h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f109414i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f109415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f109416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e63 f109417l;

    public ci2(rk1 rk1Var, b30 b30Var, th2 th2Var, nj0 nj0Var, fe1 fe1Var, int i10) {
        this.f109407b = (lk1) fi.a(rk1Var.f115475c);
        this.f109406a = rk1Var;
        this.f109408c = b30Var;
        this.f109409d = th2Var;
        this.f109410e = nj0Var;
        this.f109411f = fe1Var;
        this.f109412g = i10;
    }

    @Override // yads.ml1
    public final bl1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        c30 c30VarA = this.f109408c.a();
        e63 e63Var = this.f109417l;
        if (e63Var != null) {
            c30VarA.a(e63Var);
        }
        return new zh2(this.f109407b.f113131a, c30VarA, this.f109409d.a(getPlayerId()), this.f109410e, createDrmEventDispatcher(kl1Var), this.f109411f, createEventDispatcher(kl1Var), this, keVar, this.f109407b.f113135e, this.f109412g);
    }

    @Override // yads.ml1
    public final rk1 getMediaItem() {
        return this.f109406a;
    }

    @Override // yads.ml1
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // yads.eo
    public final void prepareSourceInternal(e63 e63Var) {
        this.f109417l = e63Var;
        this.f109410e.prepare();
        nj0 nj0Var = this.f109410e;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        nj0Var.a(looperMyLooper, getPlayerId());
        long j10 = this.f109414i;
        bx2 bx2Var = new bx2(j10, j10, this.f109415j, this.f109416k, this.f109406a);
        f43 ai2Var = bx2Var;
        if (this.f109413h) {
            ai2Var = new ai2(bx2Var);
        }
        refreshSourceInfo(ai2Var);
    }

    @Override // yads.ml1
    public final void releasePeriod(bl1 bl1Var) {
        zh2 zh2Var = (zh2) bl1Var;
        if (zh2Var.f118708w) {
            for (hq2 hq2Var : zh2Var.f118705t) {
                hq2Var.a();
                hq2Var.d();
            }
        }
        zh2Var.f118697l.a(zh2Var);
        zh2Var.f118702q.removeCallbacksAndMessages(null);
        zh2Var.f118703r = null;
        zh2Var.M = true;
    }

    @Override // yads.eo
    public final void releaseSourceInternal() {
        this.f109410e.release();
    }
}
