package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f21705a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21706b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21707c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21708d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21709e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21711g;

    public final void a(boolean z10) {
        this.f21710f = 0;
        this.f21711g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f21705a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
