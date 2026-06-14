package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeel extends zzeeq {
    private final Context zzg;
    private final VersionInfoParcel zzh;
    private final zzeek zzi;

    zzeel(Context context, VersionInfoParcel versionInfoParcel, zzeek zzeekVar, zzbyx zzbyxVar) {
        this.zzg = context;
        this.zzh = versionInfoParcel;
        this.zzi = zzeekVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzi(this.zzh.afmaVersion);
                    this.zzi.zza();
                } catch (RemoteException e10) {
                    this.zzi.zzb(e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzi.zzb(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.getErrorMessage()))));
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 33);
        sb2.append("Connection suspended with cause: ");
        sb2.append(i10);
        this.zzi.zzb(new RemoteException(sb2.toString()));
    }

    public final void zza() {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return;
                }
                this.zzc = true;
                zzbyw zzbywVar = new zzbyw(this.zzg, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
                this.zzf = zzbywVar;
                zzbywVar.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
