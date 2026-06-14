package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.q;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.io.EOFException;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements i, q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f21772n = z.a("FLV");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f21777e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a f21783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f21784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f21785m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f21773a = new n(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f21774b = new n(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f21775c = new n(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f21776d = new n();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21778f = 1;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return 0L;
    }

    public final n b(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        if (this.f21781i > this.f21776d.a()) {
            n nVar = this.f21776d;
            nVar.f23134a = new byte[Math.max(nVar.a() * 2, this.f21781i)];
            nVar.f23136c = 0;
            nVar.f23135b = 0;
        } else {
            this.f21776d.e(0);
        }
        this.f21776d.d(this.f21781i);
        bVar.b(this.f21776d.f23134a, 0, this.f21781i, false);
        return this.f21776d;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f21785m.f21786b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        bVar.a(this.f21773a.f23134a, 0, 3, false);
        this.f21773a.e(0);
        if (this.f21773a.l() != f21772n) {
            return false;
        }
        bVar.a(this.f21773a.f23134a, 0, 2, false);
        this.f21773a.e(0);
        if ((this.f21773a.o() & 250) != 0) {
            return false;
        }
        bVar.a(this.f21773a.f23134a, 0, 4, false);
        this.f21773a.e(0);
        int iB = this.f21773a.b();
        bVar.f21743e = 0;
        bVar.a(iB, false);
        bVar.a(this.f21773a.f23134a, 0, 4, false);
        this.f21773a.e(0);
        return this.f21773a.b() == 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.f21777e = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.f21778f = 1;
        this.f21779g = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, o oVar) throws InterruptedException, r, EOFException {
        c cVar;
        f fVar;
        a aVar;
        while (true) {
            int i10 = this.f21778f;
            boolean z10 = true;
            if (i10 != 1) {
                if (i10 == 2) {
                    bVar.a(this.f21779g);
                    this.f21779g = 0;
                    this.f21778f = 3;
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        int i11 = this.f21780h;
                        if (i11 == 8 && (aVar = this.f21783k) != null) {
                            n nVarB = b(bVar);
                            long j10 = this.f21782j;
                            aVar.a(nVarB);
                            aVar.a(nVarB, j10);
                        } else if (i11 == 9 && (fVar = this.f21784l) != null) {
                            n nVarB2 = b(bVar);
                            long j11 = this.f21782j;
                            if (fVar.a(nVarB2)) {
                                fVar.a(nVarB2, j11);
                            }
                        } else if (i11 == 18 && (cVar = this.f21785m) != null) {
                            cVar.a(b(bVar), this.f21782j);
                        } else {
                            bVar.a(this.f21781i);
                            z10 = false;
                        }
                        this.f21779g = 4;
                        this.f21778f = 2;
                        if (z10) {
                            return 0;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (!bVar.b(this.f21775c.f23134a, 0, 11, true)) {
                        return -1;
                    }
                    this.f21775c.e(0);
                    this.f21780h = this.f21775c.j();
                    this.f21781i = this.f21775c.l();
                    this.f21782j = this.f21775c.l();
                    this.f21782j = (((long) (this.f21775c.j() << 24)) | this.f21782j) * 1000;
                    n nVar = this.f21775c;
                    nVar.e(nVar.f23135b + 3);
                    this.f21778f = 4;
                }
            } else {
                if (!bVar.b(this.f21774b.f23134a, 0, 9, true)) {
                    return -1;
                }
                this.f21774b.e(0);
                n nVar2 = this.f21774b;
                nVar2.e(nVar2.f23135b + 4);
                int iJ = this.f21774b.j();
                boolean z11 = (iJ & 4) != 0;
                boolean z12 = (iJ & 1) != 0;
                if (z11 && this.f21783k == null) {
                    this.f21783k = new a(this.f21777e.a(8, 1));
                }
                if (z12 && this.f21784l == null) {
                    this.f21784l = new f(this.f21777e.a(9, 2));
                }
                if (this.f21785m == null) {
                    this.f21785m = new c();
                }
                this.f21777e.b();
                this.f21777e.a(this);
                this.f21779g = this.f21774b.b() - 5;
                this.f21778f = 2;
            }
        }
    }
}
