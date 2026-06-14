package yads;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class gx2 extends eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h30 f111386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b30 f111387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yv0 f111388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f111389d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fe1 f111390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f111391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bx2 f111392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rk1 f111393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e63 f111394i;

    public gx2(pk1 pk1Var, b30 b30Var, fe1 fe1Var, boolean z10) {
        this.f111387b = b30Var;
        this.f111390e = fe1Var;
        this.f111391f = z10;
        new dk1().a(Uri.EMPTY);
        throw null;
    }

    @Override // yads.ml1
    public final bl1 createPeriod(kl1 kl1Var, ke keVar, long j10) {
        return new fx2(this.f111386a, this.f111387b, this.f111394i, this.f111388c, this.f111389d, this.f111390e, createEventDispatcher(kl1Var), this.f111391f);
    }

    @Override // yads.ml1
    public final rk1 getMediaItem() {
        return this.f111393h;
    }

    @Override // yads.ml1
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // yads.eo
    public final void prepareSourceInternal(e63 e63Var) {
        this.f111394i = e63Var;
        refreshSourceInfo(this.f111392g);
    }

    @Override // yads.ml1
    public final void releasePeriod(bl1 bl1Var) {
        ((fx2) bl1Var).f110967j.a((ne1) null);
    }

    @Override // yads.eo
    public final void releaseSourceInternal() {
    }
}
