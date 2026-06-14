package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.maps.zzar;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Polyline {
    private final zzar zza;

    public Polyline(zzar zzarVar) {
        this.zza = (zzar) Preconditions.checkNotNull(zzarVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Polyline)) {
            return false;
        }
        try {
            return this.zza.zzD(((Polyline) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int getColor() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public Cap getEndCap() {
        try {
            return this.zza.zzj().zza();
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

    public int getJointType() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @Nullable
    public List<PatternItem> getPattern() {
        try {
            return PatternItem.zza(this.zza.zzm());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public List<LatLng> getPoints() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public List<StyleSpan> getSpans() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public Cap getStartCap() {
        try {
            return this.zza.zzk().zza();
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

    public float getWidth() {
        try {
            return this.zza.zzd();
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
            return this.zza.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isClickable() {
        try {
            return this.zza.zzE();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isGeodesic() {
        try {
            return this.zza.zzF();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzG();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void remove() {
        try {
            this.zza.zzp();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setClickable(boolean z10) {
        try {
            this.zza.zzq(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setColor(int i10) {
        try {
            this.zza.zzr(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setEndCap(@NonNull Cap cap) {
        Preconditions.checkNotNull(cap, "endCap must not be null");
        try {
            this.zza.zzs(cap);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setGeodesic(boolean z10) {
        try {
            this.zza.zzt(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setJointType(int i10) {
        try {
            this.zza.zzu(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPattern(@Nullable List<PatternItem> list) {
        try {
            this.zza.zzv(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setPoints(@NonNull List<LatLng> list) {
        Preconditions.checkNotNull(list, "points must not be null");
        try {
            this.zza.zzw(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setSpans(@NonNull List<StyleSpan> list) {
        try {
            this.zza.zzx(list);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setStartCap(@NonNull Cap cap) {
        Preconditions.checkNotNull(cap, "startCap must not be null");
        try {
            this.zza.zzy(cap);
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

    public void setVisible(boolean z10) {
        try {
            this.zza.zzA(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setWidth(float f10) {
        try {
            this.zza.zzB(f10);
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
}
