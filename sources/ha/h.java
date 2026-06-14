package ha;

import ga.b0;
import ga.b1;
import ga.c1;
import ga.d1;
import ga.n0;
import ga.y;
import io.bidmachine.media3.exoplayer.l1;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ka.m;
import ka.o;
import q9.o0;
import u9.d0;
import u9.m0;
import z9.u;
import z9.w;

/* JADX INFO: loaded from: classes12.dex */
public class h implements c1, d1, o.b, o.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f73016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final io.bidmachine.media3.common.a[] f73017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f73018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f73019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d1.a f73020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n0.a f73021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ka.m f73022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ka.o f73023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f73024k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f73025l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f73026m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b1 f73027n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b1[] f73028o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c f73029p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private e f73030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private io.bidmachine.media3.common.a f73031r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f73032s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f73033t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f73034u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f73035v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ha.a f73036w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f73037x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f73038y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f73039z;

    public interface b {
        void e(h hVar);
    }

    public h(int i10, int[] iArr, io.bidmachine.media3.common.a[] aVarArr, i iVar, d1.a aVar, ka.b bVar, long j10, w wVar, u.a aVar2, ka.m mVar, n0.a aVar3, boolean z10, la.b bVar2) {
        this.f73015b = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f73016c = iArr;
        this.f73017d = aVarArr == null ? new io.bidmachine.media3.common.a[0] : aVarArr;
        this.f73019f = iVar;
        this.f73020g = aVar;
        this.f73021h = aVar3;
        this.f73022i = mVar;
        this.f73037x = z10;
        this.f73023j = bVar2 != null ? new ka.o(bVar2) : new ka.o("ChunkSampleStream");
        this.f73024k = new g();
        ArrayList arrayList = new ArrayList();
        this.f73025l = arrayList;
        this.f73026m = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f73028o = new b1[length];
        this.f73018e = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        b1[] b1VarArr = new b1[i12];
        b1 b1VarL = b1.l(bVar, wVar, aVar2);
        this.f73027n = b1VarL;
        iArr2[0] = i10;
        b1VarArr[0] = b1VarL;
        while (i11 < length) {
            b1 b1VarM = b1.m(bVar);
            this.f73028o[i11] = b1VarM;
            int i13 = i11 + 1;
            b1VarArr[i13] = b1VarM;
            iArr2[i13] = this.f73016c[i11];
            i11 = i13;
        }
        this.f73029p = new c(iArr2, b1VarArr);
        this.f73033t = j10;
        this.f73034u = j10;
    }

    private void A(int i10) {
        ha.a aVar = (ha.a) this.f73025l.get(i10);
        io.bidmachine.media3.common.a aVar2 = aVar.f73007d;
        if (!aVar2.equals(this.f73031r)) {
            this.f73021h.j(this.f73015b, aVar2, aVar.f73008e, aVar.f73009f, aVar.f73010g);
        }
        this.f73031r = aVar2;
    }

    private int F(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f73025l.size()) {
                return this.f73025l.size() - 1;
            }
        } while (((ha.a) this.f73025l.get(i11)).g(0) <= i10);
        return i11 - 1;
    }

    private void H() {
        this.f73027n.X();
        for (b1 b1Var : this.f73028o) {
            b1Var.X();
        }
    }

    private void q(int i10) {
        int iMin = Math.min(F(i10, 0), this.f73035v);
        if (iMin > 0) {
            o0.a1(this.f73025l, 0, iMin);
            this.f73035v -= iMin;
        }
    }

    private void r(int i10) {
        q9.a.g(!this.f73023j.i());
        int size = this.f73025l.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!w(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = v().f73011h;
        ha.a aVarS = s(i10);
        if (this.f73025l.isEmpty()) {
            this.f73033t = this.f73034u;
        }
        this.f73039z = false;
        this.f73021h.y(this.f73015b, aVarS.f73010g, j10);
    }

    private ha.a s(int i10) {
        ha.a aVar = (ha.a) this.f73025l.get(i10);
        ArrayList arrayList = this.f73025l;
        o0.a1(arrayList, i10, arrayList.size());
        this.f73035v = Math.max(this.f73035v, this.f73025l.size());
        int i11 = 0;
        this.f73027n.w(aVar.g(0));
        while (true) {
            b1[] b1VarArr = this.f73028o;
            if (i11 >= b1VarArr.length) {
                return aVar;
            }
            b1 b1Var = b1VarArr[i11];
            i11++;
            b1Var.w(aVar.g(i11));
        }
    }

    private ha.a v() {
        return (ha.a) this.f73025l.get(r0.size() - 1);
    }

    private boolean w(int i10) {
        int iF;
        ha.a aVar = (ha.a) this.f73025l.get(i10);
        if (this.f73027n.F() > aVar.g(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f73028o;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            iF = b1VarArr[i11].F();
            i11++;
        } while (iF <= aVar.g(i11));
        return true;
    }

    private boolean x(e eVar) {
        return eVar instanceof ha.a;
    }

    private void z() {
        int iF = F(this.f73027n.F(), this.f73035v - 1);
        while (true) {
            int i10 = this.f73035v;
            if (i10 > iF) {
                return;
            }
            this.f73035v = i10 + 1;
            A(i10);
        }
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void h(e eVar, long j10, long j11, boolean z10) {
        this.f73030q = null;
        this.f73036w = null;
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a());
        this.f73022i.onLoadTaskConcluded(eVar.f73004a);
        this.f73021h.m(yVar, eVar.f73006c, this.f73015b, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h);
        if (z10) {
            return;
        }
        if (y()) {
            H();
        } else if (x(eVar)) {
            s(this.f73025l.size() - 1);
            if (this.f73025l.isEmpty()) {
                this.f73033t = this.f73034u;
            }
        }
        this.f73020g.d(this);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void f(e eVar, long j10, long j11) {
        this.f73030q = null;
        this.f73019f.e(eVar);
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a());
        this.f73022i.onLoadTaskConcluded(eVar.f73004a);
        this.f73021h.p(yVar, eVar.f73006c, this.f73015b, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h);
        this.f73020g.d(this);
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public o.c g(e eVar, long j10, long j11, IOException iOException, int i10) {
        o.c cVarG;
        long jA = eVar.a();
        boolean zX = x(eVar);
        int size = this.f73025l.size() - 1;
        boolean z10 = (jA != 0 && zX && w(size)) ? false : true;
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, jA);
        m.c cVar = new m.c(yVar, new b0(eVar.f73006c, this.f73015b, eVar.f73007d, eVar.f73008e, eVar.f73009f, o0.q1(eVar.f73010g), o0.q1(eVar.f73011h)), iOException, i10);
        if (!this.f73019f.c(eVar, z10, cVar, this.f73022i)) {
            cVarG = null;
        } else if (z10) {
            cVarG = ka.o.f93115f;
            if (zX) {
                q9.a.g(s(size) == eVar);
                if (this.f73025l.isEmpty()) {
                    this.f73033t = this.f73034u;
                }
            }
        } else {
            q9.u.h("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            cVarG = null;
        }
        if (cVarG == null) {
            long jB = this.f73022i.b(cVar);
            cVarG = jB != -9223372036854775807L ? ka.o.g(false, jB) : ka.o.f93116g;
        }
        boolean zC = cVarG.c();
        this.f73021h.r(yVar, eVar.f73006c, this.f73015b, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h, iOException, !zC);
        if (!zC) {
            this.f73030q = null;
            this.f73022i.onLoadTaskConcluded(eVar.f73004a);
            this.f73020g.d(this);
        }
        return cVarG;
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void i(e eVar, long j10, long j11, int i10) {
        this.f73021h.v(i10 == 0 ? new y(eVar.f73004a, eVar.f73005b, j10) : new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a()), eVar.f73006c, this.f73015b, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h, i10);
    }

    public void G(b bVar) {
        this.f73032s = bVar;
        this.f73027n.T();
        for (b1 b1Var : this.f73028o) {
            b1Var.T();
        }
        this.f73023j.l(this);
    }

    public void I(long j10) throws Throwable {
        ha.a aVar;
        this.f73034u = j10;
        int i10 = 0;
        this.f73037x = false;
        if (y()) {
            this.f73033t = j10;
            return;
        }
        for (int i11 = 0; i11 < this.f73025l.size(); i11++) {
            aVar = (ha.a) this.f73025l.get(i11);
            long j11 = aVar.f73010g;
            if (j11 == j10 && aVar.f72974k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null ? this.f73027n.a0(aVar.g(0)) : this.f73027n.b0(j10, j10 < getNextLoadPositionUs())) {
            this.f73035v = F(this.f73027n.F(), 0);
            b1[] b1VarArr = this.f73028o;
            int length = b1VarArr.length;
            while (i10 < length) {
                b1VarArr[i10].b0(j10, true);
                i10++;
            }
            return;
        }
        this.f73033t = j10;
        this.f73039z = false;
        this.f73025l.clear();
        this.f73035v = 0;
        if (!this.f73023j.i()) {
            this.f73023j.f();
            H();
            return;
        }
        this.f73027n.s();
        b1[] b1VarArr2 = this.f73028o;
        int length2 = b1VarArr2.length;
        while (i10 < length2) {
            b1VarArr2[i10].s();
            i10++;
        }
        this.f73023j.e();
    }

    public a J(long j10, int i10) throws Throwable {
        for (int i11 = 0; i11 < this.f73028o.length; i11++) {
            if (this.f73016c[i11] == i10) {
                q9.a.g(!this.f73018e[i11]);
                this.f73018e[i11] = true;
                this.f73028o[i11].b0(j10, true);
                return new a(this, this.f73028o[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // ga.d1
    public boolean a(l1 l1Var) {
        List list;
        long j10;
        if (this.f73039z || this.f73023j.i() || this.f73023j.h()) {
            return false;
        }
        boolean zY = y();
        if (zY) {
            list = Collections.EMPTY_LIST;
            j10 = this.f73033t;
        } else {
            list = this.f73026m;
            j10 = v().f73011h;
        }
        this.f73019f.g(l1Var, j10, list, this.f73024k);
        g gVar = this.f73024k;
        boolean z10 = gVar.f73014b;
        e eVar = gVar.f73013a;
        gVar.a();
        if (z10) {
            this.f73033t = -9223372036854775807L;
            this.f73039z = true;
            return true;
        }
        if (eVar == null) {
            return false;
        }
        this.f73030q = eVar;
        if (x(eVar)) {
            ha.a aVar = (ha.a) eVar;
            if (zY) {
                long j11 = aVar.f73010g;
                long j12 = this.f73033t;
                if (j11 < j12) {
                    this.f73027n.d0(j12);
                    for (b1 b1Var : this.f73028o) {
                        b1Var.d0(this.f73033t);
                    }
                    if (this.f73037x) {
                        io.bidmachine.media3.common.a aVar2 = aVar.f73007d;
                        this.f73038y = !n9.w.a(aVar2.f80561o, aVar2.f80557k);
                    }
                }
                this.f73037x = false;
                this.f73033t = -9223372036854775807L;
            }
            aVar.i(this.f73029p);
            this.f73025l.add(aVar);
        } else if (eVar instanceof l) {
            ((l) eVar).e(this.f73029p);
        }
        this.f73023j.m(eVar, this, this.f73022i.getMinimumLoadableRetryCount(eVar.f73006c));
        return true;
    }

    public long b(long j10, m0 m0Var) {
        return this.f73019f.b(j10, m0Var);
    }

    @Override // ga.c1
    public int d(d0 d0Var, t9.f fVar, int i10) {
        if (y()) {
            return -3;
        }
        ha.a aVar = this.f73036w;
        if (aVar != null && aVar.g(0) <= this.f73027n.F()) {
            return -3;
        }
        z();
        return this.f73027n.U(d0Var, fVar, i10, this.f73039z);
    }

    public void discardBuffer(long j10, boolean z10) {
        if (y()) {
            return;
        }
        int iA = this.f73027n.A();
        this.f73027n.r(j10, z10, true);
        int iA2 = this.f73027n.A();
        if (iA2 > iA) {
            long jB = this.f73027n.B();
            int i10 = 0;
            while (true) {
                b1[] b1VarArr = this.f73028o;
                if (i10 >= b1VarArr.length) {
                    break;
                }
                b1VarArr[i10].r(jB, z10, this.f73018e[i10]);
                i10++;
            }
        }
        q(iA2);
    }

    @Override // ga.d1
    public long getBufferedPositionUs() {
        if (this.f73039z) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f73033t;
        }
        long jMax = this.f73034u;
        ha.a aVarV = v();
        if (!aVarV.f()) {
            if (this.f73025l.size() > 1) {
                aVarV = (ha.a) this.f73025l.get(r2.size() - 2);
            } else {
                aVarV = null;
            }
        }
        if (aVarV != null) {
            jMax = Math.max(jMax, aVarV.f73011h);
        }
        return Math.max(jMax, this.f73027n.C());
    }

    @Override // ga.d1
    public long getNextLoadPositionUs() {
        if (y()) {
            return this.f73033t;
        }
        if (this.f73039z) {
            return Long.MIN_VALUE;
        }
        return v().f73011h;
    }

    @Override // ga.d1
    public boolean isLoading() {
        return this.f73023j.i();
    }

    @Override // ga.c1
    public boolean isReady() {
        return !y() && this.f73027n.N(this.f73039z);
    }

    @Override // ga.c1
    public void maybeThrowError() throws IOException {
        this.f73023j.maybeThrowError();
        this.f73027n.P();
        if (this.f73023j.i()) {
            return;
        }
        this.f73019f.maybeThrowError();
    }

    @Override // ka.o.f
    public void onLoaderReleased() {
        this.f73027n.V();
        for (b1 b1Var : this.f73028o) {
            b1Var.V();
        }
        this.f73019f.release();
        b bVar = this.f73032s;
        if (bVar != null) {
            bVar.e(this);
        }
    }

    public boolean p() {
        try {
            return this.f73038y;
        } finally {
            this.f73038y = false;
        }
    }

    @Override // ga.d1
    public void reevaluateBuffer(long j10) {
        if (this.f73023j.h() || y()) {
            return;
        }
        if (!this.f73023j.i()) {
            int preferredQueueSize = this.f73019f.getPreferredQueueSize(j10, this.f73026m);
            if (preferredQueueSize < this.f73025l.size()) {
                r(preferredQueueSize);
                return;
            }
            return;
        }
        e eVar = (e) q9.a.e(this.f73030q);
        if (!(x(eVar) && w(this.f73025l.size() - 1)) && this.f73019f.f(j10, eVar, this.f73026m)) {
            this.f73023j.e();
            if (x(eVar)) {
                this.f73036w = (ha.a) eVar;
            }
        }
    }

    @Override // ga.c1
    public int skipData(long j10) throws Throwable {
        if (y()) {
            return 0;
        }
        int iH = this.f73027n.H(j10, this.f73039z);
        ha.a aVar = this.f73036w;
        if (aVar != null) {
            iH = Math.min(iH, aVar.g(0) - this.f73027n.F());
        }
        this.f73027n.g0(iH);
        z();
        return iH;
    }

    public void t(long j10) {
        q9.a.g(!this.f73023j.i());
        if (y() || j10 == -9223372036854775807L || this.f73025l.isEmpty()) {
            return;
        }
        ha.a aVarV = v();
        long j11 = aVarV.f72975l;
        if (j11 == -9223372036854775807L) {
            j11 = aVarV.f73011h;
        }
        if (j11 <= j10) {
            return;
        }
        long jC = this.f73027n.C();
        if (jC <= j10) {
            return;
        }
        this.f73027n.u(j10);
        for (b1 b1Var : this.f73028o) {
            b1Var.u(j10);
        }
        this.f73021h.y(this.f73015b, j10, jC);
    }

    public i u() {
        return this.f73019f;
    }

    boolean y() {
        return this.f73033t != -9223372036854775807L;
    }

    public final class a implements c1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f73040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b1 f73041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f73042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f73043e;

        public a(h hVar, b1 b1Var, int i10) {
            this.f73040b = hVar;
            this.f73041c = b1Var;
            this.f73042d = i10;
        }

        private void a() {
            if (this.f73043e) {
                return;
            }
            h.this.f73021h.j(h.this.f73016c[this.f73042d], h.this.f73017d[this.f73042d], 0, null, h.this.f73034u);
            this.f73043e = true;
        }

        public void b() {
            q9.a.g(h.this.f73018e[this.f73042d]);
            h.this.f73018e[this.f73042d] = false;
        }

        @Override // ga.c1
        public int d(d0 d0Var, t9.f fVar, int i10) {
            if (h.this.y()) {
                return -3;
            }
            if (h.this.f73036w != null && h.this.f73036w.g(this.f73042d + 1) <= this.f73041c.F()) {
                return -3;
            }
            a();
            return this.f73041c.U(d0Var, fVar, i10, h.this.f73039z);
        }

        @Override // ga.c1
        public boolean isReady() {
            return !h.this.y() && this.f73041c.N(h.this.f73039z);
        }

        @Override // ga.c1
        public int skipData(long j10) throws Throwable {
            if (h.this.y()) {
                return 0;
            }
            int iH = this.f73041c.H(j10, h.this.f73039z);
            if (h.this.f73036w != null) {
                iH = Math.min(iH, h.this.f73036w.g(this.f73042d + 1) - this.f73041c.F());
            }
            this.f73041c.g0(iH);
            if (iH > 0) {
                a();
            }
            return iH;
        }

        @Override // ga.c1
        public void maybeThrowError() {
        }
    }
}
