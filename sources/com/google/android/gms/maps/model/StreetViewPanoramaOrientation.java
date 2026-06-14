package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new zzaa();

    @SafeParcelable.Field(id = 3)
    public final float bearing;

    @SafeParcelable.Field(id = 2)
    public final float tilt;

    public static final class Builder {
        public float bearing;
        public float tilt;

        public Builder() {
        }

        @NonNull
        public Builder bearing(float f10) {
            this.bearing = f10;
            return this;
        }

        @NonNull
        public StreetViewPanoramaOrientation build() {
            return new StreetViewPanoramaOrientation(this.tilt, this.bearing);
        }

        @NonNull
        public Builder tilt(float f10) {
            this.tilt = f10;
            return this;
        }

        public Builder(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            Preconditions.checkNotNull(streetViewPanoramaOrientation, "StreetViewPanoramaOrientation must not be null.");
            this.bearing = streetViewPanoramaOrientation.bearing;
            this.tilt = streetViewPanoramaOrientation.tilt;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(id = 2) float f10, @SafeParcelable.Param(id = 3) float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f) {
            z10 = true;
        }
        Preconditions.checkArgument(z10, "Tilt needs to be between -90 and 90 inclusive: " + f10);
        this.tilt = f10 + 0.0f;
        this.bearing = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        return Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.tilt), Float.valueOf(this.bearing));
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.tilt)).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        float f10 = this.tilt;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, f10);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public static Builder builder(@NonNull StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        return new Builder(streetViewPanoramaOrientation);
    }
}
