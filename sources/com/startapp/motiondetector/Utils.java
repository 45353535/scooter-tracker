package com.startapp.motiondetector;

/* JADX INFO: loaded from: classes11.dex */
public class Utils {
    public static double gaussian(double d10, double d11, double d12, double d13) {
        return d11 * Math.exp((-Math.pow(d10 - d12, 2.0d)) / d13);
    }

    public static double logisticalFunction(double d10, double d11, double d12) {
        return 1.0d / (Math.exp((d11 - d10) * d12) + 1.0d);
    }

    public static double logisticalFunction0(double d10, double d11, double d12, double d13) {
        return (logisticalFunction(d10, d11, d12) - d13) / (1.0d - d13);
    }

    public static double logisticalFunction1(double d10, double d11, double d12, double d13) {
        return logisticalFunction(d10, d11, d12) / d13;
    }

    public static double smsq(double d10, double d11, double d12) {
        return (d10 * d10) + (d11 * d11) + (d12 * d12);
    }
}
