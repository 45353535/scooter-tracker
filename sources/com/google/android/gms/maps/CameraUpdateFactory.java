package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class CameraUpdateFactory {
    private static ICameraUpdateFactoryDelegate zza;

    private CameraUpdateFactory() {
    }

    @NonNull
    public static CameraUpdate newCameraPosition(@NonNull CameraPosition cameraPosition) {
        Preconditions.checkNotNull(cameraPosition, "cameraPosition must not be null");
        try {
            return new CameraUpdate(zzb().newCameraPosition(cameraPosition));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate newLatLng(@NonNull LatLng latLng) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new CameraUpdate(zzb().newLatLng(latLng));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i10) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngBounds(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate newLatLngZoom(@NonNull LatLng latLng, float f10) {
        Preconditions.checkNotNull(latLng, "latLng must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngZoom(latLng, f10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate scrollBy(float f10, float f11) {
        try {
            return new CameraUpdate(zzb().scrollBy(f10, f11));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate zoomBy(float f10) {
        try {
            return new CameraUpdate(zzb().zoomBy(f10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate zoomIn() {
        try {
            return new CameraUpdate(zzb().zoomIn());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate zoomOut() {
        try {
            return new CameraUpdate(zzb().zoomOut());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate zoomTo(float f10) {
        try {
            return new CameraUpdate(zzb().zoomTo(f10));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public static void zza(@NonNull ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        zza = (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(iCameraUpdateFactoryDelegate);
    }

    private static ICameraUpdateFactoryDelegate zzb() {
        return (ICameraUpdateFactoryDelegate) Preconditions.checkNotNull(zza, "CameraUpdateFactory is not initialized");
    }

    @NonNull
    public static CameraUpdate zoomBy(float f10, @NonNull Point point) {
        Preconditions.checkNotNull(point, "focus must not be null");
        try {
            return new CameraUpdate(zzb().zoomByWithFocus(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public static CameraUpdate newLatLngBounds(@NonNull LatLngBounds latLngBounds, int i10, int i11, int i12) {
        Preconditions.checkNotNull(latLngBounds, "bounds must not be null");
        try {
            return new CameraUpdate(zzb().newLatLngBoundsWithSize(latLngBounds, i10, i11, i12));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
