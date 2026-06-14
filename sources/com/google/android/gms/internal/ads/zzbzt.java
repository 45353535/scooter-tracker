package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbzt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(header) != 2) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.createParcelable(parcel, header, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzbzs(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbzs[i10];
    }
}
