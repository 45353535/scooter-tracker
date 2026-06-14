package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "RewardedVideoAdRequestParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzcan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcan> CREATOR = new zzcao();

    @SafeParcelable.Field(id = 2)
    public final com.google.android.gms.ads.internal.client.zzm zza;

    @SafeParcelable.Field(id = 3)
    public final String zzb;

    @SafeParcelable.Constructor
    public zzcan(@SafeParcelable.Param(id = 2) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(id = 3) String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, zzmVar, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
