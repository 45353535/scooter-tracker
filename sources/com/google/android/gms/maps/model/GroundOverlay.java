package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class GroundOverlay {
    private final com.google.android.gms.internal.maps.zzx zza;

    public GroundOverlay(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza = (com.google.android.gms.internal.maps.zzx) Preconditions.checkNotNull(zzxVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof GroundOverlay)) {
            return false;
        }
        try {
            return this.zza.zzz(((GroundOverlay) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getBearing() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public LatLngBounds getBounds() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getHeight() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getId() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public LatLng getPosition() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzj());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getTransparency() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getWidth() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzA();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzB();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void remove() {
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setBearing(float f10) {
        try {
            this.zza.zzo(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setClickable(boolean z10) {
        try {
            this.zza.zzp(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setDimensions(float f10) {
        try {
            this.zza.zzq(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setImage(@NonNull BitmapDescriptor bitmapDescriptor) {
        Preconditions.checkNotNull(bitmapDescriptor, "imageDescriptor must not be null");
        try {
            this.zza.zzs(bitmapDescriptor.zza());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPosition(@NonNull LatLng latLng) {
        try {
            this.zza.zzt(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPositionFromBounds(@NonNull LatLngBounds latLngBounds) {
        try {
            this.zza.zzu(latLngBounds);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTag(@Nullable Object obj) {
        try {
            this.zza.zzv(ObjectWrapper.wrap(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTransparency(float f10) {
        try {
            this.zza.zzw(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setVisible(boolean z10) {
        try {
            this.zza.zzx(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZIndex(float f10) {
        try {
            this.zza.zzy(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setDimensions(float f10, float f11) {
        try {
            this.zza.zzr(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
