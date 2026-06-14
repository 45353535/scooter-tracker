package ib;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import com.google.common.base.Ascii;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import lb.t;
import oa.e0;
import oa.l0;
import oa.m0;
import oa.q0;
import oa.s0;
import q9.d0;
import q9.j0;
import q9.o0;
import r9.c;
import r9.i;

/* JADX INFO: loaded from: classes12.dex */
public class h implements oa.r {
    public static final oa.x M = new oa.x() { // from class: ib.e
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
            return h.e();
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
    private static final byte[] N = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final io.bidmachine.media3.common.a O = new a.b().u0("application/x-emsg").N();
    private long A;
    private long B;
    private b C;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private oa.t I;
    private s0[] J;
    private s0[] K;
    private boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f74042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f74043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f74044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f74045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f74046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f74047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f74048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f74049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f74050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f74051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j0 f74052k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final za.c f74053l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f74054m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f74055n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayDeque f74056o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final r9.i f74057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s0 f74058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImmutableList f74059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f74060s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f74061t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f74062u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f74063v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d0 f74064w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f74065x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f74066y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f74067z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f74068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f74069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f74070c;

        public a(long j10, boolean z10, int i10) {
            this.f74068a = j10;
            this.f74069b = z10;
            this.f74070c = i10;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f74071a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public w f74074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c f74075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f74076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f74077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f74078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f74079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f74080j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f74083m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f74072b = new v();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d0 f74073c = new d0();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final d0 f74081k = new d0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final d0 f74082l = new d0();

        public b(s0 s0Var, w wVar, c cVar, String str) {
            this.f74071a = s0Var;
            this.f74074d = wVar;
            this.f74075e = cVar;
            this.f74080j = str;
            j(wVar, cVar);
        }

        public int c() {
            int i10 = !this.f74083m ? this.f74074d.f74173g[this.f74076f] : this.f74072b.f74159k[this.f74076f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f74083m ? this.f74074d.f74169c[this.f74076f] : this.f74072b.f74155g[this.f74078h];
        }

        public long e() {
            return !this.f74083m ? this.f74074d.f74172f[this.f74076f] : this.f74072b.c(this.f74076f);
        }

        public int f() {
            return !this.f74083m ? this.f74074d.f74170d[this.f74076f] : this.f74072b.f74157i[this.f74076f];
        }

        public u g() {
            if (!this.f74083m) {
                return null;
            }
            int i10 = ((c) o0.i(this.f74072b.f74149a)).f74029a;
            u uVarB = this.f74072b.f74162n;
            if (uVarB == null) {
                uVarB = this.f74074d.f74167a.b(i10);
            }
            if (uVarB == null || !uVarB.f74144a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f74076f++;
            if (!this.f74083m) {
                return false;
            }
            int i10 = this.f74077g + 1;
            this.f74077g = i10;
            int[] iArr = this.f74072b.f74156h;
            int i11 = this.f74078h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f74078h = i11 + 1;
            this.f74077g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            d0 d0Var;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f74147d;
            if (length != 0) {
                d0Var = this.f74072b.f74163o;
            } else {
                byte[] bArr = (byte[]) o0.i(uVarG.f74148e);
                this.f74082l.U(bArr, bArr.length);
                d0 d0Var2 = this.f74082l;
                length = bArr.length;
                d0Var = d0Var2;
            }
            boolean zG = this.f74072b.g(this.f74076f);
            boolean z10 = zG || i11 != 0;
            this.f74081k.e()[0] = (byte) ((z10 ? 128 : 0) | length);
            this.f74081k.W(0);
            this.f74071a.a(this.f74081k, 1, 1);
            this.f74071a.a(d0Var, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f74073c.S(8);
                byte[] bArrE = this.f74073c.e();
                bArrE[0] = 0;
                bArrE[1] = 1;
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                bArrE[4] = (byte) ((i10 >> 24) & 255);
                bArrE[5] = (byte) ((i10 >> 16) & 255);
                bArrE[6] = (byte) ((i10 >> 8) & 255);
                bArrE[7] = (byte) (i10 & 255);
                this.f74071a.a(this.f74073c, 8, 1);
                return length + 9;
            }
            d0 d0Var3 = this.f74072b.f74163o;
            int iP = d0Var3.P();
            d0Var3.X(-2);
            int i12 = (iP * 6) + 2;
            if (i11 != 0) {
                this.f74073c.S(i12);
                byte[] bArrE2 = this.f74073c.e();
                d0Var3.l(bArrE2, 0, i12);
                int i13 = (((bArrE2[2] & 255) << 8) | (bArrE2[3] & 255)) + i11;
                bArrE2[2] = (byte) ((i13 >> 8) & 255);
                bArrE2[3] = (byte) (i13 & 255);
                d0Var3 = this.f74073c;
            }
            this.f74071a.a(d0Var3, i12, 1);
            return length + 1 + i12;
        }

        public void j(w wVar, c cVar) {
            this.f74074d = wVar;
            this.f74075e = cVar;
            this.f74071a.f(wVar.f74167a.f74138g.b().U(this.f74080j).N());
            k();
        }

        public void k() {
            this.f74072b.f();
            this.f74076f = 0;
            this.f74078h = 0;
            this.f74077g = 0;
            this.f74079i = 0;
            this.f74083m = false;
        }

        public void l(long j10) {
            int i10 = this.f74076f;
            while (true) {
                v vVar = this.f74072b;
                if (i10 >= vVar.f74154f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f74072b.f74159k[i10]) {
                    this.f74079i = i10;
                }
                i10++;
            }
        }

        public void m() {
            u uVarG = g();
            if (uVarG == null) {
                return;
            }
            d0 d0Var = this.f74072b.f74163o;
            int i10 = uVarG.f74147d;
            if (i10 != 0) {
                d0Var.X(i10);
            }
            if (this.f74072b.g(this.f74076f)) {
                d0Var.X(d0Var.P() * 6);
            }
        }

        public void n(DrmInitData drmInitData) {
            u uVarB = this.f74074d.f74167a.b(((c) o0.i(this.f74072b.f74149a)).f74029a);
            this.f74071a.f(this.f74074d.f74167a.f74138g.b().U(this.f74080j).Y(drmInitData.c(uVarB != null ? uVarB.f74145b : null)).N());
        }
    }

    public h(t.a aVar, int i10) {
        this(aVar, i10, null, null, ImmutableList.of(), null);
    }

    private static void A(c.b bVar, String str, v vVar) throws n9.x {
        byte[] bArr = null;
        d0 d0Var = null;
        d0 d0Var2 = null;
        for (int i10 = 0; i10 < bVar.f99234c.size(); i10++) {
            c.C1181c c1181c = (c.C1181c) bVar.f99234c.get(i10);
            d0 d0Var3 = c1181c.f99236b;
            int i11 = c1181c.f99232a;
            if (i11 == 1935828848) {
                d0Var3.W(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var = d0Var3;
                }
            } else if (i11 == 1936158820) {
                d0Var3.W(12);
                if (d0Var3.q() == 1936025959) {
                    d0Var2 = d0Var3;
                }
            }
        }
        if (d0Var == null || d0Var2 == null) {
            return;
        }
        d0Var.W(8);
        int iP = ib.b.p(d0Var.q());
        d0Var.X(4);
        if (iP == 1) {
            d0Var.X(4);
        }
        if (d0Var.q() != 1) {
            throw n9.x.d("Entry count in sbgp != 1 (unsupported).");
        }
        d0Var2.W(8);
        int iP2 = ib.b.p(d0Var2.q());
        d0Var2.X(4);
        if (iP2 == 1) {
            if (d0Var2.J() == 0) {
                throw n9.x.d("Variable length description in sgpd found (unsupported)");
            }
        } else if (iP2 >= 2) {
            d0Var2.X(4);
        }
        if (d0Var2.J() != 1) {
            throw n9.x.d("Entry count in sgpd != 1 (unsupported).");
        }
        d0Var2.X(1);
        int iH = d0Var2.H();
        int i12 = (iH & 240) >> 4;
        int i13 = iH & 15;
        boolean z10 = d0Var2.H() == 1;
        if (z10) {
            int iH2 = d0Var2.H();
            byte[] bArr2 = new byte[16];
            d0Var2.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = d0Var2.H();
                bArr = new byte[iH3];
                d0Var2.l(bArr, 0, iH3);
            }
            vVar.f74160l = true;
            vVar.f74162n = new u(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    private static void B(d0 d0Var, int i10, v vVar) throws n9.x {
        d0Var.W(i10 + 8);
        int iO = ib.b.o(d0Var.q());
        if ((iO & 1) != 0) {
            throw n9.x.d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iO & 2) != 0;
        int iL = d0Var.L();
        if (iL == 0) {
            Arrays.fill(vVar.f74161m, 0, vVar.f74154f, false);
            return;
        }
        if (iL == vVar.f74154f) {
            Arrays.fill(vVar.f74161m, 0, iL, z10);
            vVar.d(d0Var.a());
            vVar.b(d0Var);
        } else {
            throw n9.x.a("Senc sample count " + iL + " is different from fragment sample count" + vVar.f74154f, null);
        }
    }

    private static void C(d0 d0Var, v vVar) throws n9.x {
        B(d0Var, 0, vVar);
    }

    private static Pair D(d0 d0Var, long j10) throws n9.x {
        long jO;
        long jO2;
        d0Var.W(8);
        int iP = ib.b.p(d0Var.q());
        d0Var.X(4);
        long J = d0Var.J();
        if (iP == 0) {
            jO = d0Var.J();
            jO2 = d0Var.J();
        } else {
            jO = d0Var.O();
            jO2 = d0Var.O();
        }
        long j11 = j10 + jO2;
        long jC1 = o0.c1(jO, 1000000L, J);
        d0Var.X(2);
        int iP2 = d0Var.P();
        int[] iArr = new int[iP2];
        long[] jArr = new long[iP2];
        long[] jArr2 = new long[iP2];
        long[] jArr3 = new long[iP2];
        long j12 = j11;
        long jC12 = jC1;
        int i10 = 0;
        while (i10 < iP2) {
            int iQ = d0Var.q();
            if ((Integer.MIN_VALUE & iQ) != 0) {
                throw n9.x.a("Unhandled indirect reference", null);
            }
            long J2 = d0Var.J();
            iArr[i10] = iQ & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jC12;
            jO += J2;
            long[] jArr4 = jArr3;
            jC12 = o0.c1(jO, 1000000L, J);
            jArr2[i10] = jC12 - jArr4[i10];
            d0Var.X(4);
            j12 += (long) iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jC1), new oa.h(iArr, jArr, jArr2, jArr3));
    }

    private static long E(d0 d0Var) {
        d0Var.W(8);
        return ib.b.p(d0Var.q()) == 1 ? d0Var.O() : d0Var.J();
    }

    private static b F(d0 d0Var, SparseArray sparseArray, boolean z10) {
        d0Var.W(8);
        int iO = ib.b.o(d0Var.q());
        b bVar = (b) (z10 ? sparseArray.valueAt(0) : sparseArray.get(d0Var.q()));
        if (bVar == null) {
            return null;
        }
        if ((iO & 1) != 0) {
            long jO = d0Var.O();
            v vVar = bVar.f74072b;
            vVar.f74151c = jO;
            vVar.f74152d = jO;
        }
        c cVar = bVar.f74075e;
        bVar.f74072b.f74149a = new c((iO & 2) != 0 ? d0Var.q() - 1 : cVar.f74029a, (iO & 8) != 0 ? d0Var.q() : cVar.f74030b, (iO & 16) != 0 ? d0Var.q() : cVar.f74031c, (iO & 32) != 0 ? d0Var.q() : cVar.f74032d);
        return bVar;
    }

    private static void G(c.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws n9.x {
        b bVarF = F(((c.C1181c) q9.a.e(bVar.e(1952868452))).f99236b, sparseArray, z10);
        if (bVarF == null) {
            return;
        }
        v vVar = bVarF.f74072b;
        long j10 = vVar.f74165q;
        boolean z11 = vVar.f74166r;
        bVarF.k();
        bVarF.f74083m = true;
        c.C1181c c1181cE = bVar.e(1952867444);
        if (c1181cE == null || (i10 & 2) != 0) {
            vVar.f74165q = j10;
            vVar.f74166r = z11;
        } else {
            vVar.f74165q = E(c1181cE.f99236b);
            vVar.f74166r = true;
        }
        J(bVar, bVarF, i10);
        u uVarB = bVarF.f74074d.f74167a.b(((c) q9.a.e(vVar.f74149a)).f74029a);
        c.C1181c c1181cE2 = bVar.e(1935763834);
        if (c1181cE2 != null) {
            z((u) q9.a.e(uVarB), c1181cE2.f99236b, vVar);
        }
        c.C1181c c1181cE3 = bVar.e(1935763823);
        if (c1181cE3 != null) {
            y(c1181cE3.f99236b, vVar);
        }
        c.C1181c c1181cE4 = bVar.e(1936027235);
        if (c1181cE4 != null) {
            C(c1181cE4.f99236b, vVar);
        }
        A(bVar, uVarB != null ? uVarB.f74145b : null, vVar);
        int size = bVar.f99234c.size();
        for (int i11 = 0; i11 < size; i11++) {
            c.C1181c c1181c = (c.C1181c) bVar.f99234c.get(i11);
            if (c1181c.f99232a == 1970628964) {
                K(c1181c.f99236b, vVar, bArr);
            }
        }
    }

    private static Pair H(d0 d0Var) {
        d0Var.W(12);
        return Pair.create(Integer.valueOf(d0Var.q()), new c(d0Var.q() - 1, d0Var.q(), d0Var.q(), d0Var.q()));
    }

    private static int I(b bVar, int i10, int i11, d0 d0Var, int i12) throws n9.x {
        boolean z10;
        int iQ;
        int i13;
        int iQ2;
        int i14;
        int iQ3;
        int i15;
        int iQ4;
        d0Var.W(8);
        int iO = ib.b.o(d0Var.q());
        t tVar = bVar.f74074d.f74167a;
        v vVar = bVar.f74072b;
        c cVar = (c) o0.i(vVar.f74149a);
        vVar.f74156h[i10] = d0Var.L();
        long[] jArr = vVar.f74155g;
        long j10 = vVar.f74151c;
        jArr[i10] = j10;
        if ((iO & 1) != 0) {
            jArr[i10] = j10 + ((long) d0Var.q());
        }
        boolean z11 = (iO & 4) != 0;
        int iQ5 = cVar.f74032d;
        if (z11) {
            iQ5 = d0Var.q();
        }
        boolean z12 = (iO & 256) != 0;
        boolean z13 = (iO & 512) != 0;
        boolean z14 = (iO & 1024) != 0;
        boolean z15 = (iO & 2048) != 0;
        long j11 = o(tVar) ? ((long[]) o0.i(tVar.f74141j))[0] : 0L;
        int[] iArr = vVar.f74157i;
        long[] jArr2 = vVar.f74158j;
        boolean[] zArr = vVar.f74159k;
        boolean z16 = z15;
        boolean z17 = tVar.f74133b == 2 && (i11 & 1) != 0;
        int i16 = i12 + vVar.f74156h[i10];
        boolean z18 = z11;
        long j12 = tVar.f74134c;
        long j13 = vVar.f74165q;
        int i17 = i12;
        while (i17 < i16) {
            if (z12) {
                iQ = d0Var.q();
                z10 = z17;
            } else {
                z10 = z17;
                iQ = cVar.f74030b;
            }
            int iG = g(iQ);
            if (z13) {
                iQ2 = d0Var.q();
                i13 = i16;
            } else {
                i13 = i16;
                iQ2 = cVar.f74031c;
            }
            int iG2 = g(iQ2);
            if (z14) {
                i14 = iG2;
                iQ3 = d0Var.q();
            } else if (i17 == 0 && z18) {
                i14 = iG2;
                iQ3 = iQ5;
            } else {
                i14 = iG2;
                iQ3 = cVar.f74032d;
            }
            if (z16) {
                i15 = iQ3;
                iQ4 = d0Var.q();
            } else {
                i15 = iQ3;
                iQ4 = 0;
            }
            int i18 = i17;
            long jC1 = o0.c1((((long) iQ4) + j13) - j11, 1000000L, j12);
            jArr2[i18] = jC1;
            if (!vVar.f74166r) {
                jArr2[i18] = jC1 + bVar.f74074d.f74174h;
            }
            iArr[i18] = i14;
            zArr[i18] = ((i15 >> 16) & 1) == 0 && (!z10 || i18 == 0);
            j13 += (long) iG;
            i17 = i18 + 1;
            i16 = i13;
            z17 = z10;
        }
        int i19 = i16;
        vVar.f74165q = j13;
        return i19;
    }

    private static void J(c.b bVar, b bVar2, int i10) throws n9.x {
        List list = bVar.f99234c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c.C1181c c1181c = (c.C1181c) list.get(i13);
            if (c1181c.f99232a == 1953658222) {
                d0 d0Var = c1181c.f99236b;
                d0Var.W(12);
                int iL = d0Var.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar2.f74078h = 0;
        bVar2.f74077g = 0;
        bVar2.f74076f = 0;
        bVar2.f74072b.e(i11, i12);
        int i14 = 0;
        int I = 0;
        for (int i15 = 0; i15 < size; i15++) {
            c.C1181c c1181c2 = (c.C1181c) list.get(i15);
            if (c1181c2.f99232a == 1953658222) {
                I = I(bVar2, i14, i10, c1181c2.f99236b, I);
                i14++;
            }
        }
    }

    private static void K(d0 d0Var, v vVar, byte[] bArr) throws n9.x {
        d0Var.W(8);
        d0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, N)) {
            B(d0Var, 16, vVar);
        }
    }

    private void L(long j10) throws n9.x {
        while (!this.f74055n.isEmpty() && ((c.b) this.f74055n.peek()).f99233b == j10) {
            q((c.b) this.f74055n.pop());
        }
        i();
    }

    private boolean M(oa.s sVar) throws n9.x {
        if (this.f74063v == 0) {
            if (!sVar.readFully(this.f74054m.e(), 0, 8, true)) {
                return false;
            }
            this.f74063v = 8;
            this.f74054m.W(0);
            this.f74062u = this.f74054m.J();
            this.f74061t = this.f74054m.q();
        }
        long j10 = this.f74062u;
        if (j10 == 1) {
            sVar.readFully(this.f74054m.e(), 8, 8);
            this.f74063v += 8;
            this.f74062u = this.f74054m.O();
        } else if (j10 == 0) {
            long length = sVar.getLength();
            if (length == -1 && !this.f74055n.isEmpty()) {
                length = ((c.b) this.f74055n.peek()).f99233b;
            }
            if (length != -1) {
                this.f74062u = (length - sVar.getPosition()) + ((long) this.f74063v);
            }
        }
        if (this.f74062u < this.f74063v) {
            throw n9.x.d("Atom size less than header length (unsupported).");
        }
        long position = sVar.getPosition() - ((long) this.f74063v);
        int i10 = this.f74061t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.L) {
            this.I.e(new m0.b(this.A, position));
            this.L = true;
        }
        if (this.f74061t == 1836019558) {
            int size = this.f74046e.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = ((b) this.f74046e.valueAt(i11)).f74072b;
                vVar.f74150b = position;
                vVar.f74152d = position;
                vVar.f74151c = position;
            }
        }
        int i12 = this.f74061t;
        if (i12 == 1835295092) {
            this.C = null;
            this.f74065x = position + this.f74062u;
            this.f74060s = 2;
            return true;
        }
        if (Q(i12)) {
            long position2 = (sVar.getPosition() + this.f74062u) - 8;
            this.f74055n.push(new c.b(this.f74061t, position2));
            if (this.f74062u == this.f74063v) {
                L(position2);
            } else {
                i();
            }
        } else if (R(this.f74061t)) {
            if (this.f74063v != 8) {
                throw n9.x.d("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f74062u > SieveCacheKt.NodeLinkMask) {
                throw n9.x.d("Leaf atom with length > 2147483647 (unsupported).");
            }
            d0 d0Var = new d0((int) this.f74062u);
            System.arraycopy(this.f74054m.e(), 0, d0Var.e(), 0, 8);
            this.f74064w = d0Var;
            this.f74060s = 1;
        } else {
            if (this.f74062u > SieveCacheKt.NodeLinkMask) {
                throw n9.x.d("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f74064w = null;
            this.f74060s = 1;
        }
        return true;
    }

    private void N(oa.s sVar) throws n9.x {
        int i10 = (int) (this.f74062u - ((long) this.f74063v));
        d0 d0Var = this.f74064w;
        if (d0Var != null) {
            sVar.readFully(d0Var.e(), 8, i10);
            s(new c.C1181c(this.f74061t, d0Var), sVar.getPosition());
        } else {
            sVar.skipFully(i10);
        }
        L(sVar.getPosition());
    }

    private void O(oa.s sVar) throws n9.x {
        int size = this.f74046e.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = ((b) this.f74046e.valueAt(i10)).f74072b;
            if (vVar.f74164p) {
                long j11 = vVar.f74152d;
                if (j11 < j10) {
                    bVar = (b) this.f74046e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f74060s = 3;
            return;
        }
        int position = (int) (j10 - sVar.getPosition());
        if (position < 0) {
            throw n9.x.a("Offset to encryption data was negative.", null);
        }
        sVar.skipFully(position);
        bVar.f74072b.a(sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean P(oa.s r17) throws n9.x {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.h.P(oa.s):boolean");
    }

    private static boolean Q(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean R(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    public static /* synthetic */ oa.r[] e() {
        return new oa.r[]{new h(t.a.f94119a, 32)};
    }

    private boolean f(io.bidmachine.media3.common.a aVar) {
        return Objects.equals(aVar.f80561o, "video/avc") ? (this.f74043b & 64) != 0 : Objects.equals(aVar.f80561o, "video/hevc") && (this.f74043b & 128) != 0;
    }

    private static int g(int i10) throws n9.x {
        if (i10 >= 0) {
            return i10;
        }
        throw n9.x.a("Unexpected negative value: " + i10, null);
    }

    public static int h(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void i() {
        this.f74060s = 0;
        this.f74063v = 0;
    }

    private c j(SparseArray sparseArray, int i10) {
        return sparseArray.size() == 1 ? (c) sparseArray.valueAt(0) : (c) q9.a.e((c) sparseArray.get(i10));
    }

    private static DrmInitData k(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            c.C1181c c1181c = (c.C1181c) list.get(i10);
            if (c1181c.f99232a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = c1181c.f99236b.e();
                UUID uuidF = p.f(bArrE);
                if (uuidF == null) {
                    q9.u.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static b l(SparseArray sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) sparseArray.valueAt(i10);
            if ((bVar2.f74083m || bVar2.f74076f != bVar2.f74074d.f74168b) && (!bVar2.f74083m || bVar2.f74078h != bVar2.f74072b.f74153e)) {
                long jD = bVar2.d();
                if (jD < j10) {
                    bVar = bVar2;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    private void n() {
        int i10;
        s0[] s0VarArr = new s0[2];
        this.J = s0VarArr;
        s0 s0Var = this.f74058q;
        int i11 = 0;
        if (s0Var != null) {
            s0VarArr[0] = s0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f74043b & 4) != 0) {
            s0VarArr[i10] = this.I.track(100, 5);
            i12 = 101;
            i10++;
        }
        s0[] s0VarArr2 = (s0[]) o0.V0(this.J, i10);
        this.J = s0VarArr2;
        for (s0 s0Var2 : s0VarArr2) {
            s0Var2.f(O);
        }
        this.K = new s0[this.f74045d.size()];
        while (i11 < this.K.length) {
            s0 s0VarTrack = this.I.track(i12, 3);
            s0VarTrack.f((io.bidmachine.media3.common.a) this.f74045d.get(i11));
            this.K[i11] = s0VarTrack;
            i11++;
            i12++;
        }
    }

    private static boolean o(t tVar) {
        long[] jArr = tVar.f74140i;
        if (jArr != null && jArr.length == 1 && tVar.f74141j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || o0.c1(j10, 1000000L, tVar.f74135d) + o0.c1(tVar.f74141j[0], 1000000L, tVar.f74134c) >= tVar.f74136e) {
                return true;
            }
        }
        return false;
    }

    private void q(c.b bVar) throws n9.x {
        int i10 = bVar.f99232a;
        if (i10 == 1836019574) {
            u(bVar);
        } else if (i10 == 1836019558) {
            t(bVar);
        } else {
            if (this.f74055n.isEmpty()) {
                return;
            }
            ((c.b) this.f74055n.peek()).b(bVar);
        }
    }

    private void r(d0 d0Var) {
        String str;
        String str2;
        long jC1;
        long jC12;
        long J;
        long jA;
        if (this.J.length == 0) {
            return;
        }
        d0Var.W(8);
        int iP = ib.b.p(d0Var.q());
        if (iP == 0) {
            str = (String) q9.a.e(d0Var.B());
            str2 = (String) q9.a.e(d0Var.B());
            long J2 = d0Var.J();
            jC1 = o0.c1(d0Var.J(), 1000000L, J2);
            long j10 = this.B;
            long j11 = j10 != -9223372036854775807L ? j10 + jC1 : -9223372036854775807L;
            jC12 = o0.c1(d0Var.J(), 1000L, J2);
            J = d0Var.J();
            jA = j11;
        } else {
            if (iP != 1) {
                q9.u.h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iP);
                return;
            }
            long J3 = d0Var.J();
            jA = o0.c1(d0Var.O(), 1000000L, J3);
            long jC13 = o0.c1(d0Var.J(), 1000L, J3);
            long J4 = d0Var.J();
            str = (String) q9.a.e(d0Var.B());
            str2 = (String) q9.a.e(d0Var.B());
            jC12 = jC13;
            J = J4;
            jC1 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d0Var.a()];
        d0Var.l(bArr, 0, d0Var.a());
        d0 d0Var2 = new d0(this.f74053l.a(new za.a(str3, str4, jC12, J, bArr)));
        int iA = d0Var2.a();
        for (s0 s0Var : this.J) {
            d0Var2.W(0);
            s0Var.c(d0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f74056o.addLast(new a(jC1, true, iA));
            this.f74066y += iA;
            return;
        }
        if (!this.f74056o.isEmpty()) {
            this.f74056o.addLast(new a(jA, false, iA));
            this.f74066y += iA;
            return;
        }
        j0 j0Var = this.f74052k;
        if (j0Var != null && !j0Var.g()) {
            this.f74056o.addLast(new a(jA, false, iA));
            this.f74066y += iA;
            return;
        }
        j0 j0Var2 = this.f74052k;
        if (j0Var2 != null) {
            jA = j0Var2.a(jA);
        }
        long j12 = jA;
        for (s0 s0Var2 : this.J) {
            s0Var2.e(j12, 1, iA, 0, null);
        }
    }

    private void s(c.C1181c c1181c, long j10) throws n9.x {
        if (!this.f74055n.isEmpty()) {
            ((c.b) this.f74055n.peek()).c(c1181c);
            return;
        }
        int i10 = c1181c.f99232a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                r(c1181c.f99236b);
            }
        } else {
            Pair pairD = D(c1181c.f99236b, j10);
            this.B = ((Long) pairD.first).longValue();
            this.I.e((m0) pairD.second);
            this.L = true;
        }
    }

    private void t(c.b bVar) throws n9.x {
        x(bVar, this.f74046e, this.f74044c != null, this.f74043b, this.f74050i);
        DrmInitData drmInitDataK = k(bVar.f99234c);
        if (drmInitDataK != null) {
            int size = this.f74046e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((b) this.f74046e.valueAt(i10)).n(drmInitDataK);
            }
        }
        if (this.f74067z != -9223372036854775807L) {
            int size2 = this.f74046e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((b) this.f74046e.valueAt(i11)).l(this.f74067z);
            }
            this.f74067z = -9223372036854775807L;
        }
    }

    private void u(c.b bVar) {
        int i10 = 0;
        q9.a.h(this.f74044c == null, "Unexpected moov box.");
        DrmInitData drmInitDataK = k(bVar.f99234c);
        c.b bVar2 = (c.b) q9.a.e(bVar.d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = bVar2.f99234c.size();
        long jW = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            c.C1181c c1181c = (c.C1181c) bVar2.f99234c.get(i11);
            int i12 = c1181c.f99232a;
            if (i12 == 1953654136) {
                Pair pairH = H(c1181c.f99236b);
                sparseArray.put(((Integer) pairH.first).intValue(), (c) pairH.second);
            } else if (i12 == 1835362404) {
                jW = w(c1181c.f99236b);
            }
        }
        List listG = ib.b.G(bVar, new e0(), jW, drmInitDataK, (this.f74043b & 16) != 0, false, new Function() { // from class: ib.g
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return this.f74041b.p((t) obj);
            }
        });
        int size2 = listG.size();
        if (this.f74046e.size() != 0) {
            q9.a.g(this.f74046e.size() == size2);
            while (i10 < size2) {
                w wVar = (w) listG.get(i10);
                t tVar = wVar.f74167a;
                ((b) this.f74046e.get(tVar.f74132a)).j(wVar, j(sparseArray, tVar.f74132a));
                i10++;
            }
            return;
        }
        String strB = k.b(listG);
        while (i10 < size2) {
            w wVar2 = (w) listG.get(i10);
            t tVar2 = wVar2.f74167a;
            s0 s0VarTrack = this.I.track(i10, tVar2.f74133b);
            s0VarTrack.d(tVar2.f74136e);
            this.f74046e.put(tVar2.f74132a, new b(s0VarTrack, wVar2, j(sparseArray, tVar2.f74132a), strB));
            this.A = Math.max(this.A, tVar2.f74136e);
            i10++;
        }
        this.I.endTracks();
    }

    private void v(long j10) {
        while (!this.f74056o.isEmpty()) {
            a aVar = (a) this.f74056o.removeFirst();
            this.f74066y -= aVar.f74070c;
            long jA = aVar.f74068a;
            if (aVar.f74069b) {
                jA += j10;
            }
            j0 j0Var = this.f74052k;
            if (j0Var != null) {
                jA = j0Var.a(jA);
            }
            long j11 = jA;
            for (s0 s0Var : this.J) {
                s0Var.e(j11, 1, aVar.f74070c, this.f74066y, null);
            }
        }
    }

    private static long w(d0 d0Var) {
        d0Var.W(8);
        return ib.b.p(d0Var.q()) == 0 ? d0Var.J() : d0Var.O();
    }

    private static void x(c.b bVar, SparseArray sparseArray, boolean z10, int i10, byte[] bArr) throws n9.x {
        int size = bVar.f99235d.size();
        for (int i11 = 0; i11 < size; i11++) {
            c.b bVar2 = (c.b) bVar.f99235d.get(i11);
            if (bVar2.f99232a == 1953653094) {
                G(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void y(d0 d0Var, v vVar) throws n9.x {
        d0Var.W(8);
        int iQ = d0Var.q();
        if ((ib.b.o(iQ) & 1) == 1) {
            d0Var.X(8);
        }
        int iL = d0Var.L();
        if (iL == 1) {
            vVar.f74152d += ib.b.p(iQ) == 0 ? d0Var.J() : d0Var.O();
        } else {
            throw n9.x.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void z(u uVar, d0 d0Var, v vVar) throws n9.x {
        int i10;
        int i11 = uVar.f74147d;
        d0Var.W(8);
        if ((ib.b.o(d0Var.q()) & 1) == 1) {
            d0Var.X(8);
        }
        int iH = d0Var.H();
        int iL = d0Var.L();
        if (iL > vVar.f74154f) {
            throw n9.x.a("Saiz sample count " + iL + " is greater than fragment sample count" + vVar.f74154f, null);
        }
        if (iH == 0) {
            boolean[] zArr = vVar.f74161m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = d0Var.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = iH * iL;
            Arrays.fill(vVar.f74161m, 0, iL, iH > i11);
        }
        Arrays.fill(vVar.f74161m, iL, vVar.f74154f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    @Override // oa.r
    public int a(oa.s sVar, l0 l0Var) throws n9.x {
        while (true) {
            int i10 = this.f74060s;
            if (i10 != 0) {
                if (i10 == 1) {
                    N(sVar);
                } else if (i10 == 2) {
                    O(sVar);
                } else if (P(sVar)) {
                    return 0;
                }
            } else if (!M(sVar)) {
                this.f74057p.d();
                return -1;
            }
        }
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        if ((this.f74043b & 32) == 0) {
            tVar = new lb.u(tVar, this.f74042a);
        }
        this.I = tVar;
        i();
        n();
        t tVar2 = this.f74044c;
        if (tVar2 != null) {
            this.f74046e.put(0, new b(this.I.track(0, tVar2.f74133b), new w(this.f74044c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), k.a(this.f74044c.f74138g)));
            this.I.endTracks();
        }
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        q0 q0VarB = s.b(sVar);
        this.f74059r = q0VarB != null ? ImmutableList.of(q0VarB) : ImmutableList.of();
        return q0VarB == null;
    }

    @Override // oa.r
    public /* synthetic */ oa.r getUnderlyingImplementation() {
        return oa.q.b(this);
    }

    @Override // oa.r
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableList getSniffFailureDetails() {
        return this.f74059r;
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        int size = this.f74046e.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) this.f74046e.valueAt(i10)).k();
        }
        this.f74056o.clear();
        this.f74066y = 0;
        this.f74057p.b();
        this.f74067z = j11;
        this.f74055n.clear();
        i();
    }

    public h(t.a aVar, int i10, j0 j0Var, t tVar, List list, s0 s0Var) {
        this.f74042a = aVar;
        this.f74043b = i10;
        this.f74052k = j0Var;
        this.f74044c = tVar;
        this.f74045d = DesugarCollections.unmodifiableList(list);
        this.f74058q = s0Var;
        this.f74053l = new za.c();
        this.f74054m = new d0(16);
        this.f74047f = new d0(r9.f.f99242a);
        this.f74048g = new d0(6);
        this.f74049h = new d0();
        byte[] bArr = new byte[16];
        this.f74050i = bArr;
        this.f74051j = new d0(bArr);
        this.f74055n = new ArrayDeque();
        this.f74056o = new ArrayDeque();
        this.f74046e = new SparseArray();
        this.f74059r = ImmutableList.of();
        this.A = -9223372036854775807L;
        this.f74067z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = oa.t.O8;
        this.J = new s0[0];
        this.K = new s0[0];
        this.f74057p = new r9.i(new i.b() { // from class: ib.f
            @Override // r9.i.b
            public final void a(long j10, d0 d0Var) {
                oa.g.a(j10, d0Var, this.f74040a.K);
            }
        });
    }

    @Override // oa.r
    public void release() {
    }

    protected t p(t tVar) {
        return tVar;
    }
}
