package fe;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f72021a = TimeUnit.DAYS.toMillis(1);

    public static Calendar a(Calendar calendar) {
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar;
    }

    public static Calendar b(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static int c(Date date, Date date2) {
        return (int) (Math.abs(a(b(date2)).getTimeInMillis() - a(b(date)).getTimeInMillis()) / f72021a);
    }
}
