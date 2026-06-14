package io.bidmachine.media3.exoplayer;

/* JADX INFO: loaded from: classes12.dex */
final class k implements u9.g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9.n0 f81159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f81160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i2 f81161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u9.g0 f81162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f81163f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f81164g;

    public interface a {
        void j(n9.z zVar);
    }

    public k(a aVar, q9.h hVar) {
        this.f81160c = aVar;
        this.f81159b = new u9.n0(hVar);
    }

    private boolean e(boolean z10) {
        i2 i2Var = this.f81161d;
        if (i2Var == null || i2Var.isEnded()) {
            return true;
        }
        if (z10 && this.f81161d.getState() != 2) {
            return true;
        }
        if (this.f81161d.isReady()) {
            return false;
        }
        return z10 || this.f81161d.hasReadStreamToEnd();
    }

    private void i(boolean z10) {
        if (e(z10)) {
            this.f81163f = true;
            if (this.f81164g) {
                this.f81159b.c();
                return;
            }
            return;
        }
        u9.g0 g0Var = (u9.g0) q9.a.e(this.f81162e);
        long positionUs = g0Var.getPositionUs();
        if (this.f81163f) {
            if (positionUs < this.f81159b.getPositionUs()) {
                this.f81159b.d();
                return;
            } else {
                this.f81163f = false;
                if (this.f81164g) {
                    this.f81159b.c();
                }
            }
        }
        this.f81159b.a(positionUs);
        n9.z playbackParameters = g0Var.getPlaybackParameters();
        if (playbackParameters.equals(this.f81159b.getPlaybackParameters())) {
            return;
        }
        this.f81159b.b(playbackParameters);
        this.f81160c.j(playbackParameters);
    }

    public void a(i2 i2Var) {
        if (i2Var == this.f81161d) {
            this.f81162e = null;
            this.f81161d = null;
            this.f81163f = true;
        }
    }

    @Override // u9.g0
    public void b(n9.z zVar) {
        u9.g0 g0Var = this.f81162e;
        if (g0Var != null) {
            g0Var.b(zVar);
            zVar = this.f81162e.getPlaybackParameters();
        }
        this.f81159b.b(zVar);
    }

    public void c(i2 i2Var) throws s {
        u9.g0 g0Var;
        u9.g0 mediaClock = i2Var.getMediaClock();
        if (mediaClock == null || mediaClock == (g0Var = this.f81162e)) {
            return;
        }
        if (g0Var != null) {
            throw s.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f81162e = mediaClock;
        this.f81161d = i2Var;
        mediaClock.b(this.f81159b.getPlaybackParameters());
    }

    public void d(long j10) {
        this.f81159b.a(j10);
    }

    public void f() {
        this.f81164g = true;
        this.f81159b.c();
    }

    public void g() {
        this.f81164g = false;
        this.f81159b.d();
    }

    @Override // u9.g0
    public n9.z getPlaybackParameters() {
        u9.g0 g0Var = this.f81162e;
        return g0Var != null ? g0Var.getPlaybackParameters() : this.f81159b.getPlaybackParameters();
    }

    @Override // u9.g0
    public long getPositionUs() {
        return this.f81163f ? this.f81159b.getPositionUs() : ((u9.g0) q9.a.e(this.f81162e)).getPositionUs();
    }

    public long h(boolean z10) {
        i(z10);
        return getPositionUs();
    }

    @Override // u9.g0
    public boolean hasSkippedSilenceSinceLastCall() {
        return this.f81163f ? this.f81159b.hasSkippedSilenceSinceLastCall() : ((u9.g0) q9.a.e(this.f81162e)).hasSkippedSilenceSinceLastCall();
    }
}
