package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import androidx.core.util.Pair;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class DateStrings {
    static Pair a(Long l10, Long l11) {
        return b(l10, l11, null);
    }

    static Pair b(Long l10, Long l11, SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return Pair.create(null, null);
        }
        if (l10 == null) {
            return Pair.create(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return Pair.create(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarQ = UtcDates.q();
        Calendar calendarS = UtcDates.s();
        calendarS.setTimeInMillis(l10.longValue());
        Calendar calendarS2 = UtcDates.s();
        calendarS2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return Pair.create(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        return calendarS.get(1) == calendarS2.get(1) ? calendarS.get(1) == calendarQ.get(1) ? Pair.create(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : Pair.create(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault())) : Pair.create(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    static String c(long j10) {
        return d(j10, null);
    }

    static String d(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : q(j10) ? f(j10) : m(j10);
    }

    static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(R.string.mtrl_picker_today_description), strJ);
        }
        return z11 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), strJ) : z12 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), strJ) : strJ;
    }

    static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    static String g(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.c(locale).format(new Date(j10)) : UtcDates.l(locale).format(new Date(j10));
    }

    static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    static String i(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.m(locale).format(new Date(j10)) : UtcDates.j(locale).format(new Date(j10));
    }

    static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    static String k(Context context, int i10) {
        return UtcDates.q().get(1) == i10 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i10)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i10));
    }

    static String l(long j10) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.v(Locale.getDefault()).format(new Date(j10)) : DateUtils.formatDateTime(null, j10, 8228);
    }

    static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    static String n(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.u(locale).format(new Date(j10)) : UtcDates.k(locale).format(new Date(j10));
    }

    static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    static String p(long j10, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? UtcDates.w(locale).format(new Date(j10)) : UtcDates.j(locale).format(new Date(j10));
    }

    private static boolean q(long j10) {
        Calendar calendarQ = UtcDates.q();
        Calendar calendarS = UtcDates.s();
        calendarS.setTimeInMillis(j10);
        return calendarQ.get(1) == calendarS.get(1);
    }
}
