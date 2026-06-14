package io.bidmachine.analytics.internal.p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f79730a = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    public final Long a(String str) throws ParseException {
        int i10 = Calendar.getInstance().get(1);
        Date date = this.f79730a.parse(i10 + '-' + str);
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
