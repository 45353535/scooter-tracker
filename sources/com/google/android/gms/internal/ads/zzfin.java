package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfin implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zza;
    final /* synthetic */ zzfio zzb;

    zzfin(zzfio zzfioVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        this.zza = zzcbVar;
        Objects.requireNonNull(zzfioVar);
        this.zzb = zzfioVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzw() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
