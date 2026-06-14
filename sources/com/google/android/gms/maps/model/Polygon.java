package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzao;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Polygon {
    private final zzao zza;

    public Polygon(zzao zzaoVar) {
        this.zza = (zzao) Preconditions.checkNotNull(zzaoVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Polygon)) {
            return false;
        }
        try {
            return this.zza.zzB(((Polygon) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getFillColor() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        try {
            return this.zza.zzl();
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
    public List<LatLng> getPoints() {
        try {
            return this.zza.zzm();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getStrokeColor() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getStrokeJointType() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        try {
            return PatternItem.zza(this.zza.zzn());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getStrokeWidth() {
        try {
            return this.zza.zzd();
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
            return this.zza.zze();
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
            return this.zza.zzC();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zza.zzD();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzE();
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

    public void setGeodesic(boolean z10) {
        try {
            this.zza.zzr(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setHoles(@NonNull List<? extends List<LatLng>> list) {
        try {
            this.zza.zzs(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPoints(@NonNull List<LatLng> list) {
        try {
            Preconditions.checkNotNull(list, "points must not be null.");
            this.zza.zzt(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokeColor(int i10) {
        try {
            this.zza.zzu(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokeJointType(int i10) {
        try {
            this.zza.zzv(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokePattern(@Nullable List<PatternItem> list) {
        try {
            this.zza.zzw(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStrokeWidth(float f10) {
        try {
            this.zza.zzx(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTag(@Nullable Object obj) {
        try {
            this.zza.zzy(ObjectWrapper.wrap(obj));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setVisible(boolean z10) {
        try {
            this.zza.zzz(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZIndex(float f10) {
        try {
            this.zza.zzA(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
