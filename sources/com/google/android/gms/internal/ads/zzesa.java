package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class zzesa {
    private final zzesf zza;
    private final String zzb;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzea zzc;

    public zzesa(zzesf zzesfVar, String str) {
        this.zza = zzesfVar;
        this.zzb = str;
    }

    public final synchronized boolean zza() throws RemoteException {
        return this.zza.zzb();
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) throws RemoteException {
        this.zzc = null;
        zzesg zzesgVar = new zzesg(i10);
        zzerz zzerzVar = new zzerz(this);
        this.zza.zza(zzmVar, this.zzb, zzesgVar, zzerzVar);
    }

    @Nullable
    public final synchronized String zzc() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    @Nullable
    public final synchronized String zzd() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zzc;
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return zzeaVar != null ? zzeaVar.zze() : null;
    }

    final /* synthetic */ void zze(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzc = zzeaVar;
    }
}
