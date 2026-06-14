package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Circle {
    private final com.google.android.gms.internal.maps.zzn zza;

    public Circle(com.google.android.gms.internal.maps.zzn zznVar) {
        this.zza = (com.google.android.gms.internal.maps.zzn) Preconditions.checkNotNull(zznVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Circle)) {
            return false;
        }
        try {
            return this.zza.zzy(((Circle) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public LatLng getCenter() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getId() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public double getRadius() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzm());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zze();
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

    public float getZIndex() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzz();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzA();
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

    public void setCenter(@NonNull LatLng latLng) {
        try {
            Preconditions.checkNotNull(latLng, "center must not be null.");
            this.zza.zzo(latLng);
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

    public void setFillColor(int i10) {
        try {
            this.zza.zzq(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setRadius(double d10) {
        try {
            this.zza.zzr(d10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokeColor(int i10) {
        try {
            this.zza.zzs(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokePattern(@Nullable List<PatternItem> list) {
        try {
            this.zza.zzt(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokeWidth(float f10) {
        try {
            this.zza.zzu(f10);
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

    public void setVisible(boolean z10) {
        try {
            this.zza.zzw(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZIndex(float f10) {
        try {
            this.zza.zzx(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
