package vb;

import android.net.Uri;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.m0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements oa.r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final oa.x f106130m = new oa.x() { // from class: vb.g
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
            return h.d();
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
    private final int f106131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f106132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f106133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.d0 f106134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.c0 f106135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private oa.t f106136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f106137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f106142l;

    public h() {
        this(0);
    }

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new h()};
    }

    private void e(oa.s sVar) throws n9.x {
        int iH;
        if (this.f106140j) {
            return;
        }
        this.f106139i = -1;
        sVar.resetPeekPosition();
        long j10 = 0;
        if (sVar.getPosition() == 0) {
            i(sVar);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!sVar.peekFully(this.f106134d.e(), 0, 2, true)) {
                    break;
                }
                this.f106134d.W(0);
                if (!i.j(this.f106134d.P())) {
                    break;
                }
                if (!sVar.peekFully(this.f106134d.e(), 0, 4, true)) {
                    break;
                }
                this.f106135e.p(14);
                iH = this.f106135e.h(13);
                if (iH <= 6) {
                    this.f106140j = true;
                    throw n9.x.a("Malformed ADTS stream", null);
                }
                j10 += (long) iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (sVar.advancePeekPosition(iH - 6, true));
        i10 = i11;
        sVar.resetPeekPosition();
        if (i10 > 0) {
            this.f106139i = (int) (j10 / ((long) i10));
        } else {
            this.f106139i = -1;
        }
        this.f106140j = true;
    }

    private static int f(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private oa.m0 g(long j10, boolean z10) {
        return new oa.i(j10, this.f106138h, f(this.f106139i, this.f106132b.h()), this.f106139i, z10);
    }

    private void h(long j10, boolean z10) {
        if (this.f106142l) {
            return;
        }
        boolean z11 = (this.f106131a & 1) != 0 && this.f106139i > 0;
        if (z11 && this.f106132b.h() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f106132b.h() == -9223372036854775807L) {
            this.f106136f.e(new m0.b(-9223372036854775807L));
        } else {
            this.f106136f.e(g(j10, (this.f106131a & 2) != 0));
        }
        this.f106142l = true;
    }

    private int i(oa.s sVar) {
        int i10 = 0;
        while (true) {
            sVar.peekFully(this.f106134d.e(), 0, 10);
            this.f106134d.W(0);
            if (this.f106134d.K() != 4801587) {
                break;
            }
            this.f106134d.X(3);
            int iG = this.f106134d.G();
            i10 += iG + 10;
            sVar.advancePeekPosition(iG);
        }
        sVar.resetPeekPosition();
        sVar.advancePeekPosition(i10);
        if (this.f106138h == -1) {
            this.f106138h = i10;
        }
        return i10;
    }

    @Override // oa.r
    public int a(oa.s sVar, oa.l0 l0Var) throws n9.x {
        q9.a.i(this.f106136f);
        long length = sVar.getLength();
        int i10 = this.f106131a;
        if ((i10 & 2) != 0 || ((i10 & 1) != 0 && length != -1)) {
            e(sVar);
        }
        int i11 = sVar.read(this.f106133c.e(), 0, 2048);
        boolean z10 = i11 == -1;
        h(length, z10);
        if (z10) {
            return -1;
        }
        this.f106133c.W(0);
        this.f106133c.V(i11);
        if (!this.f106141k) {
            this.f106132b.packetStarted(this.f106137g, 4);
            this.f106141k = true;
        }
        this.f106132b.a(this.f106133c);
        return 0;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f106136f = tVar;
        this.f106132b.b(tVar, new l0.d(0, 1));
        tVar.endTracks();
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        int i10 = i(sVar);
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            sVar.peekFully(this.f106134d.e(), 0, 2);
            this.f106134d.W(0);
            if (i.j(this.f106134d.P())) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                sVar.peekFully(this.f106134d.e(), 0, 4);
                this.f106135e.p(14);
                int iH = this.f106135e.h(13);
                if (iH <= 6) {
                    i11++;
                    sVar.resetPeekPosition();
                    sVar.advancePeekPosition(i11);
                } else {
                    sVar.advancePeekPosition(iH - 6);
                    i13 += iH;
                }
            } else {
                i11++;
                sVar.resetPeekPosition();
                sVar.advancePeekPosition(i11);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
        return false;
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
        this.f106141k = false;
        this.f106132b.seek();
        this.f106137g = j11;
    }

    public h(int i10) {
        this.f106131a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f106132b = new i(true, "audio/mp4a-latm");
        this.f106133c = new q9.d0(2048);
        this.f106139i = -1;
        this.f106138h = -1L;
        q9.d0 d0Var = new q9.d0(10);
        this.f106134d = d0Var;
        this.f106135e = new q9.c0(d0Var.e());
    }

    @Override // oa.r
    public void release() {
    }
}
