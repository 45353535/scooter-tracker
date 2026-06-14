package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        CustomerInfo customerInfo = null;
        boolean z11 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                customerInfo = (CustomerInfo) SafeParcelReader.createParcelable(parcel, header, CustomerInfo.CREATOR);
            } else if (fieldId == 2) {
                z10 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                z11 = SafeParcelReader.readBoolean(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzb(customerInfo, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzb[i10];
    }
}
