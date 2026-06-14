package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.X1;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
@SafeParcelable.Class(creator = "FeatureCreator")
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getName", id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int zzb;

    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getVersion", id = 3)
    private final long zzc;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIsFullyRolledOut", id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public Feature(@NonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) long j10, @SafeParcelable.Param(id = 4) boolean z10) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (Objects.equal(getName(), feature.getName()) && getVersion() == feature.getVersion() && getIsFullyRolledOut() == feature.getIsFullyRolledOut()) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean getIsFullyRolledOut() {
        return this.zzd;
    }

    @NonNull
    @KeepForSdk
    public String getName() {
        return this.zza;
    }

    @KeepForSdk
    public long getVersion() {
        long j10 = this.zzc;
        return j10 == -1 ? this.zzb : j10;
    }

    public final int hashCode() {
        return Objects.hashCode(getName(), Long.valueOf(getVersion()), Boolean.valueOf(getIsFullyRolledOut()));
    }

    @NonNull
    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("name", getName());
        stringHelper.add("version", Long.valueOf(getVersion()));
        stringHelper.add("is_fully_rolled_out", Boolean.valueOf(getIsFullyRolledOut()));
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getName(), false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, getVersion());
        SafeParcelWriter.writeBoolean(parcel, 4, getIsFullyRolledOut());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @KeepForSdk
    public Feature(@NonNull String str, int i10, long j10) {
        this(str, i10, j10, false);
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j10) {
        this(str, -1, j10, false);
    }

    @KeepForSdk
    public Feature(@NonNull String str, long j10, boolean z10) {
        this(str, -1, j10, z10);
    }
}
