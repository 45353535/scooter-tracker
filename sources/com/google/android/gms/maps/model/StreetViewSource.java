package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewSource extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzab();

    @NonNull
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);

    @NonNull
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zza;

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(id = 2) int i10) {
        this.zza = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zza == ((StreetViewSource) obj).zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza));
    }

    @NonNull
    public String toString() {
        int i10 = this.zza;
        return String.format("StreetViewSource:%s", i10 != 0 ? i10 != 1 ? String.format("UNKNOWN(%s)", Integer.valueOf(i10)) : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int i11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i11);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
