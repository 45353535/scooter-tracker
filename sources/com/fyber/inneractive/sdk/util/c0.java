package com.fyber.inneractive.sdk.util;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c0 {
    public static String a(int i10) {
        if (i10 <= 0) {
            return "00:00:00.000";
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j10 = i10;
        long hours = timeUnit.toHours(j10);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j10 - timeUnit2.toMillis(hours));
        long millis = j10 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j10 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))));
    }
}
