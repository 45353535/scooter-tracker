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
@SafeParcelable.Class(creator = "StreetViewPanoramaLinkCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaLink extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzy();

    @SafeParcelable.Field(id = 3)
    public final float bearing;

    @NonNull
    @SafeParcelable.Field(id = 2)
    public final String panoId;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLink(@NonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) float f10) {
        this.panoId = str;
        this.bearing = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
    }

    public int hashCode() {
        return Objects.hashCode(this.panoId, Float.valueOf(this.bearing));
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        String str = this.panoId;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
