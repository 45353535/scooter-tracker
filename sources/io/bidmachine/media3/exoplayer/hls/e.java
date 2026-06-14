package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import ba.f;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import ha.m;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.exoplayer.hls.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import ka.g;
import n9.v;
import oa.s;
import q9.d0;
import q9.j0;
import q9.l0;
import s9.k;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
final class e extends m {
    private static final AtomicInteger N = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private final c2 C;
    private final long D;
    private aa.f E;
    private l F;
    private int G;
    private boolean H;
    private volatile boolean I;
    private boolean J;
    private ImmutableList K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f80981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f80982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f80983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f80984n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f80985o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final s9.g f80986p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s9.k f80987q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final aa.f f80988r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f80989s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f80990t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final j0 f80991u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final aa.e f80992v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f80993w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final DrmInitData f80994x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final cb.h f80995y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final d0 f80996z;

    private e(aa.e eVar, s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, boolean z10, s9.g gVar2, s9.k kVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, j0 j0Var, long j13, DrmInitData drmInitData, aa.f fVar, cb.h hVar, d0 d0Var, boolean z15, c2 c2Var) {
        super(gVar, kVar, aVar, i10, obj, j10, j11, j12);
        this.A = z10;
        this.f80985o = i11;
        this.M = z12;
        this.f80982l = i12;
        this.f80987q = kVar2;
        this.f80986p = gVar2;
        this.H = kVar2 != null;
        this.B = z11;
        this.f80983m = uri;
        this.f80989s = z14;
        this.f80991u = j0Var;
        this.D = j13;
        this.f80990t = z13;
        this.f80992v = eVar;
        this.f80993w = list;
        this.f80994x = drmInitData;
        this.f80988r = fVar;
        this.f80995y = hVar;
        this.f80996z = d0Var;
        this.f80984n = z15;
        this.C = c2Var;
        this.K = ImmutableList.of();
        this.f80981k = N.getAndIncrement();
    }

    private static s9.g g(s9.g gVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return gVar;
        }
        q9.a.e(bArr2);
        return new a(gVar, bArr, bArr2);
    }

    public static e h(aa.e eVar, s9.g gVar, io.bidmachine.media3.common.a aVar, long j10, ba.f fVar, c.e eVar2, Uri uri, List list, int i10, Object obj, boolean z10, aa.j jVar, long j11, e eVar3, byte[] bArr, byte[] bArr2, boolean z11, c2 c2Var, g.a aVar2) {
        boolean z12;
        s9.g gVarG;
        s9.k kVarA;
        boolean z13;
        Uri uri2;
        cb.h hVar;
        d0 d0Var;
        aa.f fVar2;
        f.g gVar2 = eVar2.f80975a;
        s9.k kVarA2 = new k.b().i(l0.f(fVar.f6085a, gVar2.f6048b)).h(gVar2.f6056j).g(gVar2.f6057k).b(eVar2.f80978d ? 8 : 0).a();
        boolean z14 = bArr != null;
        s9.g gVarG2 = g(gVar, bArr, z14 ? j((String) q9.a.e(gVar2.f6055i)) : null);
        f.C0130f c0130f = gVar2.f6049c;
        if (c0130f != null) {
            boolean z15 = bArr2 != null;
            byte[] bArrJ = z15 ? j((String) q9.a.e(c0130f.f6055i)) : null;
            z12 = true;
            kVarA = new k.b().i(l0.f(fVar.f6085a, c0130f.f6048b)).h(c0130f.f6056j).g(c0130f.f6057k).a();
            gVarG = g(gVar, bArr2, bArrJ);
            z13 = z15;
        } else {
            z12 = true;
            gVarG = null;
            kVarA = null;
            z13 = false;
        }
        long j12 = j10 + gVar2.f6052f;
        long j13 = j12 + gVar2.f6050d;
        int i11 = fVar.f6009j + gVar2.f6051e;
        if (eVar3 != null) {
            s9.k kVar = eVar3.f80987q;
            boolean z16 = (kVarA == kVar || (kVarA != null && kVar != null && kVarA.f99819a.equals(kVar.f99819a) && kVarA.f99825g == eVar3.f80987q.f99825g)) ? z12 : false;
            uri2 = uri;
            boolean z17 = (uri2.equals(eVar3.f80983m) && eVar3.J) ? z12 : false;
            hVar = eVar3.f80995y;
            d0Var = eVar3.f80996z;
            fVar2 = (z16 && z17 && !eVar3.L && eVar3.f80982l == i11) ? eVar3.E : null;
        } else {
            uri2 = uri;
            hVar = new cb.h();
            d0Var = new d0(10);
            fVar2 = null;
        }
        return new e(eVar, gVarG2, kVarA2, aVar, z14, gVarG, kVarA, z13, uri2, list, i10, obj, j12, j13, eVar2.f80976b, eVar2.f80977c, !eVar2.f80978d, i11, gVar2.f6058l, z10, jVar.a(i11), j11, gVar2.f6053g, fVar2, hVar, d0Var, z11, c2Var);
    }

    private void i(s9.g gVar, s9.k kVar, boolean z10, boolean z11) {
        s9.k kVarE;
        long position;
        long j10;
        if (z10) {
            z = this.G != 0;
            kVarE = kVar;
        } else {
            kVarE = kVar.e(this.G);
        }
        try {
            oa.j jVarS = s(gVar, kVarE, z11);
            if (z) {
                jVarS.skipFully(this.G);
            }
            while (!this.I && this.E.a(jVarS)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f73007d.f80552f & 16384) == 0) {
                            throw e10;
                        }
                        this.E.onTruncatedSegmentParsed();
                        position = jVarS.getPosition();
                        j10 = kVar.f99825g;
                    }
                } catch (Throwable th2) {
                    this.G = (int) (jVarS.getPosition() - kVar.f99825g);
                    throw th2;
                }
            }
            position = jVarS.getPosition();
            j10 = kVar.f99825g;
            this.G = (int) (position - j10);
        } finally {
            s9.j.a(gVar);
        }
    }

    private static byte[] j(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean n(c.e eVar, ba.f fVar) {
        f.g gVar = eVar.f80975a;
        if (!(gVar instanceof f.d)) {
            return fVar.f6087c;
        }
        if (((f.d) gVar).f6041m) {
            return true;
        }
        return eVar.f80977c == 0 && fVar.f6087c;
    }

    private void p() {
        i(this.f73012i, this.f73005b, this.A, true);
    }

    private void q() {
        if (this.H) {
            q9.a.e(this.f80986p);
            q9.a.e(this.f80987q);
            i(this.f80986p, this.f80987q, this.B, false);
            this.G = 0;
            this.H = false;
        }
    }

    private long r(s sVar) throws Throwable {
        sVar.resetPeekPosition();
        try {
            this.f80996z.S(10);
            sVar.peekFully(this.f80996z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f80996z.K() != 4801587) {
            return -9223372036854775807L;
        }
        this.f80996z.X(3);
        int iG = this.f80996z.G();
        int i10 = iG + 10;
        if (i10 > this.f80996z.b()) {
            byte[] bArrE = this.f80996z.e();
            this.f80996z.S(i10);
            System.arraycopy(bArrE, 0, this.f80996z.e(), 0, 10);
        }
        sVar.peekFully(this.f80996z.e(), 10, iG);
        v vVarE = this.f80995y.e(this.f80996z.e(), iG);
        if (vVarE == null) {
            return -9223372036854775807L;
        }
        int iE = vVarE.e();
        for (int i11 = 0; i11 < iE; i11++) {
            v.a aVarD = vVarE.d(i11);
            if (aVarD instanceof cb.m) {
                cb.m mVar = (cb.m) aVarD;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f6676b)) {
                    System.arraycopy(mVar.f6677c, 0, this.f80996z.e(), 0, 8);
                    this.f80996z.W(0);
                    this.f80996z.V(8);
                    return this.f80996z.A() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private oa.j s(s9.g gVar, s9.k kVar, boolean z10) throws Throwable {
        aa.f fVarD;
        long jB = gVar.b(kVar);
        if (z10) {
            try {
                this.f80991u.j(this.f80989s, this.f73010g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        oa.j jVar = new oa.j(gVar, kVar.f99825g, jB);
        if (this.E == null) {
            long jR = r(jVar);
            jVar.resetPeekPosition();
            aa.f fVar = this.f80988r;
            if (fVar != null) {
                fVarD = fVar.recreate();
            } else {
                fVarD = this.f80992v.d(kVar.f99819a, this.f73007d, this.f80993w, this.f80991u, gVar.getResponseHeaders(), jVar, this.C);
                jVar = jVar;
            }
            this.E = fVarD;
            if (fVarD.isPackedAudioExtractor()) {
                this.F.e0(jR != -9223372036854775807L ? this.f80991u.b(jR) : this.f73010g);
            } else {
                this.F.e0(0L);
            }
            this.F.Q();
            this.E.b(this.F);
        }
        this.F.b0(this.f80994x);
        return jVar;
    }

    public static boolean u(e eVar, Uri uri, ba.f fVar, c.e eVar2, long j10) {
        if (eVar == null) {
            return false;
        }
        if (uri.equals(eVar.f80983m) && eVar.J) {
            return false;
        }
        return !n(eVar2, fVar) || j10 + eVar2.f80975a.f6052f < eVar.f73011h;
    }

    @Override // ka.o.e
    public void cancelLoad() {
        this.I = true;
    }

    @Override // ha.m
    public boolean f() {
        return this.J;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int k(int i10) {
        q9.a.g(!this.f80984n);
        if (i10 >= this.K.size()) {
            return 0;
        }
        return ((Integer) this.K.get(i10)).intValue();
    }

    public void l(l lVar, ImmutableList immutableList) {
        this.F = lVar;
        this.K = immutableList;
    }

    @Override // ka.o.e
    public void load() {
        aa.f fVar;
        q9.a.e(this.F);
        if (this.E == null && (fVar = this.f80988r) != null && fVar.isReusable()) {
            this.E = this.f80988r;
            this.H = false;
        }
        q();
        if (this.I) {
            return;
        }
        if (!this.f80990t) {
            p();
        }
        this.J = !this.I;
    }

    public void m() {
        this.L = true;
    }

    public boolean o() {
        return this.M;
    }

    public void t() {
        this.M = true;
    }
}
