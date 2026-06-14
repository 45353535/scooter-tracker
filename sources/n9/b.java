package n9;

import android.net.Uri;
import j$.util.Objects;
import java.util.Arrays;
import n9.r;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f95190g = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f95191h = new a(0).h(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f95192i = o0.C0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f95193j = o0.C0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f95194k = o0.C0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f95195l = o0.C0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f95196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f95199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f95200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a[] f95201f;

    public static final class a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f95202l = o0.C0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f95203m = o0.C0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f95204n = o0.C0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f95205o = o0.C0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f95206p = o0.C0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final String f95207q = o0.C0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final String f95208r = o0.C0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final String f95209s = o0.C0(7);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final String f95210t = o0.C0(8);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        static final String f95211u = o0.C0(9);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        static final String f95212v = o0.C0(10);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f95213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f95214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f95215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f95216d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final r[] f95217e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f95218f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f95219g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String[] f95220h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f95221i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f95222j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f95223k;

        public a(long j10) {
            this(j10, -1, -1, new int[0], new r[0], new long[0], 0L, false, new String[0], false);
        }

        private static long[] a(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        private static int[] b(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public int c() {
            return d(-1);
        }

        public int d(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f95218f;
                if (i12 >= iArr.length || this.f95222j || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean e() {
            if (this.f95214b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f95214b; i10++) {
                int i11 = this.f95218f[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f95213a == aVar.f95213a && this.f95214b == aVar.f95214b && this.f95215c == aVar.f95215c && Arrays.equals(this.f95217e, aVar.f95217e) && Arrays.equals(this.f95218f, aVar.f95218f) && Arrays.equals(this.f95219g, aVar.f95219g) && this.f95221i == aVar.f95221i && this.f95222j == aVar.f95222j && Arrays.equals(this.f95220h, aVar.f95220h) && this.f95223k == aVar.f95223k) {
                    return true;
                }
            }
            return false;
        }

        public boolean f() {
            return this.f95223k && this.f95213a == Long.MIN_VALUE && this.f95214b == -1;
        }

        public boolean g() {
            return this.f95214b == -1 || c() < this.f95214b;
        }

        public a h(int i10) {
            int[] iArrB = b(this.f95218f, i10);
            long[] jArrA = a(this.f95219g, i10);
            return new a(this.f95213a, i10, this.f95215c, iArrB, (r[]) Arrays.copyOf(this.f95217e, i10), jArrA, this.f95221i, this.f95222j, (String[]) Arrays.copyOf(this.f95220h, i10), this.f95223k);
        }

        public int hashCode() {
            int i10 = ((this.f95214b * 31) + this.f95215c) * 31;
            long j10 = this.f95213a;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f95217e)) * 31) + Arrays.hashCode(this.f95218f)) * 31) + Arrays.hashCode(this.f95219g)) * 31;
            long j11 = this.f95221i;
            return ((((((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f95222j ? 1 : 0)) * 31) + Arrays.hashCode(this.f95220h)) * 31) + (this.f95223k ? 1 : 0);
        }

        private a(long j10, int i10, int i11, int[] iArr, r[] rVarArr, long[] jArr, long j11, boolean z10, String[] strArr, boolean z11) {
            int i12 = 0;
            q9.a.a(iArr.length == rVarArr.length);
            this.f95213a = j10;
            this.f95214b = i10;
            this.f95215c = i11;
            this.f95218f = iArr;
            this.f95217e = rVarArr;
            this.f95219g = jArr;
            this.f95221i = j11;
            this.f95222j = z10;
            this.f95216d = new Uri[rVarArr.length];
            while (true) {
                Uri[] uriArr = this.f95216d;
                if (i12 >= uriArr.length) {
                    this.f95220h = strArr;
                    this.f95223k = z11;
                    return;
                } else {
                    r rVar = rVarArr[i12];
                    uriArr[i12] = rVar == null ? null : ((r.h) q9.a.e(rVar.f95455b)).f95547a;
                    i12++;
                }
            }
        }
    }

    private b(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f95196a = obj;
        this.f95198c = j10;
        this.f95199d = j11;
        this.f95197b = aVarArr.length + i10;
        this.f95201f = aVarArr;
        this.f95200e = i10;
    }

    private boolean e(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        a aVarA = a(i10);
        long j12 = aVarA.f95213a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || aVarA.f() || j10 < j11 : j10 < j12;
    }

    public a a(int i10) {
        int i11 = this.f95200e;
        return i10 < i11 ? f95191h : this.f95201f[i10 - i11];
    }

    public int b(long j10, long j11) {
        if (j10 != Long.MIN_VALUE && (j11 == -9223372036854775807L || j10 < j11)) {
            int i10 = this.f95200e;
            while (i10 < this.f95197b && ((a(i10).f95213a != Long.MIN_VALUE && a(i10).f95213a <= j10) || !a(i10).g())) {
                i10++;
            }
            if (i10 < this.f95197b) {
                return i10;
            }
        }
        return -1;
    }

    public int c(long j10, long j11) {
        int i10 = this.f95197b - 1;
        int i11 = i10 - (d(i10) ? 1 : 0);
        while (i11 >= 0) {
            long j12 = j10;
            long j13 = j11;
            if (!e(j12, j13, i11)) {
                break;
            }
            i11--;
            j10 = j12;
            j11 = j13;
        }
        if (i11 < 0 || !a(i11).e()) {
            return -1;
        }
        return i11;
    }

    public boolean d(int i10) {
        return i10 == this.f95197b - 1 && a(i10).f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (Objects.equals(this.f95196a, bVar.f95196a) && this.f95197b == bVar.f95197b && this.f95198c == bVar.f95198c && this.f95199d == bVar.f95199d && this.f95200e == bVar.f95200e && Arrays.equals(this.f95201f, bVar.f95201f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f95197b * 31;
        Object obj = this.f95196a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f95198c)) * 31) + ((int) this.f95199d)) * 31) + this.f95200e) * 31) + Arrays.hashCode(this.f95201f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f95196a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f95198c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f95201f.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f95201f[i10].f95213a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f95201f[i10].f95218f.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f95201f[i10].f95218f[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f95201f[i10].f95219g[i11]);
                sb2.append(')');
                if (i11 < this.f95201f[i10].f95218f.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f95201f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
