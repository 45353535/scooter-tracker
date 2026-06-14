package vb;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.m0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements oa.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oa.x f106100d = new oa.x() { // from class: vb.d
        @Override // oa.x
        public /* synthetic */ oa.x a(t.a aVar) {
            return oa.w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ oa.x b(int i10) {
            return oa.w.b(this, i10);
        }

        @Override // oa.x
        public final oa.r[] createExtractors() {
            return e.d();
        }

        @Override // oa.x
        public /* synthetic */ oa.x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return oa.w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ oa.r[] createExtractors(Uri uri, Map map) {
            return oa.w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f106101a = new f("audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106102b = new q9.d0(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106103c;

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new e()};
    }

    @Override // oa.r
    public int a(oa.s sVar, oa.l0 l0Var) {
        int i10 = sVar.read(this.f106102b.e(), 0, 16384);
        if (i10 == -1) {
            return -1;
        }
        this.f106102b.W(0);
        this.f106102b.V(i10);
        if (!this.f106103c) {
            this.f106101a.packetStarted(0L, 4);
            this.f106103c = true;
        }
        this.f106101a.a(this.f106102b);
        return 0;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f106101a.b(tVar, new l0.d(0, 1));
        tVar.endTracks();
        tVar.e(new m0.b(-9223372036854775807L));
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        q9.d0 d0Var = new q9.d0(10);
        int i10 = 0;
        while (true) {
            sVar.peekFully(d0Var.e(), 0, 10);
            d0Var.W(0);
            if (d0Var.K() != 4801587) {
                break;
            }
            d0Var.X(3);
            int iG = d0Var.G();
            i10 += iG + 10;
            sVar.advancePeekPosition(iG);
        }
        sVar.resetPeekPosition();
        sVar.advancePeekPosition(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            sVar.peekFully(d0Var.e(), 0, 7);
            d0Var.W(0);
            int iP = d0Var.P();
            if (iP == 44096 || iP == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = oa.c.g(d0Var.e(), iP);
                if (iG2 == -1) {
                    return false;
                }
                sVar.advancePeekPosition(iG2 - 7);
            } else {
                sVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                sVar.advancePeekPosition(i12);
                i11 = 0;
            }
        }
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return oa.q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ oa.r getUnderlyingImplementation() {
        return oa.q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f106103c = false;
        this.f106101a.seek();
    }

    @Override // oa.r
    public void release() {
    }
}
