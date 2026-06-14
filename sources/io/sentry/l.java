package io.sentry;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static long a(Date date) {
        return i(date.getTime());
    }

    public static double b(Date date) {
        return j(date.getTime());
    }

    public static BigDecimal c(Double d10) {
        return BigDecimal.valueOf(d10.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public static Date d() {
        return Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f84382a).getTime();
    }

    public static Date e(long j10) {
        Calendar calendar = Calendar.getInstance(io.sentry.vendor.gson.internal.bind.util.a.f84382a);
        calendar.setTimeInMillis(j10);
        return calendar.getTime();
    }

    public static Date f(String str) {
        try {
            return io.sentry.vendor.gson.internal.bind.util.a.f(str, new ParsePosition(0));
        } catch (ParseException unused) {
            throw new IllegalArgumentException("timestamp is not ISO format " + str);
        }
    }

    public static Date g(String str) {
        try {
            return e(new BigDecimal(str).setScale(3, RoundingMode.DOWN).movePointRight(3).longValue());
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("timestamp is not millis format " + str);
        }
    }

    public static String h(Date date) {
        return io.sentry.vendor.gson.internal.bind.util.a.b(date, true);
    }

    public static long i(long j10) {
        return j10 * 1000000;
    }

    public static double j(double d10) {
        return d10 / 1000.0d;
    }

    public static Date k(long j10) {
        return e(Double.valueOf(l(j10)).longValue());
    }

    public static double l(double d10) {
        return d10 / 1000000.0d;
    }

    public static double m(long j10) {
        return j10 / 1.0E9d;
    }

    public static long n(long j10) {
        return j10 * 1000000000;
    }

    public static Date o(s5 s5Var) {
        if (s5Var == null) {
            return null;
        }
        return p(s5Var);
    }

    public static Date p(s5 s5Var) {
        return k(s5Var.g());
    }
}
