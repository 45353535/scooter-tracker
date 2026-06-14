package kotlin.ranges;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class i extends h {
    public static double c(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static float d(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static int e(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static long f(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static Comparable g(Comparable comparable, Comparable minimumValue) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(minimumValue, "minimumValue");
        return comparable.compareTo(minimumValue) < 0 ? minimumValue : comparable;
    }

    public static double h(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static float i(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int j(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static long k(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static double l(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float m(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int n(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int o(int i10, bg.c range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof bg.b) {
            return ((Number) q(Integer.valueOf(i10), (bg.b) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i10 < ((Number) range.getStart()).intValue() ? ((Number) range.getStart()).intValue() : i10 > ((Number) range.getEndInclusive()).intValue() ? ((Number) range.getEndInclusive()).intValue() : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static long p(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static Comparable q(Comparable comparable, bg.b range) {
        Intrinsics.checkNotNullParameter(comparable, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (!range.isEmpty()) {
            return (!range.a(comparable, range.getStart()) || range.a(range.getStart(), comparable)) ? (!range.a(range.getEndInclusive(), comparable) || range.a(comparable, range.getEndInclusive())) ? comparable : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
    }

    public static d r(int i10, int i11) {
        return d.f93361e.a(i10, i11, -1);
    }

    public static d s(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return d.f93361e.a(dVar.f(), dVar.e(), -dVar.g());
    }

    public static d t(d dVar, int i10) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        h.a(i10 > 0, Integer.valueOf(i10));
        d.a aVar = d.f93361e;
        int iE = dVar.e();
        int iF = dVar.f();
        if (dVar.g() <= 0) {
            i10 = -i10;
        }
        return aVar.a(iE, iF, i10);
    }

    public static e u(e eVar, long j10) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        h.a(j10 > 0, Long.valueOf(j10));
        e.a aVar = e.f93365e;
        long jE = eVar.e();
        long jF = eVar.f();
        if (eVar.g() <= 0) {
            j10 = -j10;
        }
        return aVar.a(jE, jF, j10);
    }

    public static IntRange v(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? IntRange.INSTANCE.a() : new IntRange(i10, i11 - 1);
    }

    public static f w(long j10, long j11) {
        return j11 <= Long.MIN_VALUE ? f.f93369f.a() : new f(j10, j11 - 1);
    }
}
