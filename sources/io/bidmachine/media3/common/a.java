package io.bidmachine.media3.common;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import n9.f;
import n9.g;
import n9.q;
import n9.v;
import n9.w;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final a P = new b().N();
    private static final String Q = o0.C0(0);
    private static final String R = o0.C0(1);
    private static final String S = o0.C0(2);
    private static final String T = o0.C0(3);
    private static final String U = o0.C0(4);
    private static final String V = o0.C0(5);
    private static final String W = o0.C0(6);
    private static final String X = o0.C0(7);
    private static final String Y = o0.C0(8);
    private static final String Z = o0.C0(9);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final String f80522a0 = o0.C0(10);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final String f80523b0 = o0.C0(11);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final String f80524c0 = o0.C0(12);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f80525d0 = o0.C0(13);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final String f80526e0 = o0.C0(14);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final String f80527f0 = o0.C0(15);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f80528g0 = o0.C0(16);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String f80529h0 = o0.C0(17);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final String f80530i0 = o0.C0(18);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final String f80531j0 = o0.C0(19);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final String f80532k0 = o0.C0(20);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f80533l0 = o0.C0(21);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f80534m0 = o0.C0(22);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f80535n0 = o0.C0(23);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f80536o0 = o0.C0(24);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f80537p0 = o0.C0(25);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f80538q0 = o0.C0(26);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f80539r0 = o0.C0(27);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f80540s0 = o0.C0(28);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f80541t0 = o0.C0(29);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f80542u0 = o0.C0(30);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f80543v0 = o0.C0(31);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f80544w0 = o0.C0(32);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f80545x0 = o0.C0(33);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f80546y0 = o0.C0(34);
    public final byte[] A;
    public final int B;
    public final g C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    private int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f80549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f80550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f80551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f80552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f80554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f80555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f80556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f80557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f80558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f80559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f80560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f80561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f80562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f80563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f80564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final DrmInitData f80565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f80566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f80567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f80568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f80569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f80570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f80571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f80572z;

    public static final class b {
        private int A;
        private g B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private int H;
        private int I;
        private int J;
        private int K;
        private int L;
        private int M;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f80573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f80574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f80575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f80576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f80577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f80578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f80579g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f80580h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f80581i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private String f80582j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private v f80583k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Object f80584l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f80585m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f80586n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f80587o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f80588p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private List f80589q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private DrmInitData f80590r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f80591s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f80592t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f80593u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f80594v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private float f80595w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f80596x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private float f80597y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private byte[] f80598z;

        public b A0(int i10) {
            this.L = i10;
            return this;
        }

        public b B0(int i10) {
            this.f80593u = i10;
            return this;
        }

        public a N() {
            return new a(this);
        }

        public b O(int i10) {
            this.I = i10;
            return this;
        }

        public b P(int i10) {
            this.f80579g = i10;
            return this;
        }

        public b Q(int i10) {
            this.f80580h = i10;
            return this;
        }

        public b R(int i10) {
            this.D = i10;
            return this;
        }

        public b S(String str) {
            this.f80582j = str;
            return this;
        }

        public b T(g gVar) {
            this.B = gVar;
            return this;
        }

        public b U(String str) {
            this.f80585m = w.u(str);
            return this;
        }

        public b V(int i10) {
            this.M = i10;
            return this;
        }

        public b W(int i10) {
            this.J = i10;
            return this;
        }

        public b X(Object obj) {
            this.f80584l = obj;
            return this;
        }

        public b Y(DrmInitData drmInitData) {
            this.f80590r = drmInitData;
            return this;
        }

        public b Z(int i10) {
            this.G = i10;
            return this;
        }

        public b a0(int i10) {
            this.H = i10;
            return this;
        }

        public b b0(float f10) {
            this.f80595w = f10;
            return this;
        }

        public b c0(boolean z10) {
            this.f80592t = z10;
            return this;
        }

        public b d0(int i10) {
            this.f80594v = i10;
            return this;
        }

        public b e0(int i10) {
            this.f80573a = Integer.toString(i10);
            return this;
        }

        public b f0(String str) {
            this.f80573a = str;
            return this;
        }

        public b g0(List list) {
            this.f80589q = list;
            return this;
        }

        public b h0(String str) {
            this.f80574b = str;
            return this;
        }

        public b i0(List list) {
            this.f80575c = ImmutableList.copyOf((Collection) list);
            return this;
        }

        public b j0(String str) {
            this.f80576d = str;
            return this;
        }

        public b k0(int i10) {
            this.f80587o = i10;
            return this;
        }

        public b l0(int i10) {
            this.f80588p = i10;
            return this;
        }

        public b m0(int i10) {
            this.C = i10;
            return this;
        }

        public b n0(v vVar) {
            this.f80583k = vVar;
            return this;
        }

        public b o0(int i10) {
            this.F = i10;
            return this;
        }

        public b p0(int i10) {
            this.f80581i = i10;
            return this;
        }

        public b q0(float f10) {
            this.f80597y = f10;
            return this;
        }

        public b r0(byte[] bArr) {
            this.f80598z = bArr;
            return this;
        }

        public b s0(int i10) {
            this.f80578f = i10;
            return this;
        }

        public b t0(int i10) {
            this.f80596x = i10;
            return this;
        }

        public b u0(String str) {
            this.f80586n = w.u(str);
            return this;
        }

        public b v0(int i10) {
            this.E = i10;
            return this;
        }

        public b w0(int i10) {
            this.f80577e = i10;
            return this;
        }

        public b x0(int i10) {
            this.A = i10;
            return this;
        }

        public b y0(long j10) {
            this.f80591s = j10;
            return this;
        }

        public b z0(int i10) {
            this.K = i10;
            return this;
        }

        public b() {
            this.f80575c = ImmutableList.of();
            this.f80580h = -1;
            this.f80581i = -1;
            this.f80587o = -1;
            this.f80588p = -1;
            this.f80591s = Long.MAX_VALUE;
            this.f80593u = -1;
            this.f80594v = -1;
            this.f80595w = -1.0f;
            this.f80597y = 1.0f;
            this.A = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.I = -1;
            this.J = 1;
            this.K = -1;
            this.L = -1;
            this.M = 0;
            this.f80579g = 0;
        }

        private b(a aVar) {
            this.f80573a = aVar.f80547a;
            this.f80574b = aVar.f80548b;
            this.f80575c = aVar.f80549c;
            this.f80576d = aVar.f80550d;
            this.f80577e = aVar.f80551e;
            this.f80578f = aVar.f80552f;
            this.f80580h = aVar.f80554h;
            this.f80581i = aVar.f80555i;
            this.f80582j = aVar.f80557k;
            this.f80583k = aVar.f80558l;
            this.f80584l = aVar.f80559m;
            this.f80585m = aVar.f80560n;
            this.f80586n = aVar.f80561o;
            this.f80587o = aVar.f80562p;
            this.f80588p = aVar.f80563q;
            this.f80589q = aVar.f80564r;
            this.f80590r = aVar.f80565s;
            this.f80591s = aVar.f80566t;
            this.f80592t = aVar.f80567u;
            this.f80593u = aVar.f80568v;
            this.f80594v = aVar.f80569w;
            this.f80595w = aVar.f80570x;
            this.f80596x = aVar.f80571y;
            this.f80597y = aVar.f80572z;
            this.f80598z = aVar.A;
            this.A = aVar.B;
            this.B = aVar.C;
            this.C = aVar.D;
            this.D = aVar.E;
            this.E = aVar.F;
            this.F = aVar.G;
            this.G = aVar.H;
            this.H = aVar.I;
            this.I = aVar.J;
            this.J = aVar.K;
            this.K = aVar.L;
            this.L = aVar.M;
            this.M = aVar.N;
        }
    }

    public static /* synthetic */ String a(q qVar) {
        return qVar.f95445a + ": " + qVar.f95446b;
    }

    private static String d(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (TextUtils.equals(qVar.f95445a, str)) {
                return qVar.f95446b;
            }
        }
        return ((q) list.get(0)).f95446b;
    }

    private static boolean g(b bVar) {
        if (bVar.f80575c.isEmpty() && bVar.f80574b == null) {
            return true;
        }
        for (int i10 = 0; i10 < bVar.f80575c.size(); i10++) {
            if (((q) bVar.f80575c.get(i10)).f95446b.equals(bVar.f80574b)) {
                return true;
            }
        }
        return false;
    }

    public static String h(a aVar) {
        if (aVar == null) {
            return "null";
        }
        Joiner joinerOn = Joiner.on(',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(aVar.f80547a);
        sb2.append(", mimeType=");
        sb2.append(aVar.f80561o);
        if (aVar.f80560n != null) {
            sb2.append(", container=");
            sb2.append(aVar.f80560n);
        }
        if (aVar.f80556j != -1) {
            sb2.append(", bitrate=");
            sb2.append(aVar.f80556j);
        }
        if (aVar.f80557k != null) {
            sb2.append(", codecs=");
            sb2.append(aVar.f80557k);
        }
        if (aVar.f80565s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                DrmInitData drmInitData = aVar.f80565s;
                if (i10 >= drmInitData.f80510e) {
                    break;
                }
                UUID uuid = drmInitData.e(i10).f80512c;
                if (uuid.equals(f.f95288b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(f.f95289c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(f.f95291e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(f.f95290d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(f.f95287a)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i10++;
            }
            sb2.append(", drm=[");
            joinerOn.appendTo(sb2, (Iterable<? extends Object>) linkedHashSet);
            sb2.append(']');
        }
        if (aVar.f80568v != -1 && aVar.f80569w != -1) {
            sb2.append(", res=");
            sb2.append(aVar.f80568v);
            sb2.append("x");
            sb2.append(aVar.f80569w);
        }
        if (!DoubleMath.fuzzyEquals(aVar.f80572z, 1.0d, 0.001d)) {
            sb2.append(", par=");
            sb2.append(o0.G("%.3f", Float.valueOf(aVar.f80572z)));
        }
        g gVar = aVar.C;
        if (gVar != null && gVar.i()) {
            sb2.append(", color=");
            sb2.append(aVar.C.m());
        }
        if (aVar.f80570x != -1.0f) {
            sb2.append(", fps=");
            sb2.append(aVar.f80570x);
        }
        if (aVar.D != -1) {
            sb2.append(", maxSubLayers=");
            sb2.append(aVar.D);
        }
        if (aVar.E != -1) {
            sb2.append(", channels=");
            sb2.append(aVar.E);
        }
        if (aVar.F != -1) {
            sb2.append(", sample_rate=");
            sb2.append(aVar.F);
        }
        if (aVar.f80550d != null) {
            sb2.append(", language=");
            sb2.append(aVar.f80550d);
        }
        if (!aVar.f80549c.isEmpty()) {
            sb2.append(", labels=[");
            joinerOn.appendTo(sb2, (Iterable<? extends Object>) Lists.transform(aVar.f80549c, new Function() { // from class: n9.o
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return io.bidmachine.media3.common.a.a((q) obj);
                }
            }));
            sb2.append(C4240b4.j.f42674e);
        }
        if (aVar.f80551e != 0) {
            sb2.append(", selectionFlags=[");
            joinerOn.appendTo(sb2, (Iterable<? extends Object>) o0.n0(aVar.f80551e));
            sb2.append(C4240b4.j.f42674e);
        }
        if (aVar.f80552f != 0) {
            sb2.append(", roleFlags=[");
            joinerOn.appendTo(sb2, (Iterable<? extends Object>) o0.m0(aVar.f80552f));
            sb2.append(C4240b4.j.f42674e);
        }
        if (aVar.f80559m != null) {
            sb2.append(", customData=");
            sb2.append(aVar.f80559m);
        }
        if ((aVar.f80552f & 32768) != 0) {
            sb2.append(", auxiliaryTrackType=");
            sb2.append(o0.N(aVar.f80553g));
        }
        return sb2.toString();
    }

    public b b() {
        return new b();
    }

    public a c(int i10) {
        return b().V(i10).N();
    }

    public int e() {
        int i10;
        int i11 = this.f80568v;
        if (i11 == -1 || (i10 = this.f80569w) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            int i11 = this.O;
            if ((i11 == 0 || (i10 = aVar.O) == 0 || i11 == i10) && this.f80551e == aVar.f80551e && this.f80552f == aVar.f80552f && this.f80553g == aVar.f80553g && this.f80554h == aVar.f80554h && this.f80555i == aVar.f80555i && this.f80562p == aVar.f80562p && this.f80566t == aVar.f80566t && this.f80568v == aVar.f80568v && this.f80569w == aVar.f80569w && this.f80571y == aVar.f80571y && this.B == aVar.B && this.D == aVar.D && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.L == aVar.L && this.M == aVar.M && this.N == aVar.N && Float.compare(this.f80570x, aVar.f80570x) == 0 && Float.compare(this.f80572z, aVar.f80572z) == 0 && Objects.equals(this.f80547a, aVar.f80547a) && Objects.equals(this.f80548b, aVar.f80548b) && this.f80549c.equals(aVar.f80549c) && Objects.equals(this.f80557k, aVar.f80557k) && Objects.equals(this.f80560n, aVar.f80560n) && Objects.equals(this.f80561o, aVar.f80561o) && Objects.equals(this.f80550d, aVar.f80550d) && Arrays.equals(this.A, aVar.A) && Objects.equals(this.f80558l, aVar.f80558l) && Objects.equals(this.C, aVar.C) && Objects.equals(this.f80565s, aVar.f80565s) && f(aVar) && Objects.equals(this.f80559m, aVar.f80559m)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(a aVar) {
        if (this.f80564r.size() != aVar.f80564r.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f80564r.size(); i10++) {
            if (!Arrays.equals((byte[]) this.f80564r.get(i10), (byte[]) aVar.f80564r.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.O == 0) {
            String str = this.f80547a;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f80548b;
            int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f80549c.hashCode()) * 31;
            String str3 = this.f80550d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f80551e) * 31) + this.f80552f) * 31) + this.f80553g) * 31) + this.f80554h) * 31) + this.f80555i) * 31;
            String str4 = this.f80557k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            v vVar = this.f80558l;
            int iHashCode5 = (iHashCode4 + (vVar == null ? 0 : vVar.hashCode())) * 31;
            Object obj = this.f80559m;
            int iHashCode6 = (iHashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f80560n;
            int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f80561o;
            this.O = ((((((((((((((((((((((((((((((((((((iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f80562p) * 31) + ((int) this.f80566t)) * 31) + this.f80568v) * 31) + this.f80569w) * 31) + Float.floatToIntBits(this.f80570x)) * 31) + this.f80571y) * 31) + Float.floatToIntBits(this.f80572z)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.L) * 31) + this.M) * 31) + this.N;
        }
        return this.O;
    }

    public a i(a aVar) {
        String str;
        if (this == aVar) {
            return this;
        }
        int iK = w.k(this.f80561o);
        String str2 = aVar.f80547a;
        int i10 = aVar.L;
        int i11 = aVar.M;
        String str3 = aVar.f80548b;
        if (str3 == null) {
            str3 = this.f80548b;
        }
        List list = !aVar.f80549c.isEmpty() ? aVar.f80549c : this.f80549c;
        String str4 = this.f80550d;
        if ((iK == 3 || iK == 1) && (str = aVar.f80550d) != null) {
            str4 = str;
        }
        int i12 = this.f80554h;
        if (i12 == -1) {
            i12 = aVar.f80554h;
        }
        int i13 = this.f80555i;
        if (i13 == -1) {
            i13 = aVar.f80555i;
        }
        String str5 = this.f80557k;
        if (str5 == null) {
            String strS = o0.S(aVar.f80557k, iK);
            if (o0.l1(strS).length == 1) {
                str5 = strS;
            }
        }
        v vVar = this.f80558l;
        v vVarB = vVar == null ? aVar.f80558l : vVar.b(aVar.f80558l);
        float f10 = this.f80570x;
        if (f10 == -1.0f && iK == 2) {
            f10 = aVar.f80570x;
        }
        return b().f0(str2).h0(str3).i0(list).j0(str4).w0(this.f80551e | aVar.f80551e).s0(this.f80552f | aVar.f80552f).Q(i12).p0(i13).S(str5).n0(vVarB).Y(DrmInitData.d(aVar.f80565s, this.f80565s)).b0(f10).z0(i10).A0(i11).N();
    }

    public String toString() {
        return "Format(" + this.f80547a + ", " + this.f80548b + ", " + this.f80560n + ", " + this.f80561o + ", " + this.f80557k + ", " + this.f80556j + ", " + this.f80550d + ", [" + this.f80568v + ", " + this.f80569w + ", " + this.f80570x + ", " + this.C + "], [" + this.E + ", " + this.F + "])";
    }

    private a(b bVar) {
        this.f80547a = bVar.f80573a;
        String strS0 = o0.S0(bVar.f80576d);
        this.f80550d = strS0;
        if (bVar.f80575c.isEmpty() && bVar.f80574b != null) {
            this.f80549c = ImmutableList.of(new q(strS0, bVar.f80574b));
            this.f80548b = bVar.f80574b;
        } else if (bVar.f80575c.isEmpty() || bVar.f80574b != null) {
            q9.a.g(g(bVar));
            this.f80549c = bVar.f80575c;
            this.f80548b = bVar.f80574b;
        } else {
            this.f80549c = bVar.f80575c;
            this.f80548b = d(bVar.f80575c, strS0);
        }
        this.f80551e = bVar.f80577e;
        q9.a.h(bVar.f80579g == 0 || (bVar.f80578f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f80552f = bVar.f80578f;
        this.f80553g = bVar.f80579g;
        int i10 = bVar.f80580h;
        this.f80554h = i10;
        int i11 = bVar.f80581i;
        this.f80555i = i11;
        this.f80556j = i11 != -1 ? i11 : i10;
        this.f80557k = bVar.f80582j;
        this.f80558l = bVar.f80583k;
        this.f80559m = bVar.f80584l;
        this.f80560n = bVar.f80585m;
        this.f80561o = bVar.f80586n;
        this.f80562p = bVar.f80587o;
        this.f80563q = bVar.f80588p;
        this.f80564r = bVar.f80589q == null ? Collections.EMPTY_LIST : bVar.f80589q;
        DrmInitData drmInitData = bVar.f80590r;
        this.f80565s = drmInitData;
        this.f80566t = bVar.f80591s;
        this.f80567u = bVar.f80592t;
        this.f80568v = bVar.f80593u;
        this.f80569w = bVar.f80594v;
        this.f80570x = bVar.f80595w;
        this.f80571y = bVar.f80596x == -1 ? 0 : bVar.f80596x;
        this.f80572z = bVar.f80597y == -1.0f ? 1.0f : bVar.f80597y;
        this.A = bVar.f80598z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
        this.H = bVar.G == -1 ? 0 : bVar.G;
        this.I = bVar.H != -1 ? bVar.H : 0;
        this.J = bVar.I;
        this.K = bVar.J;
        this.L = bVar.K;
        this.M = bVar.L;
        if (bVar.M != 0 || drmInitData == null) {
            this.N = bVar.M;
        } else {
            this.N = 1;
        }
    }
}
