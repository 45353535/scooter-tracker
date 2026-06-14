package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f23079c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f23077a = new w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23080d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23081e = 2000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f23082f = true;

    public q(String str, m mVar) {
        this.f23078b = str;
        this.f23079c = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new p(this.f23078b, this.f23079c, this.f23080d, this.f23081e, this.f23082f, this.f23077a);
    }
}
