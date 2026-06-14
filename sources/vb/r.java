package vb;

import io.bidmachine.media3.common.a;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106380a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s0 f106382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f106383d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f106385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f106386g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106381b = new q9.d0(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f106384e = -9223372036854775807L;

    public r(String str) {
        this.f106380a = str;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) {
        q9.a.i(this.f106382c);
        if (this.f106383d) {
            int iA = d0Var.a();
            int i10 = this.f106386g;
            if (i10 < 10) {
                int iMin = Math.min(iA, 10 - i10);
                System.arraycopy(d0Var.e(), d0Var.f(), this.f106381b.e(), this.f106386g, iMin);
                if (this.f106386g + iMin == 10) {
                    this.f106381b.W(0);
                    if (73 != this.f106381b.H() || 68 != this.f106381b.H() || 51 != this.f106381b.H()) {
                        q9.u.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f106383d = false;
                        return;
                    } else {
                        this.f106381b.X(3);
                        this.f106385f = this.f106381b.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f106385f - this.f106386g);
            this.f106382c.c(d0Var, iMin2);
            this.f106386g += iMin2;
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        s0 s0VarTrack = tVar.track(dVar.c(), 5);
        this.f106382c = s0VarTrack;
        s0VarTrack.f(new a.b().f0(dVar.b()).U(this.f106380a).u0("application/id3").N());
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
        int i10;
        q9.a.i(this.f106382c);
        if (this.f106383d && (i10 = this.f106385f) != 0 && this.f106386g == i10) {
            q9.a.g(this.f106384e != -9223372036854775807L);
            this.f106382c.e(this.f106384e, 1, this.f106385f, 0, null);
            this.f106383d = false;
        }
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f106383d = true;
        this.f106384e = j10;
        this.f106385f = 0;
        this.f106386g = 0;
    }

    @Override // vb.m
    public void seek() {
        this.f106383d = false;
        this.f106384e = -9223372036854775807L;
    }
}
