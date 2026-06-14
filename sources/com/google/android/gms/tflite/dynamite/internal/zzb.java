package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "GetInternalNativeInitializationHandleParamsCreator")
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getCustomerInfo", id = 1)
    private final CustomerInfo zza;

    @SafeParcelable.Field(defaultValue = "false", getter = "loadGpuDelegate", id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "loadTpuDelegate", id = 3)
    private final boolean zzc;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) CustomerInfo customerInfo, @SafeParcelable.Param(id = 2) boolean z10, @SafeParcelable.Param(id = 3) boolean z11) {
        this.zza = customerInfo;
        this.zzb = z10;
        this.zzc = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        CustomerInfo customerInfo = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, customerInfo, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
