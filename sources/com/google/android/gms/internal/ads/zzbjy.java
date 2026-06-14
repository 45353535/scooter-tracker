package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbjy {
    private final Context zza;

    public zzbjy(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyv zzbyvVar) {
        try {
            ((zzbjz) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbjx.zza)).zze(zzbyvVar);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
