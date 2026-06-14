package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.location.zzdj;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "CurrentLocationRequestCreator")
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new zzj();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", id = 3)
    private final int zzc;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", id = 4)
    private final long zzd;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 5)
    private final boolean zze;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", id = 7)
    private final int zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", id = 8)
    private final String zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", id = 6)
    private final WorkSource zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", id = 9)
    private final com.google.android.gms.internal.location.zzd zzi;

    public static final class Builder {
        private long zza;
        private int zzb;
        private int zzc;
        private long zzd;
        private boolean zze;
        private int zzf;

        @Nullable
        private String zzg;

        @Nullable
        private WorkSource zzh;

        @Nullable
        private com.google.android.gms.internal.location.zzd zzi;

        public Builder() {
            this.zza = 60000L;
            this.zzb = 0;
            this.zzc = 102;
            this.zzd = Long.MAX_VALUE;
            this.zze = false;
            this.zzf = 0;
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
        }

        @NonNull
        public CurrentLocationRequest build() {
            return new CurrentLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, new WorkSource(this.zzh), this.zzi);
        }

        @NonNull
        public Builder setDurationMillis(long j10) {
            Preconditions.checkArgument(j10 > 0, "durationMillis must be greater than 0");
            this.zzd = j10;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i10) {
            zzo.zza(i10);
            this.zzb = i10;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j10) {
            Preconditions.checkArgument(j10 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.zza = j10;
            return this;
        }

        @NonNull
        public Builder setPriority(int i10) {
            zzae.zza(i10);
            this.zzc = i10;
            return this;
        }

        public Builder(@NonNull CurrentLocationRequest currentLocationRequest) {
            this.zza = currentLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = currentLocationRequest.getGranularity();
            this.zzc = currentLocationRequest.getPriority();
            this.zzd = currentLocationRequest.getDurationMillis();
            this.zze = currentLocationRequest.zze();
            this.zzf = currentLocationRequest.zza();
            this.zzg = currentLocationRequest.zzd();
            this.zzh = new WorkSource(currentLocationRequest.zzb());
            this.zzi = currentLocationRequest.zzc();
        }
    }

    @SafeParcelable.Constructor
    CurrentLocationRequest(@SafeParcelable.Param(id = 1) long j10, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) long j11, @SafeParcelable.Param(id = 5) boolean z10, @SafeParcelable.Param(id = 7) int i12, @Nullable @SafeParcelable.Param(id = 8) String str, @SafeParcelable.Param(id = 6) WorkSource workSource, @Nullable @SafeParcelable.Param(id = 9) com.google.android.gms.internal.location.zzd zzdVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        this.zza = j10;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j11;
        this.zze = z10;
        this.zzf = i12;
        this.zzg = str;
        this.zzh = workSource;
        this.zzi = zzdVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.zza == currentLocationRequest.zza && this.zzb == currentLocationRequest.zzb && this.zzc == currentLocationRequest.zzc && this.zzd == currentLocationRequest.zzd && this.zze == currentLocationRequest.zze && this.zzf == currentLocationRequest.zzf && Objects.equal(this.zzg, currentLocationRequest.zzg) && Objects.equal(this.zzh, currentLocationRequest.zzh) && Objects.equal(this.zzi, currentLocationRequest.zzi);
    }

    public long getDurationMillis() {
        return this.zzd;
    }

    public int getGranularity() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int getPriority() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Long.valueOf(this.zzd));
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(zzae.zzb(this.zzc));
        if (this.zza != Long.MAX_VALUE) {
            sb2.append(", maxAge=");
            zzdj.zzb(this.zza, sb2);
        }
        if (this.zzd != Long.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.zzd);
            sb2.append("ms");
        }
        if (this.zzb != 0) {
            sb2.append(", ");
            sb2.append(zzo.zzb(this.zzb));
        }
        if (this.zze) {
            sb2.append(", bypass");
        }
        if (this.zzf != 0) {
            sb2.append(", ");
            sb2.append(zzai.zza(this.zzf));
        }
        if (this.zzg != null) {
            sb2.append(", moduleId=");
            sb2.append(this.zzg);
        }
        if (!WorkSourceUtil.isEmpty(this.zzh)) {
            sb2.append(", workSource=");
            sb2.append(this.zzh);
        }
        if (this.zzi != null) {
            sb2.append(", impersonation=");
            sb2.append(this.zzi);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeInt(parcel, 3, getPriority());
        SafeParcelWriter.writeLong(parcel, 4, getDurationMillis());
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzh, i10, false);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzf;
    }

    @NonNull
    public final WorkSource zzb() {
        return this.zzh;
    }

    @Nullable
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzi;
    }

    @Nullable
    @Deprecated
    public final String zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return this.zze;
    }
}
