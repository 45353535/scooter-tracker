package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Operator f26300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f26301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Operator f26298d = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j10)) {
                    return true;
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Operator f26299e = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j10)) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i10 = parcel.readInt();
            Operator operator = (i10 != 2 && i10 == 1) ? CompositeDateValidator.f26298d : CompositeDateValidator.f26299e;
            return new CompositeDateValidator((List) Preconditions.checkNotNull(arrayList), operator);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public CompositeDateValidator[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    };

    private interface Operator {
        int getId();

        boolean isValid(@NonNull List<CalendarConstraints.DateValidator> list, long j10);
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f26299e);
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f26298d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f26301c.equals(compositeDateValidator.f26301c) && this.f26300b.getId() == compositeDateValidator.f26300b.getId();
    }

    public int hashCode() {
        return this.f26301c.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j10) {
        return this.f26300b.isValid(this.f26301c, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeList(this.f26301c);
        parcel.writeInt(this.f26300b.getId());
    }

    private CompositeDateValidator(List list, Operator operator) {
        this.f26301c = list;
        this.f26300b = operator;
    }
}
