package com.pgl.ssdk;

import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class az {
    public static void a(long j10) {
        try {
            Thread.currentThread();
            Thread.sleep(j10);
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j10, long j11) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        calendar2.setTimeInMillis(j11);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(6) == calendar2.get(6);
    }
}
