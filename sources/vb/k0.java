package vb;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lb.t;
import oa.m0;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class k0 implements oa.r {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final oa.x f106199v = new oa.x() { // from class: vb.j0
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
            return k0.d();
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
    private final int f106200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f106203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.d0 f106204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseIntArray f106205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l0.c f106206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final t.a f106207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f106208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final SparseBooleanArray f106209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SparseBooleanArray f106210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final i0 f106211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h0 f106212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private oa.t f106213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f106214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f106215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f106216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f106217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l0 f106218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f106219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f106220u;

    public k0(int i10, t.a aVar) {
        this(1, i10, aVar, new q9.j0(0L), new j(0), 112800);
    }

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new k0(1, t.a.f94119a)};
    }

    static /* synthetic */ int j(k0 k0Var) {
        int i10 = k0Var.f106214o;
        k0Var.f106214o = i10 + 1;
        return i10;
    }

    private boolean t(oa.s sVar) {
        byte[] bArrE = this.f106204e.e();
        if (9400 - this.f106204e.f() < 188) {
            int iA = this.f106204e.a();
            if (iA > 0) {
                System.arraycopy(bArrE, this.f106204e.f(), bArrE, 0, iA);
            }
            this.f106204e.U(bArrE, iA);
        }
        while (this.f106204e.a() < 188) {
            int iG = this.f106204e.g();
            int i10 = sVar.read(bArrE, iG, 9400 - iG);
            if (i10 == -1) {
                return false;
            }
            this.f106204e.V(iG + i10);
        }
        return true;
    }

    private int u() throws n9.x {
        int iF = this.f106204e.f();
        int iG = this.f106204e.g();
        int iA = m0.a(this.f106204e.e(), iF, iG);
        this.f106204e.W(iA);
        int i10 = iA + 188;
        if (i10 <= iG) {
            this.f106219t = 0;
            return i10;
        }
        int i11 = this.f106219t + (iA - iF);
        this.f106219t = i11;
        if (this.f106200a != 2 || i11 <= 376) {
            return i10;
        }
        throw n9.x.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
    }

    private void v(long j10) {
        if (this.f106216q) {
            return;
        }
        this.f106216q = true;
        if (this.f106211l.b() == -9223372036854775807L) {
            this.f106213n.e(new m0.b(this.f106211l.b()));
            return;
        }
        h0 h0Var = new h0(this.f106211l.c(), this.f106211l.b(), j10, this.f106220u, this.f106202c);
        this.f106212m = h0Var;
        this.f106213n.e(h0Var.b());
    }

    private void w() {
        this.f106209j.clear();
        this.f106208i.clear();
        SparseArray sparseArrayCreateInitialPayloadReaders = this.f106206g.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f106208i.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), (l0) sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.f106208i.put(0, new e0(new a()));
        this.f106218s = null;
    }

    private boolean x(int i10) {
        return this.f106200a == 2 || this.f106215p || !this.f106210k.get(i10, false);
    }

    @Override // oa.r
    public int a(oa.s sVar, oa.l0 l0Var) throws n9.x {
        int i10;
        long length = sVar.getLength();
        boolean z10 = this.f106200a == 2;
        if (this.f106215p) {
            if (length != -1 && !z10 && !this.f106211l.d()) {
                return this.f106211l.e(sVar, l0Var, this.f106220u);
            }
            v(length);
            if (this.f106217r) {
                this.f106217r = false;
                seek(0L, 0L);
                if (sVar.getPosition() != 0) {
                    l0Var.f96583a = 0L;
                    return 1;
                }
            }
            h0 h0Var = this.f106212m;
            if (h0Var != null && h0Var.d()) {
                return this.f106212m.c(sVar, l0Var);
            }
        }
        if (!t(sVar)) {
            for (int i11 = 0; i11 < this.f106208i.size(); i11++) {
                l0 l0Var2 = (l0) this.f106208i.valueAt(i11);
                if (l0Var2 instanceof y) {
                    y yVar = (y) l0Var2;
                    if (yVar.c(z10)) {
                        yVar.a(new q9.d0(), 1);
                    }
                }
            }
            return -1;
        }
        int iU = u();
        int iG = this.f106204e.g();
        if (iU > iG) {
            return 0;
        }
        int iQ = this.f106204e.q();
        if ((8388608 & iQ) != 0) {
            this.f106204e.W(iU);
            return 0;
        }
        int i12 = (4194304 & iQ) != 0 ? 1 : 0;
        int i13 = (2096896 & iQ) >> 8;
        boolean z11 = (iQ & 32) != 0;
        l0 l0Var3 = (iQ & 16) != 0 ? (l0) this.f106208i.get(i13) : null;
        if (l0Var3 == null) {
            this.f106204e.W(iU);
            return 0;
        }
        if (this.f106200a != 2) {
            int i14 = iQ & 15;
            i10 = 0;
            int i15 = this.f106205f.get(i13, i14 - 1);
            this.f106205f.put(i13, i14);
            if (i15 == i14) {
                this.f106204e.W(iU);
                return 0;
            }
            if (i14 != ((i15 + 1) & 15)) {
                l0Var3.seek();
            }
        } else {
            i10 = 0;
        }
        if (z11) {
            int iH = this.f106204e.H();
            i12 |= (this.f106204e.H() & 64) != 0 ? 2 : i10;
            this.f106204e.X(iH - 1);
        }
        boolean z12 = this.f106215p;
        if (x(i13)) {
            this.f106204e.V(iU);
            l0Var3.a(this.f106204e, i12);
            this.f106204e.V(iG);
        }
        if (this.f106200a != 2 && !z12 && this.f106215p && length != -1) {
            this.f106217r = true;
        }
        this.f106204e.W(iU);
        return i10;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        if ((this.f106201b & 1) == 0) {
            tVar = new lb.u(tVar, this.f106207h);
        }
        this.f106213n = tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // oa.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(oa.s r7) {
        /*
            r6 = this;
            q9.d0 r0 = r6.f106204e
            byte[] r0 = r0.e()
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = r2
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L29
            r3 = r2
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.skipFully(r1)
            r7 = 1
            return r7
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.k0.c(oa.s):boolean");
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
        h0 h0Var;
        q9.a.g(this.f106200a != 2);
        int size = this.f106203d.size();
        for (int i10 = 0; i10 < size; i10++) {
            q9.j0 j0Var = (q9.j0) this.f106203d.get(i10);
            boolean z10 = j0Var.f() == -9223372036854775807L;
            if (!z10) {
                long jD = j0Var.d();
                z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
            }
            if (z10) {
                j0Var.i(j11);
            }
        }
        if (j11 != 0 && (h0Var = this.f106212m) != null) {
            h0Var.h(j11);
        }
        this.f106204e.S(0);
        this.f106205f.clear();
        for (int i11 = 0; i11 < this.f106208i.size(); i11++) {
            ((l0) this.f106208i.valueAt(i11)).seek();
        }
        this.f106219t = 0;
    }

    public k0(int i10, int i11, t.a aVar, q9.j0 j0Var, l0.c cVar, int i12) {
        this.f106206g = (l0.c) q9.a.e(cVar);
        this.f106202c = i12;
        this.f106200a = i10;
        this.f106201b = i11;
        this.f106207h = aVar;
        if (i10 == 1 || i10 == 2) {
            this.f106203d = Collections.singletonList(j0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f106203d = arrayList;
            arrayList.add(j0Var);
        }
        this.f106204e = new q9.d0(new byte[9400], 0);
        this.f106209j = new SparseBooleanArray();
        this.f106210k = new SparseBooleanArray();
        this.f106208i = new SparseArray();
        this.f106205f = new SparseIntArray();
        this.f106211l = new i0(i12);
        this.f106213n = oa.t.O8;
        this.f106220u = -1;
        w();
    }

    @Override // oa.r
    public void release() {
    }

    private class a implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q9.c0 f106221a = new q9.c0(new byte[4]);

        public a() {
        }

        @Override // vb.d0
        public void a(q9.d0 d0Var) {
            if (d0Var.H() == 0 && (d0Var.H() & 128) != 0) {
                d0Var.X(6);
                int iA = d0Var.a() / 4;
                for (int i10 = 0; i10 < iA; i10++) {
                    d0Var.k(this.f106221a, 4);
                    int iH = this.f106221a.h(16);
                    this.f106221a.r(3);
                    if (iH == 0) {
                        this.f106221a.r(13);
                    } else {
                        int iH2 = this.f106221a.h(13);
                        if (k0.this.f106208i.get(iH2) == null) {
                            k0.this.f106208i.put(iH2, new e0(k0.this.new b(iH2)));
                            k0.j(k0.this);
                        }
                    }
                }
                if (k0.this.f106200a != 2) {
                    k0.this.f106208i.remove(0);
                }
            }
        }

        @Override // vb.d0
        public void b(q9.j0 j0Var, oa.t tVar, l0.d dVar) {
        }
    }

    private class b implements d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q9.c0 f106223a = new q9.c0(new byte[5]);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray f106224b = new SparseArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SparseIntArray f106225c = new SparseIntArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f106226d;

        public b(int i10) {
            this.f106226d = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private vb.l0.b c(q9.d0 r17, int r18) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: vb.k0.b.c(q9.d0, int):vb.l0$b");
        }

        @Override // vb.d0
        public void a(q9.d0 d0Var) {
            q9.j0 j0Var;
            if (d0Var.H() != 2) {
                return;
            }
            if (k0.this.f106200a == 1 || k0.this.f106200a == 2 || k0.this.f106214o == 1) {
                j0Var = (q9.j0) k0.this.f106203d.get(0);
            } else {
                j0Var = new q9.j0(((q9.j0) k0.this.f106203d.get(0)).d());
                k0.this.f106203d.add(j0Var);
            }
            if ((d0Var.H() & 128) == 0) {
                return;
            }
            d0Var.X(1);
            int iP = d0Var.P();
            int i10 = 3;
            d0Var.X(3);
            d0Var.k(this.f106223a, 2);
            this.f106223a.r(3);
            int i11 = 13;
            k0.this.f106220u = this.f106223a.h(13);
            d0Var.k(this.f106223a, 2);
            int i12 = 4;
            this.f106223a.r(4);
            d0Var.X(this.f106223a.h(12));
            if (k0.this.f106200a == 2 && k0.this.f106218s == null) {
                l0.b bVar = new l0.b(21, null, 0, null, o0.f98842f);
                k0 k0Var = k0.this;
                k0Var.f106218s = k0Var.f106206g.a(21, bVar);
                if (k0.this.f106218s != null) {
                    k0.this.f106218s.b(j0Var, k0.this.f106213n, new l0.d(iP, 21, 8192));
                }
            }
            this.f106224b.clear();
            this.f106225c.clear();
            int iA = d0Var.a();
            while (iA > 0) {
                d0Var.k(this.f106223a, 5);
                int iH = this.f106223a.h(8);
                this.f106223a.r(i10);
                int iH2 = this.f106223a.h(i11);
                this.f106223a.r(i12);
                int iH3 = this.f106223a.h(12);
                l0.b bVarC = c(d0Var, iH3);
                if (iH == 6 || iH == 5) {
                    iH = bVarC.f106238a;
                }
                iA -= iH3 + 5;
                int i13 = k0.this.f106200a == 2 ? iH : iH2;
                if (!k0.this.f106209j.get(i13)) {
                    l0 l0VarA = (k0.this.f106200a == 2 && iH == 21) ? k0.this.f106218s : k0.this.f106206g.a(iH, bVarC);
                    if (k0.this.f106200a != 2 || iH2 < this.f106225c.get(i13, 8192)) {
                        this.f106225c.put(i13, iH2);
                        this.f106224b.put(i13, l0VarA);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f106225c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = this.f106225c.keyAt(i14);
                int iValueAt = this.f106225c.valueAt(i14);
                k0.this.f106209j.put(iKeyAt, true);
                k0.this.f106210k.put(iValueAt, true);
                l0 l0Var = (l0) this.f106224b.valueAt(i14);
                if (l0Var != null) {
                    if (l0Var != k0.this.f106218s) {
                        l0Var.b(j0Var, k0.this.f106213n, new l0.d(iP, iKeyAt, 8192));
                    }
                    k0.this.f106208i.put(iValueAt, l0Var);
                }
            }
            if (k0.this.f106200a == 2) {
                if (k0.this.f106215p) {
                    return;
                }
                k0.this.f106213n.endTracks();
                k0.this.f106214o = 0;
                k0.this.f106215p = true;
                return;
            }
            k0.this.f106208i.remove(this.f106226d);
            k0 k0Var2 = k0.this;
            k0Var2.f106214o = k0Var2.f106200a == 1 ? 0 : k0.this.f106214o - 1;
            if (k0.this.f106214o == 0) {
                k0.this.f106213n.endTracks();
                k0.this.f106215p = true;
            }
        }

        @Override // vb.d0
        public void b(q9.j0 j0Var, oa.t tVar, l0.d dVar) {
        }
    }
}
