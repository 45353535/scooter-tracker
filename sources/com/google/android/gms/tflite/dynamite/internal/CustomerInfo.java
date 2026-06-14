package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "CustomerInfoCreator")
public class CustomerInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getPackageName", id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getVersion", id = 2)
    private final String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getCustomerId", id = 3)
    private final Integer zzc;

    @SafeParcelable.Constructor
    public CustomerInfo(@NonNull @SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) String str2, @Nullable @SafeParcelable.Param(id = 3) Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeIntegerObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
