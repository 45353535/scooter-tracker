package com.mbridge.msdk.thrid.okhttp.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<DateFormat> f51287a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f51288b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f51289c = new DateFormat[15];

    static class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(com.mbridge.msdk.thrid.okhttp.internal.c.f51216p);
            return simpleDateFormat;
        }
    }

    public static Date a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f51287a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f51288b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = f51289c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f51288b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(com.mbridge.msdk.thrid.okhttp.internal.c.f51216p);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(Date date) {
        return f51287a.get().format(date);
    }
}
