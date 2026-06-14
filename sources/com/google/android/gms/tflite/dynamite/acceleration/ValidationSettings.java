package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "ValidationSettingsCreator")
public class ValidationSettings extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ValidationSettings> CREATOR = new zzf();

    @Nullable
    @SafeParcelable.Field(getter = "getBatchSize", id = 1)
    private final Integer zza;

    @SafeParcelable.Field(getter = "getInferenceTimeoutMillis", id = 2)
    private final long zzb;

    @SafeParcelable.Constructor
    public ValidationSettings(@Nullable @SafeParcelable.Param(id = 1) Integer num, @SafeParcelable.Param(id = 2) long j10) {
        this.zza = num;
        this.zzb = j10;
    }

    @NonNull
    public final String toString() {
        return "ValidationSettings{batchSize=" + this.zza + ", inferenceTimeoutMillis=" + this.zzb + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        Integer num = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerObject(parcel, 1, num, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
