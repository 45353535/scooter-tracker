package com.startapp.sdk.internal;

import com.adjust.sdk.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
public final class dj implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f64436c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f64437d = Pattern.compile("((\\d{1,2})|(100))%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f64439b;

    /* JADX WARN: Multi-variable type inference failed */
    public dj(String str, Comparable comparable) {
        this.f64438a = str;
        this.f64439b = (Number) comparable;
    }

    public static Integer a(String str) {
        String[] strArrSplit = str.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * Constants.ONE_HOUR) + ((int) (Float.parseFloat(strArrSplit[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Number] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f64439b.compareTo(((dj) obj).f64439b);
    }
}
