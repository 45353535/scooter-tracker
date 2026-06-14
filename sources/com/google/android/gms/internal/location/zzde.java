package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayListCreateTypedList = null;
        String strCreateString = null;
        String strCreateString2 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        long j10 = Long.MAX_VALUE;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(header);
            if (fieldId == 1) {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, header, LocationRequest.CREATOR);
            } else if (fieldId != 5) {
                switch (fieldId) {
                    case 8:
                        z10 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 9:
                        z11 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 10:
                        strCreateString = SafeParcelReader.createString(parcel, header);
                        break;
                    case 11:
                        z12 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 12:
                        z13 = SafeParcelReader.readBoolean(parcel, header);
                        break;
                    case 13:
                        strCreateString2 = SafeParcelReader.createString(parcel, header);
                        break;
                    case 14:
                        j10 = SafeParcelReader.readLong(parcel, header);
                        break;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, header);
                        break;
                }
            } else {
                arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzdd(locationRequest, arrayListCreateTypedList, z10, z11, strCreateString, z12, z13, strCreateString2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
