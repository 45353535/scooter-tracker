package zf;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public class c extends b {
    public static int a(int i10) {
        return Integer.signum(i10);
    }

    public static int b(long j10) {
        return Long.signum(j10);
    }

    public static int c(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d10 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d10 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d10);
    }

    public static int d(float f10) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f10);
    }

    public static long e(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d10);
    }

    public static long f(float f10) {
        return e(f10);
    }
}
