package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzdzv extends zzcbf {
    final /* synthetic */ zzdzx zza;

    zzdzv(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zze() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzk(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzf(int i10) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbg
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzl(zzdzxVar.zzd(), zzeVar.zza);
    }
}
