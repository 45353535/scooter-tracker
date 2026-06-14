package cf;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f6794a = DesugarTimeZone.getTimeZone("GMT");

    public static final GMTDate a(Long l10) {
        Calendar calendar = Calendar.getInstance(f6794a, Locale.ROOT);
        Intrinsics.checkNotNull(calendar);
        return c(calendar, l10);
    }

    public static /* synthetic */ GMTDate b(Long l10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = null;
        }
        return a(l10);
    }

    public static final GMTDate c(Calendar calendar, Long l10) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        int i10 = calendar.get(15) + calendar.get(16);
        return new GMTDate(calendar.get(13), calendar.get(12), calendar.get(11), f.f6823c.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), e.f6807c.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + ((long) i10));
    }
}
