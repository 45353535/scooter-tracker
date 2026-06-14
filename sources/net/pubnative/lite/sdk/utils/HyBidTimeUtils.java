package net.pubnative.lite.sdk.utils;

import com.vungle.ads.internal.signals.SignalManager;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public class HyBidTimeUtils {
    public static final Long SESSION_RENEWAL = 1800000L;

    private int calculateTimeInMinutes(long j10) {
        return (int) ((j10 / 60000) % 60);
    }

    public Boolean IsStartingNewSession(long j10) {
        return Boolean.valueOf(calculateTimeInMinutes(j10) > 30);
    }

    public Long calculateSessionDuration(Long l10, Long l11) {
        return Long.valueOf(l10.longValue() - l11.longValue());
    }

    public String getDaysSince(long j10) {
        if (j10 <= 0) {
            return "0";
        }
        Date date = new Date(j10);
        return Calendar.getInstance().before(date) ? "0" : String.valueOf((new Date(System.currentTimeMillis()).getTime() - date.getTime()) / SignalManager.TWENTY_FOUR_HOURS_MILLIS);
    }

    public String getSeconds(long j10) {
        return String.valueOf(j10 / 1000);
    }

    public long updateExpirationTimeStamp(long j10) {
        return j10 + SESSION_RENEWAL.longValue();
    }
}
