package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes9.dex */
class TimeSource {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TimeSource f26460c = new TimeSource(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f26461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f26462b;

    private TimeSource(Long l10, TimeZone timeZone) {
        this.f26461a = l10;
        this.f26462b = timeZone;
    }

    static TimeSource c() {
        return f26460c;
    }

    Calendar a() {
        return b(this.f26462b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f26461a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
