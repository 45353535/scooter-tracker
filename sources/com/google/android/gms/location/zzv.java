package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        String strCreateString = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                j10 = SafeParcelReader.readLong(parcel, header);
            } else if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                z10 = SafeParcelReader.readBoolean(parcel, header);
            } else if (fieldId == 4) {
                strCreateString = SafeParcelReader.createString(parcel, header);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zzd.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LastLocationRequest(j10, i10, z10, strCreateString, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LastLocationRequest[i10];
    }
}
