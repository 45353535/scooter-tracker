package com.google.android.gms.tflite.dynamite.acceleration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        Integer integerObject = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                integerObject = SafeParcelReader.readIntegerObject(parcel, header);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j10 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new ValidationSettings(integerObject, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ValidationSettings[i10];
    }
}
