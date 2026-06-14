package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzbfk implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbfl zza;

    zzbfk(zzbfl zzbflVar) {
        Objects.requireNonNull(zzbflVar);
        this.zza = zzbflVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zzbfl zzbflVar = this.zza;
        synchronized (zzbflVar.zzh()) {
            try {
                zzbflVar.zzk(null);
                if (zzbflVar.zzi() != null) {
                    zzbflVar.zzj(null);
                }
                zzbflVar.zzh().notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
