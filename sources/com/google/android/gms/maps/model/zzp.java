package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        LatLng latLng = null;
        String strCreateString = null;
        String strCreateString2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String strCreateString3 = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i10 = 0;
        int i11 = 0;
        float f16 = 1.0f;
        float f17 = 0.5f;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 3:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 4:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 7:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 11:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f17 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 14:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 15:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 16:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 17:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 18:
                    iBinder2 = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 19:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 20:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 21:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new MarkerOptions(latLng, strCreateString, strCreateString2, iBinder, f10, f11, z10, z11, z12, f12, f17, f13, f16, f14, i10, iBinder2, i11, strCreateString3, f15);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MarkerOptions[i10];
    }
}
