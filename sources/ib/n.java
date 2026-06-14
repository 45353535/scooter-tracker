package ib;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lb.t;
import oa.e0;
import oa.l0;
import oa.m0;
import oa.q0;
import oa.s0;
import oa.t0;
import q9.d0;
import q9.o0;
import r9.c;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements oa.r, m0 {
    public static final oa.x G = new oa.x() { // from class: ib.m
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
            return n.d();
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
    private a[] A;
    private long[][] B;
    private int C;
    private long D;
    private int E;
    private db.a F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f74087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f74088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f74089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d0 f74090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d0 f74091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f74092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f74093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q f74094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f74095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ImmutableList f74096j = ImmutableList.of();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f74097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f74098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f74099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f74100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d0 f74101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f74102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f74103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f74104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f74105s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f74106t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f74107u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f74108v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f74109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f74110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f74111y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private oa.t f74112z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f74113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f74114b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s0 f74115c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t0 f74116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f74117e;

        public a(t tVar, w wVar, s0 s0Var) {
            this.f74113a = tVar;
            this.f74114b = wVar;
            this.f74115c = s0Var;
            this.f74116d = "audio/true-hd".equals(tVar.f74138g.f80561o) ? new t0() : null;
        }
    }

    public n(t.a aVar, int i10) {
        this.f74087a = aVar;
        this.f74088b = i10;
        this.f74097k = (i10 & 4) != 0 ? 3 : 0;
        this.f74094h = new q();
        this.f74095i = new ArrayList();
        this.f74092f = new d0(16);
        this.f74093g = new ArrayDeque();
        this.f74089c = new d0(r9.f.f99242a);
        this.f74090d = new d0(6);
        this.f74091e = new d0();
        this.f74102p = -1;
        this.f74112z = oa.t.O8;
        this.A = new a[0];
    }

    private int A(oa.s sVar, l0 l0Var) throws n9.x {
        int iC = this.f74094h.c(sVar, l0Var, this.f74095i);
        if (iC == 1 && l0Var.f96583a == 0) {
            j();
        }
        return iC;
    }

    private static boolean B(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473 || i10 == 1635284069;
    }

    private static boolean C(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private boolean D(n9.v vVar) {
        r9.a aVarA;
        if (vVar != null && (this.f74088b & 64) != 0 && (aVarA = j.a(vVar, "auxiliary.tracks.offset")) != null) {
            long jO = new d0(aVarA.f99228b).O();
            if (jO > 0) {
                this.f74109w = jO;
                return true;
            }
        }
        return false;
    }

    private void E(a aVar, long j10) {
        w wVar = aVar.f74114b;
        int iA = wVar.a(j10);
        if (iA == -1) {
            iA = wVar.b(j10);
        }
        aVar.f74117e = iA;
    }

    public static /* synthetic */ oa.r[] d() {
        return new oa.r[]{new n(t.a.f94119a, 16)};
    }

    public static /* synthetic */ t e(t tVar) {
        return tVar;
    }

    private static int f(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] g(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f74114b.f74168b];
            jArr2[i10] = aVarArr[i10].f74114b.f74172f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            w wVar = aVarArr[i12].f74114b;
            j10 += (long) wVar.f74170d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = wVar.f74172f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private boolean h(io.bidmachine.media3.common.a aVar) {
        return Objects.equals(aVar.f80561o, "video/avc") ? (this.f74088b & 32) != 0 : Objects.equals(aVar.f80561o, "video/hevc") && (this.f74088b & 128) != 0;
    }

    public static int i(int i10) {
        int i11 = (i10 & 1) != 0 ? 32 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private void j() {
        this.f74097k = 0;
        this.f74100n = 0;
    }

    private List k(n9.v vVar) {
        List listB = ((r9.a) q9.a.i(j.a(vVar, "auxiliary.tracks.map"))).b();
        ArrayList arrayList = new ArrayList(listB.size());
        for (int i10 = 0; i10 < listB.size(); i10++) {
            int iIntValue = ((Integer) listB.get(i10)).intValue();
            int i11 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i11 = 3;
                    if (iIntValue != 2) {
                        i11 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i11 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    private static int n(w wVar, long j10) {
        int iA = wVar.a(j10);
        return iA == -1 ? wVar.b(j10) : iA;
    }

    private int o(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.A;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f74117e;
            w wVar = aVar.f74114b;
            if (i13 != wVar.f74168b) {
                long j14 = wVar.f74169c[i13];
                long j15 = ((long[][]) o0.i(this.B))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j12 = j15;
                    i11 = i12;
                    j13 = j16;
                }
                if (j15 < j11) {
                    z10 = z12;
                    j11 = j15;
                    i10 = i12;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    private static long p(w wVar, long j10, long j11) {
        int iN = n(wVar, j10);
        return iN == -1 ? j11 : Math.min(wVar.f74169c[iN], j11);
    }

    private void q(n9.v vVar) {
        r9.a aVarA = j.a(vVar, "auxiliary.tracks.interleaved");
        if (aVarA == null || aVarA.f99228b[0] != 0) {
            return;
        }
        this.f74111y = this.f74109w + 16;
    }

    private void r(oa.s sVar) {
        this.f74091e.S(8);
        sVar.peekFully(this.f74091e.e(), 0, 8);
        b.f(this.f74091e);
        sVar.skipFully(this.f74091e.f());
        sVar.resetPeekPosition();
    }

    private void s(long j10) {
        while (!this.f74093g.isEmpty() && ((c.b) this.f74093g.peek()).f99233b == j10) {
            c.b bVar = (c.b) this.f74093g.pop();
            if (bVar.f99232a == 1836019574) {
                v(bVar);
                this.f74093g.clear();
                if (!this.f74108v) {
                    this.f74097k = 2;
                }
            } else if (!this.f74093g.isEmpty()) {
                ((c.b) this.f74093g.peek()).b(bVar);
            }
        }
        if (this.f74097k != 2) {
            j();
        }
    }

    private void t() {
        if (this.E != 2 || (this.f74088b & 2) == 0) {
            return;
        }
        s0 s0VarTrack = this.f74112z.track(0, 4);
        db.a aVar = this.F;
        s0VarTrack.f(new a.b().n0(aVar == null ? null : new n9.v(aVar)).N());
        this.f74112z.endTracks();
        this.f74112z.e(new m0.b(-9223372036854775807L));
    }

    private static int u(d0 d0Var) {
        d0Var.W(8);
        int iF = f(d0Var.q());
        if (iF != 0) {
            return iF;
        }
        d0Var.X(4);
        while (d0Var.a() > 0) {
            int iF2 = f(d0Var.q());
            if (iF2 != 0) {
                return iF2;
            }
        }
        return 0;
    }

    private void v(c.b bVar) {
        List list;
        n9.v vVar;
        n9.v vVar2;
        int i10;
        List list2;
        e0 e0Var;
        n9.v vVar3;
        long j10;
        char c10;
        char c11 = 2;
        int i11 = 0;
        c.b bVarD = bVar.d(1835365473);
        List arrayList = new ArrayList();
        if (bVarD != null) {
            n9.v vVarT = b.t(bVarD);
            if (this.f74110x) {
                q9.a.i(vVarT);
                q(vVarT);
                arrayList = k(vVarT);
            } else if (D(vVarT)) {
                this.f74108v = true;
                return;
            }
            vVar = vVarT;
            list = arrayList;
        } else {
            list = arrayList;
            vVar = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = this.E == 1;
        e0 e0Var2 = new e0();
        c.C1181c c1181cE = bVar.e(1969517665);
        if (c1181cE != null) {
            n9.v vVarH = b.H(c1181cE);
            e0Var2.c(vVarH);
            vVar2 = vVarH;
        } else {
            vVar2 = null;
        }
        n9.v vVar4 = new n9.v(b.v(((c.C1181c) q9.a.e(bVar.e(1836476516))).f99236b));
        List listG = b.G(bVar, e0Var2, -9223372036854775807L, null, (this.f74088b & 1) != 0, z10, new Function() { // from class: ib.l
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return n.e((t) obj);
            }
        });
        if (this.f74110x) {
            q9.a.h(list.size() == listG.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listG.size())));
        }
        String strB = k.b(listG);
        int i12 = 0;
        long j11 = -9223372036854775807L;
        int size = -1;
        int i13 = 0;
        while (i12 < listG.size()) {
            w wVar = (w) listG.get(i12);
            int i14 = i11;
            if (wVar.f74168b == 0) {
                list2 = listG;
                c10 = c11;
                i10 = i13;
                e0Var = e0Var2;
            } else {
                t tVar = wVar.f74167a;
                i10 = i13 + 1;
                list2 = listG;
                a aVar = new a(tVar, wVar, this.f74112z.track(i13, tVar.f74133b));
                e0Var = e0Var2;
                long j12 = tVar.f74136e;
                if (j12 == -9223372036854775807L) {
                    j12 = wVar.f74174h;
                }
                aVar.f74115c.d(j12);
                long jMax = Math.max(j11, j12);
                int i15 = "audio/true-hd".equals(tVar.f74138g.f80561o) ? wVar.f74171e * 16 : wVar.f74171e + 30;
                a.b bVarB = tVar.f74138g.b();
                bVarB.k0(i15);
                if (tVar.f74133b == 2) {
                    int i16 = tVar.f74138g.f80552f;
                    if ((this.f74088b & 8) != 0) {
                        i16 |= size == -1 ? 1 : 2;
                    }
                    if (this.f74110x) {
                        i16 |= 32768;
                        bVarB.P(((Integer) list.get(i12)).intValue());
                    }
                    bVarB.s0(i16);
                }
                j.l(tVar.f74133b, e0Var, bVarB);
                int i17 = tVar.f74133b;
                n9.v vVar5 = tVar.f74138g.f80558l;
                if (this.f74095i.isEmpty()) {
                    j10 = jMax;
                    vVar3 = null;
                } else {
                    j10 = jMax;
                    vVar3 = new n9.v(this.f74095i);
                }
                n9.v[] vVarArr = new n9.v[3];
                vVarArr[i14] = vVar3;
                vVarArr[1] = vVar2;
                c10 = 2;
                vVarArr[2] = vVar4;
                j.m(i17, vVar, bVarB, vVar5, vVarArr);
                bVarB.U(strB);
                aVar.f74115c.f(bVarB.N());
                if (tVar.f74133b == 2 && size == -1) {
                    size = arrayList2.size();
                }
                arrayList2.add(aVar);
                j11 = j10;
            }
            i12++;
            e0Var2 = e0Var;
            c11 = c10;
            i11 = i14;
            i13 = i10;
            listG = list2;
        }
        this.C = size;
        this.D = j11;
        a[] aVarArr = (a[]) arrayList2.toArray(new a[i11]);
        this.A = aVarArr;
        this.B = g(aVarArr);
        this.f74112z.endTracks();
        this.f74112z.e(this);
    }

    private void w(long j10) {
        if (this.f74098l == 1836086884) {
            int i10 = this.f74100n;
            this.F = new db.a(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.f74099m - ((long) i10));
        }
    }

    private boolean x(oa.s sVar) throws n9.x {
        c.b bVar;
        if (this.f74100n == 0) {
            if (!sVar.readFully(this.f74092f.e(), 0, 8, true)) {
                t();
                return false;
            }
            this.f74100n = 8;
            this.f74092f.W(0);
            this.f74099m = this.f74092f.J();
            this.f74098l = this.f74092f.q();
        }
        long j10 = this.f74099m;
        if (j10 == 1) {
            sVar.readFully(this.f74092f.e(), 8, 8);
            this.f74100n += 8;
            this.f74099m = this.f74092f.O();
        } else if (j10 == 0) {
            long length = sVar.getLength();
            if (length == -1 && (bVar = (c.b) this.f74093g.peek()) != null) {
                length = bVar.f99233b;
            }
            if (length != -1) {
                this.f74099m = (length - sVar.getPosition()) + ((long) this.f74100n);
            }
        }
        if (this.f74099m < this.f74100n) {
            throw n9.x.d("Atom size less than header length (unsupported).");
        }
        if (B(this.f74098l)) {
            long position = sVar.getPosition();
            long j11 = this.f74099m;
            int i10 = this.f74100n;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.f74098l == 1835365473) {
                r(sVar);
            }
            this.f74093g.push(new c.b(this.f74098l, j12));
            if (this.f74099m == this.f74100n) {
                s(j12);
            } else {
                j();
            }
        } else if (C(this.f74098l)) {
            q9.a.g(this.f74100n == 8);
            q9.a.g(this.f74099m <= SieveCacheKt.NodeLinkMask);
            d0 d0Var = new d0((int) this.f74099m);
            System.arraycopy(this.f74092f.e(), 0, d0Var.e(), 0, 8);
            this.f74101o = d0Var;
            this.f74097k = 1;
        } else {
            w(sVar.getPosition() - ((long) this.f74100n));
            this.f74101o = null;
            this.f74097k = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean y(oa.s r10, oa.l0 r11) {
        /*
            r9 = this;
            long r0 = r9.f74099m
            int r2 = r9.f74100n
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            q9.d0 r4 = r9.f74101o
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L46
            byte[] r7 = r4.e()
            int r8 = r9.f74100n
            int r0 = (int) r0
            r10.readFully(r7, r8, r0)
            int r10 = r9.f74098l
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r10 != r0) goto L2b
            r9.f74107u = r5
            int r10 = u(r4)
            r9.E = r10
            goto L5e
        L2b:
            java.util.ArrayDeque r10 = r9.f74093g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L5e
            java.util.ArrayDeque r10 = r9.f74093g
            java.lang.Object r10 = r10.peek()
            r9.c$b r10 = (r9.c.b) r10
            r9.c$c r0 = new r9.c$c
            int r1 = r9.f74098l
            r0.<init>(r1, r4)
            r10.c(r0)
            goto L5e
        L46:
            boolean r4 = r9.f74107u
            if (r4 != 0) goto L53
            int r4 = r9.f74098l
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r4 != r7) goto L53
            r9.E = r5
        L53:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L60
            int r0 = (int) r0
            r10.skipFully(r0)
        L5e:
            r10 = r6
            goto L68
        L60:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f96583a = r7
            r10 = r5
        L68:
            r9.s(r2)
            boolean r0 = r9.f74108v
            if (r0 == 0) goto L78
            r9.f74110x = r5
            long r0 = r9.f74109w
            r11.f96583a = r0
            r9.f74108v = r6
            r10 = r5
        L78:
            if (r10 == 0) goto L80
            int r10 = r9.f74097k
            r11 = 2
            if (r10 == r11) goto L80
            return r5
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.n.y(oa.s, oa.l0):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean, int] */
    private int z(oa.s sVar, l0 l0Var) throws n9.x {
        s0.a aVar;
        ?? r12;
        int iO;
        long position = sVar.getPosition();
        if (this.f74102p == -1) {
            int iO2 = o(position);
            this.f74102p = iO2;
            if (iO2 == -1) {
                return -1;
            }
        }
        a aVar2 = this.A[this.f74102p];
        s0 s0Var = aVar2.f74115c;
        int i10 = aVar2.f74117e;
        w wVar = aVar2.f74114b;
        long j10 = wVar.f74169c[i10] + this.f74111y;
        int i11 = wVar.f74170d[i10];
        t0 t0Var = aVar2.f74116d;
        long j11 = (j10 - position) + ((long) this.f74103q);
        if (j11 < 0 || j11 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            l0Var.f96583a = j10;
            return 1;
        }
        if (aVar2.f74113a.f74139h == 1) {
            j11 += 8;
            i11 -= 8;
        }
        sVar.skipFully((int) j11);
        if (!h(aVar2.f74113a.f74138g)) {
            this.f74106t = true;
        }
        t tVar = aVar2.f74113a;
        if (tVar.f74142k == 0) {
            aVar = null;
            if ("audio/ac4".equals(tVar.f74138g.f80561o)) {
                if (this.f74104r == 0) {
                    oa.c.a(i11, this.f74091e);
                    s0Var.c(this.f74091e, 7);
                    this.f74104r += 7;
                }
                i11 += 7;
            } else if (t0Var != null) {
                t0Var.d(sVar);
            }
            while (true) {
                int i12 = this.f74104r;
                if (i12 >= i11) {
                    break;
                }
                int iB = s0Var.b(sVar, i11 - i12, false);
                this.f74103q += iB;
                this.f74104r += iB;
                this.f74105s -= iB;
            }
        } else {
            byte[] bArrE = this.f74090d.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i13 = 4 - aVar2.f74113a.f74142k;
            i11 += i13;
            while (this.f74104r < i11) {
                int i14 = this.f74105s;
                if (i14 == 0) {
                    t tVar2 = aVar2.f74113a;
                    int i15 = tVar2.f74142k;
                    if (this.f74106t || r9.f.o(tVar2.f74138g) + i15 > aVar2.f74114b.f74170d[i10] - this.f74103q) {
                        iO = 0;
                    } else {
                        iO = r9.f.o(aVar2.f74113a.f74138g);
                        i15 = aVar2.f74113a.f74142k + iO;
                    }
                    sVar.readFully(bArrE, i13, i15);
                    this.f74103q += i15;
                    this.f74090d.W(0);
                    int iQ = this.f74090d.q();
                    if (iQ < 0) {
                        throw n9.x.a("Invalid NAL length", null);
                    }
                    this.f74105s = iQ - iO;
                    this.f74089c.W(0);
                    s0Var.c(this.f74089c, 4);
                    this.f74104r += 4;
                    if (iO > 0) {
                        s0Var.c(this.f74090d, iO);
                        this.f74104r += iO;
                        if (r9.f.k(bArrE, 4, iO, aVar2.f74113a.f74138g)) {
                            this.f74106t = true;
                        }
                    }
                } else {
                    int iB2 = s0Var.b(sVar, i14, false);
                    this.f74103q += iB2;
                    this.f74104r += iB2;
                    this.f74105s -= iB2;
                }
            }
            aVar = null;
        }
        int i16 = i11;
        w wVar2 = aVar2.f74114b;
        long j12 = wVar2.f74172f[i10];
        int i17 = wVar2.f74173g[i10];
        if (!this.f74106t) {
            i17 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        int i18 = i17;
        if (t0Var != null) {
            boolean z10 = false;
            t0Var.c(s0Var, j12, i18, i16, 0, null);
            r12 = z10;
            if (i10 + 1 == aVar2.f74114b.f74168b) {
                t0Var.a(s0Var, aVar);
                r12 = z10;
            }
        } else {
            r12 = 0;
            s0Var.e(j12, i18, i16, 0, null);
        }
        aVar2.f74117e++;
        this.f74102p = -1;
        this.f74103q = r12;
        this.f74104r = r12;
        this.f74105s = r12;
        this.f74106t = r12;
        return r12;
    }

    @Override // oa.r
    public int a(oa.s sVar, l0 l0Var) {
        while (true) {
            int i10 = this.f74097k;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return z(sVar, l0Var);
                    }
                    if (i10 == 3) {
                        return A(sVar, l0Var);
                    }
                    throw new IllegalStateException();
                }
                if (y(sVar, l0Var)) {
                    return 1;
                }
            } else if (!x(sVar)) {
                return -1;
            }
        }
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        if ((this.f74088b & 16) == 0) {
            tVar = new lb.u(tVar, this.f74087a);
        }
        this.f74112z = tVar;
    }

    @Override // oa.r
    public boolean c(oa.s sVar) {
        q0 q0VarD = s.d(sVar, (this.f74088b & 2) != 0);
        this.f74096j = q0VarD != null ? ImmutableList.of(q0VarD) : ImmutableList.of();
        return q0VarD == null;
    }

    @Override // oa.m0
    public long getDurationUs() {
        return this.D;
    }

    @Override // oa.m0
    public m0.a getSeekPoints(long j10) {
        return l(j10, -1);
    }

    @Override // oa.r
    public /* synthetic */ oa.r getUnderlyingImplementation() {
        return oa.q.b(this);
    }

    @Override // oa.m0
    public boolean isSeekable() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oa.m0.a l(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            ib.n$a[] r4 = r0.A
            int r5 = r4.length
            if (r5 != 0) goto L13
            oa.m0$a r1 = new oa.m0$a
            oa.n0 r2 = oa.n0.f96612c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.C
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            ib.w r4 = r4.f74114b
            int r6 = n(r4, r1)
            if (r6 != r5) goto L35
            oa.m0$a r1 = new oa.m0$a
            oa.n0 r2 = oa.n0.f96612c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f74172f
            r12 = r11[r6]
            long[] r11 = r4.f74169c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f74168b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f74172f
            r9 = r2[r1]
            long[] r2 = r4.f74169c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            ib.n$a[] r4 = r0.A
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.C
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            ib.w r4 = r4.f74114b
            long r5 = p(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = p(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            oa.n0 r3 = new oa.n0
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            oa.m0$a r1 = new oa.m0$a
            r1.<init>(r3)
            return r1
        L8f:
            oa.n0 r4 = new oa.n0
            r4.<init>(r9, r1)
            oa.m0$a r1 = new oa.m0$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.n.l(long, int):oa.m0$a");
    }

    @Override // oa.r
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ImmutableList getSniffFailureDetails() {
        return this.f74096j;
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f74093g.clear();
        this.f74100n = 0;
        this.f74102p = -1;
        this.f74103q = 0;
        this.f74104r = 0;
        this.f74105s = 0;
        this.f74106t = false;
        if (j10 == 0) {
            if (this.f74097k != 3) {
                j();
                return;
            } else {
                this.f74094h.g();
                this.f74095i.clear();
                return;
            }
        }
        for (a aVar : this.A) {
            E(aVar, j11);
            t0 t0Var = aVar.f74116d;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    @Override // oa.r
    public void release() {
    }
}
