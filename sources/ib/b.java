package ib;

import android.util.Pair;
import androidx.core.view.ViewCompat;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n9.g;
import n9.v;
import oa.e0;
import oa.f0;
import q9.c0;
import q9.d0;
import q9.o0;
import r9.c;
import r9.f;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f73989a = o0.u0("OpusHead");

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f73990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f73991b;

        public a(long j10, long j11) {
            this.f73990a = j10;
            this.f73991b = j11;
        }
    }

    /* JADX INFO: renamed from: ib.b$b, reason: collision with other inner class name */
    private static final class C0918b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f73993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f73994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f73995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f73996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final d0 f73997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final d0 f73998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f73999h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f74000i;

        public C0918b(d0 d0Var, d0 d0Var2, boolean z10) throws n9.x {
            this.f73998g = d0Var;
            this.f73997f = d0Var2;
            this.f73996e = z10;
            d0Var2.W(12);
            this.f73992a = d0Var2.L();
            d0Var.W(12);
            this.f74000i = d0Var.L();
            oa.u.a(d0Var.q() == 1, "first_chunk must be 1");
            this.f73993b = -1;
        }

        public boolean a() {
            int i10 = this.f73993b + 1;
            this.f73993b = i10;
            if (i10 == this.f73992a) {
                return false;
            }
            this.f73995d = this.f73996e ? this.f73997f.O() : this.f73997f.J();
            if (this.f73993b == this.f73999h) {
                this.f73994c = this.f73998g.L();
                this.f73998g.X(4);
                int i11 = this.f74000i - 1;
                this.f74000i = i11;
                this.f73999h = i11 > 0 ? this.f73998g.L() - 1 : -1;
            }
            return true;
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f74001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f74002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f74003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f74004d;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f74001a = str;
            this.f74002b = bArr;
            this.f74003c = j10;
            this.f74004d = j11;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f74005a;

        public d(g gVar) {
            this.f74005a = gVar;
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f74006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f74007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f74008c;

        public e(long j10, long j11, String str) {
            this.f74006a = j10;
            this.f74007b = j11;
            this.f74008c = str;
        }
    }

    private interface f {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f74009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f74010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f74011c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f74009a = z10;
            this.f74010b = z11;
            this.f74011c = z12;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f74012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.bidmachine.media3.common.a f74013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f74014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f74015d = 0;

        public h(int i10) {
            this.f74012a = new u[i10];
        }
    }

    static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f74016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f74017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0 f74018c;

        public i(c.C1181c c1181c, io.bidmachine.media3.common.a aVar) {
            d0 d0Var = c1181c.f99236b;
            this.f74018c = d0Var;
            d0Var.W(12);
            int iL = d0Var.L();
            if ("audio/raw".equals(aVar.f80561o)) {
                int iK0 = o0.k0(aVar.G, aVar.E);
                if (iL == 0 || iL % iK0 != 0) {
                    q9.u.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iK0 + ", stsz sample size: " + iL);
                    iL = iK0;
                }
            }
            this.f74016a = iL == 0 ? -1 : iL;
            this.f74017b = d0Var.L();
        }

        @Override // ib.b.f
        public int getFixedSampleSize() {
            return this.f74016a;
        }

        @Override // ib.b.f
        public int getSampleCount() {
            return this.f74017b;
        }

        @Override // ib.b.f
        public int readNextSampleSize() {
            int i10 = this.f74016a;
            return i10 == -1 ? this.f74018c.L() : i10;
        }
    }

    static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f74019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f74020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f74021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f74022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f74023e;

        public j(c.C1181c c1181c) {
            d0 d0Var = c1181c.f99236b;
            this.f74019a = d0Var;
            d0Var.W(12);
            this.f74021c = d0Var.L() & 255;
            this.f74020b = d0Var.L();
        }

        @Override // ib.b.f
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // ib.b.f
        public int getSampleCount() {
            return this.f74020b;
        }

        @Override // ib.b.f
        public int readNextSampleSize() {
            int i10 = this.f74021c;
            if (i10 == 8) {
                return this.f74019a.H();
            }
            if (i10 == 16) {
                return this.f74019a.P();
            }
            int i11 = this.f74022d;
            this.f74022d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f74023e & 15;
            }
            int iH = this.f74019a.H();
            this.f74023e = iH;
            return (iH & 240) >> 4;
        }
    }

    private static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f74024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f74025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f74026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f74027d;

        public k(int i10, long j10, int i11, int i12) {
            this.f74024a = i10;
            this.f74025b = j10;
            this.f74026c = i11;
            this.f74027d = i12;
        }
    }

    static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f74028a;

        public l(d dVar) {
            this.f74028a = dVar;
        }

        public boolean b() {
            d dVar = this.f74028a;
            return dVar != null && dVar.f74005a.f74009a && this.f74028a.f74005a.f74010b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r22v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ib.w A(ib.t r36, r9.c.b r37, oa.e0 r38) throws n9.x {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.b.A(ib.t, r9.c$b, oa.e0):ib.w");
    }

    private static d B(d0 d0Var, int i10, int i11) throws n9.x {
        d0Var.W(i10 + 8);
        int iF = d0Var.f();
        while (iF - i10 < i11) {
            d0Var.W(iF);
            int iQ = d0Var.q();
            oa.u.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == 1937011305) {
                d0Var.X(4);
                int iH = d0Var.H();
                return new d(new g((iH & 1) == 1, (iH & 2) == 2, (iH & 8) == 8));
            }
            iF += iQ;
        }
        return null;
    }

    private static h C(d0 d0Var, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws n9.x {
        d0Var.W(12);
        int iQ = d0Var.q();
        h hVar = new h(iQ);
        for (int i12 = 0; i12 < iQ; i12++) {
            int iF = d0Var.f();
            int iQ2 = d0Var.q();
            oa.u.a(iQ2 > 0, "childAtomSize must be positive");
            int iQ3 = d0Var.q();
            if (iQ3 == 1635148593 || iQ3 == 1635148595 || iQ3 == 1701733238 || iQ3 == 1831958048 || iQ3 == 1836070006 || iQ3 == 1752589105 || iQ3 == 1751479857 || iQ3 == 1932670515 || iQ3 == 1211250227 || iQ3 == 1748121139 || iQ3 == 1987063864 || iQ3 == 1987063865 || iQ3 == 1635135537 || iQ3 == 1685479798 || iQ3 == 1685479729 || iQ3 == 1685481573 || iQ3 == 1685481521 || iQ3 == 1634760241) {
                K(d0Var, iQ3, iF, iQ2, i10, str, i11, drmInitData, hVar, i12);
            } else if (iQ3 == 1836069985 || iQ3 == 1701733217 || iQ3 == 1633889587 || iQ3 == 1700998451 || iQ3 == 1633889588 || iQ3 == 1835823201 || iQ3 == 1685353315 || iQ3 == 1685353317 || iQ3 == 1685353320 || iQ3 == 1685353324 || iQ3 == 1685353336 || iQ3 == 1935764850 || iQ3 == 1935767394 || iQ3 == 1819304813 || iQ3 == 1936684916 || iQ3 == 1953984371 || iQ3 == 778924082 || iQ3 == 778924083 || iQ3 == 1835557169 || iQ3 == 1835560241 || iQ3 == 1634492771 || iQ3 == 1634492791 || iQ3 == 1970037111 || iQ3 == 1332770163 || iQ3 == 1716281667 || iQ3 == 1767992678) {
                h(d0Var, iQ3, iF, iQ2, i10, str, z10, drmInitData, hVar, i12);
            } else if (iQ3 == 1414810956 || iQ3 == 1954034535 || iQ3 == 2004251764 || iQ3 == 1937010800 || iQ3 == 1664495672) {
                h hVar2 = hVar;
                D(d0Var, iQ3, iF, iQ2, i10, str, hVar2);
                hVar = hVar2;
            } else if (iQ3 == 1835365492) {
                u(d0Var, iQ3, iF, i10, hVar);
            } else if (iQ3 == 1667329389) {
                hVar.f74013b = new a.b().e0(i10).u0("application/x-camera-motion").N();
            }
            d0Var.W(iF + iQ2);
        }
        return hVar;
    }

    private static void D(d0 d0Var, int i10, int i11, int i12, int i13, String str, h hVar) {
        d0Var.W(i11 + 16);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = i12 - 16;
                byte[] bArr = new byte[i14];
                d0Var.l(bArr, 0, i14);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                hVar.f74015d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        hVar.f74013b = new a.b().e0(i13).u0(str2).j0(str).y0(j10).g0(immutableListOf).N();
    }

    private static k E(d0 d0Var) {
        long j10;
        int i10;
        int i11;
        d0Var.W(8);
        int iP = p(d0Var.q());
        d0Var.X(iP == 0 ? 8 : 16);
        int iQ = d0Var.q();
        d0Var.X(4);
        int iF = d0Var.f();
        int i12 = iP == 0 ? 4 : 8;
        int i13 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i13 >= i12) {
                d0Var.X(i12);
                break;
            }
            if (d0Var.e()[iF + i13] != -1) {
                long J = iP == 0 ? d0Var.J() : d0Var.O();
                if (J != 0) {
                    j10 = J;
                }
            } else {
                i13++;
            }
        }
        d0Var.X(10);
        long j11 = j10;
        int iP2 = d0Var.P();
        d0Var.X(4);
        int iQ2 = d0Var.q();
        int iQ3 = d0Var.q();
        d0Var.X(4);
        int iQ4 = d0Var.q();
        int iQ5 = d0Var.q();
        if (iQ2 == 0 && iQ3 == 65536 && iQ4 == -65536 && iQ5 == 0) {
            i11 = 90;
        } else if (iQ2 == 0 && iQ3 == -65536 && iQ4 == 65536 && iQ5 == 0) {
            i11 = 270;
        } else {
            if (iQ2 != -65536 || iQ3 != 0 || iQ4 != 0 || iQ5 != -65536) {
                i10 = 0;
                return new k(iQ, j11, iP2, i10);
            }
            i11 = 180;
        }
        i10 = i11;
        return new k(iQ, j11, iP2, i10);
    }

    public static t F(c.b bVar, c.C1181c c1181c, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws n9.x {
        long[] jArr;
        long[] jArr2;
        io.bidmachine.media3.common.a aVarN;
        c.b bVarD;
        Pair pairL;
        c.b bVar2 = (c.b) q9.a.e(bVar.d(1835297121));
        int iE = e(q(((c.C1181c) q9.a.e(bVar2.e(1751411826))).f99236b));
        if (iE == -1) {
            return null;
        }
        k kVarE = E(((c.C1181c) q9.a.e(bVar.e(1953196132))).f99236b);
        long j11 = j10 == -9223372036854775807L ? kVarE.f74025b : j10;
        long j12 = v(c1181c.f99236b).f99241c;
        long jC1 = j11 != -9223372036854775807L ? o0.c1(j11, 1000000L, j12) : -9223372036854775807L;
        c.b bVar3 = (c.b) q9.a.e(((c.b) q9.a.e(bVar2.d(1835626086))).d(1937007212));
        e eVarS = s(((c.C1181c) q9.a.e(bVar2.e(1835296868))).f99236b);
        c.C1181c c1181cE = bVar3.e(1937011556);
        if (c1181cE == null) {
            throw n9.x.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarC = C(c1181cE.f99236b, kVarE.f74024a, kVarE.f74027d, eVarS.f74008c, drmInitData, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairL = l(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairL.first;
            jArr2 = (long[]) pairL.second;
            jArr = jArr3;
        }
        if (hVarC.f74013b == null) {
            return null;
        }
        if (kVarE.f74026c != 0) {
            r9.b bVar4 = new r9.b(kVarE.f74026c);
            a.b bVarB = hVarC.f74013b.b();
            n9.v vVar = hVarC.f74013b.f80558l;
            aVarN = bVarB.n0(vVar != null ? vVar.a(bVar4) : new n9.v(bVar4)).N();
        } else {
            aVarN = hVarC.f74013b;
        }
        return new t(kVarE.f74024a, iE, eVarS.f74006a, j12, jC1, eVarS.f74007b, aVarN, hVarC.f74015d, hVarC.f74012a, hVarC.f74014c, jArr, jArr2);
    }

    public static List G(c.b bVar, e0 e0Var, long j10, DrmInitData drmInitData, boolean z10, boolean z11, Function function) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f99235d.size(); i10++) {
            c.b bVar2 = (c.b) bVar.f99235d.get(i10);
            if (bVar2.f99232a == 1953653099 && (tVar = (t) function.apply(F(bVar2, (c.C1181c) q9.a.e(bVar.e(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(A(tVar, (c.b) q9.a.e(((c.b) q9.a.e(((c.b) q9.a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), e0Var));
            }
        }
        return arrayList;
    }

    public static n9.v H(c.C1181c c1181c) {
        d0 d0Var = c1181c.f99236b;
        d0Var.W(8);
        n9.v vVar = new n9.v(new v.a[0]);
        while (d0Var.a() >= 8) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1835365473) {
                d0Var.W(iF);
                vVar = vVar.b(I(d0Var, iF + iQ));
            } else if (iQ2 == 1936553057) {
                d0Var.W(iF);
                vVar = vVar.b(r.b(d0Var, iF + iQ));
            } else if (iQ2 == -1451722374) {
                vVar = vVar.b(L(d0Var));
            }
            d0Var.W(iF + iQ);
        }
        return vVar;
    }

    private static n9.v I(d0 d0Var, int i10) {
        d0Var.X(8);
        f(d0Var);
        while (d0Var.f() < i10) {
            int iF = d0Var.f();
            int iQ = d0Var.q();
            if (d0Var.q() == 1768715124) {
                d0Var.W(iF);
                return r(d0Var, iF + iQ);
            }
            d0Var.W(iF + iQ);
        }
        return null;
    }

    static l J(d0 d0Var, int i10, int i11) throws n9.x {
        d0Var.W(i10 + 8);
        int iF = d0Var.f();
        d dVarB = null;
        while (iF - i10 < i11) {
            d0Var.W(iF);
            int iQ = d0Var.q();
            oa.u.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == 1702454643) {
                dVarB = B(d0Var, iF, iQ);
            }
            iF += iQ;
        }
        if (dVarB == null) {
            return null;
        }
        return new l(dVarB);
    }

    private static void K(d0 d0Var, int i10, int i11, int i12, int i13, String str, int i14, DrmInitData drmInitData, h hVar, int i15) throws n9.x {
        int i16;
        String str2;
        int i17;
        DrmInitData drmInitData2;
        List list;
        int i18;
        int i19;
        int i20;
        int i21;
        int iJ;
        int iK;
        f.k kVar;
        int i22;
        int i23;
        int i24;
        int i25 = i11;
        int i26 = i12;
        DrmInitData drmInitDataC = drmInitData;
        h hVar2 = hVar;
        d0Var.W(i25 + 16);
        d0Var.X(16);
        int iP = d0Var.P();
        int iP2 = d0Var.P();
        d0Var.X(50);
        int iF = d0Var.f();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairY = y(d0Var, i25, i26);
            if (pairY != null) {
                iIntValue = ((Integer) pairY.first).intValue();
                drmInitDataC = drmInitDataC == null ? null : drmInitDataC.c(((u) pairY.second).f74145b);
                hVar2.f74012a[i15] = (u) pairY.second;
            }
            d0Var.W(iF);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fW = 1.0f;
        int i27 = 8;
        int i28 = 8;
        List listOf = null;
        String str5 = null;
        byte[] bArrX = null;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int iJ2 = -1;
        int i32 = -1;
        int iK2 = -1;
        ByteBuffer byteBufferA = null;
        a aVarJ = null;
        c cVarM = null;
        f.k kVar2 = null;
        boolean z10 = false;
        while (iF - i25 < i26) {
            d0Var.W(iF);
            int iF2 = d0Var.f();
            int iQ = d0Var.q();
            if (iQ == 0 && d0Var.f() - i11 == i26) {
                break;
            }
            oa.u.a(iQ > 0, "childAtomSize must be positive");
            int iQ2 = d0Var.q();
            if (iQ2 == 1635148611) {
                oa.u.a(str4 == null, null);
                d0Var.W(iF2 + 8);
                oa.d dVarB = oa.d.b(d0Var);
                List list2 = dVarB.f96491a;
                hVar2.f74014c = dVarB.f96492b;
                if (!z10) {
                    fW = dVarB.f96501k;
                }
                String str6 = dVarB.f96502l;
                int i33 = dVarB.f96500j;
                int i34 = dVarB.f96497g;
                int i35 = dVarB.f96498h;
                listOf = list2;
                int i36 = dVarB.f96499i;
                int i37 = dVarB.f96495e;
                i16 = iF;
                i18 = iIntValue;
                str2 = str3;
                iJ2 = i34;
                i17 = i35;
                iK2 = i36;
                i28 = dVarB.f96496f;
                i27 = i37;
                str5 = str6;
                str4 = "video/avc";
                kVar = kVar2;
                drmInitData2 = drmInitDataC;
                i30 = i33;
            } else {
                i16 = iF;
                if (iQ2 == 1752589123) {
                    oa.u.a(str4 == null, null);
                    d0Var.W(iF2 + 8);
                    f0 f0VarA = f0.a(d0Var);
                    List list3 = f0VarA.f96530a;
                    hVar2.f74014c = f0VarA.f96531b;
                    if (!z10) {
                        fW = f0VarA.f96541l;
                    }
                    int i38 = f0VarA.f96542m;
                    int i39 = f0VarA.f96532c;
                    String str7 = f0VarA.f96543n;
                    int i40 = f0VarA.f96540k;
                    listOf = list3;
                    if (i40 != -1) {
                        i29 = i40;
                    }
                    int i41 = f0VarA.f96537h;
                    int i42 = f0VarA.f96538i;
                    int i43 = f0VarA.f96539j;
                    int i44 = f0VarA.f96535f;
                    int i45 = f0VarA.f96536g;
                    kVar = f0VarA.f96544o;
                    drmInitData2 = drmInitDataC;
                    i18 = iIntValue;
                    str2 = str3;
                    i17 = i42;
                    iJ2 = i41;
                    iK2 = i43;
                    i27 = i44;
                    i30 = i38;
                    i31 = i39;
                    str5 = str7;
                    i28 = i45;
                    str4 = "video/hevc";
                } else {
                    str2 = str3;
                    if (iQ2 == 1818785347) {
                        oa.u.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        f.k kVar3 = kVar2;
                        oa.u.a(kVar3 != null && kVar3.f99295b.size() >= 2, "must have at least two layers");
                        d0Var.W(iF2 + 8);
                        f0 f0VarC = f0.c(d0Var, (f.k) q9.a.e(kVar3));
                        oa.u.a(hVar2.f74014c == f0VarC.f96531b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i46 = f0VarC.f96537h;
                        int i47 = iJ2;
                        if (i46 != -1) {
                            oa.u.a(i47 == i46, "colorSpace must be the same for both views");
                        }
                        int i48 = f0VarC.f96538i;
                        int i49 = i32;
                        if (i48 != -1) {
                            oa.u.a(i49 == i48, "colorRange must be the same for both views");
                        }
                        int i50 = f0VarC.f96539j;
                        if (i50 != -1) {
                            int i51 = iK2;
                            i23 = i51;
                            oa.u.a(i51 == i50, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iK2;
                        }
                        oa.u.a(i27 == f0VarC.f96535f, "bitdepthLuma must be the same for both views");
                        oa.u.a(i28 == f0VarC.f96536g, "bitdepthChroma must be the same for both views");
                        List listBuild = listOf;
                        if (listBuild != null) {
                            listBuild = ImmutableList.builder().addAll((Iterable) listBuild).addAll((Iterable) f0VarC.f96530a).build();
                            i24 = i47;
                        } else {
                            i24 = i47;
                            oa.u.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        drmInitData2 = drmInitDataC;
                        i18 = iIntValue;
                        i17 = i49;
                        iJ2 = i24;
                        iK2 = i23;
                        str5 = f0VarC.f96543n;
                        kVar = kVar3;
                        listOf = listBuild;
                    } else {
                        List listH = listOf;
                        int i52 = iJ2;
                        i17 = i32;
                        int i53 = iK2;
                        f.k kVar4 = kVar2;
                        if (iQ2 == 1986361461) {
                            l lVarJ = J(d0Var, iF2, iQ);
                            if (lVarJ == null || lVarJ.f74028a == null) {
                                i22 = i29;
                                i29 = i22;
                                kVar = kVar4;
                                drmInitData2 = drmInitDataC;
                                listOf = listH;
                                i18 = iIntValue;
                                iJ2 = i52;
                                iK2 = i53;
                            } else if (kVar4 == null || kVar4.f99295b.size() < 2) {
                                i22 = i29;
                                if (i22 == -1) {
                                    i29 = lVarJ.f74028a.f74005a.f74011c ? 5 : 4;
                                } else {
                                    i29 = i22;
                                }
                                kVar = kVar4;
                                drmInitData2 = drmInitDataC;
                                listOf = listH;
                                i18 = iIntValue;
                                iJ2 = i52;
                                iK2 = i53;
                            } else {
                                oa.u.a(lVarJ.b(), "both eye views must be marked as available");
                                oa.u.a(!lVarJ.f74028a.f74005a.f74011c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i29;
                                i29 = i22;
                                kVar = kVar4;
                                drmInitData2 = drmInitDataC;
                                listOf = listH;
                                i18 = iIntValue;
                                iJ2 = i52;
                                iK2 = i53;
                            }
                            i26 = i12;
                            hVar2 = hVar;
                            iF = i16 + iQ;
                            iIntValue = i18;
                            drmInitDataC = drmInitData2;
                            str3 = str2;
                            i32 = i17;
                            kVar2 = kVar;
                            i25 = i11;
                        } else {
                            int i54 = i29;
                            if (iQ2 == 1685480259 || iQ2 == 1685485123) {
                                drmInitData2 = drmInitDataC;
                                list = listH;
                                i18 = iIntValue;
                                i19 = i54;
                                i20 = i28;
                                i21 = i27;
                                iJ = i52;
                                iK = i53;
                                oa.o oVarA = oa.o.a(d0Var);
                                if (oVarA != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = oVarA.f96617c;
                                }
                            } else if (iQ2 == 1987076931) {
                                oa.u.a(str4 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                d0Var.W(iF2 + 12);
                                byte bH = (byte) d0Var.H();
                                byte bH2 = (byte) d0Var.H();
                                int iH = d0Var.H();
                                i27 = iH >> 4;
                                i18 = iIntValue;
                                byte b10 = (byte) ((iH >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listH = q9.i.h(bH, bH2, (byte) i27, b10);
                                }
                                boolean z11 = (iH & 1) != 0;
                                int iH2 = d0Var.H();
                                int iH3 = d0Var.H();
                                iJ2 = n9.g.j(iH2);
                                int i55 = z11 ? 1 : 2;
                                iK2 = n9.g.k(iH3);
                                str4 = str8;
                                drmInitData2 = drmInitDataC;
                                i28 = i27;
                                i17 = i55;
                                kVar = kVar4;
                                listOf = listH;
                                i29 = i54;
                                i26 = i12;
                                hVar2 = hVar;
                                iF = i16 + iQ;
                                iIntValue = i18;
                                drmInitDataC = drmInitData2;
                                str3 = str2;
                                i32 = i17;
                                kVar2 = kVar;
                                i25 = i11;
                            } else {
                                i18 = iIntValue;
                                if (iQ2 == 1635135811) {
                                    int i56 = iQ - 8;
                                    byte[] bArr = new byte[i56];
                                    d0Var.l(bArr, 0, i56);
                                    listOf = ImmutableList.of(bArr);
                                    d0Var.W(iF2 + 8);
                                    n9.g gVarI = i(d0Var);
                                    int i57 = gVarI.f95311e;
                                    int i58 = gVarI.f95312f;
                                    int i59 = gVarI.f95307a;
                                    int i60 = gVarI.f95308b;
                                    iK2 = gVarI.f95309c;
                                    i27 = i57;
                                    drmInitData2 = drmInitDataC;
                                    i28 = i58;
                                    iJ2 = i59;
                                    i17 = i60;
                                    str4 = "video/av01";
                                    kVar = kVar4;
                                } else if (iQ2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(d0Var.D());
                                    byteBuffer.putShort(d0Var.D());
                                    byteBufferA = byteBuffer;
                                    drmInitData2 = drmInitDataC;
                                    listOf = listH;
                                    kVar = kVar4;
                                    iJ2 = i52;
                                    iK2 = i53;
                                } else if (iQ2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sD = d0Var.D();
                                    short sD2 = d0Var.D();
                                    short sD3 = d0Var.D();
                                    short sD4 = d0Var.D();
                                    int i61 = i28;
                                    short sD5 = d0Var.D();
                                    int i62 = i27;
                                    short sD6 = d0Var.D();
                                    drmInitData2 = drmInitDataC;
                                    short sD7 = d0Var.D();
                                    short sD8 = d0Var.D();
                                    long J = d0Var.J();
                                    long J2 = d0Var.J();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sD5);
                                    byteBuffer2.putShort(sD6);
                                    byteBuffer2.putShort(sD);
                                    byteBuffer2.putShort(sD2);
                                    byteBuffer2.putShort(sD3);
                                    byteBuffer2.putShort(sD4);
                                    byteBuffer2.putShort(sD7);
                                    byteBuffer2.putShort(sD8);
                                    byteBuffer2.putShort((short) (J / 10000));
                                    byteBuffer2.putShort((short) (J2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    kVar = kVar4;
                                    i28 = i61;
                                    i27 = i62;
                                    iJ2 = i52;
                                    iK2 = i53;
                                    listOf = listH;
                                    i29 = i54;
                                } else {
                                    drmInitData2 = drmInitDataC;
                                    list = listH;
                                    i19 = i54;
                                    i20 = i28;
                                    i21 = i27;
                                    if (iQ2 == 1681012275) {
                                        oa.u.a(str4 == null, null);
                                        kVar = kVar4;
                                        i28 = i20;
                                        i27 = i21;
                                        str4 = str2;
                                    } else if (iQ2 == 1702061171) {
                                        oa.u.a(str4 == null, null);
                                        cVarM = m(d0Var, iF2);
                                        String str9 = cVarM.f74001a;
                                        byte[] bArr2 = cVarM.f74002b;
                                        listOf = bArr2 != null ? ImmutableList.of(bArr2) : list;
                                        str4 = str9;
                                        kVar = kVar4;
                                        i28 = i20;
                                        i27 = i21;
                                        iJ2 = i52;
                                        iK2 = i53;
                                        i29 = i19;
                                    } else {
                                        if (iQ2 == 1651798644) {
                                            aVarJ = j(d0Var, iF2);
                                        } else if (iQ2 == 1885434736) {
                                            fW = w(d0Var, iF2);
                                            kVar = kVar4;
                                            i28 = i20;
                                            i27 = i21;
                                            iJ2 = i52;
                                            iK2 = i53;
                                            listOf = list;
                                            i29 = i19;
                                            z10 = true;
                                            i26 = i12;
                                            hVar2 = hVar;
                                            iF = i16 + iQ;
                                            iIntValue = i18;
                                            drmInitDataC = drmInitData2;
                                            str3 = str2;
                                            i32 = i17;
                                            kVar2 = kVar;
                                            i25 = i11;
                                        } else if (iQ2 == 1937126244) {
                                            bArrX = x(d0Var, iF2, iQ);
                                        } else if (iQ2 == 1936995172) {
                                            int iH4 = d0Var.H();
                                            d0Var.X(3);
                                            if (iH4 == 0) {
                                                int iH5 = d0Var.H();
                                                if (iH5 == 0) {
                                                    i19 = 0;
                                                } else if (iH5 == 1) {
                                                    i19 = 1;
                                                } else if (iH5 == 2) {
                                                    i19 = 2;
                                                } else if (iH5 == 3) {
                                                    i19 = 3;
                                                }
                                            }
                                        } else {
                                            if (iQ2 == 1634760259) {
                                                int i63 = iQ - 12;
                                                byte[] bArr3 = new byte[i63];
                                                d0Var.W(iF2 + 12);
                                                d0Var.l(bArr3, 0, i63);
                                                listOf = ImmutableList.of(bArr3);
                                                n9.g gVarG = g(new d0(bArr3));
                                                int i64 = gVarG.f95311e;
                                                int i65 = gVarG.f95312f;
                                                int i66 = gVarG.f95307a;
                                                int i67 = gVarG.f95308b;
                                                iK2 = gVarG.f95309c;
                                                i27 = i64;
                                                i28 = i65;
                                                iJ2 = i66;
                                                i17 = i67;
                                                str4 = "video/apv";
                                                kVar = kVar4;
                                                i29 = i19;
                                            } else if (iQ2 == 1668246642) {
                                                iJ = i52;
                                                iK = i53;
                                                if (iJ == -1 && iK == -1) {
                                                    int iQ3 = d0Var.q();
                                                    if (iQ3 == 1852009592 || iQ3 == 1852009571) {
                                                        int iP3 = d0Var.P();
                                                        int iP4 = d0Var.P();
                                                        d0Var.X(2);
                                                        boolean z12 = iQ == 19 && (d0Var.H() & 128) != 0;
                                                        iJ = n9.g.j(iP3);
                                                        int i68 = z12 ? 1 : 2;
                                                        iK = n9.g.k(iP4);
                                                        i17 = i68;
                                                    } else {
                                                        q9.u.h("BoxParsers", "Unsupported color type: " + r9.c.a(iQ3));
                                                    }
                                                }
                                            } else {
                                                iJ = i52;
                                                iK = i53;
                                            }
                                        }
                                        kVar = kVar4;
                                        i28 = i20;
                                        i27 = i21;
                                    }
                                    iJ2 = i52;
                                    iK2 = i53;
                                    listOf = list;
                                    i29 = i19;
                                }
                                i29 = i54;
                                i26 = i12;
                                hVar2 = hVar;
                                iF = i16 + iQ;
                                iIntValue = i18;
                                drmInitDataC = drmInitData2;
                                str3 = str2;
                                i32 = i17;
                                kVar2 = kVar;
                                i25 = i11;
                            }
                            i28 = i20;
                            i27 = i21;
                            listOf = list;
                            iJ2 = iJ;
                            iK2 = iK;
                            kVar = kVar4;
                            i29 = i19;
                            i26 = i12;
                            hVar2 = hVar;
                            iF = i16 + iQ;
                            iIntValue = i18;
                            drmInitDataC = drmInitData2;
                            str3 = str2;
                            i32 = i17;
                            kVar2 = kVar;
                            i25 = i11;
                        }
                    }
                }
                i26 = i12;
                hVar2 = hVar;
                iF = i16 + iQ;
                iIntValue = i18;
                drmInitDataC = drmInitData2;
                str3 = str2;
                i32 = i17;
                kVar2 = kVar;
                i25 = i11;
            }
            i26 = i12;
            hVar2 = hVar;
            iF = i16 + iQ;
            iIntValue = i18;
            drmInitDataC = drmInitData2;
            str3 = str2;
            i32 = i17;
            kVar2 = kVar;
            i25 = i11;
        }
        DrmInitData drmInitData3 = drmInitDataC;
        List list4 = listOf;
        int i69 = i29;
        int i70 = iJ2;
        int i71 = i32;
        int i72 = iK2;
        int i73 = i28;
        int i74 = i27;
        if (str4 == null) {
            return;
        }
        a.b bVarT = new a.b().e0(i13).u0(str4).S(str5).B0(iP).d0(iP2).q0(fW).t0(i14).r0(bArrX).x0(i69).g0(list4).l0(i30).m0(i31).Y(drmInitData3).j0(str).T(new g.b().d(i70).c(i71).e(i72).f(byteBufferA != null ? byteBufferA.array() : null).g(i74).b(i73).a());
        if (aVarJ != null) {
            bVarT.Q(Ints.saturatedCast(aVarJ.f73990a)).p0(Ints.saturatedCast(aVarJ.f73991b));
        } else if (cVarM != null) {
            bVarT.Q(Ints.saturatedCast(cVarM.f74003c)).p0(Ints.saturatedCast(cVarM.f74004d));
        }
        hVar.f74013b = bVarT.N();
    }

    private static n9.v L(d0 d0Var) {
        short sD = d0Var.D();
        d0Var.X(2);
        String strE = d0Var.E(sD);
        int iMax = Math.max(strE.lastIndexOf(43), strE.lastIndexOf(45));
        try {
            return new n9.v(new r9.d(Float.parseFloat(strE.substring(0, iMax)), Float.parseFloat(strE.substring(iMax, strE.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[o0.p(4, 0, length)] && jArr[o0.p(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static int c(d0 d0Var, int i10, int i11, int i12) throws n9.x {
        int iF = d0Var.f();
        oa.u.a(iF >= i11, null);
        while (iF - i11 < i12) {
            d0Var.W(iF);
            int iQ = d0Var.q();
            oa.u.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == i10) {
                return iF;
            }
            iF += iQ;
        }
        return -1;
    }

    private static String d(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int e(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void f(d0 d0Var) {
        int iF = d0Var.f();
        d0Var.X(4);
        if (d0Var.q() != 1751411826) {
            iF += 4;
        }
        d0Var.W(iF);
    }

    private static n9.g g(d0 d0Var) {
        g.b bVar = new g.b();
        c0 c0Var = new c0(d0Var.e());
        c0Var.p(d0Var.f() * 8);
        c0Var.s(1);
        int iH = c0Var.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            c0Var.s(1);
            int iH2 = c0Var.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                c0Var.r(6);
                boolean zG = c0Var.g();
                c0Var.q();
                c0Var.s(11);
                c0Var.r(4);
                int iH3 = c0Var.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                c0Var.s(1);
                if (zG) {
                    int iH4 = c0Var.h(8);
                    int iH5 = c0Var.h(8);
                    c0Var.s(1);
                    bVar.d(n9.g.j(iH4)).c(c0Var.g() ? 1 : 2).e(n9.g.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(q9.d0 r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, io.bidmachine.media3.common.DrmInitData r33, ib.b.h r34, int r35) throws n9.x {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.b.h(q9.d0, int, int, int, int, java.lang.String, boolean, io.bidmachine.media3.common.DrmInitData, ib.b$h, int):void");
    }

    private static n9.g i(d0 d0Var) {
        g.b bVar = new g.b();
        c0 c0Var = new c0(d0Var.e());
        c0Var.p(d0Var.f() * 8);
        c0Var.s(1);
        int iH = c0Var.h(3);
        c0Var.r(6);
        boolean zG = c0Var.g();
        boolean zG2 = c0Var.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        c0Var.r(13);
        c0Var.q();
        int iH2 = c0Var.h(4);
        if (iH2 != 1) {
            q9.u.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (c0Var.g()) {
            q9.u.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = c0Var.g();
        c0Var.q();
        if (zG3 && c0Var.h(8) > 127) {
            q9.u.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = c0Var.h(3);
        c0Var.q();
        if (c0Var.g()) {
            q9.u.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (c0Var.g()) {
            q9.u.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (c0Var.g()) {
            q9.u.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = c0Var.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            c0Var.r(12);
            if (c0Var.h(5) > 7) {
                c0Var.q();
            }
        }
        int iH5 = c0Var.h(4);
        int iH6 = c0Var.h(4);
        c0Var.r(iH5 + 1);
        c0Var.r(iH6 + 1);
        if (c0Var.g()) {
            c0Var.r(7);
        }
        c0Var.r(7);
        boolean zG4 = c0Var.g();
        if (zG4) {
            c0Var.r(2);
        }
        if ((c0Var.g() ? 2 : c0Var.h(1)) > 0 && !c0Var.g()) {
            c0Var.r(1);
        }
        if (zG4) {
            c0Var.r(3);
        }
        c0Var.r(3);
        boolean zG5 = c0Var.g();
        if (iH3 == 2 && zG5) {
            c0Var.q();
        }
        if (iH3 != 1 && c0Var.g()) {
            z10 = true;
        }
        if (c0Var.g()) {
            int iH7 = c0Var.h(8);
            int iH8 = c0Var.h(8);
            bVar.d(n9.g.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || c0Var.h(8) != 0) ? c0Var.h(1) : 1) != 1 ? 2 : 1).e(n9.g.k(iH8));
        }
        return bVar.a();
    }

    private static a j(d0 d0Var, int i10) {
        d0Var.W(i10 + 8);
        d0Var.X(4);
        return new a(d0Var.J(), d0Var.J());
    }

    static Pair k(d0 d0Var, int i10, int i11) throws n9.x {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strE = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            d0Var.W(i12);
            int iQ = d0Var.q();
            int iQ2 = d0Var.q();
            if (iQ2 == 1718775137) {
                numValueOf = Integer.valueOf(d0Var.q());
            } else if (iQ2 == 1935894637) {
                d0Var.X(4);
                strE = d0Var.E(4);
            } else if (iQ2 == 1935894633) {
                i13 = i12;
                i14 = iQ;
            }
            i12 += iQ;
        }
        if (!"cenc".equals(strE) && !"cbc1".equals(strE) && !"cens".equals(strE) && !"cbcs".equals(strE)) {
            return null;
        }
        oa.u.a(numValueOf != null, "frma atom is mandatory");
        oa.u.a(i13 != -1, "schi atom is mandatory");
        u uVarZ = z(d0Var, i13, i14, strE);
        oa.u.a(uVarZ != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) o0.i(uVarZ));
    }

    private static Pair l(c.b bVar) {
        c.C1181c c1181cE = bVar.e(1701606260);
        if (c1181cE == null) {
            return null;
        }
        d0 d0Var = c1181cE.f99236b;
        d0Var.W(8);
        int iP = p(d0Var.q());
        int iL = d0Var.L();
        long[] jArr = new long[iL];
        long[] jArr2 = new long[iL];
        for (int i10 = 0; i10 < iL; i10++) {
            jArr[i10] = iP == 1 ? d0Var.O() : d0Var.J();
            jArr2[i10] = iP == 1 ? d0Var.A() : d0Var.q();
            if (d0Var.D() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            d0Var.X(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static c m(d0 d0Var, int i10) {
        d0Var.W(i10 + 12);
        d0Var.X(1);
        n(d0Var);
        d0Var.X(2);
        int iH = d0Var.H();
        if ((iH & 128) != 0) {
            d0Var.X(2);
        }
        if ((iH & 64) != 0) {
            d0Var.X(d0Var.H());
        }
        if ((iH & 32) != 0) {
            d0Var.X(2);
        }
        d0Var.X(1);
        n(d0Var);
        String strH = n9.w.h(d0Var.H());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        d0Var.X(4);
        long J = d0Var.J();
        long J2 = d0Var.J();
        d0Var.X(1);
        int iN = n(d0Var);
        long j10 = J2;
        byte[] bArr = new byte[iN];
        d0Var.l(bArr, 0, iN);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new c(strH, bArr, j10, J > 0 ? J : -1L);
    }

    private static int n(d0 d0Var) {
        int iH = d0Var.H();
        int i10 = iH & 127;
        while ((iH & 128) == 128) {
            iH = d0Var.H();
            i10 = (i10 << 7) | (iH & 127);
        }
        return i10;
    }

    public static int o(int i10) {
        return i10 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int p(int i10) {
        return (i10 >> 24) & 255;
    }

    private static int q(d0 d0Var) {
        d0Var.W(16);
        return d0Var.q();
    }

    private static n9.v r(d0 d0Var, int i10) {
        d0Var.X(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var.f() < i10) {
            v.a aVarD = ib.j.d(d0Var);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n9.v(arrayList);
    }

    private static e s(d0 d0Var) {
        long j10;
        d0Var.W(8);
        int iP = p(d0Var.q());
        d0Var.X(iP == 0 ? 8 : 16);
        long J = d0Var.J();
        int iF = d0Var.f();
        int i10 = iP == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                d0Var.X(i10);
                break;
            }
            if (d0Var.e()[iF + i11] != -1) {
                long J2 = iP == 0 ? d0Var.J() : d0Var.O();
                if (J2 != 0) {
                    long jC1 = o0.c1(J2, 1000000L, J);
                    J = J;
                    j10 = jC1;
                }
            } else {
                i11++;
            }
        }
        return new e(J, j10, d(d0Var.P()));
    }

    public static n9.v t(c.b bVar) {
        c.C1181c c1181cE = bVar.e(1751411826);
        c.C1181c c1181cE2 = bVar.e(1801812339);
        c.C1181c c1181cE3 = bVar.e(1768715124);
        if (c1181cE == null || c1181cE2 == null || c1181cE3 == null || q(c1181cE.f99236b) != 1835299937) {
            return null;
        }
        d0 d0Var = c1181cE2.f99236b;
        d0Var.W(12);
        int iQ = d0Var.q();
        String[] strArr = new String[iQ];
        for (int i10 = 0; i10 < iQ; i10++) {
            int iQ2 = d0Var.q();
            d0Var.X(4);
            strArr[i10] = d0Var.E(iQ2 - 8);
        }
        d0 d0Var2 = c1181cE3.f99236b;
        d0Var2.W(8);
        ArrayList arrayList = new ArrayList();
        while (d0Var2.a() > 8) {
            int iF = d0Var2.f();
            int iQ3 = d0Var2.q();
            int iQ4 = d0Var2.q() - 1;
            if (iQ4 < 0 || iQ4 >= iQ) {
                q9.u.h("BoxParsers", "Skipped metadata with unknown key index: " + iQ4);
            } else {
                r9.a aVarI = ib.j.i(d0Var2, iF + iQ3, strArr[iQ4]);
                if (aVarI != null) {
                    arrayList.add(aVarI);
                }
            }
            d0Var2.W(iF + iQ3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n9.v(arrayList);
    }

    private static void u(d0 d0Var, int i10, int i11, int i12, h hVar) {
        d0Var.W(i11 + 16);
        if (i10 == 1835365492) {
            d0Var.B();
            String strB = d0Var.B();
            if (strB != null) {
                hVar.f74013b = new a.b().e0(i12).u0(strB).N();
            }
        }
    }

    public static r9.e v(d0 d0Var) {
        long jA;
        long jA2;
        d0Var.W(8);
        if (p(d0Var.q()) == 0) {
            jA = d0Var.J();
            jA2 = d0Var.J();
        } else {
            jA = d0Var.A();
            jA2 = d0Var.A();
        }
        return new r9.e(jA, jA2, d0Var.J());
    }

    private static float w(d0 d0Var, int i10) {
        d0Var.W(i10 + 8);
        return d0Var.L() / d0Var.L();
    }

    private static byte[] x(d0 d0Var, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            d0Var.W(i12);
            int iQ = d0Var.q();
            if (d0Var.q() == 1886547818) {
                return Arrays.copyOfRange(d0Var.e(), i12, iQ + i12);
            }
            i12 += iQ;
        }
        return null;
    }

    private static Pair y(d0 d0Var, int i10, int i11) throws n9.x {
        Pair pairK;
        int iF = d0Var.f();
        while (iF - i10 < i11) {
            d0Var.W(iF);
            int iQ = d0Var.q();
            oa.u.a(iQ > 0, "childAtomSize must be positive");
            if (d0Var.q() == 1936289382 && (pairK = k(d0Var, iF, iQ)) != null) {
                return pairK;
            }
            iF += iQ;
        }
        return null;
    }

    private static u z(d0 d0Var, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            d0Var.W(i14);
            int iQ = d0Var.q();
            if (d0Var.q() == 1952804451) {
                int iP = p(d0Var.q());
                d0Var.X(1);
                if (iP == 0) {
                    d0Var.X(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iH = d0Var.H();
                    i12 = iH & 15;
                    i13 = (iH & 240) >> 4;
                }
                boolean z10 = d0Var.H() == 1;
                int iH2 = d0Var.H();
                byte[] bArr2 = new byte[16];
                d0Var.l(bArr2, 0, 16);
                if (z10 && iH2 == 0) {
                    int iH3 = d0Var.H();
                    bArr = new byte[iH3];
                    d0Var.l(bArr, 0, iH3);
                }
                return new u(z10, str, iH2, bArr2, i13, i12, bArr);
            }
            i14 += iQ;
        }
    }
}
