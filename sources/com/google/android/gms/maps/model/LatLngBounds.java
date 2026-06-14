package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzm();

    @NonNull
    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;

    @NonNull
    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        @NonNull
        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        @NonNull
        public Builder include(@NonNull LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d10 = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d10;
                this.zzd = d10;
                return this;
            }
            double d11 = this.zzc;
            double d12 = this.zzd;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.zzc = d10;
                    return this;
                }
                this.zzd = d10;
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@NonNull @SafeParcelable.Param(id = 2) LatLng latLng, @NonNull @SafeParcelable.Param(id = 3) LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d10 = latLng2.latitude;
        double d11 = latLng.latitude;
        Preconditions.checkArgument(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public static LatLngBounds createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d10) {
        LatLng latLng = this.northeast;
        double d11 = this.southwest.longitude;
        double d12 = latLng.longitude;
        return d11 <= d12 ? d11 <= d10 && d10 <= d12 : d11 <= d10 || d10 <= d12;
    }

    public boolean contains(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d10 = latLng2.latitude;
        return this.southwest.latitude <= d10 && d10 <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    @NonNull
    public LatLng getCenter() {
        LatLng latLng = this.northeast;
        LatLng latLng2 = this.southwest;
        double d10 = latLng2.latitude + latLng.latitude;
        double d11 = latLng.longitude;
        double d12 = latLng2.longitude;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        return new LatLng(d10 / 2.0d, (d11 + d12) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    @NonNull
    public LatLngBounds including(@NonNull LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double dMin = Math.min(this.southwest.latitude, latLng2.latitude);
        double dMax = Math.max(this.northeast.latitude, latLng2.latitude);
        double d10 = this.northeast.longitude;
        double d11 = this.southwest.longitude;
        double d12 = latLng2.longitude;
        if (!zza(d12)) {
            if (((d11 - d12) + 360.0d) % 360.0d < ((d12 - d10) + 360.0d) % 360.0d) {
                d11 = d12;
            } else {
                d10 = d12;
            }
        }
        return new LatLngBounds(new LatLng(dMin, d11), new LatLng(dMax, d10));
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        LatLng latLng = this.southwest;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, latLng, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
