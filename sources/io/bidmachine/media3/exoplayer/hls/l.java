package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import ga.b0;
import ga.b1;
import ga.c1;
import ga.d1;
import ga.m1;
import ga.n0;
import ga.y;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.a;
import io.bidmachine.media3.exoplayer.hls.c;
import io.bidmachine.media3.exoplayer.l1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.m;
import ka.o;
import n9.f0;
import n9.v;
import n9.x;
import oa.n;
import oa.r0;
import oa.s0;
import oa.t;
import q9.d0;
import q9.o0;
import u9.m0;
import z9.u;
import z9.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes12.dex */
public final class l implements o.b, o.f, d1, t, b1.d {
    private static final Set Z = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private s0 A;
    private int B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private io.bidmachine.media3.common.a G;
    private io.bidmachine.media3.common.a H;
    private boolean I;
    private m1 J;
    private Set K;
    private int[] L;
    private int M;
    private boolean N;
    private boolean[] O;
    private boolean[] P;
    private long Q;
    private long R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private long W;
    private DrmInitData X;
    private e Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f81030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f81031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f81032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.hls.c f81033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ka.b f81034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f81035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f81036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final u.a f81037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final m f81038j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final n0.a f81040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f81041m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ArrayList f81043o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f81044p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f81045q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Runnable f81046r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f81047s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f81048t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Map f81049u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ha.e f81050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d[] f81051w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Set f81053y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private SparseIntArray f81054z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o f81039k = new o("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c.b f81042n = new c.b();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int[] f81052x = new int[0];

    public interface b extends d1.a {
        void onPlaylistRefreshRequired(Uri uri);

        void onPrepared();
    }

    private static class c implements s0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final io.bidmachine.media3.common.a f81055g = new a.b().u0("application/id3").N();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final io.bidmachine.media3.common.a f81056h = new a.b().u0("application/x-emsg").N();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final za.b f81057a = new za.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s0 f81058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.media3.common.a f81059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private io.bidmachine.media3.common.a f81060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f81061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f81062f;

        public c(s0 s0Var, int i10) {
            this.f81058b = s0Var;
            if (i10 == 1) {
                this.f81059c = f81055g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                this.f81059c = f81056h;
            }
            this.f81061e = new byte[0];
            this.f81062f = 0;
        }

        private boolean h(za.a aVar) {
            io.bidmachine.media3.common.a wrappedMetadataFormat = aVar.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && Objects.equals(this.f81059c.f80561o, wrappedMetadataFormat.f80561o);
        }

        private void i(int i10) {
            byte[] bArr = this.f81061e;
            if (bArr.length < i10) {
                this.f81061e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        private d0 j(int i10, int i11) {
            int i12 = this.f81062f - i11;
            d0 d0Var = new d0(Arrays.copyOfRange(this.f81061e, i12 - i10, i12));
            byte[] bArr = this.f81061e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f81062f = i11;
            return d0Var;
        }

        @Override // oa.s0
        public void a(d0 d0Var, int i10, int i11) {
            i(this.f81062f + i10);
            d0Var.l(this.f81061e, this.f81062f, i10);
            this.f81062f += i10;
        }

        @Override // oa.s0
        public /* synthetic */ int b(n9.h hVar, int i10, boolean z10) {
            return r0.b(this, hVar, i10, z10);
        }

        @Override // oa.s0
        public /* synthetic */ void c(d0 d0Var, int i10) {
            r0.c(this, d0Var, i10);
        }

        @Override // oa.s0
        public /* synthetic */ void d(long j10) {
            r0.a(this, j10);
        }

        @Override // oa.s0
        public void e(long j10, int i10, int i11, int i12, s0.a aVar) {
            q9.a.e(this.f81060d);
            d0 d0VarJ = j(i11, i12);
            if (!Objects.equals(this.f81060d.f80561o, this.f81059c.f80561o)) {
                if (!"application/x-emsg".equals(this.f81060d.f80561o)) {
                    q9.u.h("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f81060d.f80561o);
                    return;
                }
                za.a aVarC = this.f81057a.c(d0VarJ);
                if (!h(aVarC)) {
                    q9.u.h("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f81059c.f80561o, aVarC.getWrappedMetadataFormat()));
                    return;
                }
                d0VarJ = new d0((byte[]) q9.a.e(aVarC.getWrappedMetadataBytes()));
            }
            int iA = d0VarJ.a();
            this.f81058b.c(d0VarJ, iA);
            this.f81058b.e(j10, i10, iA, 0, aVar);
        }

        @Override // oa.s0
        public void f(io.bidmachine.media3.common.a aVar) {
            this.f81060d = aVar;
            this.f81058b.f(this.f81059c);
        }

        @Override // oa.s0
        public int g(n9.h hVar, int i10, boolean z10, int i11) throws EOFException {
            i(this.f81062f + i10);
            int i12 = hVar.read(this.f81061e, this.f81062f, i10);
            if (i12 != -1) {
                this.f81062f += i12;
                return i12;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
    }

    private static final class d extends b1 {
        private final Map H;
        private DrmInitData I;

        private v j0(v vVar) {
            if (vVar == null) {
                return null;
            }
            int iE = vVar.e();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= iE) {
                    i11 = -1;
                    break;
                }
                v.a aVarD = vVar.d(i11);
                if ((aVarD instanceof cb.m) && "com.apple.streaming.transportStreamTimestamp".equals(((cb.m) aVarD).f6676b)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return vVar;
            }
            if (iE == 1) {
                return null;
            }
            v.a[] aVarArr = new v.a[iE - 1];
            while (i10 < iE) {
                if (i10 != i11) {
                    aVarArr[i10 < i11 ? i10 : i10 - 1] = vVar.d(i10);
                }
                i10++;
            }
            return new v(aVarArr);
        }

        @Override // ga.b1, oa.s0
        public void e(long j10, int i10, int i11, int i12, s0.a aVar) {
            super.e(j10, i10, i11, i12, aVar);
        }

        public void k0(DrmInitData drmInitData) {
            this.I = drmInitData;
            L();
        }

        public void l0(e eVar) {
            h0(eVar.f80981k);
        }

        @Override // ga.b1
        public io.bidmachine.media3.common.a z(io.bidmachine.media3.common.a aVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = aVar.f80565s;
            }
            if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.f80509d)) != null) {
                drmInitData2 = drmInitData;
            }
            v vVarJ0 = j0(aVar.f80558l);
            if (drmInitData2 != aVar.f80565s || vVarJ0 != aVar.f80558l) {
                aVar = aVar.b().Y(drmInitData2).n0(vVarJ0).N();
            }
            return super.z(aVar);
        }

        private d(ka.b bVar, w wVar, u.a aVar, Map map) {
            super(bVar, wVar, aVar);
            this.H = map;
        }
    }

    public l(String str, int i10, b bVar, io.bidmachine.media3.exoplayer.hls.c cVar, Map map, ka.b bVar2, long j10, io.bidmachine.media3.common.a aVar, w wVar, u.a aVar2, m mVar, n0.a aVar3, int i11) {
        this.f81030b = str;
        this.f81031c = i10;
        this.f81032d = bVar;
        this.f81033e = cVar;
        this.f81049u = map;
        this.f81034f = bVar2;
        this.f81035g = aVar;
        this.f81036h = wVar;
        this.f81037i = aVar2;
        this.f81038j = mVar;
        this.f81040l = aVar3;
        this.f81041m = i11;
        Set set = Z;
        this.f81053y = new HashSet(set.size());
        this.f81054z = new SparseIntArray(set.size());
        this.f81051w = new d[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f81043o = arrayList;
        this.f81044p = DesugarCollections.unmodifiableList(arrayList);
        this.f81048t = new ArrayList();
        this.f81045q = new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f81028b.J();
            }
        };
        this.f81046r = new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f81029b.T();
            }
        };
        this.f81047s = o0.A();
        this.Q = j10;
        this.R = j10;
    }

    private e A() {
        return (e) this.f81043o.get(r0.size() - 1);
    }

    private s0 B(int i10, int i11) {
        q9.a.a(Z.contains(Integer.valueOf(i11)));
        int i12 = this.f81054z.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f81053y.add(Integer.valueOf(i11))) {
            this.f81052x[i12] = i10;
        }
        return this.f81052x[i12] == i10 ? this.f81051w[i12] : s(i10, i11);
    }

    private static int C(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    private void D(e eVar) {
        this.Y = eVar;
        this.G = eVar.f73007d;
        this.R = -9223372036854775807L;
        this.f81043o.add(eVar);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (d dVar : this.f81051w) {
            builder.add(Integer.valueOf(dVar.J()));
        }
        eVar.l(this, builder.build());
        for (d dVar2 : this.f81051w) {
            dVar2.l0(eVar);
            if (eVar.f80984n) {
                dVar2.i0();
            }
        }
    }

    private static boolean E(ha.e eVar) {
        return eVar instanceof e;
    }

    private boolean F() {
        return this.R != -9223372036854775807L;
    }

    private void I() {
        int i10 = this.J.f72380a;
        int[] iArr = new int[i10];
        this.L = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f81051w;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (z((io.bidmachine.media3.common.a) q9.a.i(dVarArr[i12].I()), this.J.b(i11).a(0))) {
                    this.L[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator it = this.f81048t.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (!this.I && this.L == null && this.D) {
            for (d dVar : this.f81051w) {
                if (dVar.I() == null) {
                    return;
                }
            }
            if (this.J != null) {
                I();
                return;
            }
            p();
            c0();
            this.f81032d.onPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.D = true;
        J();
    }

    private void X() {
        for (d dVar : this.f81051w) {
            dVar.Y(this.S);
        }
        this.S = false;
    }

    private boolean Y(long j10, e eVar) {
        int length = this.f81051w.length;
        for (int i10 = 0; i10 < length; i10++) {
            d dVar = this.f81051w[i10];
            if (!(eVar != null ? dVar.a0(eVar.k(i10)) : dVar.b0(j10, false)) && (this.P[i10] || !this.N)) {
                return false;
            }
        }
        return true;
    }

    private void c0() {
        this.E = true;
    }

    private void h0(c1[] c1VarArr) {
        this.f81048t.clear();
        for (c1 c1Var : c1VarArr) {
            if (c1Var != null) {
                this.f81048t.add((h) c1Var);
            }
        }
    }

    private void n() {
        q9.a.g(this.E);
        q9.a.e(this.J);
        q9.a.e(this.K);
    }

    private void p() {
        io.bidmachine.media3.common.a aVar;
        int length = this.f81051w.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((io.bidmachine.media3.common.a) q9.a.i(this.f81051w[i12].I())).f80561o;
            int i13 = n9.w.t(str) ? 2 : n9.w.o(str) ? 1 : n9.w.s(str) ? 3 : -2;
            if (C(i13) > C(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        f0 f0VarK = this.f81033e.k();
        int i14 = f0VarK.f95294a;
        this.M = -1;
        this.L = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.L[i15] = i15;
        }
        f0[] f0VarArr = new f0[length];
        int i16 = 0;
        while (i16 < length) {
            io.bidmachine.media3.common.a aVar2 = (io.bidmachine.media3.common.a) q9.a.i(this.f81051w[i16].I());
            if (i16 == i11) {
                io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    io.bidmachine.media3.common.a aVarA = f0VarK.a(i17);
                    if (i10 == 1 && (aVar = this.f81035g) != null) {
                        aVarA = aVarA.i(aVar);
                    }
                    aVarArr[i17] = i14 == 1 ? aVar2.i(aVarA) : v(aVarA, aVar2, true);
                }
                f0VarArr[i16] = new f0(this.f81030b, aVarArr);
                this.M = i16;
            } else {
                io.bidmachine.media3.common.a aVar3 = (i10 == 2 && n9.w.o(aVar2.f80561o)) ? this.f81035g : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f81030b);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                f0VarArr[i16] = new f0(sb2.toString(), v(aVar3, aVar2, false));
            }
            i16++;
        }
        this.J = u(f0VarArr);
        q9.a.g(this.K == null);
        this.K = Collections.EMPTY_SET;
    }

    private boolean q(int i10) {
        for (int i11 = i10; i11 < this.f81043o.size(); i11++) {
            if (((e) this.f81043o.get(i11)).f80984n) {
                return false;
            }
        }
        e eVar = (e) this.f81043o.get(i10);
        for (int i12 = 0; i12 < this.f81051w.length; i12++) {
            if (this.f81051w[i12].F() > eVar.k(i12)) {
                return false;
            }
        }
        return true;
    }

    private static n s(int i10, int i11) {
        q9.u.h("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new n();
    }

    private b1 t(int i10, int i11) {
        int length = this.f81051w.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f81034f, this.f81036h, this.f81037i, this.f81049u);
        dVar.d0(this.Q);
        if (z10) {
            dVar.k0(this.X);
        }
        dVar.c0(this.W);
        e eVar = this.Y;
        if (eVar != null) {
            dVar.l0(eVar);
        }
        dVar.f0(this);
        int i12 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.f81052x, i12);
        this.f81052x = iArrCopyOf;
        iArrCopyOf[length] = i10;
        this.f81051w = (d[]) o0.T0(this.f81051w, dVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.P, i12);
        this.P = zArrCopyOf;
        zArrCopyOf[length] = z10;
        this.N |= z10;
        this.f81053y.add(Integer.valueOf(i11));
        this.f81054z.append(i11, length);
        if (C(i11) > C(this.B)) {
            this.C = length;
            this.B = i11;
        }
        this.O = Arrays.copyOf(this.O, i12);
        return dVar;
    }

    private m1 u(f0[] f0VarArr) {
        for (int i10 = 0; i10 < f0VarArr.length; i10++) {
            f0 f0Var = f0VarArr[i10];
            io.bidmachine.media3.common.a[] aVarArr = new io.bidmachine.media3.common.a[f0Var.f95294a];
            for (int i11 = 0; i11 < f0Var.f95294a; i11++) {
                io.bidmachine.media3.common.a aVarA = f0Var.a(i11);
                aVarArr[i11] = aVarA.c(this.f81036h.d(aVarA));
            }
            f0VarArr[i10] = new f0(f0Var.f95295b, aVarArr);
        }
        return new m1(f0VarArr);
    }

    private static io.bidmachine.media3.common.a v(io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2, boolean z10) {
        String strD;
        String strG;
        if (aVar == null) {
            return aVar2;
        }
        int iK = n9.w.k(aVar2.f80561o);
        if (o0.R(aVar.f80557k, iK) == 1) {
            strD = o0.S(aVar.f80557k, iK);
            strG = n9.w.g(strD);
        } else {
            strD = n9.w.d(aVar.f80557k, aVar2.f80561o);
            strG = aVar2.f80561o;
        }
        a.b bVarS = aVar2.b().f0(aVar.f80547a).h0(aVar.f80548b).i0(aVar.f80549c).j0(aVar.f80550d).w0(aVar.f80551e).s0(aVar.f80552f).Q(z10 ? aVar.f80554h : -1).p0(z10 ? aVar.f80555i : -1).S(strD);
        if (iK == 2) {
            bVarS.B0(aVar.f80568v).d0(aVar.f80569w).b0(aVar.f80570x);
        }
        if (strG != null) {
            bVarS.u0(strG);
        }
        int i10 = aVar.E;
        if (i10 != -1 && iK == 1) {
            bVarS.R(i10);
        }
        v vVarB = aVar.f80558l;
        if (vVarB != null) {
            v vVar = aVar2.f80558l;
            if (vVar != null) {
                vVarB = vVar.b(vVarB);
            }
            bVarS.n0(vVarB);
        }
        return bVarS.N();
    }

    private void w(int i10) {
        q9.a.g(!this.f81039k.i());
        while (true) {
            if (i10 >= this.f81043o.size()) {
                i10 = -1;
                break;
            } else if (q(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = A().f73011h;
        e eVarX = x(i10);
        if (this.f81043o.isEmpty()) {
            this.R = this.Q;
        } else {
            ((e) Iterables.getLast(this.f81043o)).m();
        }
        this.U = false;
        this.f81040l.y(this.B, eVarX.f73010g, j10);
    }

    private e x(int i10) {
        e eVar = (e) this.f81043o.get(i10);
        ArrayList arrayList = this.f81043o;
        o0.a1(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f81051w.length; i11++) {
            this.f81051w[i11].w(eVar.k(i11));
        }
        return eVar;
    }

    private boolean y(e eVar) {
        int i10 = eVar.f80981k;
        int length = this.f81051w.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.O[i11] && this.f81051w[i11].S() == i10) {
                return false;
            }
        }
        return true;
    }

    private static boolean z(io.bidmachine.media3.common.a aVar, io.bidmachine.media3.common.a aVar2) {
        String str = aVar.f80561o;
        String str2 = aVar2.f80561o;
        int iK = n9.w.k(str);
        if (iK != 3) {
            return iK == n9.w.k(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || aVar.J == aVar2.J;
        }
        return false;
    }

    public boolean G(int i10) {
        return !F() && this.f81051w[i10].N(this.U);
    }

    public boolean H() {
        return this.B == 2;
    }

    public void K() {
        this.f81039k.maybeThrowError();
        this.f81033e.p();
    }

    public void L(int i10) {
        K();
        this.f81051w[i10].P();
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void h(ha.e eVar, long j10, long j11, boolean z10) {
        this.f81050v = null;
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a());
        this.f81038j.onLoadTaskConcluded(eVar.f73004a);
        this.f81040l.m(yVar, eVar.f73006c, this.f81031c, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h);
        if (z10) {
            return;
        }
        if (F() || this.F == 0) {
            X();
        }
        if (this.F > 0) {
            this.f81032d.d(this);
        }
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void f(ha.e eVar, long j10, long j11) {
        this.f81050v = null;
        this.f81033e.r(eVar);
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a());
        this.f81038j.onLoadTaskConcluded(eVar.f73004a);
        this.f81040l.p(yVar, eVar.f73006c, this.f81031c, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h);
        if (this.E) {
            this.f81032d.d(this);
        } else {
            a(new l1.b().f(this.Q).d());
        }
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public o.c g(ha.e eVar, long j10, long j11, IOException iOException, int i10) {
        o.c cVarG;
        int i11;
        boolean zE = E(eVar);
        if (zE && !((e) eVar).o() && (iOException instanceof s9.t) && ((i11 = ((s9.t) iOException).f99887e) == 410 || i11 == 404)) {
            return o.f93113d;
        }
        long jA = eVar.a();
        y yVar = new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, jA);
        m.c cVar = new m.c(yVar, new b0(eVar.f73006c, this.f81031c, eVar.f73007d, eVar.f73008e, eVar.f73009f, o0.q1(eVar.f73010g), o0.q1(eVar.f73011h)), iOException, i10);
        m.b bVarA = this.f81038j.a(ja.v.c(this.f81033e.l()), cVar);
        boolean zO = (bVarA == null || bVarA.f93107a != 2) ? false : this.f81033e.o(eVar, bVarA.f93108b);
        if (zO) {
            if (zE && jA == 0) {
                ArrayList arrayList = this.f81043o;
                q9.a.g(((e) arrayList.remove(arrayList.size() - 1)) == eVar);
                if (this.f81043o.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((e) Iterables.getLast(this.f81043o)).m();
                }
            }
            cVarG = o.f93115f;
        } else {
            long jB = this.f81038j.b(cVar);
            cVarG = jB != -9223372036854775807L ? o.g(false, jB) : o.f93116g;
        }
        o.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f81040l.r(yVar, eVar.f73006c, this.f81031c, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h, iOException, !zC);
        if (!zC) {
            this.f81050v = null;
            this.f81038j.onLoadTaskConcluded(eVar.f73004a);
        }
        if (zO) {
            if (!this.E) {
                a(new l1.b().f(this.Q).d());
                return cVar2;
            }
            this.f81032d.d(this);
        }
        return cVar2;
    }

    @Override // ka.o.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void i(ha.e eVar, long j10, long j11, int i10) {
        this.f81040l.v(i10 == 0 ? new y(eVar.f73004a, eVar.f73005b, j10) : new y(eVar.f73004a, eVar.f73005b, eVar.d(), eVar.c(), j10, j11, eVar.a()), eVar.f73006c, this.f81031c, eVar.f73007d, eVar.f73008e, eVar.f73009f, eVar.f73010g, eVar.f73011h, i10);
    }

    public void Q() {
        this.f81053y.clear();
    }

    public boolean R(Uri uri, m.c cVar, boolean z10) {
        m.b bVarA;
        if (!this.f81033e.q(uri)) {
            return true;
        }
        long j10 = (z10 || (bVarA = this.f81038j.a(ja.v.c(this.f81033e.l()), cVar)) == null || bVarA.f93107a != 2) ? -9223372036854775807L : bVarA.f93108b;
        return this.f81033e.s(uri, j10) && j10 != -9223372036854775807L;
    }

    public void S() {
        if (this.f81043o.isEmpty()) {
            return;
        }
        final e eVar = (e) Iterables.getLast(this.f81043o);
        int iD = this.f81033e.d(eVar);
        if (iD == 1) {
            eVar.t();
            return;
        }
        if (iD == 0) {
            this.f81047s.post(new Runnable() { // from class: io.bidmachine.media3.exoplayer.hls.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81026b.f81032d.onPlaylistRefreshRequired(eVar.f80983m);
                }
            });
        } else if (iD == 2 && !this.U && this.f81039k.i()) {
            this.f81039k.e();
        }
    }

    public void U(f0[] f0VarArr, int i10, int... iArr) {
        this.J = u(f0VarArr);
        this.K = new HashSet();
        for (int i11 : iArr) {
            this.K.add(this.J.b(i11));
        }
        this.M = i10;
        Handler handler = this.f81047s;
        final b bVar = this.f81032d;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: aa.g
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onPrepared();
            }
        });
        c0();
    }

    public int V(int i10, u9.d0 d0Var, t9.f fVar, int i11) {
        if (F()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f81043o.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f81043o.size() - 1 && y((e) this.f81043o.get(i13))) {
                i13++;
            }
            o0.a1(this.f81043o, 0, i13);
            e eVar = (e) this.f81043o.get(0);
            io.bidmachine.media3.common.a aVar = eVar.f73007d;
            if (!aVar.equals(this.H)) {
                this.f81040l.j(this.f81031c, aVar, eVar.f73008e, eVar.f73009f, eVar.f73010g);
            }
            this.H = aVar;
        }
        if (!this.f81043o.isEmpty() && !((e) this.f81043o.get(0)).o()) {
            return -3;
        }
        int iU = this.f81051w[i10].U(d0Var, fVar, i11, this.U);
        if (iU == -5) {
            io.bidmachine.media3.common.a aVarI = (io.bidmachine.media3.common.a) q9.a.e(d0Var.f105308b);
            if (i10 == this.C) {
                int iCheckedCast = Ints.checkedCast(this.f81051w[i10].S());
                while (i12 < this.f81043o.size() && ((e) this.f81043o.get(i12)).f80981k != iCheckedCast) {
                    i12++;
                }
                aVarI = aVarI.i(i12 < this.f81043o.size() ? ((e) this.f81043o.get(i12)).f73007d : (io.bidmachine.media3.common.a) q9.a.e(this.G));
            }
            d0Var.f105308b = aVarI;
        }
        return iU;
    }

    public void W() {
        if (this.E) {
            for (d dVar : this.f81051w) {
                dVar.T();
            }
        }
        this.f81033e.t();
        this.f81039k.l(this);
        this.f81047s.removeCallbacksAndMessages(null);
        this.I = true;
        this.f81048t.clear();
    }

    public boolean Z(long j10, boolean z10) {
        e eVar;
        this.Q = j10;
        if (F()) {
            this.R = j10;
            return true;
        }
        if (this.f81033e.m()) {
            for (int i10 = 0; i10 < this.f81043o.size(); i10++) {
                eVar = (e) this.f81043o.get(i10);
                if (eVar.f73010g == j10) {
                    break;
                }
            }
            eVar = null;
        } else {
            eVar = null;
        }
        if (this.D && !z10 && Y(j10, eVar)) {
            return false;
        }
        this.R = j10;
        this.U = false;
        this.f81043o.clear();
        if (this.f81039k.i()) {
            if (this.D) {
                for (d dVar : this.f81051w) {
                    dVar.s();
                }
            }
            this.f81039k.e();
        } else {
            this.f81039k.f();
            X();
        }
        return true;
    }

    @Override // ga.d1
    public boolean a(l1 l1Var) {
        List list;
        long jMax;
        if (this.U || this.f81039k.i() || this.f81039k.h()) {
            return false;
        }
        if (F()) {
            list = Collections.EMPTY_LIST;
            jMax = this.R;
            for (d dVar : this.f81051w) {
                dVar.d0(this.R);
            }
        } else {
            list = this.f81044p;
            e eVarA = A();
            jMax = eVarA.f() ? eVarA.f73011h : Math.max(this.Q, eVarA.f73010g);
        }
        List list2 = list;
        long j10 = jMax;
        this.f81042n.a();
        this.f81033e.f(l1Var, j10, list2, this.E || !list2.isEmpty(), this.f81042n);
        c.b bVar = this.f81042n;
        boolean z10 = bVar.f80969b;
        ha.e eVar = bVar.f80968a;
        Uri uri = bVar.f80970c;
        if (z10) {
            this.R = -9223372036854775807L;
            this.U = true;
            return true;
        }
        if (eVar == null) {
            if (uri != null) {
                this.f81032d.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (E(eVar)) {
            D((e) eVar);
        }
        this.f81050v = eVar;
        this.f81039k.m(eVar, this, this.f81038j.getMinimumLoadableRetryCount(eVar.f73006c));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a0(ja.r[] r14, boolean[] r15, ga.c1[] r16, boolean[] r17, long r18, boolean r20) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.hls.l.a0(ja.r[], boolean[], ga.c1[], boolean[], long, boolean):boolean");
    }

    public long b(long j10, m0 m0Var) {
        return this.f81033e.c(j10, m0Var);
    }

    public void b0(DrmInitData drmInitData) {
        if (Objects.equals(this.X, drmInitData)) {
            return;
        }
        this.X = drmInitData;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f81051w;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.P[i10]) {
                dVarArr[i10].k0(drmInitData);
            }
            i10++;
        }
    }

    @Override // ga.b1.d
    public void d(io.bidmachine.media3.common.a aVar) {
        this.f81047s.post(this.f81045q);
    }

    public void d0(boolean z10) {
        this.f81033e.v(z10);
    }

    public void discardBuffer(long j10, boolean z10) {
        if (!this.D || F()) {
            return;
        }
        int length = this.f81051w.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f81051w[i10].r(j10, z10, this.O[i10]);
        }
    }

    public void e0(long j10) {
        if (this.W != j10) {
            this.W = j10;
            for (d dVar : this.f81051w) {
                dVar.c0(j10);
            }
        }
    }

    @Override // oa.t
    public void endTracks() {
        this.V = true;
        this.f81047s.post(this.f81046r);
    }

    public int f0(int i10, long j10) throws Throwable {
        if (F()) {
            return 0;
        }
        d dVar = this.f81051w[i10];
        int iH = dVar.H(j10, this.U);
        e eVar = (e) Iterables.getLast(this.f81043o, null);
        if (eVar != null && !eVar.o()) {
            iH = Math.min(iH, eVar.k(i10) - dVar.F());
        }
        dVar.g0(iH);
        return iH;
    }

    public void g0(int i10) {
        n();
        q9.a.e(this.L);
        int i11 = this.L[i10];
        q9.a.g(this.O[i11]);
        this.O[i11] = false;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // ga.d1
    public long getBufferedPositionUs() {
        /*
            r7 = this;
            boolean r0 = r7.U
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.F()
            if (r0 == 0) goto L10
            long r0 = r7.R
            return r0
        L10:
            long r0 = r7.Q
            io.bidmachine.media3.exoplayer.hls.e r2 = r7.A()
            boolean r3 = r2.f()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList r2 = r7.f81043o
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList r2 = r7.f81043o
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            io.bidmachine.media3.exoplayer.hls.e r2 = (io.bidmachine.media3.exoplayer.hls.e) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f73011h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.D
            if (r2 == 0) goto L55
            io.bidmachine.media3.exoplayer.hls.l$d[] r2 = r7.f81051w
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.C()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.hls.l.getBufferedPositionUs():long");
    }

    @Override // ga.d1
    public long getNextLoadPositionUs() {
        if (F()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return A().f73011h;
    }

    public m1 getTrackGroups() {
        n();
        return this.J;
    }

    @Override // ga.d1
    public boolean isLoading() {
        return this.f81039k.i();
    }

    public void maybeThrowPrepareError() throws x {
        K();
        if (this.U && !this.E) {
            throw x.a("Loading finished before preparation is complete.", null);
        }
    }

    public int o(int i10) {
        n();
        q9.a.e(this.L);
        int i11 = this.L[i10];
        if (i11 == -1) {
            return this.K.contains(this.J.b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.O;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    @Override // ka.o.f
    public void onLoaderReleased() {
        for (d dVar : this.f81051w) {
            dVar.V();
        }
    }

    public void r() {
        if (this.E) {
            return;
        }
        a(new l1.b().f(this.Q).d());
    }

    @Override // ga.d1
    public void reevaluateBuffer(long j10) {
        if (this.f81039k.h() || F()) {
            return;
        }
        if (this.f81039k.i()) {
            q9.a.e(this.f81050v);
            if (this.f81033e.x(j10, this.f81050v, this.f81044p)) {
                this.f81039k.e();
                return;
            }
            return;
        }
        int size = this.f81044p.size();
        while (size > 0 && this.f81033e.d((e) this.f81044p.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f81044p.size()) {
            w(size);
        }
        int i10 = this.f81033e.i(j10, this.f81044p);
        if (i10 < this.f81043o.size()) {
            w(i10);
        }
    }

    @Override // oa.t
    public s0 track(int i10, int i11) {
        s0 s0VarT;
        if (!Z.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                s0[] s0VarArr = this.f81051w;
                if (i12 >= s0VarArr.length) {
                    s0VarT = null;
                    break;
                }
                if (this.f81052x[i12] == i10) {
                    s0VarT = s0VarArr[i12];
                    break;
                }
                i12++;
            }
        } else {
            s0VarT = B(i10, i11);
        }
        if (s0VarT == null) {
            if (this.V) {
                return s(i10, i11);
            }
            s0VarT = t(i10, i11);
        }
        if (i11 != 5) {
            return s0VarT;
        }
        if (this.A == null) {
            this.A = new c(s0VarT, this.f81041m);
        }
        return this.A;
    }

    @Override // oa.t
    public void e(oa.m0 m0Var) {
    }
}
