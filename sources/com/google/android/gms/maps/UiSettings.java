package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class UiSettings {
    private final IUiSettingsDelegate zza;

    UiSettings(IUiSettingsDelegate iUiSettingsDelegate) {
        this.zza = iUiSettingsDelegate;
    }

    public boolean isCompassEnabled() {
        try {
            return this.zza.isCompassEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isIndoorLevelPickerEnabled() {
        try {
            return this.zza.isIndoorLevelPickerEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isMapToolbarEnabled() {
        try {
            return this.zza.isMapToolbarEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isMyLocationButtonEnabled() {
        try {
            return this.zza.isMyLocationButtonEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isRotateGesturesEnabled() {
        try {
            return this.zza.isRotateGesturesEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isScrollGesturesEnabled() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isScrollGesturesEnabledDuringRotateOrZoom() {
        try {
            return this.zza.isScrollGesturesEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isTiltGesturesEnabled() {
        try {
            return this.zza.isTiltGesturesEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isZoomControlsEnabled() {
        try {
            return this.zza.isZoomControlsEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean isZoomGesturesEnabled() {
        try {
            return this.zza.isZoomGesturesEnabled();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setAllGesturesEnabled(boolean z10) {
        try {
            this.zza.setAllGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setCompassEnabled(boolean z10) {
        try {
            this.zza.setCompassEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setIndoorLevelPickerEnabled(boolean z10) {
        try {
            this.zza.setIndoorLevelPickerEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setMapToolbarEnabled(boolean z10) {
        try {
            this.zza.setMapToolbarEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setMyLocationButtonEnabled(boolean z10) {
        try {
            this.zza.setMyLocationButtonEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setRotateGesturesEnabled(boolean z10) {
        try {
            this.zza.setRotateGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setScrollGesturesEnabled(boolean z10) {
        try {
            this.zza.setScrollGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setScrollGesturesEnabledDuringRotateOrZoom(boolean z10) {
        try {
            this.zza.setScrollGesturesEnabledDuringRotateOrZoom(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setTiltGesturesEnabled(boolean z10) {
        try {
            this.zza.setTiltGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZoomControlsEnabled(boolean z10) {
        try {
            this.zza.setZoomControlsEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void setZoomGesturesEnabled(boolean z10) {
        try {
            this.zza.setZoomGesturesEnabled(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
