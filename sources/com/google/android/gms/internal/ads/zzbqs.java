package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "InstreamAdConfigurationParcelCreator")
public final class zzbqs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbqs> CREATOR = new zzbqt();

    @SafeParcelable.VersionField(id = 1000)
    public final int zza;

    @SafeParcelable.Field(id = 1)
    public final int zzb;

    @SafeParcelable.Field(id = 2)
    public final String zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Constructor
    public zzbqs(@SafeParcelable.Param(id = 1000) int i10, @SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeString(parcel, 2, this.zzc, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
