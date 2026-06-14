package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                f10 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId == 3) {
                f11 = SafeParcelReader.readFloat(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                f12 = SafeParcelReader.readFloat(parcel, header);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new StreetViewPanoramaCamera(f10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StreetViewPanoramaCamera[i10];
    }
}
