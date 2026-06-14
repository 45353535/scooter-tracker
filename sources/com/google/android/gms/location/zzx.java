package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes8.dex */
public final class zzx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        WorkSource workSource = new WorkSource();
        int i10 = 102;
        long j10 = 3600000;
        long j11 = 600000;
        long j12 = 0;
        long j13 = Long.MAX_VALUE;
        long j14 = Long.MAX_VALUE;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        long j15 = -1;
        String strCreateString = null;
        com.google.android.gms.internal.location.zzd zzdVar = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 4:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 5:
                    j13 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 6:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 7:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 8:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 9:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 10:
                    j14 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 11:
                    j15 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 12:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 13:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 15:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 16:
                    workSource = (WorkSource) SafeParcelReader.createParcelable(parcel, header, WorkSource.CREATOR);
                    break;
                case 17:
                    zzdVar = (com.google.android.gms.internal.location.zzd) SafeParcelReader.createParcelable(parcel, header, com.google.android.gms.internal.location.zzd.CREATOR);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new LocationRequest(i10, j10, j11, j12, j13, j14, i11, f10, z10, j15, i12, i13, strCreateString, z11, workSource, zzdVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
