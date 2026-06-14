package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    protected Cap(int i10) {
        this(i10, (BitmapDescriptor) null, (Float) null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    @NonNull
    public String toString() {
        return "[Cap: type=" + this.zzb + C4240b4.j.f42674e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i11);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    final Cap zza() {
        int i10 = this.zzb;
        if (i10 == 0) {
            return new ButtCap();
        }
        if (i10 == 1) {
            return new SquareCap();
        }
        if (i10 == 2) {
            return new RoundCap();
        }
        if (i10 == 3) {
            BitmapDescriptor bitmapDescriptor = this.zzc;
            Preconditions.checkState(bitmapDescriptor != null, "bitmapDescriptor must not be null");
            Float f10 = this.zzd;
            Preconditions.checkState(f10 != null, "bitmapRefWidth must not be null");
            return new CustomCap(bitmapDescriptor, f10.floatValue());
        }
        Log.w(zza, "Unknown Cap type: " + i10);
        return this;
    }

    @SafeParcelable.Constructor
    Cap(@SafeParcelable.Param(id = 2) int i10, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 4) Float f10) {
        this(i10, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f10);
    }

    private Cap(int i10, @Nullable BitmapDescriptor bitmapDescriptor, @Nullable Float f10) {
        boolean z10;
        boolean z11 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 != 3) {
            z10 = true;
        } else if (bitmapDescriptor == null || !z11) {
            i10 = 3;
            z10 = false;
        } else {
            i10 = 3;
            z10 = true;
        }
        Preconditions.checkArgument(z10, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), bitmapDescriptor, f10));
        this.zzb = i10;
        this.zzc = bitmapDescriptor;
        this.zzd = f10;
    }

    protected Cap(@NonNull BitmapDescriptor bitmapDescriptor, float f10) {
        this(3, bitmapDescriptor, Float.valueOf(f10));
    }
}
