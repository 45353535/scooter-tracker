package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapColorScheme;
import com.ironsource.X1;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "GoogleMapOptionsCreator")
@SafeParcelable.Reserved({1})
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new zzac();
    private static final Integer zza = Integer.valueOf(Color.argb(255, 236, 233, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE));

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getZOrderOnTopForParcel", id = 2, type = "byte")
    private Boolean zzb;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getUseViewLifecycleInFragmentForParcel", id = 3, type = "byte")
    private Boolean zzc;

    @SafeParcelable.Field(getter = "getMapType", id = 4)
    private int zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getCamera", id = 5)
    private CameraPosition zze;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getZoomControlsEnabledForParcel", id = 6, type = "byte")
    private Boolean zzf;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getCompassEnabledForParcel", id = 7, type = "byte")
    private Boolean zzg;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getScrollGesturesEnabledForParcel", id = 8, type = "byte")
    private Boolean zzh;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getZoomGesturesEnabledForParcel", id = 9, type = "byte")
    private Boolean zzi;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getTiltGesturesEnabledForParcel", id = 10, type = "byte")
    private Boolean zzj;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getRotateGesturesEnabledForParcel", id = 11, type = "byte")
    private Boolean zzk;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getLiteModeForParcel", id = 12, type = "byte")
    private Boolean zzl;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getMapToolbarEnabledForParcel", id = 14, type = "byte")
    private Boolean zzm;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getAmbientEnabledForParcel", id = 15, type = "byte")
    private Boolean zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getMinZoomPreference", id = 16)
    private Float zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getMaxZoomPreference", id = 17)
    private Float zzp;

    @Nullable
    @SafeParcelable.Field(getter = "getLatLngBoundsForCameraTarget", id = 18)
    private LatLngBounds zzq;

    @Nullable
    @SafeParcelable.Field(defaultValue = X1.f42014f, getter = "getScrollGesturesEnabledDuringRotateOrZoomForParcel", id = 19, type = "byte")
    private Boolean zzr;

    @Nullable
    @ColorInt
    @SafeParcelable.Field(getter = "getBackgroundColor", id = 20)
    private Integer zzs;

    @Nullable
    @SafeParcelable.Field(getter = "getMapId", id = 21)
    private String zzt;

    @MapColorScheme
    @SafeParcelable.Field(defaultValue = "0", getter = "getMapColorScheme", id = 23, type = "int")
    private int zzu;

    public GoogleMapOptions() {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
    }

    @Nullable
    public static GoogleMapOptions createFromAttributes(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        String string;
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i10 = R.styleable.MapAttrs_mapType;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            googleMapOptions.mapType(typedArrayObtainAttributes.getInt(i10, -1));
        }
        int i11 = R.styleable.MapAttrs_zOrderOnTop;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            googleMapOptions.zOrderOnTop(typedArrayObtainAttributes.getBoolean(i11, false));
        }
        int i12 = R.styleable.MapAttrs_useViewLifecycle;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            googleMapOptions.useViewLifecycleInFragment(typedArrayObtainAttributes.getBoolean(i12, false));
        }
        int i13 = R.styleable.MapAttrs_uiCompass;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            googleMapOptions.compassEnabled(typedArrayObtainAttributes.getBoolean(i13, true));
        }
        int i14 = R.styleable.MapAttrs_uiRotateGestures;
        if (typedArrayObtainAttributes.hasValue(i14)) {
            googleMapOptions.rotateGesturesEnabled(typedArrayObtainAttributes.getBoolean(i14, true));
        }
        int i15 = R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom;
        if (typedArrayObtainAttributes.hasValue(i15)) {
            googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(typedArrayObtainAttributes.getBoolean(i15, true));
        }
        int i16 = R.styleable.MapAttrs_uiScrollGestures;
        if (typedArrayObtainAttributes.hasValue(i16)) {
            googleMapOptions.scrollGesturesEnabled(typedArrayObtainAttributes.getBoolean(i16, true));
        }
        int i17 = R.styleable.MapAttrs_uiTiltGestures;
        if (typedArrayObtainAttributes.hasValue(i17)) {
            googleMapOptions.tiltGesturesEnabled(typedArrayObtainAttributes.getBoolean(i17, true));
        }
        int i18 = R.styleable.MapAttrs_uiZoomGestures;
        if (typedArrayObtainAttributes.hasValue(i18)) {
            googleMapOptions.zoomGesturesEnabled(typedArrayObtainAttributes.getBoolean(i18, true));
        }
        int i19 = R.styleable.MapAttrs_uiZoomControls;
        if (typedArrayObtainAttributes.hasValue(i19)) {
            googleMapOptions.zoomControlsEnabled(typedArrayObtainAttributes.getBoolean(i19, true));
        }
        int i20 = R.styleable.MapAttrs_liteMode;
        if (typedArrayObtainAttributes.hasValue(i20)) {
            googleMapOptions.liteMode(typedArrayObtainAttributes.getBoolean(i20, false));
        }
        int i21 = R.styleable.MapAttrs_uiMapToolbar;
        if (typedArrayObtainAttributes.hasValue(i21)) {
            googleMapOptions.mapToolbarEnabled(typedArrayObtainAttributes.getBoolean(i21, true));
        }
        int i22 = R.styleable.MapAttrs_ambientEnabled;
        if (typedArrayObtainAttributes.hasValue(i22)) {
            googleMapOptions.ambientEnabled(typedArrayObtainAttributes.getBoolean(i22, false));
        }
        int i23 = R.styleable.MapAttrs_cameraMinZoomPreference;
        if (typedArrayObtainAttributes.hasValue(i23)) {
            googleMapOptions.minZoomPreference(typedArrayObtainAttributes.getFloat(i23, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(i23)) {
            googleMapOptions.maxZoomPreference(typedArrayObtainAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        int i24 = R.styleable.MapAttrs_backgroundColor;
        if (typedArrayObtainAttributes.hasValue(i24)) {
            googleMapOptions.backgroundColor(Integer.valueOf(typedArrayObtainAttributes.getColor(i24, zza.intValue())));
        }
        int i25 = R.styleable.MapAttrs_mapId;
        if (typedArrayObtainAttributes.hasValue(i25) && (string = typedArrayObtainAttributes.getString(i25)) != null && !string.isEmpty()) {
            googleMapOptions.mapId(string);
        }
        int i26 = R.styleable.MapAttrs_mapColorScheme;
        if (typedArrayObtainAttributes.hasValue(i26)) {
            googleMapOptions.mapColorScheme(typedArrayObtainAttributes.getInt(i26, 0));
        }
        googleMapOptions.latLngBoundsForCameraTarget(zzb(context, attributeSet));
        googleMapOptions.camera(zza(context, attributeSet));
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    @Nullable
    public static CameraPosition zza(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i10 = R.styleable.MapAttrs_cameraTargetLat;
        LatLng latLng = new LatLng(typedArrayObtainAttributes.hasValue(i10) ? typedArrayObtainAttributes.getFloat(i10, 0.0f) : 0.0f, typedArrayObtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes.getFloat(r0, 0.0f) : 0.0f);
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        int i11 = R.styleable.MapAttrs_cameraZoom;
        if (typedArrayObtainAttributes.hasValue(i11)) {
            builder.zoom(typedArrayObtainAttributes.getFloat(i11, 0.0f));
        }
        int i12 = R.styleable.MapAttrs_cameraBearing;
        if (typedArrayObtainAttributes.hasValue(i12)) {
            builder.bearing(typedArrayObtainAttributes.getFloat(i12, 0.0f));
        }
        int i13 = R.styleable.MapAttrs_cameraTilt;
        if (typedArrayObtainAttributes.hasValue(i13)) {
            builder.tilt(typedArrayObtainAttributes.getFloat(i13, 0.0f));
        }
        typedArrayObtainAttributes.recycle();
        return builder.build();
    }

    @Nullable
    public static LatLngBounds zzb(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        int i10 = R.styleable.MapAttrs_latLngBoundsSouthWestLatitude;
        Float fValueOf = typedArrayObtainAttributes.hasValue(i10) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i10, 0.0f)) : null;
        int i11 = R.styleable.MapAttrs_latLngBoundsSouthWestLongitude;
        Float fValueOf2 = typedArrayObtainAttributes.hasValue(i11) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i11, 0.0f)) : null;
        int i12 = R.styleable.MapAttrs_latLngBoundsNorthEastLatitude;
        Float fValueOf3 = typedArrayObtainAttributes.hasValue(i12) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i12, 0.0f)) : null;
        int i13 = R.styleable.MapAttrs_latLngBoundsNorthEastLongitude;
        Float fValueOf4 = typedArrayObtainAttributes.hasValue(i13) ? Float.valueOf(typedArrayObtainAttributes.getFloat(i13, 0.0f)) : null;
        typedArrayObtainAttributes.recycle();
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null || fValueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
    }

    @NonNull
    public GoogleMapOptions ambientEnabled(boolean z10) {
        this.zzn = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions backgroundColor(@Nullable @ColorInt Integer num) {
        this.zzs = num;
        return this;
    }

    @NonNull
    public GoogleMapOptions camera(@Nullable CameraPosition cameraPosition) {
        this.zze = cameraPosition;
        return this;
    }

    @NonNull
    public GoogleMapOptions compassEnabled(boolean z10) {
        this.zzg = Boolean.valueOf(z10);
        return this;
    }

    @Nullable
    public Boolean getAmbientEnabled() {
        return this.zzn;
    }

    @Nullable
    @ColorInt
    public Integer getBackgroundColor() {
        return this.zzs;
    }

    @Nullable
    public CameraPosition getCamera() {
        return this.zze;
    }

    @Nullable
    public Boolean getCompassEnabled() {
        return this.zzg;
    }

    @Nullable
    public LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.zzq;
    }

    @Nullable
    public Boolean getLiteMode() {
        return this.zzl;
    }

    @MapColorScheme
    public int getMapColorScheme() {
        return this.zzu;
    }

    @Nullable
    public String getMapId() {
        return this.zzt;
    }

    @Nullable
    public Boolean getMapToolbarEnabled() {
        return this.zzm;
    }

    public int getMapType() {
        return this.zzd;
    }

    @Nullable
    public Float getMaxZoomPreference() {
        return this.zzp;
    }

    @Nullable
    public Float getMinZoomPreference() {
        return this.zzo;
    }

    @Nullable
    public Boolean getRotateGesturesEnabled() {
        return this.zzk;
    }

    @Nullable
    public Boolean getScrollGesturesEnabled() {
        return this.zzh;
    }

    @Nullable
    public Boolean getScrollGesturesEnabledDuringRotateOrZoom() {
        return this.zzr;
    }

    @Nullable
    public Boolean getTiltGesturesEnabled() {
        return this.zzj;
    }

    @Nullable
    public Boolean getUseViewLifecycleInFragment() {
        return this.zzc;
    }

    @Nullable
    public Boolean getZOrderOnTop() {
        return this.zzb;
    }

    @Nullable
    public Boolean getZoomControlsEnabled() {
        return this.zzf;
    }

    @Nullable
    public Boolean getZoomGesturesEnabled() {
        return this.zzi;
    }

    @NonNull
    public GoogleMapOptions latLngBoundsForCameraTarget(@Nullable LatLngBounds latLngBounds) {
        this.zzq = latLngBounds;
        return this;
    }

    @NonNull
    public GoogleMapOptions liteMode(boolean z10) {
        this.zzl = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapColorScheme(@MapColorScheme int i10) {
        this.zzu = i10;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapId(@NonNull String str) {
        this.zzt = str;
        return this;
    }

    @NonNull
    public GoogleMapOptions mapToolbarEnabled(boolean z10) {
        this.zzm = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions mapType(int i10) {
        this.zzd = i10;
        return this;
    }

    @NonNull
    public GoogleMapOptions maxZoomPreference(float f10) {
        this.zzp = Float.valueOf(f10);
        return this;
    }

    @NonNull
    public GoogleMapOptions minZoomPreference(float f10) {
        this.zzo = Float.valueOf(f10);
        return this;
    }

    @NonNull
    public GoogleMapOptions rotateGesturesEnabled(boolean z10) {
        this.zzk = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabled(boolean z10) {
        this.zzh = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions scrollGesturesEnabledDuringRotateOrZoom(boolean z10) {
        this.zzr = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions tiltGesturesEnabled(boolean z10) {
        this.zzj = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("MapType", Integer.valueOf(this.zzd)).add("LiteMode", this.zzl).add("Camera", this.zze).add("CompassEnabled", this.zzg).add("ZoomControlsEnabled", this.zzf).add("ScrollGesturesEnabled", this.zzh).add("ZoomGesturesEnabled", this.zzi).add("TiltGesturesEnabled", this.zzj).add("RotateGesturesEnabled", this.zzk).add("ScrollGesturesEnabledDuringRotateOrZoom", this.zzr).add("MapToolbarEnabled", this.zzm).add("AmbientEnabled", this.zzn).add("MinZoomPreference", this.zzo).add("MaxZoomPreference", this.zzp).add("BackgroundColor", this.zzs).add("LatLngBoundsForCameraTarget", this.zzq).add("ZOrderOnTop", this.zzb).add("UseViewLifecycleInFragment", this.zzc).add("mapColorScheme", Integer.valueOf(this.zzu)).toString();
    }

    @NonNull
    public GoogleMapOptions useViewLifecycleInFragment(boolean z10) {
        this.zzc = Boolean.valueOf(z10);
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByte(parcel, 2, com.google.android.gms.maps.internal.zza.zza(this.zzb));
        SafeParcelWriter.writeByte(parcel, 3, com.google.android.gms.maps.internal.zza.zza(this.zzc));
        SafeParcelWriter.writeInt(parcel, 4, getMapType());
        SafeParcelWriter.writeParcelable(parcel, 5, getCamera(), i10, false);
        SafeParcelWriter.writeByte(parcel, 6, com.google.android.gms.maps.internal.zza.zza(this.zzf));
        SafeParcelWriter.writeByte(parcel, 7, com.google.android.gms.maps.internal.zza.zza(this.zzg));
        SafeParcelWriter.writeByte(parcel, 8, com.google.android.gms.maps.internal.zza.zza(this.zzh));
        SafeParcelWriter.writeByte(parcel, 9, com.google.android.gms.maps.internal.zza.zza(this.zzi));
        SafeParcelWriter.writeByte(parcel, 10, com.google.android.gms.maps.internal.zza.zza(this.zzj));
        SafeParcelWriter.writeByte(parcel, 11, com.google.android.gms.maps.internal.zza.zza(this.zzk));
        SafeParcelWriter.writeByte(parcel, 12, com.google.android.gms.maps.internal.zza.zza(this.zzl));
        SafeParcelWriter.writeByte(parcel, 14, com.google.android.gms.maps.internal.zza.zza(this.zzm));
        SafeParcelWriter.writeByte(parcel, 15, com.google.android.gms.maps.internal.zza.zza(this.zzn));
        SafeParcelWriter.writeFloatObject(parcel, 16, getMinZoomPreference(), false);
        SafeParcelWriter.writeFloatObject(parcel, 17, getMaxZoomPreference(), false);
        SafeParcelWriter.writeParcelable(parcel, 18, getLatLngBoundsForCameraTarget(), i10, false);
        SafeParcelWriter.writeByte(parcel, 19, com.google.android.gms.maps.internal.zza.zza(this.zzr));
        SafeParcelWriter.writeIntegerObject(parcel, 20, getBackgroundColor(), false);
        SafeParcelWriter.writeString(parcel, 21, getMapId(), false);
        SafeParcelWriter.writeInt(parcel, 23, getMapColorScheme());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public GoogleMapOptions zOrderOnTop(boolean z10) {
        this.zzb = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomControlsEnabled(boolean z10) {
        this.zzf = Boolean.valueOf(z10);
        return this;
    }

    @NonNull
    public GoogleMapOptions zoomGesturesEnabled(boolean z10) {
        this.zzi = Boolean.valueOf(z10);
        return this;
    }

    @SafeParcelable.Constructor
    GoogleMapOptions(@SafeParcelable.Param(id = 2) byte b10, @SafeParcelable.Param(id = 3) byte b11, @SafeParcelable.Param(id = 4) int i10, @Nullable @SafeParcelable.Param(id = 5) CameraPosition cameraPosition, @SafeParcelable.Param(id = 6) byte b12, @SafeParcelable.Param(id = 7) byte b13, @SafeParcelable.Param(id = 8) byte b14, @SafeParcelable.Param(id = 9) byte b15, @SafeParcelable.Param(id = 10) byte b16, @SafeParcelable.Param(id = 11) byte b17, @SafeParcelable.Param(id = 12) byte b18, @SafeParcelable.Param(id = 14) byte b19, @SafeParcelable.Param(id = 15) byte b20, @Nullable @SafeParcelable.Param(id = 16) Float f10, @Nullable @SafeParcelable.Param(id = 17) Float f11, @Nullable @SafeParcelable.Param(id = 18) LatLngBounds latLngBounds, @SafeParcelable.Param(id = 19) byte b21, @Nullable @SafeParcelable.Param(id = 20) @ColorInt Integer num, @Nullable @SafeParcelable.Param(id = 21) String str, @SafeParcelable.Param(id = 23) @MapColorScheme int i11) {
        this.zzd = -1;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzb = com.google.android.gms.maps.internal.zza.zzb(b10);
        this.zzc = com.google.android.gms.maps.internal.zza.zzb(b11);
        this.zzd = i10;
        this.zze = cameraPosition;
        this.zzf = com.google.android.gms.maps.internal.zza.zzb(b12);
        this.zzg = com.google.android.gms.maps.internal.zza.zzb(b13);
        this.zzh = com.google.android.gms.maps.internal.zza.zzb(b14);
        this.zzi = com.google.android.gms.maps.internal.zza.zzb(b15);
        this.zzj = com.google.android.gms.maps.internal.zza.zzb(b16);
        this.zzk = com.google.android.gms.maps.internal.zza.zzb(b17);
        this.zzl = com.google.android.gms.maps.internal.zza.zzb(b18);
        this.zzm = com.google.android.gms.maps.internal.zza.zzb(b19);
        this.zzn = com.google.android.gms.maps.internal.zza.zzb(b20);
        this.zzo = f10;
        this.zzp = f11;
        this.zzq = latLngBounds;
        this.zzr = com.google.android.gms.maps.internal.zza.zzb(b21);
        this.zzs = num;
        this.zzt = str;
        this.zzu = i11;
    }
}
