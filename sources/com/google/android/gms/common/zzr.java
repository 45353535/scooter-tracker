package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.X1;

/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
@SafeParcelable.Reserved({6})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean zza;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final String zzb;

    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int zzc;

    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int zzd;

    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getSourceStampTimestampSeconds", id = 5)
    private final long zze;

    @SafeParcelable.Constructor
    zzr(@SafeParcelable.Param(id = 1) boolean z10, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i10, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) long j10) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = zzz.zza(i10) - 1;
        this.zzd = zzc.zza(i11) - 1;
        this.zze = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final long zzc() {
        return this.zze;
    }

    public final int zzd() {
        return zzz.zza(this.zzc);
    }

    public final int zze() {
        return zzc.zza(this.zzd);
    }
}
