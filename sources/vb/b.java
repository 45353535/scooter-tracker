package vb;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.m0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements oa.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final oa.x f106062d = new oa.x() { // from class: vb.a
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
            return b.d();
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
    private final c f106063a = new c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106064b = new q9.d0(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f106065c;

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new b()};
    }

    @Override // oa.r
    public int a(oa.s sVar, oa.l0 l0Var) {
        int i10 = sVar.read(this.f106064b.e(), 0, 2786);
        if (i10 == -1) {
            return -1;
        }
        this.f106064b.W(0);
        this.f106064b.V(i10);
        if (!this.f106065c) {
            this.f106063a.packetStarted(0L, 4);
            this.f106065c = true;
        }
        this.f106063a.a(this.f106064b);
        return 0;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f106063a.b(tVar, new l0.d(0, 1));
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
            sVar.peekFully(d0Var.e(), 0, 6);
            d0Var.W(0);
            if (d0Var.P() != 2935) {
                sVar.resetPeekPosition();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                sVar.advancePeekPosition(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG2 = oa.b.g(d0Var.e());
                if (iG2 == -1) {
                    return false;
                }
                sVar.advancePeekPosition(iG2 - 6);
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
        this.f106065c = false;
        this.f106063a.seek();
    }

    @Override // oa.r
    public void release() {
    }
}
