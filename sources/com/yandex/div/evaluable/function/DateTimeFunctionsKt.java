package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"toCalendar", "Ljava/util/Calendar;", "Lcom/yandex/div/evaluable/types/DateTime;", "toDate", "Ljava/util/Date;", "div-evaluable"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class DateTimeFunctionsKt {
    @NotNull
    public static final Calendar toCalendar(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone());
        calendar.setTimeInMillis(dateTime.getTimestampMillis());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    @NotNull
    public static final Date toDate(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return new Date(dateTime.getTimestampMillis() - ((long) dateTime.getTimezone().getRawOffset()));
    }
}
