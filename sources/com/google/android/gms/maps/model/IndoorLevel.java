package com.google.android.gms.maps.model;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes8.dex */
public final class IndoorLevel {
    private final com.google.android.gms.internal.maps.zzad zza;

    public IndoorLevel(com.google.android.gms.internal.maps.zzad zzadVar) {
        this.zza = (com.google.android.gms.internal.maps.zzad) Preconditions.checkNotNull(zzadVar);
    }

    public void activate() {
        try {
            this.zza.zzg();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof IndoorLevel)) {
            return false;
        }
        try {
            return this.zza.zzh(((IndoorLevel) obj).zza);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getName() {
        try {
            return this.zza.zze();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    @NonNull
    public String getShortName() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public int hashCode() {
        try {
            return this.zza.zzd();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }
}
