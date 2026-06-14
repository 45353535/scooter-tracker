package com.yandex.div.evaluable.types;

import androidx.collection.b;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.taurusx.tax.f.y;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.i;
import lf.l;
import net.pubnative.lite.sdk.mraid.MRAIDNativeFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010!\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0015¨\u0006'"}, d2 = {"Lcom/yandex/div/evaluable/types/DateTime;", "", "", "timestampMillis", "Ljava/util/TimeZone;", "timezone", "<init>", "(JLjava/util/TimeZone;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "compareTo", "(Lcom/yandex/div/evaluable/types/DateTime;)I", "J", "getTimestampMillis$div_evaluable", "()J", "Ljava/util/TimeZone;", "getTimezone$div_evaluable", "()Ljava/util/TimeZone;", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "calendar$delegate", "Lkotlin/Lazy;", "getCalendar", "()Ljava/util/Calendar;", MRAIDNativeFeature.CALENDAR, "timezoneMinutes", "I", "getTimezoneMinutes$div_evaluable", "timestampUtc", y.f66058y, "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DateTime implements Comparable<DateTime> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, "UTC");

    /* JADX INFO: renamed from: calendar$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy calendar;
    private final long timestampMillis;
    private final long timestampUtc;

    @NotNull
    private final TimeZone timezone;
    private final int timezoneMinutes;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/evaluable/types/DateTime$Companion;", "", "()V", "utcTimezone", "Ljava/util/SimpleTimeZone;", "formatDate", "", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Ljava/util/Calendar;", "formatDate$div_evaluable", "div-evaluable"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatDate$div_evaluable(@NotNull Calendar c10) {
            Intrinsics.checkNotNullParameter(c10, "c");
            return String.valueOf(c10.get(1)) + '-' + StringsKt.H0(String.valueOf(c10.get(2) + 1), 2, '0') + '-' + StringsKt.H0(String.valueOf(c10.get(5)), 2, '0') + ' ' + StringsKt.H0(String.valueOf(c10.get(11)), 2, '0') + ':' + StringsKt.H0(String.valueOf(c10.get(12)), 2, '0') + ':' + StringsKt.H0(String.valueOf(c10.get(13)), 2, '0');
        }

        private Companion() {
        }
    }

    public DateTime(long j10, @NotNull TimeZone timezone) {
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        this.timestampMillis = j10;
        this.timezone = timezone;
        this.calendar = i.b(l.f94211d, new Function0<Calendar>() { // from class: com.yandex.div.evaluable.types.DateTime$calendar$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Calendar invoke() {
                Calendar calendar = Calendar.getInstance(DateTime.utcTimezone);
                calendar.setTimeInMillis(this.this$0.getTimestampMillis());
                return calendar;
            }
        });
        int rawOffset = timezone.getRawOffset() / 60;
        this.timezoneMinutes = rawOffset;
        this.timestampUtc = j10 - ((long) (rawOffset * 60000));
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar.getValue();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DateTime) && this.timestampUtc == ((DateTime) other).timestampUtc;
    }

    /* JADX INFO: renamed from: getTimestampMillis$div_evaluable, reason: from getter */
    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: getTimezone$div_evaluable, reason: from getter */
    public final TimeZone getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return b.a(this.timestampUtc);
    }

    @NotNull
    public String toString() {
        Companion companion = INSTANCE;
        Calendar calendar = getCalendar();
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DateTime other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.timestampUtc, other.timestampUtc);
    }
}
