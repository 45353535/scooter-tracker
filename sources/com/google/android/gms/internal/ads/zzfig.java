package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzfig implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdq zza;
    final /* synthetic */ zzfii zzb;

    zzfig(zzfii zzfiiVar, com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zza = zzdqVar;
        Objects.requireNonNull(zzfiiVar);
        this.zzb = zzfiiVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        if (this.zzb.zzv() != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
