package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfy implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbfz zzb;

    zzbfy(zzbfz zzbfzVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbfzVar);
        this.zzb = zzbfzVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
