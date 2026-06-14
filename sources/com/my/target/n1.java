package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n1 extends cb {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f60172e;

    public n1(w2 w2Var, ab abVar, long j10) {
        super(w2Var, abVar);
        this.f60172e = 0L;
        this.f60171d = j10;
    }

    public final boolean a(boolean z10) {
        if (!z10) {
            this.f60172e = 0L;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f60172e == 0) {
            this.f60172e = jCurrentTimeMillis;
        }
        if (jCurrentTimeMillis - this.f60172e < this.f60171d) {
            gb.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visibility < " + this.f60171d + " millis");
            return false;
        }
        gb.b("ViewabilityTracker: ContinuousVisibilityBaseTracker", "view continuous visible for " + this.f60171d + " millis");
        return true;
    }
}
