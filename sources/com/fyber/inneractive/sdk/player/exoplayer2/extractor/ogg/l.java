package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f22350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f22351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f22353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f22356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f22359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22362m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z10) {
        if (z10) {
            this.f22359j = new j();
            this.f22355f = 0L;
            this.f22357h = 0;
        } else {
            this.f22357h = 1;
        }
        this.f22354e = -1L;
        this.f22356g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar);

    public void a(long j10) {
        this.f22356g = j10;
    }
}
