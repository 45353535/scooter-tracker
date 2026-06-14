package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes7.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = -1;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        String strCreateString = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                z10 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 2) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId == 3) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 4) {
                i11 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                j10 = SafeParcelReader.readLong(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzr(z10, strCreateString, i10, i11, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
