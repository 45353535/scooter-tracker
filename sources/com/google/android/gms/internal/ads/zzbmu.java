package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbmu extends zzbmc {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbmu(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    final /* synthetic */ OnAdManagerAdViewLoadedListener zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final void zze(com.google.android.gms.ads.internal.client.zzbx zzbxVar, IObjectWrapper iObjectWrapper) {
        if (zzbxVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbxVar.zzw() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbxVar.zzw();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzk() : null);
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
        try {
            if (zzbxVar.zzv() instanceof zzbdt) {
                zzbdt zzbdtVar = (zzbdt) zzbxVar.zzv();
                adManagerAdView.setAppEventListener(zzbdtVar != null ? zzbdtVar.zzc() : null);
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzbmt(this, adManagerAdView, zzbxVar));
    }
}
