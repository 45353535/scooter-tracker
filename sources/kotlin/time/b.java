package kotlin.time;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f93560c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f93561d = j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f93562e = c.j(4611686018427387903L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f93563f = c.j(-4611686018427387903L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f93564b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return b.f93562e;
        }

        public final long b() {
            return b.f93563f;
        }

        public final long c() {
            return b.f93561d;
        }

        public final long d(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return c.p(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        private a() {
        }
    }

    private /* synthetic */ b(long j10) {
        this.f93564b = j10;
    }

    private static final boolean A(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean B(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean C(long j10) {
        return j10 == f93562e || j10 == f93563f;
    }

    public static final boolean D(long j10) {
        return j10 < 0;
    }

    public static final boolean E(long j10) {
        return j10 > 0;
    }

    public static final long F(long j10, long j11) {
        return G(j10, M(j11));
    }

    public static final long G(long j10, long j11) {
        if (C(j10)) {
            if (z(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (C(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return A(j10) ? e(j10, x(j10), x(j11)) : e(j10, x(j11), x(j10));
        }
        long jX = x(j10) + x(j11);
        return B(j10) ? c.m(jX) : c.k(jX);
    }

    public static final double H(long j10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f93562e) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f93563f) {
            return Double.NEGATIVE_INFINITY;
        }
        return d.a(x(j10), w(j10), unit);
    }

    public static final int I(long j10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) kotlin.ranges.g.p(K(j10, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    public static final String J(long j10) {
        StringBuilder sb2 = new StringBuilder();
        if (D(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jM = m(j10);
        long jP = p(jM);
        int iT = t(jM);
        int iV = v(jM);
        int iU = u(jM);
        long j11 = C(j10) ? 9999999999999L : jP;
        boolean z10 = false;
        boolean z11 = j11 != 0;
        boolean z12 = (iV == 0 && iU == 0) ? false : true;
        if (iT != 0 || (z12 && z11)) {
            z10 = true;
        }
        if (z11) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z10) {
            sb2.append(iT);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z10)) {
            f(j10, sb2, iV, iU, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb2.toString();
    }

    public static final long K(long j10, cg.b unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == f93562e) {
            return Long.MAX_VALUE;
        }
        if (j10 == f93563f) {
            return Long.MIN_VALUE;
        }
        return d.b(x(j10), w(j10), unit);
    }

    public static String L(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f93562e) {
            return "Infinity";
        }
        if (j10 == f93563f) {
            return "-Infinity";
        }
        boolean zD = D(j10);
        StringBuilder sb2 = new StringBuilder();
        if (zD) {
            sb2.append('-');
        }
        long jM = m(j10);
        long jO = o(jM);
        int iN = n(jM);
        int iT = t(jM);
        int iV = v(jM);
        int iU = u(jM);
        int i10 = 0;
        boolean z10 = jO != 0;
        boolean z11 = iN != 0;
        boolean z12 = iT != 0;
        boolean z13 = (iV == 0 && iU == 0) ? false : true;
        if (z10) {
            sb2.append(jO);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iN);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(iT);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (iV != 0 || z10 || z11 || z12) {
                f(j10, sb2, iV, iU, 9, "s", false);
            } else if (iU >= 1000000) {
                f(j10, sb2, iU / 1000000, iU % 1000000, 6, "ms", false);
            } else if (iU >= 1000) {
                f(j10, sb2, iU / 1000, iU % 1000, 3, "us", false);
            } else {
                sb2.append(iU);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (zD && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long M(long j10) {
        return c.i(-x(j10), ((int) j10) & 1);
    }

    private static final long e(long j10, long j11, long j12) {
        long jO = c.o(j12);
        long j13 = j11 + jO;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(kotlin.ranges.g.p(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(jO)));
    }

    private static final void f(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strH0 = StringsKt.H0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strH0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strH0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strH0, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) strH0, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ b g(long j10) {
        return new b(j10);
    }

    public static int i(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.compare(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return D(j10) ? -i10 : i10;
    }

    public static long j(long j10) {
        if (!cg.a.a()) {
            return j10;
        }
        if (B(j10)) {
            long jX = x(j10);
            if (-4611686018426999999L <= jX && jX < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(x(j10) + " ns is out of nanoseconds range");
        }
        long jX2 = x(j10);
        if (-4611686018427387903L > jX2 || jX2 >= 4611686018427387904L) {
            throw new AssertionError(x(j10) + " ms is out of milliseconds range");
        }
        long jX3 = x(j10);
        if (-4611686018426L > jX3 || jX3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(x(j10) + " ms is denormalized");
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).N();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final long m(long j10) {
        return D(j10) ? M(j10) : j10;
    }

    public static final int n(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (p(j10) % ((long) 24));
    }

    public static final long o(long j10) {
        return K(j10, cg.b.f6842i);
    }

    public static final long p(long j10) {
        return K(j10, cg.b.f6841h);
    }

    public static final long q(long j10) {
        return (A(j10) && z(j10)) ? x(j10) : K(j10, cg.b.f6838e);
    }

    public static final long r(long j10) {
        return K(j10, cg.b.f6840g);
    }

    public static final long s(long j10) {
        return K(j10, cg.b.f6839f);
    }

    public static final int t(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (r(j10) % ((long) 60));
    }

    public static final int u(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (A(j10) ? c.n(x(j10) % ((long) 1000)) : x(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    public static final int v(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (s(j10) % ((long) 60));
    }

    private static final cg.b w(long j10) {
        return B(j10) ? cg.b.f6836c : cg.b.f6838e;
    }

    private static final long x(long j10) {
        return j10 >> 1;
    }

    public static int y(long j10) {
        return androidx.collection.b.a(j10);
    }

    public static final boolean z(long j10) {
        return !C(j10);
    }

    public final /* synthetic */ long N() {
        return this.f93564b;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return h(((b) obj).N());
    }

    public boolean equals(Object obj) {
        return k(this.f93564b, obj);
    }

    public int h(long j10) {
        return i(this.f93564b, j10);
    }

    public int hashCode() {
        return y(this.f93564b);
    }

    public String toString() {
        return L(this.f93564b);
    }
}
