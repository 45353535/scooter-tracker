package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbqd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzbqf zzb;

    zzbqd(zzbqf zzbqfVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzbqfVar);
        this.zzb = zzbqfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e10) {
            this.zza.zzd(e10);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("onConnectionSuspended: ");
        sb2.append(i10);
        this.zza.zzd(new RuntimeException(sb2.toString()));
    }
}
