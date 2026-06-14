package ja;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.internal.ads.k2;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import ga.f0;
import ga.m1;
import io.bidmachine.media3.exoplayer.i2;
import io.bidmachine.media3.exoplayer.j2;
import j$.util.Objects;
import ja.a;
import ja.n;
import ja.r;
import ja.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import n9.e0;
import n9.f0;
import n9.g0;
import n9.h0;
import q9.o0;
import u9.j0;
import u9.k0;

/* JADX INFO: loaded from: classes12.dex */
public class n extends t implements j2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Ordering f85600j = Ordering.from(new Comparator() { // from class: ja.l
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.t((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f85601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f85602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r.b f85603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f85604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g f85605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private n9.c f85606i;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends i implements Comparable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f85607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f85608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final String f85609h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final e f85610i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f85611j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f85612k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f85613l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f85614m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f85615n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final boolean f85616o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f85617p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f85618q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f85619r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final int f85620s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f85621t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f85622u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int f85623v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final boolean f85624w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final boolean f85625x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f85626y;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i10, f0 f0Var, int i11, e eVar, int i12, boolean z10, Predicate predicate, int i13) {
            int i14;
            int iH;
            int iH2;
            super(i10, f0Var, i11);
            this.f85610i = eVar;
            int i15 = eVar.f85641y0 ? 24 : 16;
            this.f85615n = eVar.f85637u0 && (i13 & i15) != 0;
            this.f85609h = n.U(this.f85661e.f80550d);
            this.f85611j = j0.k(i12, false);
            int i16 = 0;
            while (true) {
                i14 = Integer.MAX_VALUE;
                if (i16 >= eVar.f95354p.size()) {
                    iH = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH = n.H(this.f85661e, (String) eVar.f95354p.get(i16), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f85613l = i16;
            this.f85612k = iH;
            this.f85614m = n.L(this.f85661e.f80552f, eVar.f95355q);
            io.bidmachine.media3.common.a aVar = this.f85661e;
            int i17 = aVar.f80552f;
            this.f85616o = i17 == 0 || (i17 & 1) != 0;
            this.f85619r = (aVar.f80551e & 1) != 0;
            this.f85626y = n.P(aVar);
            io.bidmachine.media3.common.a aVar2 = this.f85661e;
            int i18 = aVar2.E;
            this.f85620s = i18;
            this.f85621t = aVar2.F;
            int i19 = aVar2.f80556j;
            this.f85622u = i19;
            this.f85608g = (i19 == -1 || i19 <= eVar.f95357s) && (i18 == -1 || i18 <= eVar.f95356r) && predicate.apply(aVar2);
            String[] strArrP0 = o0.p0();
            int i20 = 0;
            while (true) {
                if (i20 >= strArrP0.length) {
                    iH2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    iH2 = n.H(this.f85661e, strArrP0[i20], false);
                    if (iH2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f85617p = i20;
            this.f85618q = iH2;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f95358t.size()) {
                    String str = this.f85661e.f80561o;
                    if (str != null && str.equals(eVar.f95358t.get(i21))) {
                        i14 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f85623v = i14;
            this.f85624w = j0.g(i12) == 128;
            this.f85625x = j0.i(i12) == 64;
            this.f85607f = g(i12, z10, i15);
        }

        public static int d(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static ImmutableList f(int i10, f0 f0Var, e eVar, int[] iArr, boolean z10, Predicate predicate, int i11) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < f0Var.f95294a; i12++) {
                builder.add(new b(i10, f0Var, i12, eVar, iArr[i12], z10, predicate, i11));
            }
            return builder.build();
        }

        private int g(int i10, boolean z10, int i11) {
            if (!j0.k(i10, this.f85610i.A0)) {
                return 0;
            }
            if (!this.f85608g && !this.f85610i.f85636t0) {
                return 0;
            }
            e eVar = this.f85610i;
            if (eVar.f95359u.f95369a == 2 && !n.V(eVar, i10, this.f85661e)) {
                return 0;
            }
            if (!j0.k(i10, false) || !this.f85608g || this.f85661e.f80556j == -1) {
                return 1;
            }
            e eVar2 = this.f85610i;
            if (eVar2.C || eVar2.B) {
                return 1;
            }
            return ((!eVar2.C0 && z10) || eVar2.f95359u.f95369a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // ja.n.i
        public int a() {
            return this.f85607f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            Ordering orderingReverse = (this.f85608g && this.f85611j) ? n.f85600j : n.f85600j.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.f85611j, bVar.f85611j).compare(Integer.valueOf(this.f85613l), Integer.valueOf(bVar.f85613l), Ordering.natural().reverse()).compare(this.f85612k, bVar.f85612k).compare(this.f85614m, bVar.f85614m).compareFalseFirst(this.f85619r, bVar.f85619r).compareFalseFirst(this.f85616o, bVar.f85616o).compare(Integer.valueOf(this.f85617p), Integer.valueOf(bVar.f85617p), Ordering.natural().reverse()).compare(this.f85618q, bVar.f85618q).compareFalseFirst(this.f85608g, bVar.f85608g).compare(Integer.valueOf(this.f85623v), Integer.valueOf(bVar.f85623v), Ordering.natural().reverse());
            if (this.f85610i.B) {
                comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(this.f85622u), Integer.valueOf(bVar.f85622u), n.f85600j.reverse());
            }
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.f85624w, bVar.f85624w).compareFalseFirst(this.f85625x, bVar.f85625x).compareFalseFirst(this.f85626y, bVar.f85626y).compare(Integer.valueOf(this.f85620s), Integer.valueOf(bVar.f85620s), orderingReverse).compare(Integer.valueOf(this.f85621t), Integer.valueOf(bVar.f85621t), orderingReverse);
            if (Objects.equals(this.f85609h, bVar.f85609h)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(this.f85622u), Integer.valueOf(bVar.f85622u), orderingReverse);
            }
            return comparisonChainCompare2.result();
        }

        @Override // ja.n.i
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean c(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f85610i.f85639w0 && ((i11 = this.f85661e.E) == -1 || i11 != bVar.f85661e.E)) {
                return false;
            }
            if (!this.f85615n && ((str = this.f85661e.f80561o) == null || !TextUtils.equals(str, bVar.f85661e.f80561o))) {
                return false;
            }
            e eVar = this.f85610i;
            if (!eVar.f85638v0 && ((i10 = this.f85661e.F) == -1 || i10 != bVar.f85661e.F)) {
                return false;
            }
            if (eVar.f85640x0) {
                return true;
            }
            return this.f85624w == bVar.f85624w && this.f85625x == bVar.f85625x;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends i implements Comparable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f85627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f85628g;

        public c(int i10, f0 f0Var, int i11, e eVar, int i12) {
            super(i10, f0Var, i11);
            this.f85627f = j0.k(i12, eVar.A0) ? 1 : 0;
            this.f85628g = this.f85661e.e();
        }

        public static int d(List list, List list2) {
            return ((c) list.get(0)).compareTo((c) list2.get(0));
        }

        public static ImmutableList f(int i10, f0 f0Var, e eVar, int[] iArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i11 = 0; i11 < f0Var.f95294a; i11++) {
                builder.add(new c(i10, f0Var, i11, eVar, iArr[i11]));
            }
            return builder.build();
        }

        @Override // ja.n.i
        public int a() {
            return this.f85627f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f85628g, cVar.f85628g);
        }

        @Override // ja.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean c(c cVar) {
            return false;
        }
    }

    private static final class d implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f85629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f85630c;

        public d(io.bidmachine.media3.common.a aVar, int i10) {
            this.f85629b = (aVar.f80551e & 1) != 0;
            this.f85630c = j0.k(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return ComparisonChain.start().compareFalseFirst(this.f85630c, dVar.f85630c).compareFalseFirst(this.f85629b, dVar.f85629b).result();
        }
    }

    public static final class e extends h0 {
        public static final e G0;
        public static final e H0;
        private static final String I0;
        private static final String J0;
        private static final String K0;
        private static final String L0;
        private static final String M0;
        private static final String N0;
        private static final String O0;
        private static final String P0;
        private static final String Q0;
        private static final String R0;
        private static final String S0;
        private static final String T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        private static final String f85631a1;
        public final boolean A0;
        public final boolean B0;
        public final boolean C0;
        public final boolean D0;
        private final SparseArray E0;
        private final SparseBooleanArray F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final boolean f85632p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final boolean f85633q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final boolean f85634r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f85635s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f85636t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final boolean f85637u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final boolean f85638v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final boolean f85639w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final boolean f85640x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f85641y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final boolean f85642z0;

        public static final class a extends h0.c {
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private boolean O;
            private boolean P;
            private boolean Q;
            private boolean R;
            private boolean S;
            private boolean T;
            private final SparseArray U;
            private final SparseBooleanArray V;

            private static SparseArray j0(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            private void k0() {
                this.F = true;
                this.G = false;
                this.H = true;
                this.I = false;
                this.J = true;
                this.K = false;
                this.L = false;
                this.M = false;
                this.N = false;
                this.O = true;
                this.P = true;
                this.Q = true;
                this.R = false;
                this.S = true;
                this.T = false;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
            public e F() {
                return new e(this);
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
            public a G(int i10) {
                super.G(i10);
                return this;
            }

            protected a l0(h0 h0Var) {
                super.J(h0Var);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
            public a K(int i10) {
                super.K(i10);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a L(g0 g0Var) {
                super.L(g0Var);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a M(String str) {
                super.M(str);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
            public a N(String... strArr) {
                super.N(strArr);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a O(int i10) {
                super.O(i10);
                return this;
            }

            @Override // n9.h0.c
            /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
            public a P(int i10, boolean z10) {
                super.P(i10, z10);
                return this;
            }

            public a() {
                this.U = new SparseArray();
                this.V = new SparseBooleanArray();
                k0();
            }

            private a(e eVar) {
                super(eVar);
                this.F = eVar.f85632p0;
                this.G = eVar.f85633q0;
                this.H = eVar.f85634r0;
                this.I = eVar.f85635s0;
                this.J = eVar.f85636t0;
                this.K = eVar.f85637u0;
                this.L = eVar.f85638v0;
                this.M = eVar.f85639w0;
                this.N = eVar.f85640x0;
                this.O = eVar.f85641y0;
                this.P = eVar.f85642z0;
                this.Q = eVar.A0;
                this.R = eVar.B0;
                this.S = eVar.C0;
                this.T = eVar.D0;
                this.U = j0(eVar.E0);
                this.V = eVar.F0.clone();
            }
        }

        static {
            e eVarF = new a().F();
            G0 = eVarF;
            H0 = eVarF;
            I0 = o0.C0(1000);
            J0 = o0.C0(1001);
            K0 = o0.C0(1002);
            L0 = o0.C0(1003);
            M0 = o0.C0(1004);
            N0 = o0.C0(1005);
            O0 = o0.C0(1006);
            P0 = o0.C0(1007);
            Q0 = o0.C0(1008);
            R0 = o0.C0(1009);
            S0 = o0.C0(1010);
            T0 = o0.C0(1011);
            U0 = o0.C0(1012);
            V0 = o0.C0(1013);
            W0 = o0.C0(1014);
            X0 = o0.C0(1015);
            Y0 = o0.C0(1016);
            Z0 = o0.C0(1017);
            f85631a1 = o0.C0(1018);
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !f((Map) sparseArray.valueAt(i10), (Map) sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean f(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                m1 m1Var = (m1) entry.getKey();
                if (!map2.containsKey(m1Var) || !Objects.equals(entry.getValue(), map2.get(m1Var))) {
                    return false;
                }
            }
            return true;
        }

        @Override // n9.h0
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f85632p0 == eVar.f85632p0 && this.f85633q0 == eVar.f85633q0 && this.f85634r0 == eVar.f85634r0 && this.f85635s0 == eVar.f85635s0 && this.f85636t0 == eVar.f85636t0 && this.f85637u0 == eVar.f85637u0 && this.f85638v0 == eVar.f85638v0 && this.f85639w0 == eVar.f85639w0 && this.f85640x0 == eVar.f85640x0 && this.f85641y0 == eVar.f85641y0 && this.f85642z0 == eVar.f85642z0 && this.A0 == eVar.A0 && this.B0 == eVar.B0 && this.C0 == eVar.C0 && this.D0 == eVar.D0 && d(this.F0, eVar.F0) && e(this.E0, eVar.E0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // n9.h0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean h(int i10) {
            return this.F0.get(i10);
        }

        @Override // n9.h0
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f85632p0 ? 1 : 0)) * 31) + (this.f85633q0 ? 1 : 0)) * 31) + (this.f85634r0 ? 1 : 0)) * 31) + (this.f85635s0 ? 1 : 0)) * 31) + (this.f85636t0 ? 1 : 0)) * 31) + (this.f85637u0 ? 1 : 0)) * 31) + (this.f85638v0 ? 1 : 0)) * 31) + (this.f85639w0 ? 1 : 0)) * 31) + (this.f85640x0 ? 1 : 0)) * 31) + (this.f85641y0 ? 1 : 0)) * 31) + (this.f85642z0 ? 1 : 0)) * 31) + (this.A0 ? 1 : 0)) * 31) + (this.B0 ? 1 : 0)) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0);
        }

        public f i(int i10, m1 m1Var) {
            Map map = (Map) this.E0.get(i10);
            if (map != null) {
                androidx.privacysandbox.ads.adservices.topics.a.a(map.get(m1Var));
            }
            return null;
        }

        public boolean j(int i10, m1 m1Var) {
            Map map = (Map) this.E0.get(i10);
            return map != null && map.containsKey(m1Var);
        }

        private e(a aVar) {
            super(aVar);
            this.f85632p0 = aVar.F;
            this.f85633q0 = aVar.G;
            this.f85634r0 = aVar.H;
            this.f85635s0 = aVar.I;
            this.f85636t0 = aVar.J;
            this.f85637u0 = aVar.K;
            this.f85638v0 = aVar.L;
            this.f85639w0 = aVar.M;
            this.f85640x0 = aVar.N;
            this.f85641y0 = aVar.O;
            this.f85642z0 = aVar.P;
            this.A0 = aVar.Q;
            this.B0 = aVar.R;
            this.C0 = aVar.S;
            this.D0 = aVar.T;
            this.E0 = aVar.U;
            this.F0 = aVar.V;
        }
    }

    public static final class f {
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Spatializer f85643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f85644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f85645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f85646d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f85647a;

            a(n nVar) {
                this.f85647a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f85647a.S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f85647a.S();
            }
        }

        public g(Context context, n nVar) {
            AudioManager audioManagerC = context == null ? null : o9.d.c(context);
            if (audioManagerC == null || o0.K0((Context) q9.a.e(context))) {
                this.f85643a = null;
                this.f85644b = false;
                this.f85645c = null;
                this.f85646d = null;
                return;
            }
            Spatializer spatializer = audioManagerC.getSpatializer();
            this.f85643a = spatializer;
            this.f85644b = spatializer.getImmersiveAudioLevel() != 0;
            a aVar = new a(nVar);
            this.f85646d = aVar;
            Handler handler = new Handler((Looper) q9.a.i(Looper.myLooper()));
            this.f85645c = handler;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new androidx.emoji2.text.a(handler), aVar);
        }

        public boolean a(n9.c cVar, io.bidmachine.media3.common.a aVar) {
            int i10;
            if (Objects.equals(aVar.f80561o, "audio/eac3-joc")) {
                i10 = aVar.E;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(aVar.f80561o, "audio/iamf")) {
                i10 = aVar.E;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(aVar.f80561o, "audio/ac4")) {
                i10 = aVar.E;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = aVar.E;
            }
            int iM = o0.M(i10);
            if (iM == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM);
            int i11 = aVar.F;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return k2.a(q9.a.e(this.f85643a)).canBeSpatialized(cVar.a().f95236a, channelMask.build());
        }

        public boolean b() {
            return k2.a(q9.a.e(this.f85643a)).isAvailable();
        }

        public boolean c() {
            return k2.a(q9.a.e(this.f85643a)).isEnabled();
        }

        public boolean d() {
            return this.f85644b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f85643a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f85646d) == null || this.f85645c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f85645c.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h extends i implements Comparable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f85649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f85650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f85651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f85652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f85653j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f85654k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f85655l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f85656m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f85657n;

        /* JADX WARN: Multi-variable type inference failed */
        public h(int i10, f0 f0Var, int i11, e eVar, int i12, String str, String str2) {
            int iH;
            super(i10, f0Var, i11);
            int i13 = 0;
            this.f85650g = j0.k(i12, false);
            int i14 = this.f85661e.f80551e & (~eVar.f95363y);
            this.f85651h = (i14 & 1) != 0;
            this.f85652i = (i14 & 2) != 0;
            ImmutableList immutableListOf = str2 != null ? ImmutableList.of(str2) : eVar.f95360v.isEmpty() ? ImmutableList.of("") : eVar.f95360v;
            int i15 = 0;
            while (true) {
                if (i15 >= immutableListOf.size()) {
                    i15 = Integer.MAX_VALUE;
                    iH = 0;
                    break;
                } else {
                    iH = n.H(this.f85661e, (String) immutableListOf.get(i15), eVar.f95364z);
                    if (iH > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f85653j = i15;
            this.f85654k = iH;
            int iL = n.L(this.f85661e.f80552f, str2 != null ? 1088 : eVar.f95361w);
            this.f85655l = iL;
            this.f85657n = (1088 & this.f85661e.f80552f) != 0;
            int iH2 = n.H(this.f85661e, str, n.U(str) == null);
            this.f85656m = iH2;
            boolean z10 = iH > 0 || (eVar.f95360v.isEmpty() && iL > 0) || this.f85651h || (this.f85652i && iH2 > 0);
            if (j0.k(i12, eVar.A0) && z10) {
                i13 = 1;
            }
            this.f85649f = i13;
        }

        public static int d(List list, List list2) {
            return ((h) list.get(0)).compareTo((h) list2.get(0));
        }

        public static ImmutableList f(int i10, f0 f0Var, e eVar, int[] iArr, String str, String str2) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i11 = 0; i11 < f0Var.f95294a; i11++) {
                builder.add(new h(i10, f0Var, i11, eVar, iArr[i11], str, str2));
            }
            return builder.build();
        }

        @Override // ja.n.i
        public int a() {
            return this.f85649f;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.f85650g, hVar.f85650g).compare(Integer.valueOf(this.f85653j), Integer.valueOf(hVar.f85653j), Ordering.natural().reverse()).compare(this.f85654k, hVar.f85654k).compare(this.f85655l, hVar.f85655l).compareFalseFirst(this.f85651h, hVar.f85651h).compare(Boolean.valueOf(this.f85652i), Boolean.valueOf(hVar.f85652i), this.f85654k == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.f85656m, hVar.f85656m);
            if (this.f85655l == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.f85657n, hVar.f85657n);
            }
            return comparisonChainCompare.result();
        }

        @Override // ja.n.i
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean c(h hVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f85658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f85659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f85661e;

        public interface a {
            List a(int i10, f0 f0Var, int[] iArr);
        }

        public i(int i10, f0 f0Var, int i11) {
            this.f85658b = i10;
            this.f85659c = f0Var;
            this.f85660d = i11;
            this.f85661e = f0Var.a(i11);
        }

        public abstract int a();

        public abstract boolean c(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f85662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f85663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f85664h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f85665i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f85666j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f85667k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f85668l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f85669m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f85670n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f85671o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f85672p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final boolean f85673q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f85674r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final boolean f85675s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f85676t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f85677u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final boolean f85678v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f85679w;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(int r5, n9.f0 r6, int r7, ja.n.e r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instruction units count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ja.n.j.<init>(int, n9.f0, int, ja.n$e, int, java.lang.String, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(j jVar, j jVar2) {
            ComparisonChain comparisonChainCompareFalseFirst = ComparisonChain.start().compareFalseFirst(jVar.f85665i, jVar2.f85665i).compare(Integer.valueOf(jVar.f85670n), Integer.valueOf(jVar2.f85670n), Ordering.natural().reverse()).compare(jVar.f85671o, jVar2.f85671o).compare(jVar.f85672p, jVar2.f85672p).compareFalseFirst(jVar.f85673q, jVar2.f85673q).compare(jVar.f85674r, jVar2.f85674r).compareFalseFirst(jVar.f85666j, jVar2.f85666j).compareFalseFirst(jVar.f85662f, jVar2.f85662f).compareFalseFirst(jVar.f85664h, jVar2.f85664h).compare(Integer.valueOf(jVar.f85669m), Integer.valueOf(jVar2.f85669m), Ordering.natural().reverse()).compareFalseFirst(jVar.f85677u, jVar2.f85677u).compareFalseFirst(jVar.f85678v, jVar2.f85678v);
            if (jVar.f85677u && jVar.f85678v) {
                comparisonChainCompareFalseFirst = comparisonChainCompareFalseFirst.compare(jVar.f85679w, jVar2.f85679w);
            }
            return comparisonChainCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int g(j jVar, j jVar2) {
            Ordering orderingReverse = (jVar.f85662f && jVar.f85665i) ? n.f85600j : n.f85600j.reverse();
            ComparisonChain comparisonChainStart = ComparisonChain.start();
            if (jVar.f85663g.B) {
                comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(jVar.f85667k), Integer.valueOf(jVar2.f85667k), n.f85600j.reverse());
            }
            return comparisonChainStart.compare(Integer.valueOf(jVar.f85668l), Integer.valueOf(jVar2.f85668l), orderingReverse).compare(Integer.valueOf(jVar.f85667k), Integer.valueOf(jVar2.f85667k), orderingReverse).result();
        }

        public static int h(List list, List list2) {
            return ComparisonChain.start().compare((j) Collections.max(list, new Comparator() { // from class: ja.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: ja.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: ja.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.f((n.j) obj, (n.j) obj2);
                }
            }).compare(list.size(), list2.size()).compare((j) Collections.max(list, new Comparator() { // from class: ja.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: ja.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: ja.p
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.g((n.j) obj, (n.j) obj2);
                }
            }).result();
        }

        public static ImmutableList i(int i10, f0 f0Var, e eVar, int[] iArr, String str, int i11, Point point) {
            int I = n.I(f0Var, point != null ? point.x : eVar.f95347i, point != null ? point.y : eVar.f95348j, eVar.f95350l);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < f0Var.f95294a; i12++) {
                int iE = f0Var.a(i12).e();
                builder.add(new j(i10, f0Var, i12, eVar, iArr[i12], str, i11, I == Integer.MAX_VALUE || (iE != -1 && iE <= I)));
            }
            return builder.build();
        }

        private int j(int i10, int i11) {
            if ((this.f85661e.f80552f & 16384) != 0 || !j0.k(i10, this.f85663g.A0)) {
                return 0;
            }
            if (!this.f85662f && !this.f85663g.f85632p0) {
                return 0;
            }
            if (!j0.k(i10, false) || !this.f85664h || !this.f85662f || this.f85661e.f80556j == -1) {
                return 1;
            }
            e eVar = this.f85663g;
            return (eVar.C || eVar.B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // ja.n.i
        public int a() {
            return this.f85676t;
        }

        @Override // ja.n.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean c(j jVar) {
            if (!this.f85675s && !Objects.equals(this.f85661e.f80561o, jVar.f85661e.f80561o)) {
                return false;
            }
            if (this.f85663g.f85635s0) {
                return true;
            }
            return this.f85677u == jVar.f85677u && this.f85678v == jVar.f85678v;
        }
    }

    public n(Context context) {
        this(context, new a.b());
    }

    private static void E(t.a aVar, e eVar, r.a[] aVarArr) {
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            m1 m1VarF = aVar.f(i10);
            if (eVar.j(i10, m1VarF)) {
                eVar.i(i10, m1VarF);
                aVarArr[i10] = null;
            }
        }
    }

    private static void F(t.a aVar, h0 h0Var, r.a[] aVarArr) {
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < iD; i10++) {
            G(aVar.f(i10), h0Var, map);
        }
        G(aVar.h(), h0Var, map);
        for (int i11 = 0; i11 < iD; i11++) {
            g0 g0Var = (g0) map.get(Integer.valueOf(aVar.e(i11)));
            if (g0Var != null) {
                aVarArr[i11] = (g0Var.f95323b.isEmpty() || aVar.f(i11).d(g0Var.f95322a) == -1) ? null : new r.a(g0Var.f95322a, Ints.toArray(g0Var.f95323b));
            }
        }
    }

    private static void G(m1 m1Var, h0 h0Var, Map map) {
        g0 g0Var;
        for (int i10 = 0; i10 < m1Var.f72380a; i10++) {
            g0 g0Var2 = (g0) h0Var.D.get(m1Var.b(i10));
            if (g0Var2 != null && ((g0Var = (g0) map.get(Integer.valueOf(g0Var2.a()))) == null || (g0Var.f95323b.isEmpty() && !g0Var2.f95323b.isEmpty()))) {
                map.put(Integer.valueOf(g0Var2.a()), g0Var2);
            }
        }
    }

    protected static int H(io.bidmachine.media3.common.a aVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(aVar.f80550d)) {
            return 4;
        }
        String strU = U(str);
        String strU2 = U(aVar.f80550d);
        if (strU2 == null || strU == null) {
            return (z10 && strU2 == null) ? 1 : 0;
        }
        if (strU2.startsWith(strU) || strU.startsWith(strU2)) {
            return 3;
        }
        return o0.k1(strU2, TokenBuilder.TOKEN_DELIMITER)[0].equals(o0.k1(strU, TokenBuilder.TOKEN_DELIMITER)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(f0 f0Var, int i10, int i11, boolean z10) {
        int i12;
        int i13 = Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < f0Var.f95294a; i14++) {
                io.bidmachine.media3.common.a aVarA = f0Var.a(i14);
                int i15 = aVarA.f80568v;
                if (i15 > 0 && (i12 = aVarA.f80569w) > 0) {
                    Point pointD = v.d(z10, i10, i11, i15, i12);
                    int i16 = aVarA.f80568v;
                    int i17 = aVarA.f80569w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointD.x * 0.98f)) && i17 >= ((int) (pointD.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    private static String K(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return o0.e0(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(io.bidmachine.media3.common.a aVar, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        if (!eVar.f85642z0 || (i10 = aVar.E) == -1 || i10 <= 2) {
            return true;
        }
        if (!O(aVar) || (o0.f98837a >= 32 && (gVar2 = this.f85605h) != null && gVar2.d())) {
            return o0.f98837a >= 32 && (gVar = this.f85605h) != null && gVar.d() && this.f85605h.b() && this.f85605h.c() && this.f85605h.a(this.f85606i, aVar);
        }
        return true;
    }

    private static boolean O(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    private static void Q(e eVar, t.a aVar, int[][][] iArr, k0[] k0VarArr, r[] rVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if (iE != 1 && rVar != null) {
                return;
            }
            if (iE == 1 && rVar != null && rVar.length() == 1) {
                if (V(eVar, iArr[i12][aVar.f(i12).d(rVar.getTrackGroup())][rVar.getIndexInTrackGroup(0)], rVar.getSelectedFormat())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f95359u.f95370b ? 1 : 2;
            k0 k0Var = k0VarArr[i10];
            if (k0Var != null && k0Var.f105315b) {
                z10 = true;
            }
            k0VarArr[i10] = new k0(i13, z10);
        }
    }

    private static void R(t.a aVar, int[][][] iArr, k0[] k0VarArr, r[] rVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            r rVar = rVarArr[i12];
            if ((iE == 1 || iE == 2) && rVar != null && W(iArr[i12], aVar.f(i12), rVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            k0 k0Var = new k0(0, true);
            k0VarArr[i11] = k0Var;
            k0VarArr[i10] = k0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        boolean z10;
        g gVar;
        synchronized (this.f85601d) {
            try {
                z10 = this.f85604g.f85642z0 && o0.f98837a >= 32 && (gVar = this.f85605h) != null && gVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    private void T(i2 i2Var) {
        boolean z10;
        synchronized (this.f85601d) {
            z10 = this.f85604g.D0;
        }
        if (z10) {
            g(i2Var);
        }
    }

    protected static String U(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean V(e eVar, int i10, io.bidmachine.media3.common.a aVar) {
        if (j0.f(i10) == 0) {
            return false;
        }
        if (eVar.f95359u.f95371c && (j0.f(i10) & 2048) == 0) {
            return false;
        }
        if (eVar.f95359u.f95370b) {
            boolean z10 = (aVar.H == 0 && aVar.I == 0) ? false : true;
            boolean z11 = (j0.f(i10) & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private static boolean W(int[][] iArr, m1 m1Var, r rVar) {
        if (rVar == null) {
            return false;
        }
        int iD = m1Var.d(rVar.getTrackGroup());
        for (int i10 = 0; i10 < rVar.length(); i10++) {
            if (j0.j(iArr[iD][rVar.getIndexInTrackGroup(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair c0(int i10, t.a aVar, int[][][] iArr, i.a aVar2, Comparator comparator) {
        int i11;
        RandomAccess randomAccessOf;
        t.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                m1 m1VarF = aVar3.f(i12);
                for (int i13 = 0; i13 < m1VarF.f72380a; i13++) {
                    f0 f0VarB = m1VarF.b(i13);
                    List listA = aVar2.a(i12, f0VarB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[f0VarB.f95294a];
                    int i14 = 0;
                    while (i14 < f0VarB.f95294a) {
                        i iVar = (i) listA.get(i14);
                        int iA = iVar.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessOf = ImmutableList.of(iVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(iVar);
                                int i15 = i14 + 1;
                                while (i15 < f0VarB.f95294a) {
                                    i iVar2 = (i) listA.get(i15);
                                    int i16 = iD;
                                    if (iVar2.a() == 2 && iVar.c(iVar2)) {
                                        arrayList2.add(iVar2);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessOf);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f85660d;
        }
        i iVar3 = (i) list.get(0);
        return Pair.create(new r.a(iVar3.f85659c, iArr2), Integer.valueOf(iVar3.f85658b));
    }

    private void e0(e eVar) {
        boolean zEquals;
        q9.a.e(eVar);
        synchronized (this.f85601d) {
            zEquals = this.f85604g.equals(eVar);
            this.f85604g = eVar;
        }
        if (zEquals) {
            return;
        }
        if (eVar.f85642z0 && this.f85602e == null) {
            q9.u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        f();
    }

    public static /* synthetic */ int t(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ List u(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, f0 f0Var, int[] iArr2) {
        nVar.getClass();
        return b.f(i10, f0Var, eVar, iArr2, z10, new Predicate() { // from class: ja.m
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return this.f85598b.N((io.bidmachine.media3.common.a) obj, eVar);
            }
        }, iArr[i10]);
    }

    @Override // ja.w
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f85601d) {
            eVar = this.f85604g;
        }
        return eVar;
    }

    protected r.a[] X(t.a aVar, int[][][] iArr, int[] iArr2, e eVar) {
        String str;
        int iD = aVar.d();
        r.a[] aVarArr = new r.a[iD];
        Pair pairY = Y(aVar, iArr, iArr2, eVar);
        if (pairY != null) {
            aVarArr[((Integer) pairY.second).intValue()] = (r.a) pairY.first;
        }
        if (pairY == null) {
            str = null;
        } else {
            Object obj = pairY.first;
            str = ((r.a) obj).f85680a.a(((r.a) obj).f85681b[0]).f80550d;
        }
        Pair pairD0 = d0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        Pair pairZ = (eVar.A || pairD0 == null) ? Z(aVar, iArr, eVar) : null;
        if (pairZ != null) {
            aVarArr[((Integer) pairZ.second).intValue()] = (r.a) pairZ.first;
        } else if (pairD0 != null) {
            aVarArr[((Integer) pairD0.second).intValue()] = (r.a) pairD0.first;
        }
        Pair pairB0 = b0(aVar, iArr, eVar, str2);
        if (pairB0 != null) {
            aVarArr[((Integer) pairB0.second).intValue()] = (r.a) pairB0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = a0(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    protected Pair Y(t.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f72380a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return c0(1, aVar, iArr, new i.a() { // from class: ja.h
            @Override // ja.n.i.a
            public final List a(int i11, f0 f0Var, int[] iArr3) {
                return n.u(this.f85593a, eVar, z10, iArr2, i11, f0Var, iArr3);
            }
        }, new Comparator() { // from class: ja.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.d((List) obj, (List) obj2);
            }
        });
    }

    protected Pair Z(t.a aVar, int[][][] iArr, final e eVar) {
        if (eVar.f95359u.f95369a == 2) {
            return null;
        }
        return c0(4, aVar, iArr, new i.a() { // from class: ja.j
            @Override // ja.n.i.a
            public final List a(int i10, f0 f0Var, int[] iArr2) {
                return n.c.f(i10, f0Var, eVar, iArr2);
            }
        }, new Comparator() { // from class: ja.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.d((List) obj, (List) obj2);
            }
        });
    }

    @Override // io.bidmachine.media3.exoplayer.j2.a
    public void a(i2 i2Var) {
        T(i2Var);
    }

    protected r.a a0(int i10, m1 m1Var, int[][] iArr, e eVar) {
        if (eVar.f95359u.f95369a == 2) {
            return null;
        }
        int i11 = 0;
        f0 f0Var = null;
        d dVar = null;
        for (int i12 = 0; i12 < m1Var.f72380a; i12++) {
            f0 f0VarB = m1Var.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < f0VarB.f95294a; i13++) {
                if (j0.k(iArr2[i13], eVar.A0)) {
                    d dVar2 = new d(f0VarB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        f0Var = f0VarB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (f0Var == null) {
            return null;
        }
        return new r.a(f0Var, i11);
    }

    protected Pair b0(t.a aVar, int[][][] iArr, final e eVar, final String str) {
        if (eVar.f95359u.f95369a == 2) {
            return null;
        }
        final String strK = eVar.f95362x ? K(this.f85602e) : null;
        return c0(3, aVar, iArr, new i.a() { // from class: ja.d
            @Override // ja.n.i.a
            public final List a(int i10, f0 f0Var, int[] iArr2) {
                return n.h.f(i10, f0Var, eVar, iArr2, str, strK);
            }
        }, new Comparator() { // from class: ja.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.d((List) obj, (List) obj2);
            }
        });
    }

    protected Pair d0(t.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) {
        Context context;
        final Point pointV = null;
        if (eVar.f95359u.f95369a == 2) {
            return null;
        }
        if (eVar.f95349k && (context = this.f85602e) != null) {
            pointV = o0.V(context);
        }
        return c0(2, aVar, iArr, new i.a() { // from class: ja.f
            @Override // ja.n.i.a
            public final List a(int i10, f0 f0Var, int[] iArr3) {
                return n.j.i(i10, f0Var, eVar, iArr3, str, iArr2[i10], pointV);
            }
        }, new Comparator() { // from class: ja.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.h((List) obj, (List) obj2);
            }
        });
    }

    @Override // ja.w
    public boolean h() {
        return true;
    }

    @Override // ja.w
    public void j() {
        g gVar;
        if (o0.f98837a >= 32 && (gVar = this.f85605h) != null) {
            gVar.e();
        }
        super.j();
    }

    @Override // ja.w
    public void l(n9.c cVar) {
        if (this.f85606i.equals(cVar)) {
            return;
        }
        this.f85606i = cVar;
        S();
    }

    @Override // ja.w
    public void m(h0 h0Var) {
        if (h0Var instanceof e) {
            e0((e) h0Var);
        }
        e0(new e.a().l0(h0Var).F());
    }

    @Override // ja.t
    protected final Pair q(t.a aVar, int[][][] iArr, int[] iArr2, f0.b bVar, e0 e0Var) {
        e eVar;
        synchronized (this.f85601d) {
            eVar = this.f85604g;
        }
        if (eVar.f85642z0 && o0.f98837a >= 32 && this.f85605h == null) {
            this.f85605h = new g(this.f85602e, this);
        }
        int iD = aVar.d();
        r.a[] aVarArrX = X(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrX);
        E(aVar, eVar, aVarArrX);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.h(i10) || eVar.E.contains(Integer.valueOf(iE))) {
                aVarArrX[i10] = null;
            }
        }
        r[] rVarArrA = this.f85603f.a(aVarArrX, b(), bVar, e0Var);
        k0[] k0VarArr = new k0[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            k0VarArr[i11] = (eVar.h(i11) || eVar.E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && rVarArrA[i11] == null)) ? null : k0.f105313c;
        }
        if (eVar.B0) {
            R(aVar, iArr, k0VarArr, rVarArrA);
        }
        if (eVar.f95359u.f95369a != 0) {
            Q(eVar, aVar, iArr, k0VarArr, rVarArrA);
        }
        return Pair.create(k0VarArr, rVarArrA);
    }

    public n(Context context, r.b bVar) {
        this(context, e.G0, bVar);
    }

    public n(Context context, h0 h0Var, r.b bVar) {
        this(h0Var, bVar, context);
    }

    private n(h0 h0Var, r.b bVar, Context context) {
        this.f85601d = new Object();
        this.f85602e = context != null ? context.getApplicationContext() : null;
        this.f85603f = bVar;
        if (h0Var instanceof e) {
            this.f85604g = (e) h0Var;
        } else {
            this.f85604g = e.G0.a().l0(h0Var).F();
        }
        this.f85606i = n9.c.f95224g;
        if (this.f85604g.f85642z0 && context == null) {
            q9.u.h("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // ja.w
    public j2.a d() {
        return this;
    }
}
