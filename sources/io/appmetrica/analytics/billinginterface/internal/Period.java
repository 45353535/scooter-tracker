package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class Period {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f75054a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;

    @NonNull
    public final TimeUnit timeUnit;

    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i10, @NonNull TimeUnit timeUnit) {
        this.number = i10;
        this.timeUnit = timeUnit;
    }

    @Nullable
    public static Period parse(@NonNull String str) {
        Matcher matcher = f75054a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            return new Period(i10, cCharAt != 'D' ? cCharAt != 'M' ? cCharAt != 'W' ? cCharAt != 'Y' ? TimeUnit.TIME_UNIT_UNKNOWN : TimeUnit.YEAR : TimeUnit.WEEK : TimeUnit.MONTH : TimeUnit.DAY);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    @NonNull
    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
