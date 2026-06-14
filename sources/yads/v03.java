package yads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class v03 implements li1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv f116828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f116829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f116830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f116831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gc2 f116832f = gc2.f111140e;

    public v03(r23 r23Var) {
        this.f116828b = r23Var;
    }

    @Override // yads.li1
    public final long a() {
        long j10 = this.f116830d;
        if (!this.f116829c) {
            return j10;
        }
        ((r23) this.f116828b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f116831e;
        gc2 gc2Var = this.f116832f;
        return (gc2Var.f111141b == 1.0f ? w83.a(jElapsedRealtime) : jElapsedRealtime * ((long) gc2Var.f111143d)) + j10;
    }

    @Override // yads.li1
    public final gc2 getPlaybackParameters() {
        return this.f116832f;
    }

    public final void a(long j10) {
        this.f116830d = j10;
        if (this.f116829c) {
            ((r23) this.f116828b).getClass();
            this.f116831e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.li1
    public final void a(gc2 gc2Var) {
        if (this.f116829c) {
            a(a());
        }
        this.f116832f = gc2Var;
    }
}
