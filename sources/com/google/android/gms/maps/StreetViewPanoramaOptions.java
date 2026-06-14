package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "StreetViewPanoramaOptionsCreator")
@SafeParcelable.Reserved({1})
public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<StreetViewPanoramaOptions> CREATOR = new zzaq();

    @Nullable
    @SafeParcelable.Field(getter = "getStreetViewPanoramaCamera", id = 2)
    private StreetViewPanoramaCamera zza;

    @Nullable
    @SafeParcelable.Field(getter = "getPanoramaId", id = 3)
    private String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getPosition", id = 4)
    private LatLng zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getRadius", id = 5)
    private Integer zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getUserNavigationEnabledForParcel", id = 6, type = "byte")
    private Boolean zze;

    @Nullable
    @SafeParcelable.Field(getter = "getZoomGesturesEnabledForParcel", id = 7, type = "byte")
    private Boolean zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getPanningGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getStreetNamesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getUseViewLifecycleInFragmentForParcel", id = 10, type = "byte")
    private Boolean zzi;

    @SafeParcelable.Field(getter = "getSource", id = 11)
    private StreetViewSource zzj;

    public StreetViewPanoramaOptions() {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
    }

    @Nullable
    public Boolean getPanningGesturesEnabled() {
        return this.zzg;
    }

    @Nullable
    public String getPanoramaId() {
        return this.zzb;
    }

    @Nullable
    public LatLng getPosition() {
        return this.zzc;
    }

    @Nullable
    public Integer getRadius() {
        return this.zzd;
    }

    @NonNull
    public StreetViewSource getSource() {
        return this.zzj;
    }

    @Nullable
    public Boolean getStreetNamesEnabled() {
        return this.zzh;
    }

    @Nullable
    public StreetViewPanoramaCamera getStreetViewPanoramaCamera() {
        return this.zza;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzi;
    }

    @Nullable
    public Boolean getUserNavigationEnabled() {
        return this.zze;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.zzf;
    }

    @NonNull
    public StreetViewPanoramaOptions panningGesturesEnabled(boolean z10) {
        this.zzg = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaCamera(@Nullable StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza = streetViewPanoramaCamera;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions panoramaId(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng) {
        this.zzc = latLng;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions streetNamesEnabled(boolean z10) {
        this.zzh = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("PanoramaId", this.zzb).add("Position", this.zzc).add("Radius", this.zzd).add("Source", this.zzj).add("StreetViewPanoramaCamera", this.zza).add("UserNavigationEnabled", this.zze).add("ZoomGesturesEnabled", this.zzf).add("PanningGesturesEnabled", this.zzg).add("StreetNamesEnabled", this.zzh).add("UseViewLifecycleInFragment", this.zzi).toString();
    }

    @NonNull
    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean z10) {
        this.zzi = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions userNavigationEnabled(boolean z10) {
        this.zze = Boolean.valueOf(z10);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getStreetViewPanoramaCamera(), i10, false);
        SafeParcelWriter.writeString(parcel, 3, getPanoramaId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getPosition(), i10, false);
        SafeParcelWriter.writeIntegerObject(parcel, 5, getRadius(), false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zze));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeParcelable(parcel, 11, getSource(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean z10) {
        this.zzf = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @NonNull StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzj = streetViewSource;
        return this;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @Nullable Integer num) {
        this.zzc = latLng;
        this.zzd = num;
        return this;
    }

    @SafeParcelable.Constructor
    StreetViewPanoramaOptions(@Nullable @SafeParcelable.Param(id = 2) StreetViewPanoramaCamera streetViewPanoramaCamera, @Nullable @SafeParcelable.Param(id = 3) String str, @Nullable @SafeParcelable.Param(id = 4) LatLng latLng, @Nullable @SafeParcelable.Param(id = 5) Integer num, @SafeParcelable.Param(id = 6) byte b10, @SafeParcelable.Param(id = 7) byte b11, @SafeParcelable.Param(id = 8) byte b12, @SafeParcelable.Param(id = 9) byte b13, @SafeParcelable.Param(id = 10) byte b14, @SafeParcelable.Param(id = 11) StreetViewSource streetViewSource) {
        Boolean bool = Boolean.TRUE;
        this.zze = bool;
        this.zzf = bool;
        this.zzg = bool;
        this.zzh = bool;
        this.zzj = StreetViewSource.DEFAULT;
        this.zza = streetViewPanoramaCamera;
        this.zzc = latLng;
        this.zzd = num;
        this.zzb = str;
        this.zze = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzj = streetViewSource;
    }

    @NonNull
    public StreetViewPanoramaOptions position(@Nullable LatLng latLng, @Nullable Integer num, @NonNull StreetViewSource streetViewSource) {
        this.zzc = latLng;
        this.zzd = num;
        this.zzj = streetViewSource;
        return this;
    }
}
