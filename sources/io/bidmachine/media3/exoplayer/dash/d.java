package io.bidmachine.media3.exoplayer.dash;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.ImmutableMap;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import ha.d;
import ha.f;
import ha.l;
import ha.n;
import ha.o;
import io.bidmachine.media3.exoplayer.dash.a;
import io.bidmachine.media3.exoplayer.dash.f;
import io.bidmachine.media3.exoplayer.l1;
import ja.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ka.g;
import ka.m;
import ka.q;
import lb.t;
import n9.w;
import oa.h;
import q9.l0;
import q9.o0;
import s9.g;
import s9.k;
import s9.y;
import u9.m0;
import v9.c2;
import y9.i;
import y9.j;

/* JADX INFO: loaded from: classes12.dex */
public class d implements io.bidmachine.media3.exoplayer.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f80747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x9.b f80748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f80749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f80750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f80751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f80752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f80753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f.c f80754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final b[] f80755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private r f80756j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private y9.c f80757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f80758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f80759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f80760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f80761o = -9223372036854775807L;

    public static final class a implements a.InterfaceC0982a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f80762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f80763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.a f80764c;

        public a(g.a aVar) {
            this(aVar, 1);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0982a
        public io.bidmachine.media3.common.a c(io.bidmachine.media3.common.a aVar) {
            return this.f80764c.c(aVar);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0982a
        public io.bidmachine.media3.exoplayer.dash.a d(q qVar, y9.c cVar, x9.b bVar, int i10, int[] iArr, r rVar, int i11, long j10, boolean z10, List list, f.c cVar2, y yVar, c2 c2Var, ka.f fVar) {
            g gVarCreateDataSource = this.f80762a.createDataSource();
            if (yVar != null) {
                gVarCreateDataSource.a(yVar);
            }
            return new d(this.f80764c, qVar, cVar, bVar, i10, iArr, rVar, i11, gVarCreateDataSource, j10, this.f80763b, z10, list, cVar2, c2Var, fVar);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0982a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f80764c.experimentalParseSubtitlesDuringExtraction(z10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0982a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f80764c.b(i10);
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.dash.a.InterfaceC0982a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(t.a aVar) {
            this.f80764c.a(aVar);
            return this;
        }

        public a(g.a aVar, int i10) {
            this(new d.b(), aVar, i10);
        }

        public a(f.a aVar, g.a aVar2, int i10) {
            this.f80764c = aVar;
            this.f80762a = aVar2;
            this.f80763b = i10;
        }
    }

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ha.f f80765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f80766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final y9.b f80767c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final x9.f f80768d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f80769e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f80770f;

        b(long j10, j jVar, y9.b bVar, ha.f fVar, long j11, x9.f fVar2) {
            this.f80769e = j10;
            this.f80766b = jVar;
            this.f80767c = bVar;
            this.f80770f = j11;
            this.f80765a = fVar;
            this.f80768d = fVar2;
        }

        b b(long j10, j jVar) throws ga.b {
            long segmentNum;
            long segmentNum2;
            x9.f fVarB = this.f80766b.b();
            x9.f fVarB2 = jVar.b();
            if (fVarB == null) {
                return new b(j10, jVar, this.f80767c, this.f80765a, this.f80770f, fVarB);
            }
            if (!fVarB.isExplicit()) {
                return new b(j10, jVar, this.f80767c, this.f80765a, this.f80770f, fVarB2);
            }
            long segmentCount = fVarB.getSegmentCount(j10);
            if (segmentCount == 0) {
                return new b(j10, jVar, this.f80767c, this.f80765a, this.f80770f, fVarB2);
            }
            q9.a.i(fVarB2);
            long firstSegmentNum = fVarB.getFirstSegmentNum();
            long timeUs = fVarB.getTimeUs(firstSegmentNum);
            long j11 = segmentCount + firstSegmentNum;
            long j12 = j11 - 1;
            long timeUs2 = fVarB.getTimeUs(j12) + fVarB.getDurationUs(j12, j10);
            long firstSegmentNum2 = fVarB2.getFirstSegmentNum();
            long timeUs3 = fVarB2.getTimeUs(firstSegmentNum2);
            long j13 = this.f80770f;
            if (timeUs2 == timeUs3) {
                segmentNum = j11 - firstSegmentNum2;
            } else {
                if (timeUs2 < timeUs3) {
                    throw new ga.b();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j13 - (fVarB2.getSegmentNum(timeUs, j10) - firstSegmentNum);
                    return new b(j10, jVar, this.f80767c, this.f80765a, segmentNum2, fVarB2);
                }
                segmentNum = fVarB.getSegmentNum(timeUs3, j10) - firstSegmentNum2;
            }
            segmentNum2 = j13 + segmentNum;
            return new b(j10, jVar, this.f80767c, this.f80765a, segmentNum2, fVarB2);
        }

        b c(x9.f fVar) {
            return new b(this.f80769e, this.f80766b, this.f80767c, this.f80765a, this.f80770f, fVar);
        }

        b d(y9.b bVar) {
            return new b(this.f80769e, this.f80766b, bVar, this.f80765a, this.f80770f, this.f80768d);
        }

        public long e(long j10) {
            return ((x9.f) q9.a.i(this.f80768d)).getFirstAvailableSegmentNum(this.f80769e, j10) + this.f80770f;
        }

        public long f() {
            return ((x9.f) q9.a.i(this.f80768d)).getFirstSegmentNum() + this.f80770f;
        }

        public long g(long j10) {
            return (e(j10) + ((x9.f) q9.a.i(this.f80768d)).getAvailableSegmentCount(this.f80769e, j10)) - 1;
        }

        public long h() {
            return ((x9.f) q9.a.i(this.f80768d)).getSegmentCount(this.f80769e);
        }

        public long i(long j10) {
            return k(j10) + ((x9.f) q9.a.i(this.f80768d)).getDurationUs(j10 - this.f80770f, this.f80769e);
        }

        public long j(long j10) {
            return ((x9.f) q9.a.i(this.f80768d)).getSegmentNum(j10, this.f80769e) + this.f80770f;
        }

        public long k(long j10) {
            return ((x9.f) q9.a.i(this.f80768d)).getTimeUs(j10 - this.f80770f);
        }

        public i l(long j10) {
            return ((x9.f) q9.a.i(this.f80768d)).getSegmentUrl(j10 - this.f80770f);
        }

        public boolean m(long j10, long j11) {
            return ((x9.f) q9.a.i(this.f80768d)).isExplicit() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    protected static final class c extends ha.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f80771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f80772f;

        public c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f80771e = bVar;
            this.f80772f = j12;
        }

        @Override // ha.n
        public long getChunkEndTimeUs() {
            a();
            return this.f80771e.i(b());
        }

        @Override // ha.n
        public long getChunkStartTimeUs() {
            a();
            return this.f80771e.k(b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(f.a aVar, q qVar, y9.c cVar, x9.b bVar, int i10, int[] iArr, r rVar, int i11, g gVar, long j10, int i12, boolean z10, List list, f.c cVar2, c2 c2Var, ka.f fVar) {
        this.f80747a = qVar;
        this.f80757k = cVar;
        this.f80748b = bVar;
        this.f80749c = iArr;
        this.f80756j = rVar;
        int i13 = i11;
        this.f80750d = i13;
        this.f80751e = gVar;
        this.f80758l = i10;
        this.f80752f = j10;
        this.f80753g = i12;
        f.c cVar3 = cVar2;
        this.f80754h = cVar3;
        long jF = cVar.f(i10);
        ArrayList arrayListL = l();
        this.f80755i = new b[rVar.length()];
        int i14 = 0;
        while (i14 < this.f80755i.length) {
            j jVar = (j) arrayListL.get(rVar.getIndexInTrackGroup(i14));
            y9.b bVarJ = bVar.j(jVar.f108457c);
            b[] bVarArr = this.f80755i;
            y9.b bVar2 = bVarJ == null ? (y9.b) jVar.f108457c.get(0) : bVarJ;
            ha.f fVarD = aVar.d(i13, jVar.f108456b, z10, list, cVar3, c2Var);
            long j11 = jF;
            int i15 = i14;
            bVarArr[i15] = new b(j11, jVar, bVar2, fVarD, 0L, jVar.b());
            i14 = i15 + 1;
            i13 = i11;
            jF = j11;
            cVar3 = cVar2;
        }
    }

    private m.a h(r rVar, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.isTrackExcluded(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = x9.b.f(list);
        return new m.a(iF, iF - this.f80748b.g(list), length, i10);
    }

    private long i(long j10, long j11) {
        if (!this.f80757k.f108408d || this.f80755i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(k(j10), this.f80755i[0].i(this.f80755i[0].g(j10))) - j11);
    }

    private Pair j(long j10, i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j11);
        String strA = l0.a(iVar.b(bVar.f80767c.f108401a), iVarL.b(bVar.f80767c.f108401a));
        String str = iVarL.f108451a + TokenBuilder.TOKEN_DELIMITER;
        if (iVarL.f108452b != -1) {
            str = str + (iVarL.f108451a + iVarL.f108452b);
        }
        return new Pair(strA, str);
    }

    private long k(long j10) {
        y9.c cVar = this.f80757k;
        long j11 = cVar.f108405a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - o0.P0(j11 + cVar.c(this.f80758l).f108442b);
    }

    private ArrayList l() {
        List list = this.f80757k.c(this.f80758l).f108443c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f80749c) {
            arrayList.addAll(((y9.a) list.get(i10)).f108397c);
        }
        return arrayList;
    }

    private long m(b bVar, ha.m mVar, long j10, long j11, long j12) {
        return mVar != null ? mVar.e() : o0.q(bVar.j(j10), j11, j12);
    }

    private b p(int i10) {
        b bVar = this.f80755i[i10];
        y9.b bVarJ = this.f80748b.j(bVar.f80766b.f108457c);
        if (bVarJ == null || bVarJ.equals(bVar.f80767c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f80755i[i10] = bVarD;
        return bVarD;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.a
    public void a(r rVar) {
        this.f80756j = rVar;
    }

    @Override // ha.i
    public long b(long j10, m0 m0Var) {
        long j11 = j10;
        b[] bVarArr = this.f80755i;
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (bVar.f80768d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j12 = bVar.j(j11);
                    long jK = bVar.k(j12);
                    return m0Var.a(j11, jK, (jK >= j11 || (jH != -1 && j12 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j12 + 1));
                }
            }
            i10++;
            j11 = j10;
        }
        return j10;
    }

    @Override // ha.i
    public boolean c(ha.e eVar, boolean z10, m.c cVar, m mVar) {
        m.b bVarA;
        if (!z10) {
            return false;
        }
        f.c cVar2 = this.f80754h;
        if (cVar2 != null && cVar2.k(eVar)) {
            return true;
        }
        if (!this.f80757k.f108408d && (eVar instanceof ha.m)) {
            IOException iOException = cVar.f93111c;
            if ((iOException instanceof s9.t) && ((s9.t) iOException).f99887e == 404) {
                b bVar = this.f80755i[this.f80756j.a(eVar.f73007d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((ha.m) eVar).e() > (bVar.f() + jH) - 1) {
                        this.f80760n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f80755i[this.f80756j.a(eVar.f73007d)];
        y9.b bVarJ = this.f80748b.j(bVar2.f80766b.f108457c);
        if (bVarJ != null && !bVar2.f80767c.equals(bVarJ)) {
            return true;
        }
        m.a aVarH = h(this.f80756j, bVar2.f80766b.f108457c);
        if ((aVarH.a(2) || aVarH.a(1)) && (bVarA = mVar.a(aVarH, cVar)) != null && aVarH.a(bVarA.f93107a)) {
            int i10 = bVarA.f93107a;
            if (i10 == 2) {
                r rVar = this.f80756j;
                return rVar.excludeTrack(rVar.a(eVar.f73007d), bVarA.f93108b);
            }
            if (i10 == 1) {
                this.f80748b.e(bVar2.f80767c, bVarA.f93108b);
                return true;
            }
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.dash.a
    public void d(y9.c cVar, int i10) {
        try {
            this.f80757k = cVar;
            this.f80758l = i10;
            long jF = cVar.f(i10);
            ArrayList arrayListL = l();
            for (int i11 = 0; i11 < this.f80755i.length; i11++) {
                j jVar = (j) arrayListL.get(this.f80756j.getIndexInTrackGroup(i11));
                b[] bVarArr = this.f80755i;
                bVarArr[i11] = bVarArr[i11].b(jF, jVar);
            }
        } catch (ga.b e10) {
            this.f80759m = e10;
        }
    }

    @Override // ha.i
    public void e(ha.e eVar) {
        h chunkIndex;
        if (eVar instanceof l) {
            int iA = this.f80756j.a(((l) eVar).f73007d);
            b bVar = this.f80755i[iA];
            if (bVar.f80768d == null && (chunkIndex = ((ha.f) q9.a.i(bVar.f80765a)).getChunkIndex()) != null) {
                this.f80755i[iA] = bVar.c(new x9.h(chunkIndex, bVar.f80766b.f108458d));
            }
        }
        f.c cVar = this.f80754h;
        if (cVar != null) {
            cVar.j(eVar);
        }
    }

    @Override // ha.i
    public boolean f(long j10, ha.e eVar, List list) {
        if (this.f80759m != null) {
            return false;
        }
        return this.f80756j.c(j10, eVar, list);
    }

    @Override // ha.i
    public void g(l1 l1Var, long j10, List list, ha.g gVar) {
        boolean z10;
        n[] nVarArr;
        long j11;
        int i10;
        int i11;
        d dVar;
        ha.m mVar;
        d dVar2 = this;
        if (dVar2.f80759m != null) {
            return;
        }
        long j12 = l1Var.f81195a;
        long j13 = j10 - j12;
        long jP0 = o0.P0(dVar2.f80757k.f108405a) + o0.P0(dVar2.f80757k.c(dVar2.f80758l).f108442b) + j10;
        f.c cVar = dVar2.f80754h;
        if (cVar == null || !cVar.i(jP0)) {
            long jP02 = o0.P0(o0.h0(dVar2.f80752f));
            long jK = dVar2.k(jP02);
            boolean z11 = true;
            ha.m mVar2 = list.isEmpty() ? null : (ha.m) list.get(list.size() - 1);
            int length = dVar2.f80756j.length();
            n[] nVarArr2 = new n[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = dVar2.f80755i[i12];
                if (bVar.f80768d == null) {
                    nVarArr2[i12] = n.f73059a;
                    dVar = dVar2;
                    mVar = mVar2;
                    z10 = z11;
                    nVarArr = nVarArr2;
                    j11 = j13;
                    i11 = length;
                    i10 = i12;
                } else {
                    n[] nVarArr3 = nVarArr2;
                    long jE = bVar.e(jP02);
                    z10 = z11;
                    nVarArr = nVarArr3;
                    ha.m mVar3 = mVar2;
                    long jG = bVar.g(jP02);
                    j11 = j13;
                    i10 = i12;
                    i11 = length;
                    long jM = dVar2.m(bVar, mVar3, j10, jE, jG);
                    dVar = dVar2;
                    mVar = mVar3;
                    if (jM < jE) {
                        nVarArr[i10] = n.f73059a;
                    } else {
                        nVarArr[i10] = new c(dVar.p(i10), jM, jG, jK);
                    }
                }
                i12 = i10 + 1;
                dVar2 = dVar;
                length = i11;
                mVar2 = mVar;
                nVarArr2 = nVarArr;
                z11 = z10;
                j13 = j11;
            }
            d dVar3 = dVar2;
            ha.m mVar4 = mVar2;
            boolean z12 = z11;
            dVar3.f80756j.b(j12, j13, dVar3.i(jP02, j12), list, nVarArr2);
            int selectedIndex = dVar3.f80756j.getSelectedIndex();
            dVar3.f80761o = SystemClock.elapsedRealtime();
            b bVarP = dVar3.p(selectedIndex);
            ha.f fVar = bVarP.f80765a;
            if (fVar != null) {
                j jVar = bVarP.f80766b;
                i iVarD = fVar.getSampleFormats() == null ? jVar.d() : null;
                i iVarC = bVarP.f80768d == null ? jVar.c() : null;
                if (iVarD != null || iVarC != null) {
                    gVar.f73013a = dVar3.n(bVarP, dVar3.f80751e, dVar3.f80756j.getSelectedFormat(), dVar3.f80756j.getSelectionReason(), dVar3.f80756j.getSelectionData(), iVarD, iVarC, null);
                    return;
                }
            }
            long j14 = bVarP.f80769e;
            y9.c cVar2 = dVar3.f80757k;
            boolean z13 = (cVar2.f108408d && dVar3.f80758l == cVar2.d() + (-1)) ? z12 : false;
            boolean z14 = (z13 && j14 == -9223372036854775807L) ? false : z12;
            if (bVarP.h() == 0) {
                gVar.f73014b = z14;
                return;
            }
            long jE2 = bVarP.e(jP02);
            long jG2 = bVarP.g(jP02);
            if (z13) {
                long jI = bVarP.i(jG2);
                z14 &= jI + (jI - bVarP.k(jG2)) >= j14 ? z12 : false;
            }
            boolean z15 = z14;
            long jM2 = dVar3.m(bVarP, mVar4, j10, jE2, jG2);
            if (jM2 < jE2) {
                dVar3.f80759m = new ga.b();
                return;
            }
            if (jM2 > jG2 || (dVar3.f80760n && jM2 >= jG2)) {
                gVar.f73014b = z15;
                return;
            }
            if (z15 && bVarP.k(jM2) >= j14) {
                gVar.f73014b = z12;
                return;
            }
            int iMin = (int) Math.min(dVar3.f80753g, (jG2 - jM2) + 1);
            if (j14 != -9223372036854775807L) {
                while (iMin > 1 && bVarP.k((((long) iMin) + jM2) - 1) >= j14) {
                    iMin--;
                }
            }
            gVar.f73013a = dVar3.o(bVarP, dVar3.f80751e, dVar3.f80750d, dVar3.f80756j.getSelectedFormat(), dVar3.f80756j.getSelectionReason(), dVar3.f80756j.getSelectionData(), jM2, iMin, list.isEmpty() ? j10 : -9223372036854775807L, jK, null);
        }
    }

    @Override // ha.i
    public int getPreferredQueueSize(long j10, List list) {
        return (this.f80759m != null || this.f80756j.length() < 2) ? list.size() : this.f80756j.evaluateQueueSize(j10, list);
    }

    @Override // ha.i
    public void maybeThrowError() throws IOException {
        IOException iOException = this.f80759m;
        if (iOException != null) {
            throw iOException;
        }
        this.f80747a.maybeThrowError();
    }

    protected ha.e n(b bVar, g gVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, i iVar, i iVar2, g.a aVar2) {
        i iVar3 = iVar;
        j jVar = bVar.f80766b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f80767c.f108401a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = (i) q9.a.e(iVar2);
        }
        return new l(gVar, x9.g.a(jVar, bVar.f80767c.f108401a, iVar3, 0, ImmutableMap.of()), aVar, i10, obj, bVar.f80765a);
    }

    protected ha.e o(b bVar, s9.g gVar, int i10, io.bidmachine.media3.common.a aVar, int i11, Object obj, long j10, int i12, long j11, long j12, g.a aVar2) {
        j jVar = bVar.f80766b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f80765a == null) {
            int i13 = 8;
            long jI = bVar.i(j10);
            if (bVar.m(j10, j12)) {
                i13 = 0;
            }
            return new o(gVar, x9.g.a(jVar, bVar.f80767c.f108401a, iVarL, i13, ImmutableMap.of()), aVar, i11, obj, jK, jI, j10, i10, aVar);
        }
        int i14 = 8;
        int i15 = 1;
        int i16 = 1;
        while (i15 < i12) {
            i iVarA = iVarL.a(bVar.l(j10 + ((long) i15)), bVar.f80767c.f108401a);
            if (iVarA == null) {
                break;
            }
            i16++;
            i15++;
            iVarL = iVarA;
        }
        long j13 = (j10 + ((long) i16)) - 1;
        int i17 = i16;
        long jI2 = bVar.i(j13);
        long j14 = bVar.f80769e;
        if (j14 == -9223372036854775807L || j14 > jI2) {
            j14 = -9223372036854775807L;
        }
        if (bVar.m(j13, j12)) {
            i14 = 0;
        }
        k kVarA = x9.g.a(jVar, bVar.f80767c.f108401a, iVarL, i14, ImmutableMap.of());
        long j15 = -jVar.f108458d;
        if (w.q(aVar.f80561o)) {
            j15 += jK;
        }
        return new ha.j(gVar, kVarA, aVar, i11, obj, jK, jI2, j11, j14, j10, i17, j15, bVar.f80765a);
    }

    @Override // ha.i
    public void release() {
        for (b bVar : this.f80755i) {
            ha.f fVar = bVar.f80765a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }
}
