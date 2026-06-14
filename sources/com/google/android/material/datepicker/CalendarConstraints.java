package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Month f26270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Month f26271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final DateValidator f26272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Month f26273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f26274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f26275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f26276h;

    public interface DateValidator extends Parcelable {
        boolean isValid(long j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f26270b.equals(calendarConstraints.f26270b) && this.f26271c.equals(calendarConstraints.f26271c) && ObjectsCompat.equals(this.f26273e, calendarConstraints.f26273e) && this.f26274f == calendarConstraints.f26274f && this.f26272d.equals(calendarConstraints.f26272d);
    }

    Month f(Month month) {
        return month.compareTo(this.f26270b) < 0 ? this.f26270b : month.compareTo(this.f26271c) > 0 ? this.f26271c : month;
    }

    Month g() {
        return this.f26271c;
    }

    public DateValidator getDateValidator() {
        return this.f26272d;
    }

    public long getEndMs() {
        return this.f26271c.f26417g;
    }

    @Nullable
    public Long getOpenAtMs() {
        Month month = this.f26273e;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f26417g);
    }

    public long getStartMs() {
        return this.f26270b.f26417g;
    }

    int h() {
        return this.f26274f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26270b, this.f26271c, this.f26273e, Integer.valueOf(this.f26274f), this.f26272d});
    }

    int i() {
        return this.f26276h;
    }

    Month j() {
        return this.f26273e;
    }

    Month k() {
        return this.f26270b;
    }

    int l() {
        return this.f26275g;
    }

    boolean m(long j10) {
        if (this.f26270b.f(1) > j10) {
            return false;
        }
        Month month = this.f26271c;
        return j10 <= month.f(month.f26416f);
    }

    void n(Month month) {
        this.f26273e = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f26270b, 0);
        parcel.writeParcelable(this.f26271c, 0);
        parcel.writeParcelable(this.f26273e, 0);
        parcel.writeParcelable(this.f26272d, 0);
        parcel.writeInt(this.f26274f);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f26270b = month;
        this.f26271c = month2;
        this.f26273e = month3;
        this.f26274f = i10;
        this.f26272d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > UtcDates.s().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f26276h = month.k(month2) + 1;
        this.f26275g = (month2.f26414d - month.f26414d) + 1;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f26277f = UtcDates.a(Month.a(1900, 0).f26417g);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f26278g = UtcDates.a(Month.a(2100, 11).f26417g);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f26279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f26280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f26281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f26282d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private DateValidator f26283e;

        public Builder() {
            this.f26279a = f26277f;
            this.f26280b = f26278g;
            this.f26283e = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f26283e);
            Month monthC = Month.c(this.f26279a);
            Month monthC2 = Month.c(this.f26280b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f26281c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l10 == null ? null : Month.c(l10.longValue()), this.f26282d);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setEnd(long j10) {
            this.f26280b = j10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i10) {
            this.f26282d = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setOpenAt(long j10) {
            this.f26281c = Long.valueOf(j10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setStart(long j10) {
            this.f26279a = j10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setValidator(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f26283e = dateValidator;
            return this;
        }

        Builder(CalendarConstraints calendarConstraints) {
            this.f26279a = f26277f;
            this.f26280b = f26278g;
            this.f26283e = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.f26279a = calendarConstraints.f26270b.f26417g;
            this.f26280b = calendarConstraints.f26271c.f26417g;
            this.f26281c = Long.valueOf(calendarConstraints.f26273e.f26417g);
            this.f26282d = calendarConstraints.f26274f;
            this.f26283e = calendarConstraints.f26272d;
        }
    }
}
