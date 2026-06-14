package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class jh1 extends ay {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ml1 f112337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f112338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e43 f112339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c43 f112340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hh1 f112341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gh1 f112342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f112343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f112345l;

    public jh1(ml1 ml1Var, boolean z10) {
        this.f112337d = ml1Var;
        this.f112338e = z10 && ml1Var.isSingleWindow();
        this.f112339f = new e43();
        this.f112340g = new c43();
        f43 initialTimeline = ml1Var.getInitialTimeline();
        if (initialTimeline == null) {
            this.f112341h = hh1.a(ml1Var.getMediaItem());
        } else {
            this.f112341h = hh1.a(initialTimeline);
            this.f112345l = true;
        }
    }

    @Override // yads.ml1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gh1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        gh1 gh1Var = new gh1(kl1Var, keVar, j10);
        ml1 ml1Var = this.f112337d;
        if (gh1Var.f111197e != null) {
            throw new IllegalStateException();
        }
        gh1Var.f111197e = ml1Var;
        if (!this.f112344k) {
            this.f112342i = gh1Var;
            if (!this.f112343j) {
                this.f112343j = true;
                a((Object) null, ml1Var);
            }
            return gh1Var;
        }
        Object obj = kl1Var.f109962a;
        if (this.f112341h.f111595e != null && obj.equals(hh1.f111593f)) {
            obj = this.f112341h.f111595e;
        }
        gh1Var.a(kl1Var.a(obj));
        return gh1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // yads.ay
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r13, yads.ml1 r14, yads.f43 r15) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.jh1.a(java.lang.Object, yads.ml1, yads.f43):void");
    }

    @Override // yads.ml1
    public final rk1 getMediaItem() {
        return this.f112337d.getMediaItem();
    }

    @Override // yads.ay, yads.ml1
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // yads.eo
    public final void prepareSourceInternal(e63 e63Var) {
        this.f108859c = e63Var;
        this.f108858b = w83.a((Handler.Callback) null);
        if (this.f112338e) {
            return;
        }
        this.f112343j = true;
        a((Object) null, this.f112337d);
    }

    @Override // yads.ml1
    public final void releasePeriod(bl1 bl1Var) {
        ((gh1) bl1Var).a();
        if (bl1Var == this.f112342i) {
            this.f112342i = null;
        }
    }

    @Override // yads.ay, yads.eo
    public final void releaseSourceInternal() {
        this.f112344k = false;
        this.f112343j = false;
        super.releaseSourceInternal();
    }

    @Override // yads.ay
    public final kl1 a(Object obj, kl1 kl1Var) {
        Object obj2 = kl1Var.f109962a;
        Object obj3 = this.f112341h.f111595e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = hh1.f111593f;
        }
        return kl1Var.a(obj2);
    }

    public final void a(long j10) {
        gh1 gh1Var = this.f112342i;
        int iA = this.f112341h.a(gh1Var.f111194b.f109962a);
        if (iA == -1) {
            return;
        }
        long j11 = this.f112341h.a(iA, this.f112340g, false).f109217e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        gh1Var.f111200h = j10;
    }
}
