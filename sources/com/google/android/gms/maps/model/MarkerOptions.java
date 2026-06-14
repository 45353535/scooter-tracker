package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.ironsource.C4329g8;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "MarkerOptionsCreator")
@SafeParcelable.Reserved({1})
public class MarkerOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getPosition", id = 2)
    private LatLng zza;

    @Nullable
    @SafeParcelable.Field(getter = "getTitle", id = 3)
    private String zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getSnippet", id = 4)
    private String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getWrappedIconDescriptorImplBinder", id = 5, type = "android.os.IBinder")
    private BitmapDescriptor zzd;

    @SafeParcelable.Field(getter = "getAnchorU", id = 6)
    private float zze;

    @SafeParcelable.Field(getter = "getAnchorV", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = "isDraggable", id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = C4329g8.f43166k, id = 9)
    private boolean zzh;

    @SafeParcelable.Field(getter = "isFlat", id = 10)
    private boolean zzi;

    @SafeParcelable.Field(getter = "getRotation", id = 11)
    private float zzj;

    @SafeParcelable.Field(defaultValue = "0.5f", getter = "getInfoWindowAnchorU", id = 12)
    private float zzk;

    @SafeParcelable.Field(getter = "getInfoWindowAnchorV", id = 13)
    private float zzl;

    @SafeParcelable.Field(defaultValue = "1.0f", getter = "getAlpha", id = 14)
    private float zzm;

    @SafeParcelable.Field(getter = "getZIndex", id = 15)
    private float zzn;

    @AdvancedMarkerOptions.CollisionBehavior
    @SafeParcelable.Field(getter = "getCollisionBehaviorInternal", id = 17)
    private int zzo;

    @Nullable
    @SafeParcelable.Field(getter = "getIconViewBinder", id = 18, type = "android.os.IBinder")
    private View zzp;

    @SafeParcelable.Field(getter = "getMarkerType", id = 19)
    private int zzq;

    @Nullable
    @SafeParcelable.Field(getter = "getContentDescription", id = 20)
    private String zzr;

    @SafeParcelable.Field(getter = "getAltitudeInternal", id = 21)
    private float zzs;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
    }

    @NonNull
    public MarkerOptions alpha(float f10) {
        this.zzm = f10;
        return this;
    }

    @NonNull
    public MarkerOptions anchor(float f10, float f11) {
        this.zze = f10;
        this.zzf = f11;
        return this;
    }

    @NonNull
    public MarkerOptions contentDescription(@Nullable String str) {
        this.zzr = str;
        return this;
    }

    @NonNull
    public MarkerOptions draggable(boolean z10) {
        this.zzg = z10;
        return this;
    }

    @NonNull
    public MarkerOptions flat(boolean z10) {
        this.zzi = z10;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    @Nullable
    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    @NonNull
    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    @Nullable
    public String getSnippet() {
        return this.zzc;
    }

    @Nullable
    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @NonNull
    public MarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    @NonNull
    public MarkerOptions infoWindowAnchor(float f10, float f11) {
        this.zzk = f10;
        this.zzl = f11;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @NonNull
    public MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.zza = latLng;
        return this;
    }

    @NonNull
    public MarkerOptions rotation(float f10) {
        this.zzj = f10;
        return this;
    }

    @NonNull
    public MarkerOptions snippet(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @NonNull
    public MarkerOptions title(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public MarkerOptions visible(boolean z10) {
        this.zzh = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i10, false);
        SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        SafeParcelWriter.writeInt(parcel, 17, this.zzo);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 19, this.zzq);
        SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        SafeParcelWriter.writeFloat(parcel, 21, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public MarkerOptions zIndex(float f10) {
        this.zzn = f10;
        return this;
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzq;
    }

    @Nullable
    public final View zzc() {
        return this.zzp;
    }

    @NonNull
    public final MarkerOptions zzd(@AdvancedMarkerOptions.CollisionBehavior int i10) {
        this.zzo = i10;
        return this;
    }

    @NonNull
    public final MarkerOptions zze(@Nullable View view) {
        this.zzp = view;
        return this;
    }

    @NonNull
    public final MarkerOptions zzf(int i10) {
        this.zzq = 1;
        return this;
    }

    @SafeParcelable.Constructor
    MarkerOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder, @SafeParcelable.Param(id = 6) float f10, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) boolean z10, @SafeParcelable.Param(id = 9) boolean z11, @SafeParcelable.Param(id = 10) boolean z12, @SafeParcelable.Param(id = 11) float f12, @SafeParcelable.Param(id = 12) float f13, @SafeParcelable.Param(id = 13) float f14, @SafeParcelable.Param(id = 14) float f15, @SafeParcelable.Param(id = 15) float f16, @SafeParcelable.Param(id = 17) int i10, @SafeParcelable.Param(id = 18) IBinder iBinder2, @SafeParcelable.Param(id = 19) int i11, @SafeParcelable.Param(id = 20) String str3, @SafeParcelable.Param(id = 21) float f17) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f10;
        this.zzf = f11;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = z12;
        this.zzj = f12;
        this.zzk = f13;
        this.zzl = f14;
        this.zzm = f15;
        this.zzn = f16;
        this.zzq = i11;
        this.zzo = i10;
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(iBinder2);
        this.zzp = iObjectWrapperAsInterface != null ? (View) ObjectWrapper.unwrap(iObjectWrapperAsInterface) : null;
        this.zzr = str3;
        this.zzs = f17;
    }
}
