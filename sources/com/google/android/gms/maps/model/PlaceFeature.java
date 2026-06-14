package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public final class PlaceFeature extends Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public PlaceFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    @NonNull
    public String getPlaceId() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
