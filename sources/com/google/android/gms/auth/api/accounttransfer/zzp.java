package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashSet = new HashSet();
        int i10 = 0;
        ArrayList arrayList = null;
        zzs zzsVar = null;
        int i11 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                int i12 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(1);
                i11 = i12;
            } else if (fieldId == 2) {
                ArrayList arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, zzu.CREATOR);
                hashSet.add(2);
                arrayList = arrayListCreateTypedList;
            } else if (fieldId == 3) {
                int i13 = SafeParcelReader.readInt(parcel, header);
                hashSet.add(3);
                i10 = i13;
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, header);
            } else {
                zzs zzsVar2 = (zzs) SafeParcelReader.createParcelable(parcel, header, zzs.CREATOR);
                hashSet.add(4);
                zzsVar = zzsVar2;
            }
        }
        if (parcel.dataPosition() == iValidateObjectHeader) {
            return new zzo(hashSet, i11, arrayList, i10, zzsVar);
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + iValidateObjectHeader, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
