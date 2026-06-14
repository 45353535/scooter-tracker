package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "IconAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzeh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeh> CREATOR = new zzei();

    @SafeParcelable.Field(id = 2)
    public final int zza;

    @SafeParcelable.Constructor
    public zzeh(@SafeParcelable.Param(id = 2) int i10) {
        this.zza = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i11);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
