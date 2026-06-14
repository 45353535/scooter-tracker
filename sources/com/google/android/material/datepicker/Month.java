package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes9.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.a(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Calendar f26412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f26413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f26414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f26415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f26416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f26417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f26418h;

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = UtcDates.f(calendar);
        this.f26412b = calendarF;
        this.f26413c = calendarF.get(2);
        this.f26414d = calendarF.get(1);
        this.f26415e = calendarF.getMaximum(7);
        this.f26416f = calendarF.getActualMaximum(5);
        this.f26417g = calendarF.getTimeInMillis();
    }

    static Month a(int i10, int i11) {
        Calendar calendarS = UtcDates.s();
        calendarS.set(1, i10);
        calendarS.set(2, i11);
        return new Month(calendarS);
    }

    static Month c(long j10) {
        Calendar calendarS = UtcDates.s();
        calendarS.setTimeInMillis(j10);
        return new Month(calendarS);
    }

    static Month d() {
        return new Month(UtcDates.q());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(int i10) {
        int i11 = this.f26412b.get(7);
        if (i10 <= 0) {
            i10 = this.f26412b.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f26415e : i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f26413c == month.f26413c && this.f26414d == month.f26414d;
    }

    long f(int i10) {
        Calendar calendarF = UtcDates.f(this.f26412b);
        calendarF.set(5, i10);
        return calendarF.getTimeInMillis();
    }

    int g(long j10) {
        Calendar calendarF = UtcDates.f(this.f26412b);
        calendarF.setTimeInMillis(j10);
        return calendarF.get(5);
    }

    String h() {
        if (this.f26418h == null) {
            this.f26418h = DateStrings.l(this.f26412b.getTimeInMillis());
        }
        return this.f26418h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f26413c), Integer.valueOf(this.f26414d)});
    }

    long i() {
        return this.f26412b.getTimeInMillis();
    }

    Month j(int i10) {
        Calendar calendarF = UtcDates.f(this.f26412b);
        calendarF.add(2, i10);
        return new Month(calendarF);
    }

    int k(Month month) {
        if (this.f26412b instanceof GregorianCalendar) {
            return ((month.f26414d - this.f26414d) * 12) + (month.f26413c - this.f26413c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f26414d);
        parcel.writeInt(this.f26413c);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull Month month) {
        return this.f26412b.compareTo(month.f26412b);
    }
}
