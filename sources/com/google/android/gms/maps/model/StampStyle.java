package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StampStyleCreator")
@SafeParcelable.Reserved({1})
public class StampStyle extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StampStyle> CREATOR = new zzw();

    @NonNull
    @SafeParcelable.Field(getter = "getWrappedStampBinder", id = 2, type = "android.os.IBinder")
    protected final BitmapDescriptor zza;

    static abstract class Builder<T extends Builder<T>> {
        BitmapDescriptor zza;

        Builder() {
        }

        protected abstract T self();

        public T stamp(BitmapDescriptor bitmapDescriptor) {
            this.zza = bitmapDescriptor;
            return (T) self();
        }
    }

    @SafeParcelable.Constructor
    StampStyle(@SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.zza = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
    }

    @NonNull
    public BitmapDescriptor getStamp() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        BitmapDescriptor bitmapDescriptor = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 2, bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    protected StampStyle(@NonNull BitmapDescriptor bitmapDescriptor) {
        this.zza = bitmapDescriptor;
    }
}
