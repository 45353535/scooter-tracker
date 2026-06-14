package com.google.android.gms.internal.tflite;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzc {
    static {
        zzc.class.getClassLoader();
    }

    private zzc() {
    }

    public static void zza(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zzb(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
