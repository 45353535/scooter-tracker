package oa;

import io.bidmachine.media3.common.a;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f96618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f96620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f96621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t f96623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f96624g;

    public o0(int i10, int i11, String str) {
        this.f96618a = i10;
        this.f96619b = i11;
        this.f96620c = str;
    }

    private void d(String str) {
        s0 s0VarTrack = this.f96623f.track(1024, 4);
        this.f96624g = s0VarTrack;
        s0VarTrack.f(new a.b().U(str).u0(str).N());
        this.f96623f.endTracks();
        this.f96623f.e(new p0(-9223372036854775807L));
        this.f96622e = 1;
    }

    private void e(s sVar) {
        int iB = ((s0) q9.a.e(this.f96624g)).b(sVar, 1024, true);
        if (iB != -1) {
            this.f96621d += iB;
            return;
        }
        this.f96622e = 2;
        this.f96624g.e(0L, 1, this.f96621d, 0, null);
        this.f96621d = 0;
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        int i10 = this.f96622e;
        if (i10 == 1) {
            e(sVar);
            return 0;
        }
        if (i10 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // oa.r
    public void b(t tVar) {
        this.f96623f = tVar;
        d(this.f96620c);
    }

    @Override // oa.r
    public boolean c(s sVar) {
        q9.a.g((this.f96618a == -1 || this.f96619b == -1) ? false : true);
        q9.d0 d0Var = new q9.d0(this.f96619b);
        sVar.peekFully(d0Var.e(), 0, this.f96619b);
        return d0Var.P() == this.f96618a;
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        if (j10 == 0 || this.f96622e == 1) {
            this.f96622e = 1;
            this.f96621d = 0;
        }
    }

    @Override // oa.r
    public void release() {
    }
}
