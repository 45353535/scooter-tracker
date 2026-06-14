package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public class Marker {
    protected final com.google.android.gms.internal.maps.zzaj zza;

    public Marker(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza = (com.google.android.gms.internal.maps.zzaj) Preconditions.checkNotNull(zzajVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Marker)) {
            return false;
        }
        try {
            return this.zza.zzE(((Marker) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getAlpha() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getId() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public LatLng getPosition() {
        try {
            return this.zza.zzj();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getRotation() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public String getSnippet() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public Object getTag() {
        try {
            return ObjectWrapper.unwrap(this.zza.zzi());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public String getTitle() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void hideInfoWindow() {
        try {
            this.zza.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isDraggable() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isFlat() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isInfoWindowShown() {
        try {
            return this.zza.zzH();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzI();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void remove() {
        try {
            this.zza.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setAlpha(float f10) {
        try {
            this.zza.zzp(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setAnchor(float f10, float f11) {
        try {
            this.zza.zzq(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setDraggable(boolean z10) {
        try {
            this.zza.zzr(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setFlat(boolean z10) {
        try {
            this.zza.zzs(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setIcon(@Nullable BitmapDescriptor bitmapDescriptor) {
        try {
            if (bitmapDescriptor == null) {
                this.zza.zzt(null);
            } else {
                this.zza.zzt(bitmapDescriptor.zza());
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setInfoWindowAnchor(float f10, float f11) {
        try {
            this.zza.zzv(f10, f11);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPosition(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        try {
            this.zza.zzw(latLng);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setRotation(float f10) {
        try {
            this.zza.zzx(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setSnippet(@Nullable String str) {
        try {
            this.zza.zzy(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTag(@Nullable Object obj) {
        try {
            this.zza.zzz(ObjectWrapper.wrap(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTitle(@Nullable String str) {
        try {
            this.zza.zzA(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setVisible(boolean z10) {
        try {
            this.zza.zzB(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZIndex(float f10) {
        try {
            this.zza.zzC(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void showInfoWindow() {
        try {
            this.zza.zzD();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
