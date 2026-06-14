package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.google.android.material.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    };
    public static final String NUMBER_FORMAT = "%d";
    public static final String ZERO_LEADING_NUMBER_FORMAT = "%02d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaxInputValidator f28205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MaxInputValidator f28206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f28207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f28208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f28209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f28210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f28211h;

    public TimeModel() {
        this(0);
    }

    private static int a(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence) {
        return formatText(resources, charSequence, ZERO_LEADING_NUMBER_FORMAT);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f28208e == timeModel.f28208e && this.f28209f == timeModel.f28209f && this.f28207d == timeModel.f28207d && this.f28210g == timeModel.f28210g;
    }

    @StringRes
    public int getHourContentDescriptionResId() {
        return this.f28207d == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    public int getHourForDisplay() {
        if (this.f28207d == 1) {
            return this.f28208e % 24;
        }
        int i10 = this.f28208e;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f28211h == 1 ? i10 - 12 : i10;
    }

    public MaxInputValidator getHourInputValidator() {
        return this.f28206c;
    }

    public MaxInputValidator getMinuteInputValidator() {
        return this.f28205b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28207d), Integer.valueOf(this.f28208e), Integer.valueOf(this.f28209f), Integer.valueOf(this.f28210g)});
    }

    public void setHour(int i10) {
        if (this.f28207d == 1) {
            this.f28208e = i10;
        } else {
            this.f28208e = (i10 % 12) + (this.f28211h != 1 ? 0 : 12);
        }
    }

    public void setHourOfDay(int i10) {
        this.f28211h = a(i10);
        this.f28208e = i10;
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i10) {
        this.f28209f = i10 % 60;
    }

    public void setPeriod(int i10) {
        if (i10 != this.f28211h) {
            this.f28211h = i10;
            int i11 = this.f28208e;
            if (i11 < 12 && i10 == 1) {
                this.f28208e = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f28208e = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28208e);
        parcel.writeInt(this.f28209f);
        parcel.writeInt(this.f28210g);
        parcel.writeInt(this.f28207d);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    @Nullable
    public static String formatText(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f28208e = i10;
        this.f28209f = i11;
        this.f28210g = i12;
        this.f28207d = i13;
        this.f28211h = a(i10);
        this.f28205b = new MaxInputValidator(59);
        this.f28206c = new MaxInputValidator(i13 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
