package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.C4329g8;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "CircleOptionsCreator")
@SafeParcelable.Reserved({1})
public final class CircleOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @Nullable
    @SafeParcelable.Field(getter = "getCenter", id = 2)
    private LatLng zza;

    @SafeParcelable.Field(getter = "getRadius", id = 3)
    private double zzb;

    @SafeParcelable.Field(getter = "getStrokeWidth", id = 4)
    private float zzc;

    @SafeParcelable.Field(getter = "getStrokeColor", id = 5)
    private int zzd;

    @SafeParcelable.Field(getter = "getFillColor", id = 6)
    private int zze;

    @SafeParcelable.Field(getter = "getZIndex", id = 7)
    private float zzf;

    @SafeParcelable.Field(getter = C4329g8.f43166k, id = 8)
    private boolean zzg;

    @SafeParcelable.Field(getter = "isClickable", id = 9)
    private boolean zzh;

    @Nullable
    @SafeParcelable.Field(getter = "getStrokePattern", id = 10)
    private List zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = ViewCompat.MEASURED_STATE_MASK;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    @NonNull
    public CircleOptions center(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    @NonNull
    public CircleOptions clickable(boolean z10) {
        this.zzh = z10;
        return this;
    }

    @NonNull
    public CircleOptions fillColor(int i10) {
        this.zze = i10;
        return this;
    }

    @Nullable
    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public CircleOptions radius(double d10) {
        this.zzb = d10;
        return this;
    }

    @NonNull
    public CircleOptions strokeColor(int i10) {
        this.zzd = i10;
        return this;
    }

    @NonNull
    public CircleOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    @NonNull
    public CircleOptions strokeWidth(float f10) {
        this.zzc = f10;
        return this;
    }

    @NonNull
    public CircleOptions visible(boolean z10) {
        this.zzg = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getCenter(), i10, false);
        SafeParcelWriter.writeDouble(parcel, 3, getRadius());
        SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        SafeParcelWriter.writeBoolean(parcel, 9, isClickable());
        SafeParcelWriter.writeTypedList(parcel, 10, getStrokePattern(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public CircleOptions zIndex(float f10) {
        this.zzf = f10;
        return this;
    }

    @SafeParcelable.Constructor
    CircleOptions(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) double d10, @SafeParcelable.Param(id = 4) float f10, @SafeParcelable.Param(id = 5) int i10, @SafeParcelable.Param(id = 6) int i11, @SafeParcelable.Param(id = 7) float f11, @SafeParcelable.Param(id = 8) boolean z10, @SafeParcelable.Param(id = 9) boolean z11, @Nullable @SafeParcelable.Param(id = 10) List list) {
        this.zza = latLng;
        this.zzb = d10;
        this.zzc = f10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = f11;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = list;
    }
}
