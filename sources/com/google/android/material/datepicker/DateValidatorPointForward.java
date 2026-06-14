package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointForward createFromParcel(@NonNull Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public DateValidatorPointForward[] newArray(int i10) {
            return new DateValidatorPointForward[i10];
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f26311b;

    @NonNull
    public static DateValidatorPointForward from(long j10) {
        return new DateValidatorPointForward(j10);
    }

    @NonNull
    public static DateValidatorPointForward now() {
        return from(UtcDates.q().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f26311b == ((DateValidatorPointForward) obj).f26311b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f26311b)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j10) {
        return j10 >= this.f26311b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeLong(this.f26311b);
    }

    private DateValidatorPointForward(long j10) {
        this.f26311b = j10;
    }
}
