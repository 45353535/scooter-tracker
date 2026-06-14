package yads;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gv extends ay {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ml1 f111341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f111342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f111343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f111344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f111345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f111346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f111347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e43 f111348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ev f111349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fv f111350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f111351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f111352o;

    public gv(ml1 ml1Var, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        fi.a(j10 >= 0);
        this.f111341d = (ml1) fi.a(ml1Var);
        this.f111342e = j10;
        this.f111343f = j11;
        this.f111344g = z10;
        this.f111345h = z11;
        this.f111346i = z12;
        this.f111347j = new ArrayList();
        this.f111348k = new e43();
    }

    public final void a(f43 f43Var) {
        long j10;
        long j11;
        long j12;
        f43Var.a(0, this.f111348k, 0L);
        long j13 = this.f111348k.f110203r;
        if (this.f111349l == null || this.f111347j.isEmpty() || this.f111345h) {
            long j14 = this.f111342e;
            long j15 = this.f111343f;
            if (this.f111346i) {
                long j16 = this.f111348k.f110199n;
                j14 += j16;
                j10 = j16 + j15;
            } else {
                j10 = j15;
            }
            this.f111351n = j13 + j14;
            this.f111352o = j15 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f111347j.size();
            for (int i10 = 0; i10 < size; i10++) {
                dv dvVar = (dv) this.f111347j.get(i10);
                long j17 = this.f111351n;
                long j18 = this.f111352o;
                dvVar.f110081f = j17;
                dvVar.f110082g = j18;
            }
            j11 = j14;
            j12 = j10;
        } else {
            long j19 = this.f111351n - j13;
            j12 = this.f111343f != Long.MIN_VALUE ? this.f111352o - j13 : Long.MIN_VALUE;
            j11 = j19;
        }
        try {
            ev evVar = new ev(f43Var, j11, j12);
            this.f111349l = evVar;
            refreshSourceInfo(evVar);
        } catch (fv e10) {
            this.f111350m = e10;
            for (int i11 = 0; i11 < this.f111347j.size(); i11++) {
                ((dv) this.f111347j.get(i11)).f110083h = this.f111350m;
            }
        }
    }

    @Override // yads.ay
    /* JADX INFO: renamed from: b */
    public final void a(Object obj, ml1 ml1Var, f43 f43Var) {
        if (this.f111350m != null) {
            return;
        }
        a(f43Var);
    }

    @Override // yads.ml1
    public final bl1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        dv dvVar = new dv(this.f111341d.createPeriod(kl1Var, keVar, j10), this.f111344g, this.f111351n, this.f111352o);
        this.f111347j.add(dvVar);
        return dvVar;
    }

    @Override // yads.ml1
    public final rk1 getMediaItem() {
        return this.f111341d.getMediaItem();
    }

    @Override // yads.ay, yads.ml1
    public final void maybeThrowSourceInfoRefreshError() throws fv {
        fv fvVar = this.f111350m;
        if (fvVar != null) {
            throw fvVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // yads.eo
    public final void prepareSourceInternal(e63 e63Var) {
        this.f108859c = e63Var;
        this.f108858b = w83.a((Handler.Callback) null);
        a((Object) null, this.f111341d);
    }

    @Override // yads.ml1
    public final void releasePeriod(bl1 bl1Var) {
        if (!this.f111347j.remove(bl1Var)) {
            throw new IllegalStateException();
        }
        this.f111341d.releasePeriod(((dv) bl1Var).f110077b);
        if (!this.f111347j.isEmpty() || this.f111345h) {
            return;
        }
        ev evVar = this.f111349l;
        evVar.getClass();
        a(evVar.f109134c);
    }

    @Override // yads.ay, yads.eo
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.f111350m = null;
        this.f111349l = null;
    }
}
