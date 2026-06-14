package com.google.maps.android;

/* JADX INFO: loaded from: classes9.dex */
class MathUtil {
    static double a(double d10) {
        return Math.asin(Math.sqrt(d10)) * 2.0d;
    }

    static double b(double d10, double d11, double d12) {
        return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
    }

    static double c(double d10) {
        double dSin = Math.sin(d10 * 0.5d);
        return dSin * dSin;
    }

    static double d(double d10, double d11, double d12) {
        return c(d10 - d11) + (c(d12) * Math.cos(d10) * Math.cos(d11));
    }

    static double e(double d10) {
        double d11 = d10 * d10;
        return (d11 / (Math.sqrt(1.0d - d11) + 1.0d)) * 0.5d;
    }

    static double f(double d10) {
        return (Math.atan(Math.exp(d10)) * 2.0d) - 1.5707963267948966d;
    }

    static double g(double d10) {
        return Math.log(Math.tan((d10 * 0.5d) + 0.7853981633974483d));
    }

    static double h(double d10, double d11) {
        return ((d10 % d11) + d11) % d11;
    }

    static double i(double d10) {
        return Math.sqrt(d10 * (1.0d - d10)) * 2.0d;
    }

    static double j(double d10, double d11) {
        double dSqrt = Math.sqrt((1.0d - d10) * d10);
        double dSqrt2 = Math.sqrt((1.0d - d11) * d11);
        return ((dSqrt + dSqrt2) - (((dSqrt * d11) + (dSqrt2 * d10)) * 2.0d)) * 2.0d;
    }

    static double k(double d10, double d11, double d12) {
        return (d10 < d11 || d10 >= d12) ? h(d10 - d11, d12 - d11) + d11 : d10;
    }
}
