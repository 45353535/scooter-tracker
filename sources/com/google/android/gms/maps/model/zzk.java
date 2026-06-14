package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 2:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.createParcelable(parcel, header, LatLng.CREATOR);
                    break;
                case 4:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 5:
                    f11 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, header, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f12 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    f13 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    f14 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 11:
                    f15 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 12:
                    f16 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 13:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GroundOverlayOptions(iBinder, latLng, f10, f11, latLngBounds, f12, f13, z10, f14, f15, f16, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GroundOverlayOptions[i10];
    }
}
