package u9;

import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.h f105323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f105324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f105325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f105326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private n9.z f105327f = n9.z.f95676d;

    public n0(q9.h hVar) {
        this.f105323b = hVar;
    }

    public void a(long j10) {
        this.f105325d = j10;
        if (this.f105324c) {
            this.f105326e = this.f105323b.elapsedRealtime();
        }
    }

    @Override // u9.g0
    public void b(n9.z zVar) {
        if (this.f105324c) {
            a(getPositionUs());
        }
        this.f105327f = zVar;
    }

    public void c() {
        if (this.f105324c) {
            return;
        }
        this.f105326e = this.f105323b.elapsedRealtime();
        this.f105324c = true;
    }

    public void d() {
        if (this.f105324c) {
            a(getPositionUs());
            this.f105324c = false;
        }
    }

    @Override // u9.g0
    public n9.z getPlaybackParameters() {
        return this.f105327f;
    }

    @Override // u9.g0
    public long getPositionUs() {
        long j10 = this.f105325d;
        if (!this.f105324c) {
            return j10;
        }
        long jElapsedRealtime = this.f105323b.elapsedRealtime() - this.f105326e;
        n9.z zVar = this.f105327f;
        return j10 + (zVar.f95679a == 1.0f ? o0.P0(jElapsedRealtime) : zVar.a(jElapsedRealtime));
    }

    @Override // u9.g0
    public /* synthetic */ boolean hasSkippedSilenceSinceLastCall() {
        return f0.a(this);
    }
}
