package vb;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.m0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 implements oa.r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final oa.x f106080l = new oa.x() { // from class: vb.b0
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
            return c0.d();
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
    private final q9.j0 f106081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f106082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.d0 f106083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f106084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f106087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f106088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private z f106089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private oa.t f106090j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106091k;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f106092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q9.j0 f106093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q9.c0 f106094c = new q9.c0(new byte[64]);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f106095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f106096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f106097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f106098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f106099h;

        public a(m mVar, q9.j0 j0Var) {
            this.f106092a = mVar;
            this.f106093b = j0Var;
        }

        private void b() {
            this.f106094c.r(8);
            this.f106095d = this.f106094c.g();
            this.f106096e = this.f106094c.g();
            this.f106094c.r(6);
            this.f106098g = this.f106094c.h(8);
        }

        private void c() {
            this.f106099h = 0L;
            if (this.f106095d) {
                this.f106094c.r(4);
                long jH = ((long) this.f106094c.h(3)) << 30;
                this.f106094c.r(1);
                long jH2 = jH | ((long) (this.f106094c.h(15) << 15));
                this.f106094c.r(1);
                long jH3 = jH2 | ((long) this.f106094c.h(15));
                this.f106094c.r(1);
                if (!this.f106097f && this.f106096e) {
                    this.f106094c.r(4);
                    long jH4 = ((long) this.f106094c.h(3)) << 30;
                    this.f106094c.r(1);
                    long jH5 = jH4 | ((long) (this.f106094c.h(15) << 15));
                    this.f106094c.r(1);
                    long jH6 = jH5 | ((long) this.f106094c.h(15));
                    this.f106094c.r(1);
                    this.f106093b.b(jH6);
                    this.f106097f = true;
                }
                this.f106099h = this.f106093b.b(jH3);
            }
        }

        public void a(q9.d0 d0Var) {
            d0Var.l(this.f106094c.f98765a, 0, 3);
            this.f106094c.p(0);
            b();
            d0Var.l(this.f106094c.f98765a, 0, this.f106098g);
            this.f106094c.p(0);
            c();
            this.f106092a.packetStarted(this.f106099h, 4);
            this.f106092a.a(d0Var);
            this.f106092a.packetFinished(false);
        }

        public void d() {
            this.f106097f = false;
            this.f106092a.seek();
        }
    }

    public c0() {
        this(new q9.j0(0L));
    }

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new c0()};
    }

    private void e(long j10) {
        if (this.f106091k) {
            return;
        }
        this.f106091k = true;
        if (this.f106084d.c() == -9223372036854775807L) {
            this.f106090j.e(new m0.b(this.f106084d.c()));
            return;
        }
        z zVar = new z(this.f106084d.d(), this.f106084d.c(), j10);
        this.f106089i = zVar;
        this.f106090j.e(zVar.b());
    }

    @Override // oa.r
    public int a(oa.s sVar, oa.l0 l0Var) {
        m nVar;
        q9.a.i(this.f106090j);
        long length = sVar.getLength();
        if (length != -1 && !this.f106084d.e()) {
            return this.f106084d.g(sVar, l0Var);
        }
        e(length);
        z zVar = this.f106089i;
        if (zVar != null && zVar.d()) {
            return this.f106089i.c(sVar, l0Var);
        }
        sVar.resetPeekPosition();
        long peekPosition = length != -1 ? length - sVar.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !sVar.peekFully(this.f106083c.e(), 0, 4, true)) {
            return -1;
        }
        this.f106083c.W(0);
        int iQ = this.f106083c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            sVar.peekFully(this.f106083c.e(), 0, 10);
            this.f106083c.W(9);
            sVar.skipFully((this.f106083c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            sVar.peekFully(this.f106083c.e(), 0, 2);
            this.f106083c.W(0);
            sVar.skipFully(this.f106083c.P() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            sVar.skipFully(1);
            return 0;
        }
        int i10 = iQ & 255;
        a aVar = (a) this.f106082b.get(i10);
        if (!this.f106085e) {
            if (aVar == null) {
                if (i10 == 189) {
                    nVar = new c("video/mp2p");
                    this.f106086f = true;
                    this.f106088h = sVar.getPosition();
                } else if ((iQ & 224) == 192) {
                    nVar = new t("video/mp2p");
                    this.f106086f = true;
                    this.f106088h = sVar.getPosition();
                } else if ((iQ & 240) == 224) {
                    nVar = new n("video/mp2p");
                    this.f106087g = true;
                    this.f106088h = sVar.getPosition();
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    nVar.b(this.f106090j, new l0.d(i10, 256));
                    aVar = new a(nVar, this.f106081a);
                    this.f106082b.put(i10, aVar);
                }
            }
            if (sVar.getPosition() > ((this.f106086f && this.f106087g) ? this.f106088h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f106085e = true;
                this.f106090j.endTracks();
            }
        }
        sVar.peekFully(this.f106083c.e(), 0, 2);
        this.f106083c.W(0);
        int iP = this.f106083c.P() + 6;
        if (aVar == null) {
            sVar.skipFully(iP);
        } else {
            this.f106083c.S(iP);
            sVar.readFully(this.f106083c.e(), 0, iP);
            this.f106083c.W(6);
            aVar.a(this.f106083c);
            q9.d0 d0Var = this.f106083c;
            d0Var.V(d0Var.b());
        }
        return 0;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        this.f106090j = tVar;
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        byte[] bArr = new byte[14];
        sVar.peekFully(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        sVar.advancePeekPosition(bArr[13] & 7);
        sVar.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
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
        boolean z10 = this.f106081a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f106081a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f106081a.i(j11);
        }
        z zVar = this.f106089i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f106082b.size(); i10++) {
            ((a) this.f106082b.valueAt(i10)).d();
        }
    }

    public c0(q9.j0 j0Var) {
        this.f106081a = j0Var;
        this.f106083c = new q9.d0(4096);
        this.f106082b = new SparseArray();
        this.f106084d = new a0();
    }

    @Override // oa.r
    public void release() {
    }
}
