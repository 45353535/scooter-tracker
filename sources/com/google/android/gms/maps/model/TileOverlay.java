package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.maps.zzaw;

/* JADX INFO: loaded from: classes8.dex */
public final class TileOverlay {
    private final zzaw zza;

    public TileOverlay(zzaw zzawVar) {
        this.zza = (zzaw) Preconditions.checkNotNull(zzawVar);
    }

    public void clearTileCache() {
        try {
            this.zza.zzh();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TileOverlay)) {
            return false;
        }
        try {
            return this.zza.zzn(((TileOverlay) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean getFadeIn() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getId() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public float getTransparency() {
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
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isVisible() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void remove() {
        try {
            this.zza.zzi();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setFadeIn(boolean z10) {
        try {
            this.zza.zzj(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTransparency(float f10) {
        try {
            this.zza.zzk(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setVisible(boolean z10) {
        try {
            this.zza.zzl(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZIndex(float f10) {
        try {
            this.zza.zzm(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
