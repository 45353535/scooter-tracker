package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        short s10 = 0;
        short s11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 2) {
                s10 = SafeParcelReader.readShort(parcel, header);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                s11 = SafeParcelReader.readShort(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new UvmEntry(i10, s10, s11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new UvmEntry[i10];
    }
}
