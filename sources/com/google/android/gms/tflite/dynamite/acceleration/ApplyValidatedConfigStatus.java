package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public enum ApplyValidatedConfigStatus implements Parcelable {
    SUCCESS(0),
    FAILURE_BENCHMARK_RUN_NOT_COMPLETED(1),
    FAILURE_HAS_NOT_PASSED_ACCURACY_CHECK(2);


    @NonNull
    public static final Parcelable.Creator<ApplyValidatedConfigStatus> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.tflite.dynamite.acceleration.zzb
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return ApplyValidatedConfigStatus.zza(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new ApplyValidatedConfigStatus[i10];
        }
    };
    private final int zzb;

    ApplyValidatedConfigStatus(int i10) {
        this.zzb = i10;
    }

    @NonNull
    public static ApplyValidatedConfigStatus zza(int i10) {
        for (ApplyValidatedConfigStatus applyValidatedConfigStatus : values()) {
            if (applyValidatedConfigStatus.zzb == i10) {
                return applyValidatedConfigStatus;
            }
        }
        throw new IllegalArgumentException("Invalid enum value: " + i10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.zzb);
    }
}
