package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzdzw extends zzcbb {
    final /* synthetic */ zzdzx zza;

    zzdzw(zzdzx zzdzxVar) {
        Objects.requireNonNull(zzdzxVar);
        this.zza = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zze() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzm(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzf() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzo(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzg(zzcaw zzcawVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzp(zzdzxVar.zzd(), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzh(int i10) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzn(zzdzxVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzj() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzq(zzdzxVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzcbc
    public final void zzk() throws RemoteException {
        zzdzx zzdzxVar = this.zza;
        zzdzxVar.zze().zzr(zzdzxVar.zzd());
    }
}
