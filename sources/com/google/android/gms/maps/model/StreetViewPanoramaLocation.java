package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzz();

    @NonNull
    @SafeParcelable.Field(id = 2)
    public final StreetViewPanoramaLink[] links;

    @NonNull
    @SafeParcelable.Field(id = 4)
    public final String panoId;

    @NonNull
    @SafeParcelable.Field(id = 3)
    public final LatLng position;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@NonNull @SafeParcelable.Param(id = 2) StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @NonNull @SafeParcelable.Param(id = 3) LatLng latLng, @NonNull @SafeParcelable.Param(id = 4) String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
    }

    public int hashCode() {
        return Objects.hashCode(this.position, this.panoId);
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add(C4240b4.i.L, this.position.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = this.links;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, streetViewPanoramaLinkArr, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.position, i10, false);
        SafeParcelWriter.writeString(parcel, 4, this.panoId, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
