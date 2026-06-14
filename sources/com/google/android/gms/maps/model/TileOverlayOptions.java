package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.maps.zzay;
import com.google.android.gms.internal.maps.zzaz;
import com.ironsource.C4329g8;

/* JADX INFO: loaded from: classes8.dex */
@SafeParcelable.Class(creator = "TileOverlayOptionsCreator")
@SafeParcelable.Reserved({1})
public final class TileOverlayOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzaj();

    @Nullable
    @SafeParcelable.Field(getter = "getTileProviderDelegate", id = 2, type = "android.os.IBinder")
    private zzaz zza;

    @Nullable
    private TileProvider zzb;

    @SafeParcelable.Field(getter = C4329g8.f43166k, id = 3)
    private boolean zzc;

    @SafeParcelable.Field(getter = "getZIndex", id = 4)
    private float zzd;

    @SafeParcelable.Field(defaultValue = "true", getter = "getFadeIn", id = 5)
    private boolean zze;

    @SafeParcelable.Field(getter = "getTransparency", id = 6)
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z10) {
        this.zze = z10;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @Nullable
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        this.zzb = (TileProvider) Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new zzai(this, tileProvider);
        return this;
    }

    @NonNull
    public TileOverlayOptions transparency(float f10) {
        boolean z10 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        Preconditions.checkArgument(z10, "Transparency must be in the range [0..1]");
        this.zzf = f10;
        return this;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z10) {
        this.zzc = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzaz zzazVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzazVar == null ? null : zzazVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public TileOverlayOptions zIndex(float f10) {
        this.zzd = f10;
        return this;
    }

    @SafeParcelable.Constructor
    TileOverlayOptions(@SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) boolean z10, @SafeParcelable.Param(id = 4) float f10, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) float f11) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzaz zzazVarZzc = zzay.zzc(iBinder);
        this.zza = zzazVarZzc;
        this.zzb = zzazVarZzc == null ? null : new zzah(this);
        this.zzc = z10;
        this.zzd = f10;
        this.zze = z11;
        this.zzf = f11;
    }
}
