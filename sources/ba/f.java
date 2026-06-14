package ba;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends ba.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6009j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6010k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6011l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6012m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6014o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final DrmInitData f6016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f6017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f6018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f6019t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f6020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f6021v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImmutableList f6022w;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6028b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f6029c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f6032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f6033g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f6034h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f6035i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f6036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f6037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ImmutableList f6038l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ImmutableList f6039m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ImmutableList f6040n;

        public c(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, List list, boolean z10, long j14, long j15, List list2, List list3, List list4) {
            q9.a.a((uri == null || uri2 == null) && !(uri == null && uri2 == null));
            this.f6027a = str;
            this.f6028b = uri;
            this.f6029c = uri2;
            this.f6030d = j10;
            this.f6031e = j11;
            this.f6032f = j12;
            this.f6033g = j13;
            this.f6034h = list;
            this.f6035i = z10;
            this.f6036j = j14;
            this.f6037k = j15;
            this.f6038l = ImmutableList.copyOf((Collection) list2);
            this.f6039m = ImmutableList.copyOf((Collection) list3);
            this.f6040n = ImmutableList.copyOf((Collection) list4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6030d == cVar.f6030d && this.f6031e == cVar.f6031e && this.f6032f == cVar.f6032f && this.f6033g == cVar.f6033g && this.f6035i == cVar.f6035i && this.f6036j == cVar.f6036j && this.f6037k == cVar.f6037k && Objects.equals(this.f6027a, cVar.f6027a) && Objects.equals(this.f6028b, cVar.f6028b) && Objects.equals(this.f6029c, cVar.f6029c) && Objects.equals(this.f6034h, cVar.f6034h) && Objects.equals(this.f6038l, cVar.f6038l) && Objects.equals(this.f6039m, cVar.f6039m) && Objects.equals(this.f6040n, cVar.f6040n);
        }

        public int hashCode() {
            return Objects.hash(this.f6027a, this.f6028b, this.f6029c, Long.valueOf(this.f6030d), Long.valueOf(this.f6031e), Long.valueOf(this.f6032f), Long.valueOf(this.f6033g), this.f6034h, Boolean.valueOf(this.f6035i), Long.valueOf(this.f6036j), Long.valueOf(this.f6037k), this.f6038l, this.f6039m, this.f6040n);
        }
    }

    public static final class d extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f6041m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f6042n;

        public d(String str, C0130f c0130f, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, c0130f, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f6041m = z11;
            this.f6042n = z12;
        }

        public d c(long j10, int i10) {
            return new d(this.f6048b, this.f6049c, this.f6050d, i10, j10, this.f6053g, this.f6054h, this.f6055i, this.f6056j, this.f6057k, this.f6058l, this.f6041m, this.f6042n);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f6043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6045c;

        public e(Uri uri, long j10, int i10) {
            this.f6043a = uri;
            this.f6044b = j10;
            this.f6045c = i10;
        }
    }

    public static class g implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0130f f6049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f6052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final DrmInitData f6053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f6054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f6055i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f6056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f6057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f6058l;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l10) {
            if (this.f6052f > l10.longValue()) {
                return 1;
            }
            return this.f6052f < l10.longValue() ? -1 : 0;
        }

        private g(String str, C0130f c0130f, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f6048b = str;
            this.f6049c = c0130f;
            this.f6050d = j10;
            this.f6051e = i10;
            this.f6052f = j11;
            this.f6053g = drmInitData;
            this.f6054h = str2;
            this.f6055i = str3;
            this.f6056j = j12;
            this.f6057k = j13;
            this.f6058l = z10;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6059a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6060b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6061c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6062d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6063e;

        public h(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f6059a = j10;
            this.f6060b = z10;
            this.f6061c = j11;
            this.f6062d = j12;
            this.f6063e = z11;
        }
    }

    public f(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List list2, List list3, h hVar, Map map, List list4) {
        super(str, list, z12);
        this.f6003d = i10;
        this.f6007h = j11;
        this.f6006g = z10;
        this.f6008i = z11;
        this.f6009j = i11;
        this.f6010k = j12;
        this.f6011l = i12;
        this.f6012m = j13;
        this.f6013n = j14;
        this.f6014o = z13;
        this.f6015p = z14;
        this.f6016q = drmInitData;
        this.f6017r = ImmutableList.copyOf((Collection) list2);
        this.f6018s = ImmutableList.copyOf((Collection) list3);
        this.f6019t = ImmutableMap.copyOf(map);
        this.f6022w = ImmutableList.copyOf((Collection) list4);
        if (!list3.isEmpty()) {
            d dVar = (d) Iterables.getLast(list3);
            this.f6020u = dVar.f6052f + dVar.f6050d;
        } else if (list2.isEmpty()) {
            this.f6020u = 0L;
        } else {
            C0130f c0130f = (C0130f) Iterables.getLast(list2);
            this.f6020u = c0130f.f6052f + c0130f.f6050d;
        }
        this.f6004e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f6020u, j10) : Math.max(0L, this.f6020u + j10) : -9223372036854775807L;
        this.f6005f = j10 >= 0;
        this.f6021v = hVar;
    }

    public f b(long j10, int i10) {
        return new f(this.f6003d, this.f6085a, this.f6086b, this.f6004e, this.f6006g, j10, true, i10, this.f6010k, this.f6011l, this.f6012m, this.f6013n, this.f6087c, this.f6014o, this.f6015p, this.f6016q, this.f6017r, this.f6018s, this.f6021v, this.f6019t, this.f6022w);
    }

    public f c() {
        return this.f6014o ? this : new f(this.f6003d, this.f6085a, this.f6086b, this.f6004e, this.f6006g, this.f6007h, this.f6008i, this.f6009j, this.f6010k, this.f6011l, this.f6012m, this.f6013n, this.f6087c, true, this.f6015p, this.f6016q, this.f6017r, this.f6018s, this.f6021v, this.f6019t, this.f6022w);
    }

    public long d() {
        return this.f6007h + this.f6020u;
    }

    public boolean e(f fVar) {
        if (fVar != null) {
            long j10 = this.f6010k;
            long j11 = fVar.f6010k;
            if (j10 <= j11) {
                if (j10 < j11) {
                    return false;
                }
                int size = this.f6017r.size() - fVar.f6017r.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.f6018s.size();
                int size3 = fVar.f6018s.size();
                if (size2 <= size3 && (size2 != size3 || !this.f6014o || fVar.f6014o)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ba.f$f, reason: collision with other inner class name */
    public static final class C0130f extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f6046m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List f6047n;

        public C0130f(String str, long j10, long j11, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, ImmutableList.of());
        }

        public C0130f c(long j10, int i10) {
            ArrayList arrayList = new ArrayList();
            long j11 = j10;
            for (int i11 = 0; i11 < this.f6047n.size(); i11++) {
                d dVar = (d) this.f6047n.get(i11);
                arrayList.add(dVar.c(j11, i10));
                j11 += dVar.f6050d;
            }
            return new C0130f(this.f6048b, this.f6049c, this.f6046m, this.f6050d, i10, j10, this.f6053g, this.f6054h, this.f6055i, this.f6056j, this.f6057k, this.f6058l, arrayList);
        }

        public C0130f(String str, C0130f c0130f, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List list) {
            super(str, c0130f, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f6046m = str2;
            this.f6047n = ImmutableList.copyOf((Collection) list);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f6025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f6026d;

        public b(String str, double d10) {
            this.f6023a = str;
            this.f6024b = 2;
            this.f6025c = d10;
            this.f6026d = null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6024b == bVar.f6024b && Double.compare(this.f6025c, bVar.f6025c) == 0 && Objects.equals(this.f6023a, bVar.f6023a) && Objects.equals(this.f6026d, bVar.f6026d);
        }

        public int hashCode() {
            return Objects.hash(this.f6023a, Integer.valueOf(this.f6024b), Double.valueOf(this.f6025c), this.f6026d);
        }

        public b(String str, String str2, int i10) {
            boolean z10 = true;
            if (i10 == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
                z10 = false;
            }
            q9.a.g(z10);
            this.f6023a = str;
            this.f6024b = i10;
            this.f6026d = str2;
            this.f6025c = 0.0d;
        }
    }

    @Override // fa.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f copy(List list) {
        return this;
    }
}
