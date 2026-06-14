package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbqe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcen zza;

    zzbqe(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
