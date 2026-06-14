package io.bidmachine.media3.exoplayer.hls;

import ga.c1;
import u9.d0;

/* JADX INFO: loaded from: classes12.dex */
final class h implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f81024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81025d = -1;

    public h(l lVar, int i10) {
        this.f81024c = lVar;
        this.f81023b = i10;
    }

    private boolean b() {
        int i10 = this.f81025d;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void a() {
        q9.a.a(this.f81025d == -1);
        this.f81025d = this.f81024c.o(this.f81023b);
    }

    public void c() {
        if (this.f81025d != -1) {
            this.f81024c.g0(this.f81023b);
            this.f81025d = -1;
        }
    }

    @Override // ga.c1
    public int d(d0 d0Var, t9.f fVar, int i10) {
        if (this.f81025d == -3) {
            fVar.a(4);
            return -4;
        }
        if (b()) {
            return this.f81024c.V(this.f81025d, d0Var, fVar, i10);
        }
        return -3;
    }

    @Override // ga.c1
    public boolean isReady() {
        if (this.f81025d != -3) {
            return b() && this.f81024c.G(this.f81025d);
        }
        return true;
    }

    @Override // ga.c1
    public void maybeThrowError() throws aa.i {
        int i10 = this.f81025d;
        if (i10 == -2) {
            throw new aa.i(this.f81024c.getTrackGroups().b(this.f81023b).a(0).f80561o);
        }
        if (i10 == -1) {
            this.f81024c.K();
        } else if (i10 != -3) {
            this.f81024c.L(i10);
        }
    }

    @Override // ga.c1
    public int skipData(long j10) {
        if (b()) {
            return this.f81024c.f0(this.f81025d, j10);
        }
        return 0;
    }
}
