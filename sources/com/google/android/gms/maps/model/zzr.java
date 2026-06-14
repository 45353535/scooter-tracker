package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.PinConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PinConfig.Glyph glyph = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 2) {
                i10 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId == 3) {
                i11 = SafeParcelReader.readInt(parcel, header);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                glyph = (PinConfig.Glyph) SafeParcelReader.createParcelable(parcel, header, PinConfig.Glyph.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new PinConfig(i10, i11, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new PinConfig[i10];
    }
}
