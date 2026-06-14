package nh;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f96151a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f96152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DateFormat[] f96153c;

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(ih.d.f74841f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f96152b = strArr;
        f96153c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f96151a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f96152b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = f96153c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f96152b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(ih.d.f74841f);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                Unit unit = Unit.f93236a;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final String b(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        String str = ((DateFormat) f96151a.get()).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "STANDARD_DATE_FORMAT.get().format(this)");
        return str;
    }
}
